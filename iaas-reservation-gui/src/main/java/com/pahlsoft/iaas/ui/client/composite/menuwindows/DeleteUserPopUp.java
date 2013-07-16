package com.pahlsoft.iaas.ui.client.composite.menuwindows;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.event.WindowEvent;
import com.extjs.gxt.ui.client.event.WindowListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.Info;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.DualListField;
import com.extjs.gxt.ui.client.widget.form.DualListField.Mode;
import com.extjs.gxt.ui.client.widget.form.LabelField;
import com.extjs.gxt.ui.client.widget.form.ListField;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pahlsoft.iaas.ui.client.AsyncServer;
import com.pahlsoft.iaas.ui.client.AsyncUser;
import com.pahlsoft.iaas.ui.client.ReservationService;
import com.pahlsoft.iaas.ui.client.ReservationServiceAsync;
import com.pahlsoft.iaas.ui.client.events.DataChangeEvent;

public class DeleteUserPopUp extends Window  {
	
	SimpleEventBus eventBus = new SimpleEventBus();
	
	public DeleteUserPopUp(SimpleEventBus eventBus) {
		this.eventBus = eventBus;
	}

	@Override  
	  protected void onRender(Element parent, int pos) {  
		
		super.onRender(parent, pos);
		setSize("583px", "502px");
		setDraggable(true);
	    setSize(583, 502);  
	    setPlain(true);  
	    setModal(true);  
	    setBlinkModal(true);  
	    setHeadingText("Delete Users");
	    setClosable(true);
	    setOnEsc(true);
	    setSize("465", "345");
	    
	    ListStore<AsyncUser> users = null;
	    if (Beans.isDesignTime()) {
	    // Do nothing
	    } else {
	    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
	    	users = getAsyncUsers(reservationService);
	    }

	    setLayout(new AbsoluteLayout());
	    
	    LabelField labelServers = new LabelField("Users:");
	    
	    add(labelServers, new AbsoluteData(34, 6));
	    labelServers.setSize("131px", "14px");
	    
	    final DualListField<AsyncUser> userList = new DualListField<AsyncUser>();  

	    userList.setMode(Mode.INSERT);  
	    userList.setFieldLabel("Users");  
	  
	    ListField<AsyncUser> from = userList.getFromList();  
	    from.setDisplayField("loginid");
	    from.setStore(users);  
	    ListField<AsyncUser> to = userList.getToList();  
	    to.setDisplayField("loginid" );  
	    users = new ListStore<AsyncUser>();  
	    to.setStore(users);
	    
	    add(userList, new AbsoluteData(81, 6));
	    userList.setSize("347px", "206px");
	    
	    Button btnCancel = new Button("Cancel", new SelectionListener<ButtonEvent>() {  
	      @Override  
	      public void componentSelected(ButtonEvent ce) {  
	    	DeleteUserPopUp.this.hide();  
	      }  
	});

	  add(btnCancel, new AbsoluteData(324, 248));
	  btnCancel.setSize("45px", "22px");
	  
	   Button btnReserve = new Button("Delete", new SelectionListener<ButtonEvent>() {  
		      @Override  
		      public void componentSelected(ButtonEvent ce) {
		    	if (userList.getToList().getListView().getItemCount() == 0 ) {
		    		MessageBox.alert("Invalid Selection","No User(s) Selected", null);
		    	} else {
		    		if (Beans.isDesignTime()) {
		    		    // Do nothing
		    		    } else {
		    		    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
		    		    	ArrayList<AsyncUser> tmpList = new ArrayList<AsyncUser>();
		    		    	ArrayList<String> sList = new ArrayList<String>();
		    		    	tmpList.addAll(userList.getToList().getStore().getModels());
		    		    	for (AsyncUser user: tmpList) {
		    		    		sList.add(user.getLoginId());
		    		    		getReservations(reservationService, user.getLoginId());
		    		    	}
		    		    	deleteUsers(reservationService, sList);
		    		    }
		    		DeleteUserPopUp.this.hide();  
		    	}
		      }  
		    });
	   add(btnReserve, new AbsoluteData(375, 248));
	   btnReserve.setSize("53px", "22px");
	    addWindowListener(new WindowListener() {  
	        @Override  
	        public void windowHide(WindowEvent we) {
	        	
	        	DeleteUserPopUp.this.hide();
	        }  
	      }); 
	    setFocusWidget(getButtonBar().getItem(0));
		
	}

	public ListStore<AsyncUser> getAsyncUsers(ReservationServiceAsync reservationService) {
		final ListStore<AsyncUser> _asyncUserList = new ListStore<AsyncUser>();

			reservationService.getUsers(new AsyncCallback<List<AsyncUser>>() {
				
				public void onFailure(Throwable caught) {
					com.google.gwt.user.client.Window.alert("Something Bad Happened on Listing Users"); 
				}
				
				public void onSuccess(List<AsyncUser> result) {
					_asyncUserList.add(result);		
				}
				
			});
		return _asyncUserList;
	}
	
	public void deleteUsers(ReservationServiceAsync reservationService, ArrayList<String> users) {
		
		reservationService.deleteUsers(users, new AsyncCallback<Integer>() {

			public void onFailure(Throwable caught) {
				com.google.gwt.user.client.Window.alert("Something Bad Happened Reserving Server(s)");
			}

			public void onSuccess(Integer result) {
				Info.display("Reservation Service Response","Deleted " + result.toString() + " number of users.");
				eventBus.fireEvent(new DataChangeEvent());
			}
			
		});
	}
	
	public List<String> getReservations(final ReservationServiceAsync reservationService, String userName) {
		final ArrayList<String> _serverList = new ArrayList<String>();
		reservationService.getReservations(userName, new AsyncCallback<List<String>>() {

			public void onFailure(Throwable caught) {
				com.google.gwt.user.client.Window.alert("Something Bad Happened Reserving Server(s)");
			}

			public void onSuccess(List<String> result) {
				_serverList.addAll(result);
				Info.display("Reservation Service Response","User Has " + result.toString() + " number of servers reserved.");
				setExpiration(reservationService, _serverList);
			}
		});
		return _serverList;
		
	}
	
	
	public void setExpiration(ReservationServiceAsync reservationService, ArrayList<String> servers) {
		
		reservationService.setExpiration(servers, new AsyncCallback<Integer>() {

			public void onFailure(Throwable caught) {
				com.google.gwt.user.client.Window.alert("Something Bad Happened Manually Expiring Server(s)");
			}

			public void onSuccess(Integer result) {
				eventBus.fireEvent(new DataChangeEvent());
				Info.display("Reservation Service Response","Manually Expired " + result.toString() + " number of servers.");
			}
			
		});
	}
}
