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
import com.pahlsoft.iaas.ui.client.AsyncError;
import com.pahlsoft.iaas.ui.client.Enums;
import com.pahlsoft.iaas.ui.client.MessagingService;
import com.pahlsoft.iaas.ui.client.MessagingServiceAsync;
import com.pahlsoft.iaas.ui.client.events.DataChangeEvent;
import com.pahlsoft.iaas.ui.client.events.DataChangeEventHandler;

public class ErrorsPanel extends Composite  {
	
	Grid<AsyncError> grid = null;

	public ErrorsPanel(final SimpleEventBus eventBus, final Enums.ReportType enums, final String title) {
		ColumnConfig column = new ColumnConfig();
		List<ColumnConfig> configs = new ArrayList<ColumnConfig>();
	    
	    column.setId("errorDate");
	    column.setHeaderText("Time/Date");
	    column.setWidth(100);
	    configs.add(column);

	    column = new ColumnConfig("errorInfo","Error Info",330);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    final ColumnModel cm = new ColumnModel(configs);
	    
	    if (Beans.isDesignTime()) {
	    	grid = new Grid<AsyncError>(new ListStore<AsyncError>(),cm);
	    } else {
	    	
	    	MessagingServiceAsync messagingService = GWT.create(MessagingService.class);
	    	grid = new Grid<AsyncError>(getAsyncErrors(messagingService, enums),cm);
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
				grid.reconfigure(getAsyncErrors(messagingService, enums), cm);
				grid.repaint();
	    	}
	    	
	    });
	    initComponent(grid);
	}
	
	public ListStore<AsyncError> getAsyncErrors(MessagingServiceAsync messagingService, Enums.ReportType enums) {
		final ListStore<AsyncError> asyncEventList = new ListStore<AsyncError>();
	
		if (enums.name().contentEquals(Enums.ReportType.TODAY.toString())) {
			messagingService.getErrorsToday(new AsyncCallback<List<AsyncError>>() {
				
				public void onFailure(Throwable caught) {
					Info.display("WebService Error", "Something Bad Happened on Listing Events"); 
				}
				
				public void onSuccess(List<AsyncError> result) {
					asyncEventList.add(result);		
				}
				
			});
		} else if (enums.name().contentEquals(Enums.ReportType.YESTERDAY.toString())) {
			messagingService.getErrorsYesterday(new AsyncCallback<List<AsyncError>>() {
				
				public void onFailure(Throwable caught) {
					Info.display("WebService Error", "Something Bad Happened on Listing Events"); 
				}
				
				public void onSuccess(List<AsyncError> result) {
					
					asyncEventList.add(result);		
				}
				
			});
		 } else if (enums.name().contentEquals(Enums.ReportType.LASTWEEK.toString())) {
			messagingService.getErrorsLastWeek(new AsyncCallback<List<AsyncError>>() {
				
				public void onFailure(Throwable caught) {
					Info.display("WebService Error", "Something Bad Happened on Listing Events");
				}
				
				public void onSuccess(List<AsyncError> result) {
					asyncEventList.add(result);		
				}
				
			});
		} else if (enums.name().contentEquals(Enums.ReportType.LASTMONTH.toString())) {
			messagingService.getErrorsLastMonth(new AsyncCallback<List<AsyncError>>() {
				
				public void onFailure(Throwable caught) {
					Info.display("WebService Error", "Something Bad Happened on Listing Events"); 
				}
				
				public void onSuccess(List<AsyncError> result) {
					asyncEventList.add(result);		
				}
				
			});
		}
		
		return asyncEventList;
	}
	
}
