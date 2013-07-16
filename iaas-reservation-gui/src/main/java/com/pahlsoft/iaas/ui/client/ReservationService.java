package com.pahlsoft.iaas.ui.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("reservations")
public interface ReservationService extends RemoteService {
	// Getters
	List<AsyncServer> getServers() throws IllegalArgumentException;
	List<AsyncServer> getServer(AsyncServer serverName) throws IllegalArgumentException;
	List<AsyncServer> getUnreservedServers() throws IllegalArgumentException;
	List<AsyncServer> getReservedServers() throws IllegalArgumentException;
	List<String> getReservations(String userName) throws IllegalArgumentException;
	String getServerStatus(String serverName) throws IllegalArgumentException;
	List<AsyncStatistics> getStatistics() throws IllegalArgumentException;
	AsyncStatistics getServerStatistics(String serverName) throws IllegalArgumentException;
	List<AsyncStorage> getStorage() throws IllegalArgumentException;
	List<AsyncStorage> getServerStorageInfo(String serverName) throws IllegalArgumentException;
	List<AsyncUser> getUsers() throws IllegalArgumentException;
	List<AsyncUser> getUser(AsyncUser userName) throws IllegalArgumentException;
	List<AsyncParent> getParents() throws IllegalArgumentException;
	List<AsyncParent> getParent(String parentName) throws IllegalArgumentException;
	
	// Setters
	Integer setReservation(ArrayList<AsyncServer> servers, String userId) throws IllegalArgumentException;
	Integer setExpiration(ArrayList<String> servers) throws IllegalArgumentException;
	Integer addServer(AsyncServer server) throws IllegalArgumentException;
	Integer deleteServers(ArrayList<String> servers) throws IllegalArgumentException;
	Integer addUser(AsyncUser user) throws IllegalArgumentException;
	Integer deleteUsers(ArrayList<String> user) throws IllegalArgumentException;
	Integer addParent(AsyncParent parent) throws IllegalArgumentException;
	Integer deleteParents(ArrayList<String> parents) throws IllegalArgumentException;
	
}
