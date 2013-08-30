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
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pahlsoft.iaas.ui.client.AsyncParent;
import com.pahlsoft.iaas.ui.client.Enums.CategoryType;
import com.pahlsoft.iaas.ui.client.AsyncServer;
import com.pahlsoft.iaas.ui.client.Enums.OperatingSystemType;
import com.pahlsoft.iaas.ui.client.Enums.StatusType;
import com.pahlsoft.iaas.ui.client.ReservationService;
import com.pahlsoft.iaas.ui.client.ReservationServiceAsync;
import com.pahlsoft.iaas.ui.client.events.DataChangeEvent;
import com.extjs.gxt.ui.client.widget.form.ComboBox;
import com.extjs.gxt.ui.client.widget.form.SimpleComboBox;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.form.LabelField;

public class AddServerPopUp extends Window  {

	SimpleEventBus eventBus = new SimpleEventBus();

	public AddServerPopUp(SimpleEventBus eventBus) {
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
	    setHeadingText("Add New Server");
	    setClosable(true);
	    setOnEsc(true);
	    setSize("465", "395");
	       
	    setLayout(new AbsoluteLayout());
	    
	    setFocusWidget(getButtonBar().getItem(0));
	    
	    final TextField<String> txtServerName = new TextField<String>();
	    add(txtServerName, new AbsoluteData(139, 11));
	    txtServerName.setFieldLabel("Server Name");
	    
	    LabelField lblfldServerName = new LabelField("Server Name");
	    add(lblfldServerName, new AbsoluteData(60, 11));
	    
	    final SimpleComboBox<CategoryType> scbCategory = new SimpleComboBox<CategoryType>();
	    scbCategory.setFieldLabel("Category");
	    scbCategory.add(Arrays.asList(CategoryType.values()));
	    
	    final SimpleComboBox<OperatingSystemType> scbOperatingSystem = new SimpleComboBox<OperatingSystemType>();
	    scbOperatingSystem.setFieldLabel("Operating System");
	    scbOperatingSystem.add(Arrays.asList(OperatingSystemType.values()));
	    scbOperatingSystem.setEmptyText("Choose...");
	    scbOperatingSystem.setEditable(false);
	    scbOperatingSystem.setAllowBlank(false);
	    add(scbOperatingSystem, new AbsoluteData(139, 41));
	    
	    LabelField lblfldOperatingSystem = new LabelField("Operating System");
	    add(lblfldOperatingSystem, new AbsoluteData(32, 36));
	    lblfldOperatingSystem.setSize("101px", "9px");
	    
	    final SimpleComboBox<StatusType> scbStatus = new SimpleComboBox<StatusType>();
	    scbStatus.setFieldLabel("Status");
	    scbStatus.add(Arrays.asList(StatusType.values()));
	    scbStatus.setEmptyText("Choose...");
	    scbStatus.setEditable(false);
	    scbStatus.setAllowBlank(false);
	    add(scbStatus, new AbsoluteData(139, 71));
	    
	    LabelField lblfldStatus = new LabelField("Status");
	    add(lblfldStatus, new AbsoluteData(95, 66));
	    scbCategory.setEmptyText("Choose...");
	    scbCategory.setEditable(false);
	    scbCategory.setAllowBlank(false);
	    add(scbCategory, new AbsoluteData(139, 101));
	    
	    LabelField lblfldCategory = new LabelField("Category");
	    add(lblfldCategory, new AbsoluteData(81, 101));
	    
	    ListStore<AsyncParent> parents = null;
	    if (Beans.isDesignTime()) {
	    // Do nothing
	    } else {
	    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
	    	parents = getAsyncParents(reservationService);
	    }
	    
	    final ComboBox<AsyncParent> scbParent = new ComboBox<AsyncParent>();
	    scbParent.setFieldLabel("parentName");
	    scbParent.setDisplayField("parentName");
	    scbParent.setStore(parents);
	    
	    scbParent.setEmptyText("Choose...");
	    scbParent.setEditable(false);
	    scbParent.setAllowBlank(false);
	    add(scbParent, new AbsoluteData(139, 131));
	    scbParent.setSize("150px", "24px");
	    
	    LabelField lblfldParent= new LabelField("Parents");
	    add(lblfldParent, new AbsoluteData(89, 131));
	    
	    final TextField<String> txtServerDns = new TextField<String>();
	    add(txtServerDns, new AbsoluteData(139, 161));
	    txtServerDns.setSize("150px", "24px");
	    txtServerDns.setFieldLabel("Server DNS");
	    
	    LabelField lblfldServerDns = new LabelField("Server DNS");
	    add(lblfldServerDns, new AbsoluteData(68, 156));
	    
	    final TextField<String> txtServerIp = new TextField<String>();
	    add(txtServerIp, new AbsoluteData(139, 191));
	    txtServerIp.setSize("150px", "24px");
	    
	    LabelField lblfldServerIp = new LabelField("Server IP");
	    add(lblfldServerIp, new AbsoluteData(80, 191));
	    txtServerName.setFieldLabel("Server IP");

	    final TextField<String> txtCpuQuantity = new TextField<String>();
	    add(txtCpuQuantity, new AbsoluteData(139, 226));
	    txtCpuQuantity.setSize("150px", "24px");
	    
	    LabelField lblFldCpuQty = new LabelField("CPU Quantity");
	    add(lblFldCpuQty, new AbsoluteData(58, 226));
	    txtCpuQuantity.setFieldLabel("CPU Quantity");
	    
	    final TextField<String> txtCpuSpeed = new TextField<String>();
	    add(txtCpuSpeed, new AbsoluteData(139, 261));
	    txtCpuSpeed.setSize("150px", "24px");
	    
	    LabelField lblFldCpuSpeed = new LabelField("CPU Speed (MHz)");
	    add(lblFldCpuSpeed, new AbsoluteData(38, 261));
	    txtCpuSpeed.setFieldLabel("CPU Speed");
	    
	    final TextField<String> txtMemoryQuantity = new TextField<String>();
	    add(txtMemoryQuantity, new AbsoluteData(139, 296));
	    txtMemoryQuantity.setSize("150px", "24px");
	    
	    LabelField lblFldMemoryQuantity = new LabelField("Memory Quantity (MB)");
	    add(lblFldMemoryQuantity, new AbsoluteData(10, 296));
	    txtMemoryQuantity.setFieldLabel("Memory Quantity (MB)");
	    
	    Button btnCancel = new Button("Cancel", new SelectionListener<ButtonEvent>() {  
		      @Override  
		      public void componentSelected(ButtonEvent ce) {  
		    	AddServerPopUp.this.hide();  
		      }  
		    });

		    add(btnCancel, new AbsoluteData(324, 298));
		    btnCancel.setSize("45px", "22px");
		    
		 Button btnAddServer = new Button("Add", new SelectionListener<ButtonEvent>() {  
			      @Override  
			      public void componentSelected(ButtonEvent ce) {
			    	if (txtServerName.getValue().length() == 0 ) {
			    		Info.display("Invalid Entry","No Server Name Entered");
			    	} else if (!scbStatus.isValid()) {
			    		Info.display("Invalid Entry","No Server Status Selected");
			    	} else if (!scbCategory.isValid()) {
			    		Info.display("Invalid Entry","No Server Category Selected");
			    	} else if (!scbParent.isValid()) {
			    		Info.display("Invalid Entry","No Parent Server Selected");	
			    	} else {
			    		if (Beans.isDesignTime()) {
			    		    // Do nothing
			    		} else {
			    		    	AsyncServer newServer = new AsyncServer();
			    		    	newServer.setStartDate("");
			    		    	newServer.setExpirationDate("");
			    		    	newServer.setOwner(null);
			    		    	newServer.setServerId(null);
			    		    	newServer.setCategory(scbCategory.getValue().getValue().toString());
			    		    	newServer.setName(txtServerName.getValue());
			    		    	newServer.setStatus(scbStatus.getValue().getValue().toString());
			    		    	newServer.setParentName(scbParent.getValue().getParentName());
			    		    	newServer.setIpAddress(txtServerIp.getValue());
			    		    	newServer.setDnsName(txtServerDns.getValue());
			    		    	newServer.setOperatingSystem(scbOperatingSystem.getValue().getValue().toString());
			    		        newServer.setCpuQuantity(txtCpuQuantity.getValue());
			    		        newServer.setCpuSpeed(txtCpuSpeed.getValue());
			    		        newServer.setMemoryQuantity(txtMemoryQuantity.getValue());

			    		    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
			    		    	addServer(reservationService, newServer);
			    		}
			    		AddServerPopUp.this.hide();  
			    	}
			      }  
			    });
		    
		   add(btnAddServer, new AbsoluteData(375, 298));
		   btnAddServer.setSize("53px", "22px");
		    addWindowListener(new WindowListener() {  
		        @Override  
		        public void windowHide(WindowEvent we) {
		        	AddServerPopUp.this.hide();
		        }  
		      }); 
	}
				

