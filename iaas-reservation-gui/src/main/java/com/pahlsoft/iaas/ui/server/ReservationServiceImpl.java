package com.pahlsoft.iaas.ui.server;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.pahlsoft.iaas.ui.client.AsyncParent;
import com.pahlsoft.iaas.ui.client.AsyncServer;
import com.pahlsoft.iaas.ui.client.AsyncStatistics;
import com.pahlsoft.iaas.ui.client.AsyncStorage;
import com.pahlsoft.iaas.ui.client.AsyncUser;
import com.pahlsoft.iaas.ui.client.ReservationService;
import com.pahlsoft.ws.iaas.clients.reservation.Category;
import com.pahlsoft.ws.iaas.clients.reservation.OperatingSystemEnum;
import com.pahlsoft.ws.iaas.clients.reservation.Parent;
import com.pahlsoft.ws.iaas.clients.reservation.ReservationSystemEndpointProxy;
import com.pahlsoft.ws.iaas.clients.reservation.Server;
import com.pahlsoft.ws.iaas.clients.reservation.Statistics;
import com.pahlsoft.ws.iaas.clients.reservation.Status;
import com.pahlsoft.ws.iaas.clients.reservation.Storage;
import com.pahlsoft.ws.iaas.clients.reservation.User;


/**
 * The server side implementation of the RPC service.
 */

@SuppressWarnings("serial")
public class ReservationServiceImpl extends RemoteServiceServlet implements	ReservationService {

	private AsyncServer toAsync(Server server) {
		AsyncServer _asyncServer = new AsyncServer();
		_asyncServer.setServerId(server.getServerId());
		_asyncServer.setName(server.getServerName());
		_asyncServer.setStatus(server.getServerStatus().getValue());
		_asyncServer.setCategory(server.getServerCategory().getValue());
		_asyncServer.setOwner(toAsync(server.getServerUser()));
		_asyncServer.setStartDate(server.getStartDate());
		_asyncServer.setExpirationDate(server.getExpirationDate());
		_asyncServer.setOperatingSystem(server.getOperatingSystem().getValue());
		_asyncServer.setParentName((server.getParentName()));
		_asyncServer.setIpAddress(server.getIpAddress());
		_asyncServer.setDnsName(server.getDnsName());
		return _asyncServer;
	}
	
	private AsyncStatistics toAsync(Statistics statistics) {
		AsyncStatistics _asyncStatistics = new AsyncStatistics();
		_asyncStatistics.setServerName(statistics.getServerName());
		_asyncStatistics.setServerLoad(statistics.getServerLoad());
		_asyncStatistics.setContextSwitching(statistics.getConextSwitching());
		_asyncStatistics.setServerUptime(statistics.getServerUptime());
		return _asyncStatistics;
	}
	
	private AsyncStorage toAsync(Storage storage) {
		AsyncStorage _asyncStorage = new AsyncStorage();
		_asyncStorage.setServerName(storage.getServerName());
		_asyncStorage.setStorageEntity(storage.getStorageEntity());
		_asyncStorage.setStorageSize(storage.getStorageSize());
		_asyncStorage.setPercentFree(storage.getPercentFree());
		return _asyncStorage;
	}
	
	private AsyncUser toAsync(User user) {
		AsyncUser _asyncUser = new AsyncUser();
		_asyncUser.setFirstName(user.getFirstName());
		_asyncUser.setLastName(user.getLastName());
		_asyncUser.setLoginId(user.getLoginId());
		_asyncUser.setUserId(user.getUserId());
		_asyncUser.setPhoneNumber(user.getPhoneNumber());
		return _asyncUser;
	}
	
	private AsyncParent toAsync(Parent parent) {
		AsyncParent _asyncParent = new AsyncParent();
		_asyncParent.setParentId(parent.getParentId());
		_asyncParent.setParentName(parent.getParentName());
		_asyncParent.setIpAddress(parent.getIpAddress());
		_asyncParent.setDnsName(parent.getDnsName());
		return _asyncParent;
	}
	
	private Server fromAsync(AsyncServer asyncServer) {
		Server _server = new Server();
		_server.setExpirationDate(asyncServer.getExpirationDate());
		_server.setServerCategory(Category.fromValue(asyncServer.getCategory()));
		_server.setServerId(asyncServer.getServerId());
		_server.setServerName(asyncServer.getName());
		_server.setServerStatus(Status.fromValue(asyncServer.getStatus()));
		_server.setServerUser(fromAsync(asyncServer.getOwner()));
		_server.setStartDate(asyncServer.getStartDate());
		_server.setParentName(asyncServer.getParentName());
		_server.setDnsName(asyncServer.getDnsName());
		_server.setIpAddress(asyncServer.getIpAddress());
		_server.setOperatingSystem(OperatingSystemEnum.fromString(asyncServer.getOperatingSystem()));
		return _server;
	}
	
