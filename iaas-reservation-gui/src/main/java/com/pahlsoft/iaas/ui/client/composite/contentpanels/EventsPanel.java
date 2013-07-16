package com.pahlsoft.iaas.ui.client.composite.contentpanels;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.Composite;
import com.extjs.gxt.ui.client.widget.Info;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pahlsoft.iaas.ui.client.AsyncEvent;
import com.pahlsoft.iaas.ui.client.Enums;
import com.pahlsoft.iaas.ui.client.MessagingService;
import com.pahlsoft.iaas.ui.client.MessagingServiceAsync;
import com.pahlsoft.iaas.ui.client.events.DataChangeEvent;
import com.pahlsoft.iaas.ui.client.events.DataChangeEventHandler;

public class EventsPanel extends Composite  {
	
	Grid<AsyncEvent> grid = null;

	public EventsPanel(final SimpleEventBus eventBus, final Enums.ReportType enums, final String title) {
		ColumnConfig column = new ColumnConfig();
		List<ColumnConfig> configs = new ArrayList<ColumnConfig>();
	    
	    column.setId("eventDate");
	    column.setHeaderText("Time/Date");
	    column.setWidth(100);
	    configs.add(column);

	    column = new ColumnConfig("eventInfo","Event Info",330);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    final ColumnModel cm = new ColumnModel(configs);
	    
	    if (Beans.isDesignTime()) {
	    	grid = new Grid<AsyncEvent>(new ListStore<AsyncEvent>(),cm);
	    } else {
	    	
	    	MessagingServiceAsync messagingService = GWT.create(MessagingService.class);
	    	grid = new Grid<AsyncEvent>(getAsyncEvents(messagingService, enums),cm);
	    	grid.setColumnLines(true);
	    	grid.setStripeRows(true);
	        grid.setHeight("200px");
	        grid.setWidth("900px");
	        
	    }
	    
	    //Update the Grid because the data has changed.
	    eventBus.addHandler(DataChangeEvent.TYPE, new DataChangeEventHandler() {
			public void onEvent(DataChangeEvent event) {
				System.out.println("Refreshing EventPanel Grids");
				grid.getStore().removeAll();
				MessagingServiceAsync messagingService = GWT.create(MessagingService.class);
				grid.reconfigure(getAsyncEvents(messagingService, enums), cm);
				grid.repaint();
	    	}
	    	
	    });
	    initComponent(grid);
	}
	
	public ListStore<AsyncEvent> getAsyncEvents(MessagingServiceAsync messagingService, Enums.ReportType enums) {
		final ListStore<AsyncEvent> asyncEventList = new ListStore<AsyncEvent>();
	
		if (enums.name().contentEquals(Enums.ReportType.TODAY.toString())) {
			messagingService.getEventsToday(new AsyncCallback<List<AsyncEvent>>() {
				
				public void onFailure(Throwable caught) {
					Info.display("WebService Error", "Something Bad Happened on Listing Events"); 
				}
				
				public void onSuccess(List<AsyncEvent> result) {
					asyncEventList.add(result);		
				}
				
			});
		} else if (enums.name().contentEquals(Enums.ReportType.YESTERDAY.toString())) {
			messagingService.getEventsYesterday(new AsyncCallback<List<AsyncEvent>>() {
				
				public void onFailure(Throwable caught) {
					Info.display("WebService Error", "Something Bad Happened on Listing Events"); 
				}
				
				public void onSuccess(List<AsyncEvent> result) {
					
					asyncEventList.add(result);		
				}
				
			});
		 } else if (enums.name().contentEquals(Enums.ReportType.LASTWEEK.toString())) {
			messagingService.getEventsLastWeek(new AsyncCallback<List<AsyncEvent>>() {
				
				public void onFailure(Throwable caught) {
					Info.display("WebService Error", "Something Bad Happened on Listing Events");
				}
				
				public void onSuccess(List<AsyncEvent> result) {
					asyncEventList.add(result);		
				}
				
			});
		} else if (enums.name().contentEquals(Enums.ReportType.LASTMONTH.toString())) {
			messagingService.getEventsLastMonth(new AsyncCallback<List<AsyncEvent>>() {
				
				public void onFailure(Throwable caught) {
					Info.display("WebService Error", "Something Bad Happened on Listing Events"); 
				}
				
				public void onSuccess(List<AsyncEvent> result) {
					asyncEventList.add(result);		
				}
				
			});
		}
		
		return asyncEventList;
	}
	
}
