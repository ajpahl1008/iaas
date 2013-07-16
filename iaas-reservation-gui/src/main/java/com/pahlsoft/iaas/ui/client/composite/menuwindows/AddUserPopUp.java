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

public class AddUserPopUp extends Window  {
	
	SimpleEventBus eventBus = new SimpleEventBus();

	public AddUserPopUp(SimpleEventBus eventBus) {
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
	    setHeadingText("Add New User");
	    setClosable(true);
	    setOnEsc(true);
	    
	    	    setFocusWidget(getButtonBar().getItem(0));
		   	    setLayout(new AbsoluteLayout());
		   	    
		   	    FormPanel frmpnlUserInformation = new FormPanel();
		   	    frmpnlUserInformation.setLabelAlign(LabelAlign.RIGHT);
		   	    frmpnlUserInformation.setHeadingText("User Information");
		   	    frmpnlUserInformation.setLayout(new FormLayout());
		   	    
		   	    final TextField<String> txtfldFirstName = new TextField<String>();
		   	    frmpnlUserInformation.add(txtfldFirstName, new FormData("75%"));
		   	    txtfldFirstName.setFieldLabel("First Name");
		   	    
		   	    final TextField<String> txtfldLastName = new TextField<String>();
		   	    frmpnlUserInformation.add(txtfldLastName, new FormData("75%"));
		   	    txtfldLastName.setFieldLabel("Last Name");
		   	    
		   	    final TextField<String> txtfldLoginId = new TextField<String>();
		   	    frmpnlUserInformation.add(txtfldLoginId, new FormData("75%"));
		   	    txtfldLoginId.setFieldLabel("Login ID");
		   	    
		   	    final TextField<String> txtfldPhoneNumber = new TextField<String>();
		   	    frmpnlUserInformation.add(txtfldPhoneNumber, new FormData("75%"));
		   	    txtfldPhoneNumber.setFieldLabel("Phone Number");

		   	    add(frmpnlUserInformation, new AbsoluteData(0, 0));
		   	    frmpnlUserInformation.setSize("451px", "159px");
		   	    
		   	    Button btnAddServer = new Button("Add", new SelectionListener<ButtonEvent>() {  
			      @Override  
			      public void componentSelected(ButtonEvent ce) {
			    	if (txtfldFirstName.getValue().length() == 0 ) {
			    		MessageBox.alert("Invalid Entry","No First Name Entered", null);
			    	} else if (txtfldLastName.getValue().length() == 0 ) {
			    		MessageBox.alert("Invalid Entry","No Last Name Entered", null);
			    	} else if (txtfldLoginId.getValue().length() == 0 ) {
			    		MessageBox.alert("Invalid Entry","No Login ID Entered", null);
			    	} else if (txtfldPhoneNumber.getValue().length() == 0 ) {
			    		MessageBox.alert("Invalid Entry","No Phone Number Entered", null);
			    	} else {
			    		System.out.println("DEBUG: Adding User " + txtfldFirstName.getValue());
			    		
			    		if (Beans.isDesignTime()) {
			    		    // Do nothing
			    		    } else {
			    		    	AsyncUser newUser = new AsyncUser();
			    		    	newUser.setFirstName(txtfldFirstName.getValue());
			    		    	newUser.setLastName(txtfldLastName.getValue());
			    		    	newUser.setLoginId(txtfldLoginId.getValue());
			    		    	newUser.setPhoneNumber(txtfldPhoneNumber.getValue());
			    		    	
			    		    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
			    		    	getUser(reservationService, newUser);
			    		    }
			    		AddUserPopUp.this.hide();  
			    	}
			      }  
			    });
		   	    
		   add(btnAddServer, new AbsoluteData(413, 165));
		   btnAddServer.setSize("32px", "22px");
		   
		   	    
		   	    Button btnCancel = new Button("Cancel", new SelectionListener<ButtonEvent>() {  
		   		      @Override  
		   		      public void componentSelected(ButtonEvent ce) {  
		   		    
		   		    	AddUserPopUp.this.hide();  
		   		      }  
		   		    });
		   	    
		   	    		    add(btnCancel, new AbsoluteData(367, 165));
		   	    		    btnCancel.setSize("45px", "22px");
		    addWindowListener(new WindowListener() {  
		        @Override  
		        public void windowHide(WindowEvent we) {
		        	AddUserPopUp.this.hide();
		        }  
		      }); 
	}
		
	public void addUser(ReservationServiceAsync reservationService, final AsyncUser user) {
		
		reservationService.addUser(user, new AsyncCallback<Integer>() {

			public void onFailure(Throwable caught) {
				com.google.gwt.user.client.Window.alert("Something Bad Happened Adding A User");
			}

			public void onSuccess(Integer result) {
				eventBus.fireEvent(new DataChangeEvent());
				Info.display("Reservation Service Response","Added User " + user.getFirstName() + " " + user.getLastName());
			}
			
		});
	}
	
	public ListStore<AsyncUser> getUser(final ReservationServiceAsync reservationService, final AsyncUser userName ) {
		final ListStore<AsyncUser> _asyncServerList = new ListStore<AsyncUser>();
		reservationService.getUser(userName, new AsyncCallback<List<AsyncUser>>() {

			public void onFailure(Throwable caught) {
				com.google.gwt.user.client.Window.alert("Something Bad Happened Get A Single Server");
				
			}

			public void onSuccess(List<AsyncUser> result) {
				_asyncServerList.add(result);
				
				if (result.size() == 0) {
					addUser(reservationService, userName);
				} else {
					Info.display("Reservation Service Response","Server " + userName.getFirstName() + " " + userName.getLastName() + " Already Exists.");
				}
				
			}
			
		}); 
		
		return _asyncServerList;
	}
}
