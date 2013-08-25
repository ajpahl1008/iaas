package com.pahlsoft.iaas.ui.client;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.Style.Orientation;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.TabItem;
import com.extjs.gxt.ui.client.widget.TabPanel;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteData;
import com.extjs.gxt.ui.client.widget.layout.AbsoluteLayout;
import com.extjs.gxt.ui.client.widget.layout.AccordionLayout;
import com.extjs.gxt.ui.client.widget.layout.CenterLayout;
import com.extjs.gxt.ui.client.widget.layout.FillLayout;
import com.extjs.gxt.ui.client.widget.layout.FlowLayout;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RootPanel;
import com.pahlsoft.iaas.ui.client.composite.contentpanels.ErrorsPanel;
import com.pahlsoft.iaas.ui.client.composite.contentpanels.EventsPanel;
import com.pahlsoft.iaas.ui.client.composite.contentpanels.Servers;
import com.pahlsoft.iaas.ui.client.composite.contentpanels.Statistics;
import com.pahlsoft.iaas.ui.client.composite.contentpanels.Storage;
import com.pahlsoft.iaas.ui.client.composite.menubar.IaasMenu;

public class Iaas_reservation_ui implements EntryPoint {

	SimpleEventBus eventBus = new SimpleEventBus();
	
	public void onModuleLoad() {
		
		
	    RootPanel rootPanel = RootPanel.get("mainBorder");
	    rootPanel.setLayoutData(new CenterLayout());
	    rootPanel.setStyleName("center");

	    
	    	GWT.setUncaughtExceptionHandler( new CustomUncaughtExceptionHandler() );
		    Viewport viewPort = new Viewport();
		    viewPort.setSize("1000px", "831px");
		    viewPort.setLayout(new FlowLayout());
		    
		    
		    ContentPanel cntntpnlOverview = new ContentPanel();
		    cntntpnlOverview.setHideCollapseTool(true);
		    cntntpnlOverview.setButtonAlign(HorizontalAlignment.CENTER);
		    cntntpnlOverview.setHeadingText("Overview");
		    cntntpnlOverview.setCollapsible(true);
		    
		    TabPanel gxtTabPanel = new TabPanel();
		    gxtTabPanel.setHeight(150);
		    
		    TabItem tbtmServers = new TabItem("Servers");
		    Servers iaasServerTab = new Servers(eventBus);
		    tbtmServers.add(iaasServerTab);
		    gxtTabPanel.add(tbtmServers);
		    
		    TabItem tbtmStorage = new TabItem("Storage");
		    Storage iaasStorageTab = new Storage();
		    tbtmStorage.add(iaasStorageTab);
		    gxtTabPanel.add(tbtmStorage);
		    
		    TabItem tbtmStatistics = new TabItem("Statistics");
		    Statistics iaasStatisticsTab = new Statistics();
		    tbtmStatistics.add(iaasStatisticsTab);
		    gxtTabPanel.add(tbtmStatistics);
		    
		    cntntpnlOverview.add(gxtTabPanel);
		    gxtTabPanel.setHeight("385");
		    viewPort.setLayout(new AbsoluteLayout());
		    
		    IaasMenu menuBar = new IaasMenu(eventBus);
		    viewPort.add(menuBar, new AbsoluteData(140, 6));
		    menuBar.setSize("1000px", "30px");
		    menuBar.setPosition(13,10);
		    

		    viewPort.add(cntntpnlOverview, new AbsoluteData(140, 42));
		    cntntpnlOverview.setSize("1000px", "412px");
		    cntntpnlOverview.setPosition(10, 40);
		    
		    ContentPanel cntntpnlEvents = new ContentPanel();
		    cntntpnlEvents.setHideCollapseTool(true);
		    cntntpnlEvents.setHeadingText("Events");
		    cntntpnlEvents.setCollapsible(true);
		    cntntpnlEvents.setLayout(new AccordionLayout());
		    
		    FormPanel frmpnlToday = new FormPanel();
		    frmpnlToday.setPadding(0);
		    frmpnlToday.setHeadingText("Today");
		    frmpnlToday.setCollapsible(true);
		    frmpnlToday.setLayout(new FillLayout(Orientation.VERTICAL));
		    EventsPanel eventsTodayGrid = new EventsPanel(eventBus,Enums.ReportType.TODAY, "TODAY");
		    frmpnlToday.add(eventsTodayGrid);
		    cntntpnlEvents.add(frmpnlToday);
		    
		    		    FormPanel frmpnlEventsLast24 = new FormPanel();
		    		    frmpnlEventsLast24.setPadding(0);
		    		    frmpnlEventsLast24.setHeadingText("Yesterday");
		    		    frmpnlEventsLast24.setCollapsible(true);
		    		    frmpnlEventsLast24.setLayout(new FillLayout());
		    		    EventsPanel eventsLast24Grid = new EventsPanel(eventBus, Enums.ReportType.YESTERDAY, "YESTERDAY");
		    		    frmpnlEventsLast24.add(eventsLast24Grid);
		    		    cntntpnlEvents.add(frmpnlEventsLast24);
		    		    
		    		    FormPanel frmpnlEventsLastWeek = new FormPanel();
		    		    frmpnlEventsLastWeek.setPadding(0);
		    		    frmpnlEventsLastWeek.setHeadingText("Last Week");
		    		    frmpnlEventsLastWeek.setCollapsible(true);
		    		    frmpnlEventsLastWeek.setLayout(new FillLayout());
		    		    EventsPanel eventsLastWeekGrid = new EventsPanel(eventBus, Enums.ReportType.LASTWEEK, "LAST WEEK");
		    		    frmpnlEventsLastWeek.add(eventsLastWeekGrid);
		    		    cntntpnlEvents.add(frmpnlEventsLastWeek);
		    		    
		    		    FormPanel frmpnlEventsLastMonth = new FormPanel();
		    		    frmpnlEventsLastMonth.setPadding(0);
		    		    frmpnlEventsLastMonth.setHeadingText("Last Month");
		    		    frmpnlEventsLastMonth.setCollapsible(true);
		    		    frmpnlEventsLastMonth.setLayout(new FillLayout());
		    		    EventsPanel eventsLastMonthGrid = new EventsPanel(eventBus, Enums.ReportType.LASTMONTH, "LAST MONTH");
		    		    frmpnlEventsLastMonth.add(eventsLastMonthGrid);
		    		    cntntpnlEvents.add(frmpnlEventsLastMonth);
		    		    cntntpnlEvents.setSize("483px", "341px");
		    		    viewPort.add(cntntpnlEvents, new AbsoluteData(140, 460));
		    		    cntntpnlEvents.setPosition(10,458);
		    		    
		    		    ContentPanel cntntpnlErrors = new ContentPanel();
		    		    cntntpnlErrors.setHideCollapseTool(true);
		    		    cntntpnlErrors.setHeadingText("Errors");
		    		    cntntpnlErrors.setCollapsible(true);
		    		    cntntpnlErrors.setLayout(new AccordionLayout());
		    		    
		    		    FormPanel frmpnlErrorsToday = new FormPanel();
		    		    frmpnlErrorsToday.setPadding(0);
		    		    frmpnlErrorsToday.setHeadingText("Today");
		    		    frmpnlErrorsToday.setCollapsible(true);
		    		    frmpnlErrorsToday.setLayout(new FillLayout());
		    		    ErrorsPanel errorsTodayGrid  = new ErrorsPanel(eventBus, Enums.ReportType.TODAY, "TODAY");
		    		    frmpnlErrorsToday.add(errorsTodayGrid);
		    		    cntntpnlErrors.add(frmpnlErrorsToday);
		    		    
		    		    FormPanel frmpnlErrorsYesterday = new FormPanel();
		    		    frmpnlErrorsYesterday.setPadding(0);
		    		    frmpnlErrorsYesterday.setHeadingText("Yesterday");
		    		    frmpnlErrorsYesterday.setCollapsible(true);
		    		    frmpnlErrorsYesterday.setLayout(new FillLayout());
		    		    ErrorsPanel errorsYesterdayGrid  = new ErrorsPanel(eventBus, Enums.ReportType.YESTERDAY, "YESTERDAY");
		    		    frmpnlErrorsYesterday.add(errorsYesterdayGrid);
		    		    cntntpnlErrors.add(frmpnlErrorsYesterday);
		    		    
		    		    FormPanel frmpnlErrorsThisWeek = new FormPanel();
		    		    frmpnlErrorsThisWeek.setPadding(0);
		    		    frmpnlErrorsThisWeek.setHeadingText("Last Week");
		    		    frmpnlErrorsThisWeek.setCollapsible(true);
		    		    frmpnlErrorsThisWeek.setLayout(new FillLayout());
		    		    ErrorsPanel errorsThisWeekGrid  = new ErrorsPanel(eventBus, Enums.ReportType.LASTWEEK, "LAST WEEK");
		    		    frmpnlErrorsThisWeek.add(errorsThisWeekGrid);
		    		    cntntpnlErrors.add(frmpnlErrorsThisWeek);
		    		    
		    		    FormPanel frmpnlErrorsLastMonth = new FormPanel();
		    		    frmpnlErrorsLastMonth.setPadding(0);
		    		    frmpnlErrorsLastMonth.setHeadingText("Last Month");
		    		    frmpnlErrorsLastMonth.setCollapsible(true);
		    		    frmpnlErrorsLastMonth.setLayout(new FillLayout());
		    		    ErrorsPanel errorsThisMonthGrid  = new ErrorsPanel(eventBus, Enums.ReportType.LASTMONTH, "LAST MONTH");
		    		    frmpnlErrorsLastMonth.add(errorsThisMonthGrid);
		    		    cntntpnlErrors.add(frmpnlErrorsLastMonth);
		    		    cntntpnlErrors.setSize("509px", "341px");
		    		    viewPort.add(cntntpnlErrors, new AbsoluteData(629, 460));
		    		    cntntpnlErrors.setPosition(499,458);
		    		    
		    		    rootPanel.add(viewPort);
		    		    
		    		    rootPanel.setSize("1000", "831");
		                DOM.removeChild(RootPanel.getBodyElement(),	 DOM.getElementById("loadingScreen"));
			
	}

}