	private ListStore<AsyncParent> getAsyncParents(ReservationServiceAsync reservationService) {
		final ListStore<AsyncParent> _asyncParentList = new ListStore<AsyncParent>();

		reservationService.getParents(new AsyncCallback<List<AsyncParent>>() {
			
			public void onFailure(Throwable caught) {
				Info.display("Reservation Service Error","Something Bad Happened on Listing Parents"); 
			}
			
			public void onSuccess(List<AsyncParent> result) {
				_asyncParentList.add(result);		
			}
			
		});
	return _asyncParentList;
	}

	public void addServer(ReservationServiceAsync reservationService, AsyncServer server) {
		
		reservationService.addServer(server, new AsyncCallback<Integer>() {

			public void onFailure(Throwable caught) {
				Info.display("Reservation Service Error: ", "Something Bad Happened Adding A Server");
			}

			public void onSuccess(Integer result) {
				eventBus.fireEvent(new DataChangeEvent());
				Info.display("Reservation Service Response","Added " + result.toString() + " number of servers.");
			}
			
		});
	}
	
	
	public ListStore<AsyncParent> getParent(final ReservationServiceAsync reservationService, final String parentName ) {
		final ListStore<AsyncParent> _asyncParentList = new ListStore<AsyncParent>();
		reservationService.getParent(parentName, new AsyncCallback<List<AsyncParent>>() {

			public void onFailure(Throwable caught) {
				Info.display("Reservation Service Error","Something Bad Happened Get A Single Parent");
				
			}

			public void onSuccess(List<AsyncParent> result) {
				_asyncParentList.add(result);
			}	
		}); 
		
		return _asyncParentList;
	}

	
}
