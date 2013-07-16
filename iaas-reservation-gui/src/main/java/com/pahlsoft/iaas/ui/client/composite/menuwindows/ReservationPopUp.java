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
import com.extjs.gxt.ui.client.widget.form.ComboBox;
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

public class ReservationPopUp extends Window  {
	
	SimpleEventBus eventBus = new SimpleEventBus();
	
	public ReservationPopUp(SimpleEventBus eventBus) {
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
	    setHeadingText("Reserve A Server");
	    setClosable(true);
	    setOnEsc(true);
	    setSize("465", "345");
	    
	    ListStore<AsyncServer> servers = null;
	    if (Beans.isDesignTime()) {
	    // Do nothing
	    } else {
	    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
	    	servers = getAsyncServers(reservationService);
	    }

	    ListStore<AsyncUser> users = null;
	    if (Beans.isDesignTime()) {
	    // DO nothing	
	    } else {
	    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
	    	users = getAsyncUsers(reservationService);
	    }
	    setLayout(new AbsoluteLayout());
	    final ComboBox<AsyncUser> userList = new ComboBox<AsyncUser>();
	    userList.setFieldLabel("loginid");
	    userList.setDisplayField("loginid");
	    userList.setStore(users);
	    add(userList, new AbsoluteData(81, 218));
	    userList.setSize("347px", "24px");
	    userList.setEmptyText("Select a User...");
	    
	    LabelField labelServers = new LabelField("Servers:");
	    
	    add(labelServers, new AbsoluteData(34, 6));
	    labelServers.setSize("131px", "14px");
	    
	    final DualListField<AsyncServer> serverList = new DualListField<AsyncServer>();  

	    serverList.setMode(Mode.INSERT);  
	    serverList.setFieldLabel("Servers");  
	  
	    ListField<AsyncServer> from = serverList.getFromList();  
	    from.setDisplayField("name");
	   from.setStore(servers);  
	    ListField<AsyncServer> to = serverList.getToList();  
	    to.setDisplayField("name" );  
	    servers = new ListStore<AsyncServer>();  
	    to.setStore(servers);
	    
	    add(serverList, new AbsoluteData(81, 6));
	    serverList.setSize("347px", "206px");
	    
	    Button btnCancel = new Button("Cancel", new SelectionListener<ButtonEvent>() {  
	      @Override  
	      public void componentSelected(ButtonEvent ce) {  
	    	ReservationPopUp.this.hide();  
	      }  
	});

	  add(btnCancel, new AbsoluteData(324, 248));
	  btnCancel.setSize("45px", "22px");
	  
	   Button btnReserve = new Button("Reserve", new SelectionListener<ButtonEvent>() {  
		      @Override  
		      public void componentSelected(ButtonEvent ce) {
		    	if (serverList.getToList().getListView().getItemCount() == 0 ) {
		    		MessageBox.alert("Invalid Selection","No Server(s) Selected", null);
		    	} else if ( userList.getValue() == null) {
		    		MessageBox.alert("Invalid Selection","No User Selected", null); 
		    	} else {
		    		System.out.println("DEBUG: Adding " + serverList.getToList().getStore().getCount() + " Number of Servers");
		    		System.out.println("DEBUG Reserved for - " + userList.getValue().getLoginId());
		    		
		    		if (Beans.isDesignTime()) {
		    		    // Do nothing
		    		    } else {
		    		    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
		    		    	ArrayList<AsyncServer> sList = new ArrayList<AsyncServer>(); 
		    		    	sList.addAll(serverList.getToList().getStore().getModels());
		    		    	String user = userList.getValue().getUserId().toString();
		    		    	setReservation(reservationService, sList ,user);
		    		    }
		    		ReservationPopUp.this.hide();  
		    	}
		      }  
		    });
	   add(btnReserve, new AbsoluteData(375, 248));
	   btnReserve.setSize("53px", "22px");
	    addWindowListener(new WindowListener() {  
	        @Override  
	        public void windowHide(WindowEvent we) {
	        	
	        	ReservationPopUp.this.hide();
	        }  
	      }); 
	    setFocusWidget(getButtonBar().getItem(0));
	    	    	    
	    	    LabelField lblfldUsers = new LabelField("Users:");
	    	    AbsoluteData ad_lblfldUsers = new AbsoluteData(34, 218);
	    	    ad_lblfldUsers.setAnchorSpec("-300");
	    	    add(lblfldUsers, ad_lblfldUsers);
	    	    lblfldUsers.setHeight("14px");
		
	}

	public ListStore<AsyncServer> getAsyncServers(ReservationServiceAsync reservationService) {
		final ListStore<AsyncServer> _asyncServerList = new ListStore<AsyncServer>();

			reservationService.getUnreservedServers(new AsyncCallback<List<AsyncServer>>() {
				
				public void onFailure(Throwable caught) {
					com.google.gwt.user.client.Window.alert("Something Bad Happened on Listing Servers"); 
				}
				
				public void onSuccess(List<AsyncServer> result) {
					_asyncServerList.add(result);		
				}
				
			});
		return _asyncServerList;
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
	
	public void setReservation(ReservationServiceAsync reservationService, ArrayList<AsyncServer> servers, String userId) {
		
		reservationService.setReservation(servers, userId, new AsyncCallback<Integer>() {

			public void onFailure(Throwable caught) {
				com.google.gwt.user.client.Window.alert("Something Bad Happened Reserving Server(s)");
			}

			public void onSuccess(Integer result) {
				eventBus.fireEvent(new DataChangeEvent());
				Info.display("Reservation Service Response","Reserved " + result.toString() + " number of servers.");
			}
			
		});
	}
}
