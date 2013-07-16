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
import com.pahlsoft.iaas.ui.client.AsyncParent;
import com.pahlsoft.iaas.ui.client.ReservationService;
import com.pahlsoft.iaas.ui.client.ReservationServiceAsync;
import com.pahlsoft.iaas.ui.client.events.DataChangeEvent;

public class DeleteParentPopUp extends Window  {
	
	SimpleEventBus eventBus = new SimpleEventBus();
	
	public DeleteParentPopUp(SimpleEventBus eventBus) {
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
	    setHeadingText("Delete A Parent");
	    setClosable(true);
	    setOnEsc(true);
	    setSize("465", "345");
	    
	    ListStore<AsyncParent> parents = null;
	    if (Beans.isDesignTime()) {
	    // Do nothing
	    } else {
	    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
	    	parents = getAsyncParents(reservationService);
	    }

	    setLayout(new AbsoluteLayout());
	    
	    LabelField labelParents = new LabelField("Parents:");
	    
	    add(labelParents, new AbsoluteData(34, 6));
	    labelParents.setSize("131px", "14px");
	    
	    final DualListField<AsyncParent> parentList = new DualListField<AsyncParent>();  

	    parentList.setMode(Mode.INSERT);  
	    parentList.setFieldLabel("Parents");  
	  
	    ListField<AsyncParent> from = parentList.getFromList();  
	    from.setDisplayField("parentName");
	    from.setStore(parents);  
	    ListField<AsyncParent> to = parentList.getToList();  
	    to.setDisplayField("parentName" );  
	    parents= new ListStore<AsyncParent>();  
	    to.setStore(parents);
	    
	    add(parentList, new AbsoluteData(81, 6));
	    parentList.setSize("347px", "206px");
	    
	    Button btnCancel = new Button("Cancel", new SelectionListener<ButtonEvent>() {  
	      @Override  
	      public void componentSelected(ButtonEvent ce) {  
	    	DeleteParentPopUp.this.hide();  
	      }  
	});

	  add(btnCancel, new AbsoluteData(324, 248));
	  btnCancel.setSize("45px", "22px");
	  
	   Button btnReserve = new Button("Delete", new SelectionListener<ButtonEvent>() {  
		      @Override  
		      public void componentSelected(ButtonEvent ce) {
		    	if (parentList.getToList().getListView().getItemCount() == 0 ) {
		    		MessageBox.alert("Invalid Selection","No Parent(s) Selected", null);
		    	} else {
		    		System.out.println("DEBUG: Deleting " + parentList.getToList().getStore().getCount() + " parents");
		    		
		    		if (Beans.isDesignTime()) {
		    		    // Do nothing
		    		    } else {
		    		    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
		    		    	ArrayList<AsyncParent> tmpList = new ArrayList<AsyncParent>();
		    		    	ArrayList<String> sList = new ArrayList<String>();
		    		    	tmpList.addAll(parentList.getToList().getStore().getModels());
		    		    	for (AsyncParent parent : tmpList) {
		    		    		sList.add(parent.getParentName());
		    		    		System.out.println("DEBUG: Adding Parent " + parent.getParentName() + " to delete List");
		    		    	}
		    		    	deleteParents(reservationService, sList);
		    		    }
		    		DeleteParentPopUp.this.hide();  
		    	}
		      }  
		    });
	   add(btnReserve, new AbsoluteData(375, 248));
	   btnReserve.setSize("53px", "22px");
	    addWindowListener(new WindowListener() {  
	        @Override  
	        public void windowHide(WindowEvent we) {
	        	
	        	DeleteParentPopUp.this.hide();
	        }  
	      }); 
	    setFocusWidget(getButtonBar().getItem(0));
		
	}

	public ListStore<AsyncParent> getAsyncParents(ReservationServiceAsync reservationService) {
		final ListStore<AsyncParent> _asyncParentList = new ListStore<AsyncParent>();

			reservationService.getParents(new AsyncCallback<List<AsyncParent>>() {
				
				public void onFailure(Throwable caught) {
					com.google.gwt.user.client.Window.alert("Something Bad Happened on Listing Parents"); 
				}
				
				public void onSuccess(List<AsyncParent> result) {
					_asyncParentList.add(result);		
				}
				
			});
		return _asyncParentList;
	}
	
	public void deleteParents(ReservationServiceAsync reservationService, ArrayList<String> parents) {
		
		reservationService.deleteParents(parents, new AsyncCallback<Integer>() {

			public void onFailure(Throwable caught) {
				com.google.gwt.user.client.Window.alert("Something Bad Happened Deleting Parent(s)");
			}

			public void onSuccess(Integer result) {
				Info.display("Reservation Service Response","Deleted " + result.toString() + " number of parents.");
				eventBus.fireEvent(new DataChangeEvent());
			}
			
		});
	}
}