	private Server fromAsyncAdd(AsyncServer asyncServer) {
		Server _server = new Server();
		_server.setExpirationDate(asyncServer.getExpirationDate());
		_server.setServerCategory(Category.fromValue(asyncServer.getCategory()));
		_server.setServerId(0);
		_server.setServerName(asyncServer.getName());
		_server.setServerStatus(Status.fromValue(asyncServer.getStatus()));
		_server.setStartDate(asyncServer.getStartDate());
		_server.setParentName(asyncServer.getParentName());
		_server.setDnsName(asyncServer.getDnsName());
		_server.setIpAddress(asyncServer.getIpAddress());
		_server.setOperatingSystem(OperatingSystemEnum.fromString(asyncServer.getOperatingSystem()));
		User _user = new User();
		_user.setFirstName("");
		_user.setLastName("");
		_user.setLoginId("");
		_user.setPhoneNumber("");
		_user.setUserId(0);
		_server.setServerUser(_user);

		return _server;
	}
	
	private User fromAsync(AsyncUser asyncUser) {
		User _user = new User();
		_user.setFirstName(asyncUser.getFirstName());
		_user.setLastName(asyncUser.getLastName());
		_user.setPhoneNumber(asyncUser.getPhoneNumber());
		_user.setLoginId(asyncUser.getLoginId());
		return _user; 
	}
	
	private Parent fromAsync(AsyncParent asyncParent) {
		Parent _parent = new Parent();
		_parent.setParentId(0);
		_parent.setParentName(asyncParent.getParentName());
		_parent.setIpAddress(asyncParent.getIpAddress());
		_parent.setDnsName(asyncParent.getDnsName());
		return _parent;
	}
	
//TODO: Break this out into either another service or complete the code	
//	private Statistics fromAsync(AsyncStatistics asyncStatistics) {
//		return null;
//	}
	
//	private Storage fromAsync(AsyncStorage asyncStorage) {
//		return null;
//	}
	
