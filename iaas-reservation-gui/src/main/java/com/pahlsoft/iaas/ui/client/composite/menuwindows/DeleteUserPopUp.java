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
		    		    	ArrayList<AsyncUser> uList = new ArrayList<AsyncUser>();
		    		    	uList.addAll(userList.getToList().getStore().getModels());
		    		    	deleteUsers(reservationService, uList);
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
	
	public void deleteUsers(final ReservationServiceAsync reservationService, final ArrayList<AsyncUser> users) {

		final ArrayList<String> userList = new ArrayList<String>();
		for (AsyncUser aUser : users) { 
			userList.add(aUser.getLoginId());
		}
		
		final ArrayList<String> serverList = new ArrayList<String>();
		for (String sUser : userList) {
			reservationService.getReservations(sUser, new AsyncCallback<List<String>>() {
	
				public void onFailure(Throwable caught) {
					com.google.gwt.user.client.Window.alert("Something Bad Happened Getting Reservations");
				}
	
				public void onSuccess(List<String> result) {
					serverList.addAll(result);
					Info.display("Reservation Service Response","User Has " + result.toString() + " number of servers reserved.");
					reservationService.setExpiration(serverList, new AsyncCallback<Integer>() {
						
						public void onFailure(Throwable caught) {
							com.google.gwt.user.client.Window.alert("Something Bad Happened Expiring Server(s)");
						}
						
						public void onSuccess(Integer result) {
							Info.display("Reservation Service Response","Manually Expired " + serverList.size() + " number of servers.");
							eventBus.fireEvent(new DataChangeEvent());
							reservationService.deleteUsers(userList, new AsyncCallback<Integer>() {
								
								public void onFailure(Throwable caught) {
									com.google.gwt.user.client.Window.alert("Something Bad Happened Deleting User(s)");
								}
								
								public void onSuccess(Integer result) {
									Info.display("Reservation Service Response","Deleted " + result.toString() + " number of users.");
									eventBus.fireEvent(new DataChangeEvent());
								}
								
							});
						}
					});
				}
			});
		
		}
		
	}

}
