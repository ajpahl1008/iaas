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
import com.pahlsoft.iaas.ui.client.AsyncStatistics;
import com.pahlsoft.iaas.ui.client.ReservationService;
import com.pahlsoft.iaas.ui.client.ReservationServiceAsync;

public class StatisticsPanel extends Composite {
	
	public StatisticsPanel() {
	

		ColumnConfig columnStatistics = new ColumnConfig();
		List<ColumnConfig> configsStatistics = new ArrayList<ColumnConfig>();
		
		columnStatistics.setId("serverName");
		columnStatistics.setHeaderText("Server Name");
		columnStatistics.setWidth(200);
		configsStatistics.add(columnStatistics);
		
		columnStatistics = new ColumnConfig("serverUptime","Uptime",150);
		columnStatistics.setAlignment(HorizontalAlignment.LEFT);
		configsStatistics.add(columnStatistics);
		
		columnStatistics = new ColumnConfig("contextSwitching","Context Switching",150);
		columnStatistics.setAlignment(HorizontalAlignment.LEFT);
		configsStatistics.add(columnStatistics);
		
		columnStatistics = new ColumnConfig("serverLoad","Load",150);
		columnStatistics.setAlignment(HorizontalAlignment.LEFT);
		configsStatistics.add(columnStatistics);
		
		ColumnModel cmStatistics = new ColumnModel(configsStatistics);
		ContentPanel cpStatistics = new ContentPanel();
		cpStatistics.setHeadingText("Statistic Overview");
		
		Grid<AsyncStatistics> gridStatistics = null;
		if (Beans.isDesignTime()) {
			gridStatistics = new Grid<AsyncStatistics>(new ListStore<AsyncStatistics>(),cmStatistics);
		} else {
			ReservationServiceAsync reservationService = GWT.create(ReservationService.class);
			gridStatistics = new Grid<AsyncStatistics>(getAsyncStatistics(reservationService),cmStatistics);
			gridStatistics.setColumnLines(true);
	    	gridStatistics.setStripeRows(true);
		    gridStatistics.setHeight("420px");
	        gridStatistics.setWidth("1000px");
			
		}
		
		cpStatistics.setHeight("360px");
	    cpStatistics.setWidth("1000px");
		cpStatistics.add(gridStatistics);
			
		initComponent(cpStatistics);
	}
	
	public ListStore<AsyncStatistics> getAsyncStatistics(ReservationServiceAsync reservationService) {
		final ListStore<AsyncStatistics> _asyncStatisticsList = new ListStore<AsyncStatistics>();
		 // Make the ASYNC Call to the Reservation Service
	    reservationService.getStatistics(new AsyncCallback<List<AsyncStatistics>>() {
	    	
	    	public void onFailure(Throwable caught) {
				Info.display("WebService Error", "Something Bad Happened on Listing Statistics"); 

	    	}
	    	
	    	public void onSuccess(List<AsyncStatistics> result) {
	    		_asyncStatisticsList.add(result);		
	    	}
	    	
	    });
	    
	    return _asyncStatisticsList;
	}

}
