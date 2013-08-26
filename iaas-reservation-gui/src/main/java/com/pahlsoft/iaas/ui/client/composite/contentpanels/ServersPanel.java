package com.pahlsoft.iaas.ui.client.composite.contentpanels;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.store.GroupingStore;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.Composite;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.Info;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridGroupRenderer;
import com.extjs.gxt.ui.client.widget.grid.GroupColumnData;
import com.extjs.gxt.ui.client.widget.grid.GroupingView;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pahlsoft.iaas.ui.client.AsyncServer;
import com.pahlsoft.iaas.ui.client.ReservationService;
import com.pahlsoft.iaas.ui.client.ReservationServiceAsync;
import com.pahlsoft.iaas.ui.client.events.DataChangeEvent;
import com.pahlsoft.iaas.ui.client.events.DataChangeEventHandler;

public class ServersPanel extends Composite  {
	
	Grid<AsyncServer> grid = null;
	
	public ServersPanel(final SimpleEventBus eventBus) {
		
		ColumnConfig column = new ColumnConfig();
	    final List<ColumnConfig> configs = new ArrayList<ColumnConfig>();
	    
	    column.setId("name");
	    column.setHeaderText("Server Names");
	    column.setWidth(100);
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
	    
	    column = new ColumnConfig("cpuQuantity","CPUs",40);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    column = new ColumnConfig("cpuSpeed","CPU Speed",80);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    column = new ColumnConfig("memoryQuantity","Memory (MB)",80);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);

	    column = new ColumnConfig("owner.lastname","LastName",80);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    column = new ColumnConfig("owner.loginid","LoginID",80);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    column = new ColumnConfig("startDate","StartDate",75);
	    column.setAlignment(HorizontalAlignment.LEFT);
	    configs.add(column);
	    
	    column = new ColumnConfig("expirationDate","ExpirationDate",75);
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
	        
	        GroupingView groupView = new GroupingView();
	        groupView.setShowGroupedColumn(false);
	        groupView.setForceFit(true);
	        groupView.setGroupRenderer(new GridGroupRenderer() {

				@Override
				public String render(GroupColumnData data) {
					String f = cm.getColumnById(data.field).getHeaderHtml();  
			        String l = data.models.size() == 1 ? "Item" : "Items";  
			        return f + ": " + data.group + " (" + data.models.size() + " " + l + ")";  
				}
	        	
	        });
	    	grid = new Grid<AsyncServer>(getAsyncServers(reservationService),cm);
	        grid.setView(groupView);
	    	grid.setColumnLines(true);
	    	grid.setStripeRows(true);
	        grid.setHeight("420px");
	        grid.setWidth("1000px");
	        grid.setLazyRowRender(0);
	        
	     }
	    
	    //Update the Grid because the data has changed.
	    eventBus.addHandler(DataChangeEvent.TYPE, new DataChangeEventHandler() {
			public void onEvent(DataChangeEvent event) {
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
	
	public GroupingStore<AsyncServer> getAsyncServers(ReservationServiceAsync reservationService) {
		final GroupingStore<AsyncServer> _asyncServerGroupingStore = new GroupingStore<AsyncServer>();

		reservationService.getServers(new AsyncCallback<List<AsyncServer>>() {
			
			public void onFailure(Throwable caught) {
				Info.display("WebService Error", "Something Bad Happened on Listing Servers"); 

			}
			
			public void onSuccess(List<AsyncServer> result) {
				_asyncServerGroupingStore.add(result);		
			}
			
		});
		
		return _asyncServerGroupingStore;
	}
	
}
