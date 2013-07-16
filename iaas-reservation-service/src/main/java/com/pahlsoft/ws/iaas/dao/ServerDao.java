package com.pahlsoft.ws.iaas.dao;

import java.util.ArrayList;
import java.util.List;

import com.pahlsoft.ws.iaas.generated.Parent;
import com.pahlsoft.ws.iaas.generated.Server;

public interface ServerDao {
	public List<Server> getServer(String serverName);
	public List<Server> getServers();
	public List<Server> getUnreservedServers();
	public List<Server> getReservedServers();
	public List<Server> getReservations(String userName);
	public List<Parent> getParents();
	public Parent getParent(String serverName);

	public int setServer(Server serverInfo);
	public int deleteServers(ArrayList<String> serverName);
	public int deleteParents(ArrayList<String> parentName);
	public int setReservation(ArrayList<Server> servers, String user);
	public int setExpiration(ArrayList<String> servers);
	public int addServer(Server serverInfo);
	public int addParent(Parent parentInfo);
	
}
