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
import com.extjs.gxt.ui.client.widget.form.ListField;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pahlsoft.iaas.ui.client.AsyncParent;
import com.pahlsoft.iaas.ui.client.AsyncServer;
import com.pahlsoft.iaas.ui.client.ReservationService;
import com.pahlsoft.iaas.ui.client.ReservationServiceAsync;
import com.pahlsoft.iaas.ui.client.events.DataChangeEvent;

public class ExpirationPopUp extends Window  {
	
	SimpleEventBus eventBus = new SimpleEventBus();
	
	public ExpirationPopUp(SimpleEventBus eventBus) {
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
	    setHeadingText("Expire Reservations");
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

	    setLayout(new AbsoluteLayout());
	    
	    final DualListField<AsyncServer> serverList = new DualListField<AsyncServer>();  

	    serverList.setMode(Mode.INSERT);  
	    serverList.setFieldLabel("Servers");  
	  
	    ListField<AsyncServer> from = serverList.getFromList();  
	    from.setDisplayField("name");  
	    from.setStore(servers);  
	    ListField<AsyncServer> to = serverList.getToList();  
	    to.setDisplayField("name");  
	    servers = new ListStore<AsyncServer>();  
	    to.setStore(servers);
	    
	    add(serverList, new AbsoluteData(81, 6));
	    serverList.setSize("347px", "206px");
	    
	    Button btnCancel = new Button("Cancel", new SelectionListener<ButtonEvent>() {  
	      @Override  
	      public void componentSelected(ButtonEvent ce) {  
	    
	    	ExpirationPopUp.this.hide();  
	      }  
	});

	  add(btnCancel, new AbsoluteData(324, 248));
	  btnCancel.setSize("45px", "22px");
	  
	   Button btnReserve = new Button("Expire", new SelectionListener<ButtonEvent>() {  
		      @Override  
		      public void componentSelected(ButtonEvent ce) {
		    	if (serverList.getToList().getListView().getItemCount() == 0 ) {
		    		MessageBox.alert("Invalid Selection","No Server(s) Selected", null);
		    	} else {
		    		
		    		if (Beans.isDesignTime()) {
		    		    // Do nothing
		    		    } else {
		    		    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
		    		    	ArrayList<AsyncServer> tmpList = new ArrayList<AsyncServer>();
		    		    	ArrayList<String> sList = new ArrayList<String>();
		    		    	tmpList.addAll(serverList.getToList().getStore().getModels());
		    		        for ( AsyncServer _asrvr : tmpList ) {
		    		        	   sList.add(_asrvr.getName());
		    		        }
		    		    	setExpiration(reservationService, sList);
		    		    }
		    		ExpirationPopUp.this.hide();  
		    	}
		      }  
		    });
	   add(btnReserve, new AbsoluteData(375, 248));
	   btnReserve.setSize("53px", "22px");
	    addWindowListener(new WindowListener() {  
	        @Override  
	        public void windowHide(WindowEvent we) {
	        	
	        	ExpirationPopUp.this.hide();
	        }  
	      }); 
	    setFocusWidget(getButtonBar().getItem(0));
	    	    
	}

	public ListStore<AsyncServer> getAsyncServers(ReservationServiceAsync reservationService) {
		final ListStore<AsyncServer> _asyncServerList = new ListStore<AsyncServer>();

			reservationService.getReservedServers(new AsyncCallback<List<AsyncServer>>() {
				
				public void onFailure(Throwable caught) {
					com.google.gwt.user.client.Window.alert("Something Bad Happened on Listing Servers"); 
				}
				
				public void onSuccess(List<AsyncServer> result) {
					_asyncServerList.add(result);		
				}
				
			});
		return _asyncServerList;
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