	public List<AsyncServer> getServers() throws IllegalArgumentException {
		List<AsyncServer> asyncServerList = new  ArrayList<AsyncServer>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();

		try {
			for (Server server : endpoint.getServers()) {
				asyncServerList.add(toAsync(server));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return asyncServerList;
	}

	public List<AsyncServer> getUnreservedServers() throws IllegalArgumentException {
		List<AsyncServer> asyncServerList = new  ArrayList<AsyncServer>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();

		try {
			for (Server server : endpoint.getUnreservedServers()) {
				asyncServerList.add(toAsync(server));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return asyncServerList;
	}
	
	public List<AsyncServer> getReservedServers() throws IllegalArgumentException {
		List<AsyncServer> asyncServerList = new  ArrayList<AsyncServer>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();

		try {
			for (Server server : endpoint.getReservedServers()) {
				asyncServerList.add(toAsync(server));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return asyncServerList;
	}
	
	public List<String> getReservations(String userName) throws IllegalArgumentException {
		List<String> serverList = new  ArrayList<String>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();

		try {
			for (String server : endpoint.getReservations(userName)) {
				serverList.add(server);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return serverList;
	}
	
	public String getServerStatus(String serverName) throws IllegalArgumentException {
		String status = "";
		ArrayList<AsyncServer> _servers = new ArrayList<AsyncServer>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
			try {
				//status = endpoint.getServer(serverName).getServerStatus().getValue();
				for (Server server : endpoint.getServer(serverName)) {
					_servers.add(toAsync(server));
				}
			status = _servers.get(0).getStatus();	
			} catch (Exception e) {
				e.printStackTrace();
			}
			return status;
		
	}

	
	public List<AsyncStatistics> getStatistics() throws IllegalArgumentException {
		List<AsyncStatistics> asyncStatisticsList = new  ArrayList<AsyncStatistics>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();

		try {
			for (Statistics statistic : endpoint.getAllServerStats()) {
				asyncStatisticsList.add(toAsync(statistic));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return asyncStatisticsList;
	}

	
	public AsyncStatistics getServerStatistics(String serverName) throws IllegalArgumentException {
		Statistics _statistics = null;
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
			try {
				_statistics = endpoint.getServerStats(serverName);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return toAsync(_statistics);
	}

	
	public List<AsyncStorage> getStorage() throws IllegalArgumentException {
		List<AsyncStorage> asyncStorageList = new  ArrayList<AsyncStorage>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();

		try {
			for (Storage storage: endpoint.getAllStorageInfo()) {
				asyncStorageList.add(toAsync(storage));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return asyncStorageList;
	}

	
	public List<AsyncStorage> getServerStorageInfo(String serverName) throws IllegalArgumentException {
		ArrayList<AsyncStorage> _storage = new ArrayList<AsyncStorage>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
			try {
				
				for (Storage storage : endpoint.getServerStorageInfo(serverName)) {
					_storage.add(toAsync(storage));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return _storage;
	}

	public List<AsyncUser> getUsers() throws IllegalArgumentException {
		ArrayList<AsyncUser> _users = new ArrayList<AsyncUser>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
			try {
				
				for (User user: endpoint.getUsers()) {
					_users.add(toAsync(user));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return _users;
	}
	
	public List<AsyncUser> getUser(String userName) throws IllegalArgumentException {
		ArrayList<AsyncUser> _users = new ArrayList<AsyncUser>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
			try {
				
				for (User user: endpoint.getUser(userName)) {
					_users.add(toAsync(user));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return _users;
	}

	public Integer setReservation(ArrayList<AsyncServer> servers, String userId) throws IllegalArgumentException {
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
		Integer serverUpdates = 0;
		ArrayList<Server> _servers = new ArrayList<Server>();
		
		for (AsyncServer aserver: servers) {
			_servers.add(fromAsync(aserver));
		}
		
		// Convert to an ArrayList to an Array
		Server[] _serverArray = _servers.toArray(new Server[_servers.size()]);
		
		try {
			serverUpdates=endpoint.setReservation(_serverArray, userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return serverUpdates;
	}
	
	public Integer setExpiration(ArrayList<String> servers) throws IllegalArgumentException {
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
		Integer serverUpdates = 0;
		
		// Convert to an ArrayList to an Array
		String[] _serverArray = servers.toArray(new String[servers.size()]);
		
		try {
			serverUpdates=endpoint.setExpiration(_serverArray);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return serverUpdates;
	}

	public Integer addServer(AsyncServer server) throws IllegalArgumentException {
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
		Integer serverAdded = 0;
		Server _server = fromAsyncAdd(server);
		
		try {
			serverAdded = endpoint.addServer(_server);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return serverAdded;
	}

	public Integer deleteServers(ArrayList<String> servers) throws IllegalArgumentException {
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
		Integer serverDeleted = 0;
		
		// Convert to an ArrayList to an Array
		String[] _serverArray = servers.toArray(new String[servers.size()]);
		
		try {
			serverDeleted = endpoint.deleteServers(_serverArray);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return serverDeleted;
	}

	public Integer addUser(AsyncUser user) throws IllegalArgumentException {
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
		Integer userAdded = 0;
		User _user = fromAsync(user);
		
		try {
			userAdded = endpoint.addUser(_user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return userAdded;
	}

	public Integer deleteUsers(ArrayList<String> users) throws IllegalArgumentException {
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
		Integer usersDeleted = 0;
		
		// Convert to an ArrayList to an Array
		String[] _userArray = users.toArray(new String[users.size()]);
		
		try {
			usersDeleted = endpoint.deleteUsers(_userArray);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return usersDeleted;
	}

	public List<AsyncServer> getServer(AsyncServer serverName) throws IllegalArgumentException {
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
		ArrayList<AsyncServer> _server = new ArrayList<AsyncServer>();
		try {
			
			for (Server server : endpoint.getServer(serverName.getName())) {
				_server.add(toAsync(server));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return _server;
		
	}

	public List<AsyncUser> getUser(AsyncUser userName) throws IllegalArgumentException {
		ArrayList<AsyncUser> _users = new ArrayList<AsyncUser>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
			try {
				
				for (User user: endpoint.getUser(userName.getLoginId())) {
					_users.add(toAsync(user));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return _users;
	}

	@Override
	public List<AsyncParent> getParents() throws IllegalArgumentException {
			ArrayList<AsyncParent> _parents = new ArrayList<AsyncParent>();
			ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
				try {
					
					for (Parent parent : endpoint.getParents()) {
						_parents.add(toAsync(parent));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			return _parents;
		}
	

	public List<AsyncParent> getParent(String parentName) throws IllegalArgumentException {
		ArrayList<AsyncParent> _asyncParents = new ArrayList<AsyncParent>();
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
			try {
				
				_asyncParents.add(toAsync(endpoint.getParent(parentName)));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return _asyncParents;
	}

	@Override
	public Integer addParent(AsyncParent parent) throws IllegalArgumentException {
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
		Integer parentAdded = 0;
		Parent _parent= fromAsync(parent);
		
		try {
			parentAdded = endpoint.addParent(_parent);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return parentAdded;
	}

	@Override
	public Integer deleteParents(ArrayList<String> parents) throws IllegalArgumentException {
		ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy();
		Integer parentsDeleted = 0;
		
		// Convert to an ArrayList to an Array
		String[] _parentArray = parents.toArray(new String[parents.size()]);
		
		try {
			parentsDeleted = endpoint.deleteParents(_parentArray);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return parentsDeleted;
	}

	
}
