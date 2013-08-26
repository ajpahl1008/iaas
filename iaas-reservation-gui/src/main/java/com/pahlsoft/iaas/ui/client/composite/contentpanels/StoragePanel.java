package com.pahlsoft.iaas.ui.client.composite.contentpanels;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.Composite;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.Info;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pahlsoft.iaas.ui.client.AsyncStorage;
import com.pahlsoft.iaas.ui.client.ReservationService;
import com.pahlsoft.iaas.ui.client.ReservationServiceAsync;

public class StoragePanel extends Composite {

	public StoragePanel() {
		
	    ColumnConfig columnStorage = new ColumnConfig();
	    List<ColumnConfig> configsStorage = new ArrayList<ColumnConfig>();
	    
	    columnStorage.setId("serverName");
	    columnStorage.setHeaderText("Server Name");
	    columnStorage.setWidth(200);
	    configsStorage.add(columnStorage);
	    
	    columnStorage = new ColumnConfig("storageEntity","Storage Entity Name",150);
	    columnStorage.setAlignment(HorizontalAlignment.LEFT);
	    configsStorage.add(columnStorage);
	    
	    columnStorage = new ColumnConfig("storageSize","Size (GB)",150);
	    columnStorage.setAlignment(HorizontalAlignment.LEFT);
	    configsStorage.add(columnStorage);
	    
	    columnStorage = new ColumnConfig("percentFree","Free (%)",150);
	    columnStorage.setAlignment(HorizontalAlignment.LEFT);
	    configsStorage.add(columnStorage);
	    
	    ColumnModel cmStorage = new ColumnModel(configsStorage);
	    ContentPanel cpStorage = new ContentPanel();
	    cpStorage.setHeadingText("Storage Overview");
	    
	    Grid<AsyncStorage> gridStorage = null;
	    if (Beans.isDesignTime()) {
	    	gridStorage = new Grid<AsyncStorage>(new ListStore<AsyncStorage>(),cmStorage);
	    } else {
	    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
	    	gridStorage = new Grid<AsyncStorage>(getAsyncStorage(reservationService),cmStorage);
	    	gridStorage.setHeight("420px");
	    	gridStorage.setWidth("1000px");
	    	gridStorage.setColumnLines(true);
	    	gridStorage.setStripeRows(true);
	    }
	    cpStorage.setHeight("360px");
	    cpStorage.setWidth("1000px");
	    cpStorage.add(gridStorage);
		initComponent(cpStorage);
	}

	public ListStore<AsyncStorage> getAsyncStorage(ReservationServiceAsync reservationService) {
		final ListStore<AsyncStorage> _asyncStorageList = new ListStore<AsyncStorage>();
		 // Make the ASYNC Call to the Reservation Service
	    reservationService.getStorage(new AsyncCallback<List<AsyncStorage>>() {
	    	
	    	public void onFailure(Throwable caught) {
				Info.display("WebService Error", "Something Bad Happened on Listing Events"); 
	    	}
	    	
	    	public void onSuccess(List<AsyncStorage> result) {
	    		_asyncStorageList.add(result);		
	    	}
	    	
	    });
	    
	    return _asyncStorageList;
	}


}


