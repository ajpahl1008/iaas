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
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pahlsoft.iaas.ui.client.AsyncServer;
import com.pahlsoft.iaas.ui.client.ReservationService;
import com.pahlsoft.iaas.ui.client.ReservationServiceAsync;
import com.pahlsoft.iaas.ui.client.events.DataChangeEvent;
import com.pahlsoft.iaas.ui.client.events.DataChangeEventHandler;

public class Servers extends Composite  {
	
	Grid<AsyncServer> grid = null;
	
	public Servers(final SimpleEventBus eventBus) {
		
		ColumnConfig column = new ColumnConfig();
	    final List<ColumnConfig> configs = new ArrayList<ColumnConfig>();
	    
	    column.setId("name");
	    column.setHeaderText("Server Names");
	    column.setWidth(200);
	    configs.add(column);
	    
	    column = new ColumnConfig("status","Status",75);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    column = new ColumnConfig("parentName","Parent",75);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    column = new ColumnConfig("category","Category",75);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    column = new ColumnConfig("startDate","Start Date",100);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    column = new ColumnConfig("expirationDate","Expiration Date",100);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    column = new ColumnConfig("owner.lastname","Last Name",150);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    column = new ColumnConfig("owner.loginid","Login ID",150);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    final ColumnModel cm = new ColumnModel(configs);
	    
	    ContentPanel cp = new ContentPanel();
	    cp.setHeadingText("Server Overview");
	    cp.setLayout(new FitLayout());
	    
	    if (Beans.isDesignTime()) {
	    	grid = new Grid<AsyncServer>(new ListStore<AsyncServer>(),cm);
	    } else {
	    	ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
	    	grid = new Grid<AsyncServer>(getAsyncServers(reservationService),cm);
	    	grid.setColumnLines(true);
	    	grid.setStripeRows(true);
	        grid.setHeight("420px");
	        grid.setWidth("1000px");
	    
	    }
	    
	    //Update the Grid because the data has changed.
	    eventBus.addHandler(DataChangeEvent.TYPE, new DataChangeEventHandler() {
			public void onEvent(DataChangeEvent event) {
				System.out.println("Refreshing Server Grid");
				grid.getStore().removeAll();
				ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
				grid.reconfigure(getAsyncServers(reservationService), cm);
				grid.repaint();
	    	}
	    	
	    });
	    
	    cp.setHeight("360px");
	    cp.setWidth("1000px");
	    cp.add(grid);
	    initComponent(cp);
	}
	
	public ListStore<AsyncServer> getAsyncServers(ReservationServiceAsync reservationService) {
		final ListStore<AsyncServer> _asyncServerList = new ListStore<AsyncServer>();

		reservationService.getServers(new AsyncCallback<List<AsyncServer>>() {
			
			public void onFailure(Throwable caught) {
				Info.display("WebService Error", "Something Bad Happened on Listing Servers"); 

			}
			
			public void onSuccess(List<AsyncServer> result) {
				_asyncServerList.add(result);		
			}
			
		});
		
		return _asyncServerList;
	}
	
}
