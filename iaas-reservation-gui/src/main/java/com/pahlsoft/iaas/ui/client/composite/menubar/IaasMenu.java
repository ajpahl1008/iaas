package com.pahlsoft.iaas.ui.client.composite.menubar;

import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.Composite;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.extjs.gxt.ui.client.widget.menu.MenuBar;
import com.extjs.gxt.ui.client.widget.menu.MenuBarItem;
import com.extjs.gxt.ui.client.widget.menu.MenuItem;
import com.extjs.gxt.ui.client.widget.menu.SeparatorMenuItem;
import com.google.gwt.event.shared.SimpleEventBus;
import com.pahlsoft.iaas.ui.client.composite.menuwindows.AddParentPopUp;
import com.pahlsoft.iaas.ui.client.composite.menuwindows.AddServerPopUp;
import com.pahlsoft.iaas.ui.client.composite.menuwindows.AddUserPopUp;
import com.pahlsoft.iaas.ui.client.composite.menuwindows.DeleteParentPopUp;
import com.pahlsoft.iaas.ui.client.composite.menuwindows.DeleteServerPopUp;
import com.pahlsoft.iaas.ui.client.composite.menuwindows.DeleteUserPopUp;
import com.pahlsoft.iaas.ui.client.composite.menuwindows.ExpirationPopUp;
import com.pahlsoft.iaas.ui.client.composite.menuwindows.ReservationPopUp;

public class IaasMenu extends Composite  {

	public IaasMenu(final SimpleEventBus eventBus) {
		
    MenuBar menuBar = new MenuBar();
	
	Menu menuReservations = new Menu();
	
	MenuItem mntmReserve = new MenuItem("Reserve"); 
	mntmReserve.addSelectionListener(new SelectionListener<MenuEvent>() {
		public void componentSelected(MenuEvent ce) {
			ReservationPopUp reservationPopUp = new ReservationPopUp(eventBus);
			reservationPopUp.show();
    }
		
	});
		
	menuReservations.add(mntmReserve);
	
	MenuItem mntmExpire= new MenuItem("Expire");
	mntmExpire.addSelectionListener(new SelectionListener<MenuEvent>() {
		public void componentSelected(MenuEvent ce) {
			ExpirationPopUp expirationPopUp = new ExpirationPopUp(eventBus);
			expirationPopUp.show();
    }
		
	});
	
	menuReservations.add(mntmExpire);
	
	
	MenuBarItem mnbrtmReservation = new MenuBarItem("Reservations", menuReservations);
	menuBar.add(mnbrtmReservation);
	
	// Administration
	Menu menuAdministration = new Menu();
	
	MenuItem mntmServerReboot = new MenuItem("Server Reboot");
	menuAdministration.add(mntmServerReboot);
	
	MenuItem mntmStop = new MenuItem("Server Shutdown");
	menuAdministration.add(mntmStop);
	
	MenuItem mntmHalt = new MenuItem("Server Halt");
	menuAdministration.add(mntmHalt);
	
	MenuItem mntmBoot = new MenuItem("Server Boot");
	menuAdministration.add(mntmBoot);
	
	SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
	menuAdministration.add(separatorMenuItem);
	
	MenuItem mntmRestart = new MenuItem("Application Server Restart");
	menuAdministration.add(mntmRestart);
	
	MenuItem mntmRedeploy_1 = new MenuItem("Application Server Stop");
	menuAdministration.add(mntmRedeploy_1);
	MenuBarItem mnbrtmAdministration = new MenuBarItem("Administration", menuAdministration);
	menuBar.add(mnbrtmAdministration);
	
	// Servers
	Menu menuServers = new Menu();
	
	MenuItem mntmServer = new MenuItem("Add");
	mntmServer.addSelectionListener(new SelectionListener<MenuEvent>() {
		public void componentSelected(MenuEvent ce) {
			AddServerPopUp addServerPopUp = new AddServerPopUp(eventBus);
			addServerPopUp.show();
    }
		
	});
	menuServers.add(mntmServer);
	
	MenuItem mntmUser = new MenuItem("Delete");
	mntmUser.addSelectionListener(new SelectionListener<MenuEvent>() {
		public void componentSelected(MenuEvent ce) {
			DeleteServerPopUp deleteServerPopUp = new DeleteServerPopUp(eventBus);
			deleteServerPopUp.show();
    }
		
	});
	
	
	menuServers.add(mntmUser);
	MenuBarItem mnbrtmAdd = new MenuBarItem("Servers", menuServers);
	menuBar.add(mnbrtmAdd);
	
	
	// Parents
	Menu menuParents = new Menu();
	
	MenuItem mntmParentAdd = new MenuItem("Add");
	mntmParentAdd.addSelectionListener(new SelectionListener<MenuEvent>() {
		public void componentSelected(MenuEvent ce) {
			AddParentPopUp addParentPopUp = new AddParentPopUp(eventBus);
			addParentPopUp.show();
    }
		
	});
	menuParents.add(mntmParentAdd);
	
	MenuItem mntmParentDelete = new MenuItem("Delete");
	mntmParentDelete.addSelectionListener(new SelectionListener<MenuEvent>() {
		public void componentSelected(MenuEvent ce) {
			DeleteParentPopUp deleteParentPopUp = new DeleteParentPopUp(eventBus);
			deleteParentPopUp.show();
    }
		
	});
	
	
	menuParents.add(mntmParentDelete);
	MenuBarItem mnbrtmParentAdd = new MenuBarItem("Parents", menuParents);
	menuBar.add(mnbrtmParentAdd);
	
	// Users
	Menu menuUsers = new Menu();
	
	MenuItem mntmAdd = new MenuItem("Add");
	mntmAdd.addSelectionListener(new SelectionListener<MenuEvent>() {
		public void componentSelected(MenuEvent ce) {
			AddUserPopUp addUserPopUp = new AddUserPopUp(eventBus);
			addUserPopUp.show();
    }
		
	});
	
	menuUsers.add(mntmAdd);
	
	MenuItem mntmDelete = new MenuItem("Delete");
	mntmDelete.addSelectionListener(new SelectionListener<MenuEvent>() {
		public void componentSelected(MenuEvent ce) {
			DeleteUserPopUp deleteUserPopUp = new DeleteUserPopUp(eventBus);
			deleteUserPopUp.show();
    }
		
	});

	menuUsers.add(mntmDelete);
	
	MenuBarItem mnbrtmUsers = new MenuBarItem("Users", menuUsers);
	menuBar.add(mnbrtmUsers);
	
	
	// Schedule
	Menu menuSchedule = new Menu();
	
	MenuItem mntmRebuild = new MenuItem("Rebuild");
	menuSchedule.add(mntmRebuild);
	
	MenuItem mntmRedeploy = new MenuItem("Redeploy");
	menuSchedule.add(mntmRedeploy);
	MenuBarItem mnbrtmSchedule = new MenuBarItem("Schedule", menuSchedule);
	menuBar.add(mnbrtmSchedule);

	initComponent(menuBar);
	
	}
	
}
