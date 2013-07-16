package com.pahlsoft.ws.iaas.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.pahlsoft.ws.iaas.dao.ServerDao;
import com.pahlsoft.ws.iaas.dao.StatisticsDao;
import com.pahlsoft.ws.iaas.dao.StorageDao;
import com.pahlsoft.ws.iaas.dao.UserDao;
import com.pahlsoft.ws.iaas.generated.Parent;
import com.pahlsoft.ws.iaas.generated.Server;
import com.pahlsoft.ws.iaas.generated.Statistics;
import com.pahlsoft.ws.iaas.generated.Storage;
import com.pahlsoft.ws.iaas.generated.User;

@Service
@WebService(name ="ReservationSystemEndpoint",targetNamespace="http://iaas.ws.pahlsoft.com")
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class ReservationSystemEndpoint extends SpringBeanAutowiringSupport {
	
	@Autowired
	ServerDao serverDao;
	@Autowired
	StatisticsDao statisticsDao;
	@Autowired
	StorageDao storageDao;
	@Autowired
	UserDao userDao;
	
	@WebMethod
	public int addServer(@WebParam(name="serverInfo", targetNamespace="http://iaas.ws.pahlsoft.com") Server serverInfo) throws Exception {
		return serverDao.addServer(serverInfo);
	}
	
	@WebMethod
	public int addParent(@WebParam(name="parentInfo", targetNamespace="http://iaas.ws.pahlsoft.com") Parent parentInfo) throws Exception {
		return serverDao.addParent(parentInfo);
	}
	
	
	@WebMethod
	public List<Server> getReservations(@WebParam(name="userName", targetNamespace="http://iaas.ws.pahlsoft.com") String userName) throws Exception {
		return serverDao.getReservations(userName);
	}
	
    @WebMethod
	public int deleteServers(@WebParam(name="deleteServers", targetNamespace="http://iaas.ws.pahlsoft.com") ArrayList<String> serverNames) throws Exception {
		return serverDao.deleteServers(serverNames);
	}
    
    @WebMethod
	public int deleteParents(@WebParam(name="deleteParents", targetNamespace="http://iaas.ws.pahlsoft.com") ArrayList<String> parentNames) throws Exception {
		return serverDao.deleteParents(parentNames);
	}
	
	@WebMethod
	public int deleteServerStatistics(@WebParam(name="deleteServerStatistics", targetNamespace="http://iaas.ws.pahlsoft.com") String serverName) throws Exception {
		return statisticsDao.deleteServerStatistics(serverName);
	}
	
	@WebMethod
	public int deleteServerStorage(@WebParam(name="deleteServerStorage", targetNamespace="http://iaas.ws.pahlsoft.com") String serverName) throws Exception {
		return storageDao.deleteServerStorage(serverName);
	}

	@WebMethod
	public int deleteStorageEntity(@WebParam(name="deleteStorageEntity", targetNamespace="http://iaas.ws.pahlsoft.com") Storage storage) throws Exception {
		return storageDao.deleteStorageEntity(storage);
	}

	
	@WebMethod
	public int deleteUsers(@WebParam(name="userInfo",targetNamespace="http://iaas.ws.pahlsoft.com") ArrayList<String> users) throws Exception {
		return userDao.deleteUsers(users);
	}
	
	
	@WebMethod
	public int addUser(@WebParam(name="userInfo",targetNamespace="http://iaas.ws.pahlsoft.com") User userInfo) throws Exception {
		return userDao.addUser(userInfo);
	}
	
	@WebMethod
	@WebResult(name="AllStatistics")
	public List<Statistics> getAllServerStats() throws Exception {
		return statisticsDao.getAllServerStats();
	}
	
	@WebMethod
	@WebResult(name="AllStorage")
	public List<Storage> getAllStorageInfo() throws Exception {
		return storageDao.getAllStorageInfo();
	}

	@WebMethod
	@WebResult(name="ReservedServers")
	public List<Server> getReservedServers() throws Exception {
		return serverDao.getReservedServers();
	}
	
	@WebMethod
	@WebResult(name="Server")
	public List<Server> getServer(@WebParam(name="getServer", targetNamespace="http://iaas.ws.pahlsoft.com") String serverName) throws Exception {
		return serverDao.getServer(serverName);
	}
	
	@WebMethod
	@WebResult(name="Parent")
	public Parent getParent(@WebParam(name="getServer", targetNamespace="http://iaas.ws.pahlsoft.com") String parentName) throws Exception {
		return serverDao.getParent(parentName);
	}
	
	@WebMethod
	@WebResult(name="Servers")
	public List<Server> getServers() throws Exception {
		return serverDao.getServers();
	}

	@WebMethod
	@WebResult(name="Parents")
	public List<Parent> getParents() throws Exception {
		return serverDao.getParents();
	}
	
	@WebMethod
	@WebResult(name="Statistics")
	public Statistics getServerStats(@WebParam(name="serverName", targetNamespace="http://iaas.ws.pahlsoft.com") String serverName) throws Exception {
		return statisticsDao.getServerStats(serverName);
	}
	
	@WebMethod
	@WebResult(name="Storage")
	public List<Storage> getServerStorageInfo(@WebParam(name="serverName", targetNamespace="http://iaas.ws.pahlsoft.com") String serverName) throws Exception {
		return storageDao.getServerStorageInfo(serverName);
	}
	
	@WebMethod
	@WebResult(name="UnreservedServers")
	public List<Server> getUnreservedServers() throws Exception {
		return serverDao.getUnreservedServers();
	}
	
	@WebMethod
	@WebResult(name="Users")
	public List<User> getUsers() throws Exception {
		return userDao.getUsers();
	}
	
	@WebMethod
	public List<User> getUser(@WebParam(name="userName", targetNamespace="http://iaas.ws.pahlsoft.com") String userName) throws Exception {
		return userDao.getUser(userName);
	}
	
	// Required to Autowire the DAOs into a JAX-WS service
	@PostConstruct
	public void init() {
	    SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
	
	@WebMethod
	public int setExpiration(@WebParam(name="servers", targetNamespace="http://iaas.ws.pahlsoft.com") ArrayList<String> servers) throws Exception {
		return serverDao.setExpiration(servers);
	}
	
	@WebMethod
	public boolean setMultiStorage(@WebParam(name="storageEntityList", targetNamespace="http://iaas.ws.pahlsoft.com") ArrayList<Storage> serverStorage) throws Exception {
		return storageDao.setMultiStorage(serverStorage);
	}
	
	@WebMethod
	public int setReservation(@WebParam(name="serverName", targetNamespace="http://iaas.ws.pahlsoft.com") ArrayList<Server> servers, 
							  @WebParam(name="user", targetNamespace="http://iaas.ws.pahlsoft.com") String userId) throws Exception {
		
		return serverDao.setReservation(servers,userId);
	}
	
	@WebMethod
	public int setServer(@WebParam(name="serverInfo", targetNamespace="http://iaas.ws.pahlsoft.com") Server serverInfo) throws Exception {
		return serverDao.setServer(serverInfo);
	}
	
	@WebMethod
	public boolean setServerStats(@WebParam(name="setServerStats", targetNamespace="http://iaas.ws.pahlsoft.com") Statistics serverStats ) throws Exception {
		return statisticsDao.setServerStats(serverStats);
	}
	
	@WebMethod
	public boolean setSingleStorage(@WebParam(name="storageEntity", targetNamespace="http://iaas.ws.pahlsoft.com") Storage serverStorage) throws Exception {
		return storageDao.setSingleStorage(serverStorage);
	}
	
	@WebMethod
	public int setUser(@WebParam(name="userInfo",targetNamespace="http://iaas.ws.pahlsoft.com") User userInfo) throws Exception {
		return userDao.setUser(userInfo);
	}
	
	
}
