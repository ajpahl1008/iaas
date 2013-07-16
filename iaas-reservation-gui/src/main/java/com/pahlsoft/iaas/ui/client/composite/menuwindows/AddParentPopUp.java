package com.pahlsoft.iaas.ui.client.composite.menuwindows;

import java.beans.Beans;
import java.util.Arrays;
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
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pahlsoft.iaas.ui.client.AsyncParent;
import com.pahlsoft.iaas.ui.client.AsyncUser;
import com.pahlsoft.iaas.ui.client.Enums.CategoryType;
import com.pahlsoft.iaas.ui.client.AsyncServer;
import com.pahlsoft.iaas.ui.client.Enums.StatusType;
import com.pahlsoft.iaas.ui.client.ReservationService;
import com.pahlsoft.iaas.ui.client.ReservationServiceAsync;
import com.pahlsoft.iaas.ui.client.events.DataChangeEvent;
import com.extjs.gxt.ui.client.widget.form.SimpleComboBox;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.form.LabelField;
import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import com.extjs.gxt.ui.client.widget.layout.FormData;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.FormPanel.LabelAlign;

public class AddParentPopUp extends Window  {
	
	SimpleEventBus eventBus = new SimpleEventBus();

	public AddParentPopUp(SimpleEventBus eventBus) {
		this.eventBus = eventBus;
	}

	@Override  
	  protected void onRender(Element parent, int pos) {  
		
		super.onRender(parent, pos);
		setSize("465", "300");
		setDraggable(true);
	    setSize(465, 236);  
	    setPlain(true);  
	    setModal(true);  
	    setBlinkModal(true);  
	    setHeadingText("Add New Parent");
	    setClosable(true);
	    setOnEsc(true);
	    
	    	    setFocusWidget(getButtonBar().getItem(0));
		   	    setLayout(new AbsoluteLayout());
		   	    
		   	    FormPanel frmpnlParentInformation = new FormPanel();
		   	    frmpnlParentInformation.setLabelAlign(LabelAlign.RIGHT);
		   	    frmpnlParentInformation.setHeadingText("Parent Information");
		   	    frmpnlParentInformation.setLayout(new FormLayout());
		   	    
		   	    final TextField<String> txtfldParentName = new TextField<String>();
		   	    frmpnlParentInformation.add(txtfldParentName, new FormData("75%"));
		   	    txtfldParentName.setFieldLabel("Parent Name");
		   	    
		   	    final TextField<String> txtfldDns = new TextField<String>();
		   	    frmpnlParentInformation.add(txtfldDns, new FormData("75%"));
		   	    txtfldDns.setFieldLabel("DNS");
		   	    
		   	    final TextField<String> txtfldIpAddress = new TextField<String>();
		   	    frmpnlParentInformation.add(txtfldIpAddress, new FormData("75%"));
		   	    txtfldIpAddress.setFieldLabel("IP Address");
		   	    
		   	    add(frmpnlParentInformation, new AbsoluteData(0, 0));
		   	    frmpnlParentInformation.setSize("451px", "159px");
		   	    
		   	    Button btnAddParent = new Button("Add", new SelectionListener<ButtonEvent>() {  
			      @Override  
			      public void componentSelected(ButtonEvent ce) {
			    	if (txtfldParentName.getValue().length() == 0 ) {
			    		MessageBox.alert("Invalid Entry","No Parent Name Entered", null);
			    	} else if (txtfldDns.getValue().length() == 0 ) {
			    		MessageBox.alert("Invalid Entry","No DNS Entry Entered", null);
			    	} else if (txtfldIpAddress.getValue().length() == 0 ) {
			    		MessageBox.alert("Invalid Entry","No IP Address Entered", null);
			    	} else {
			    		System.out.println("DEBUG: Adding Parent " + txtfldParentName.getValue());
			    		
			    		if (Beans.isDesignTime()) {
			    		    // Do nothing
			    		    } else {
			    		    	AsyncParent newParent = new AsyncParent();
			    		    	newParent.setParentId(null);
			    		    	newParent.setParentName(txtfldParentName.getValue());
			    		    	newParent.setDnsName(txtfldDns.getValue());
			    		    	newParent.setIpAddress(txtfldIpAddress.getValue());
			    		    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
			    		    	getParent(reservationService, newParent);
			    		    }
			    		AddParentPopUp.this.hide();  
			    	}
			      }  
			    });
		   	    
		   add(btnAddParent, new AbsoluteData(413, 165));
		   btnAddParent.setSize("32px", "22px");
		   
		   	    
		   	    Button btnCancel = new Button("Cancel", new SelectionListener<ButtonEvent>() {  
		   		      @Override  
		   		      public void componentSelected(ButtonEvent ce) {  
		   		    	AddParentPopUp.this.hide();  
		   		      }  
		   		    });
		   	    
		   	    		    add(btnCancel, new AbsoluteData(367, 165));
		   	    		    btnCancel.setSize("45px", "22px");
		    addWindowListener(new WindowListener() {  
		        @Override  
		        public void windowHide(WindowEvent we) {
		        	AddParentPopUp.this.hide();
		        }  
		      }); 
	}
		
	public void addParent(ReservationServiceAsync reservationService, final AsyncParent parent) {
		
		reservationService.addParent(parent, new AsyncCallback<Integer>() {

			public void onFailure(Throwable caught) {
				com.google.gwt.user.client.Window.alert("Something Bad Happened Adding A Parent");
			}

			public void onSuccess(Integer result) {
				eventBus.fireEvent(new DataChangeEvent());
				Info.display("Reservation Service Response","Added Parent " + parent.getDnsName());
			}
			
		});
	}
	
	public ListStore<AsyncParent> getParent(final ReservationServiceAsync reservationService, final AsyncParent parent ) {
		final ListStore<AsyncParent> _asyncParentList = new ListStore<AsyncParent>();
		reservationService.getParent(parent.getDnsName(), new AsyncCallback<List<AsyncParent>>() {

			public void onFailure(Throwable caught) {
				com.google.gwt.user.client.Window.alert("Something Bad Happened Get A Single Parent");
				
			}

			public void onSuccess(List<AsyncParent> result) {
				_asyncParentList.add(result);
				
				if (result.size() == 0) {
					addParent(reservationService, parent);
				} else {
					Info.display("Reservation Service Response","Server " + parent.getParentName()  + " Already Exists.");
				}
				
			}
			
		}); 
		
		return _asyncParentList;
	}
}
