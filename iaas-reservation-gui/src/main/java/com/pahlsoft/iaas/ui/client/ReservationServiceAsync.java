package com.pahlsoft.iaas.ui.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;


public interface ReservationServiceAsync {
	// Getters
	void getServers(AsyncCallback<List<AsyncServer>> asyncCallback);
	void getServer(AsyncServer serverName,AsyncCallback<List<AsyncServer>> asyncCallback);
	
	void getUnreservedServers(AsyncCallback<List<AsyncServer>> asyncCallback);
	void getReservedServers(AsyncCallback<List<AsyncServer>> asyncCallback);
	
	void getReservations(String userName, AsyncCallback<List<String>> asyncCallback);
	void getServerStatus(String serverName, AsyncCallback<String> asyncCallback);
	
	void getStatistics(AsyncCallback<List<AsyncStatistics>> asyncCallback);
	void getServerStatistics(String serverName, AsyncCallback<AsyncStatistics> asyncCallback);
	
	void getStorage(AsyncCallback<List<AsyncStorage>> asyncCallback);
	void getServerStorageInfo(String entityName, AsyncCallback<List<AsyncStorage>> asyncCallback);
	
	void getUsers(AsyncCallback<List<AsyncUser>> asyncCallback);
	void getUser(AsyncUser userName, AsyncCallback<List<AsyncUser>> asyncCallback);
	
	void getParents(AsyncCallback<List<AsyncParent>> asyncCallback);
	void getParent(String parentName, AsyncCallback<List<AsyncParent>> asyncCallback);
	
	void getChildrenByParent(String parentName, AsyncCallback<List<String>> asyncCallback);
	
	// Setters
	void setReservation(ArrayList<AsyncServer> servers, String userId, AsyncCallback<Integer> asyncCallback);
	void setExpiration(ArrayList<String> servers, AsyncCallback<Integer> asyncCallback);

	void addServer(AsyncServer server, AsyncCallback<Integer> asyncCallback);
	void deleteServers(ArrayList<String> servers, AsyncCallback<Integer> asyncCallback);
	
	void addUser(AsyncUser user, AsyncCallback<Integer> asyncCallBack);
	void deleteUsers(ArrayList<String> user, AsyncCallback<Integer> asyncCallBack);
	
	void addParent(AsyncParent parent, AsyncCallback<Integer> asyncCallBack);
	void deleteParents(ArrayList<String> parent, AsyncCallback<Integer> asyncCallBack);

}

