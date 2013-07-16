package com.pahlsoft.iaas.ws;

public class ReservationSystemEndpointProxy implements com.pahlsoft.iaas.ws.ReservationSystemEndpoint {
  private String _endpoint = null;
  private com.pahlsoft.iaas.ws.ReservationSystemEndpoint reservationSystemEndpoint = null;
  
  public ReservationSystemEndpointProxy() {
    _initReservationSystemEndpointProxy();
  }
  
  public ReservationSystemEndpointProxy(String endpoint) {
    _endpoint = endpoint;
    _initReservationSystemEndpointProxy();
  }
  
  private void _initReservationSystemEndpointProxy() {
    try {
      reservationSystemEndpoint = (new com.pahlsoft.iaas.ws.ReservationSystemEndpointServiceLocator()).getReservationSystemEndpointPort();
      if (reservationSystemEndpoint != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)reservationSystemEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)reservationSystemEndpoint)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (reservationSystemEndpoint != null)
      ((javax.xml.rpc.Stub)reservationSystemEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pahlsoft.iaas.ws.ReservationSystemEndpoint getReservationSystemEndpoint() {
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint;
  }
  
  public com.pahlsoft.iaas.ws.Server[] getReservations(java.lang.String userName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getReservations(userName);
  }
  
  public int addParent(com.pahlsoft.iaas.ws.Parent parentInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.addParent(parentInfo);
  }
  
  public int deleteUsers(java.lang.String[] userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.deleteUsers(userInfo);
  }
  
  public com.pahlsoft.iaas.ws.Statistics[] getAllServerStats() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getAllServerStats();
  }
  
  public int setReservation(com.pahlsoft.iaas.ws.Server[] serverName, java.lang.String user) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.setReservation(serverName, user);
  }
  
  public com.pahlsoft.iaas.ws.User[] getUsers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getUsers();
  }
  
  public com.pahlsoft.iaas.ws.Parent getParent(java.lang.String getServer) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getParent(getServer);
  }
  
  public int deleteServers(java.lang.String[] deleteServers) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.deleteServers(deleteServers);
  }
  
  public com.pahlsoft.iaas.ws.Server[] getUnreservedServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getUnreservedServers();
  }
  
  public boolean setServerStats(com.pahlsoft.iaas.ws.Statistics setServerStats) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.setServerStats(setServerStats);
  }
  
  public int addServer(com.pahlsoft.iaas.ws.Server serverInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.addServer(serverInfo);
  }
  
  public boolean setMultiStorage(com.pahlsoft.iaas.ws.Storage[] storageEntityList) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.setMultiStorage(storageEntityList);
  }
  
  public com.pahlsoft.iaas.ws.Statistics getServerStats(java.lang.String serverName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getServerStats(serverName);
  }
  
  public com.pahlsoft.iaas.ws.Server[] getServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getServers();
  }
  
  public int setUser(com.pahlsoft.iaas.ws.User userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.setUser(userInfo);
  }
  
  public int setServer(com.pahlsoft.iaas.ws.Server serverInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.setServer(serverInfo);
  }
  
  public com.pahlsoft.iaas.ws.Server[] getServer(java.lang.String getServer) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getServer(getServer);
  }
  
  public void init() throws java.rmi.RemoteException{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    reservationSystemEndpoint.init();
  }
  
  public int addUser(com.pahlsoft.iaas.ws.User userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.addUser(userInfo);
  }
  
  public com.pahlsoft.iaas.ws.Server[] getReservedServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getReservedServers();
  }
  
  public com.pahlsoft.iaas.ws.Storage[] getAllStorageInfo() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getAllStorageInfo();
  }
  
  public int setExpiration(com.pahlsoft.iaas.ws.Server[] servers) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.setExpiration(servers);
  }
  
  public com.pahlsoft.iaas.ws.User[] getUser(java.lang.String userName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getUser(userName);
  }
  
  public int deleteServerStorage(java.lang.String deleteServerStorage) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.deleteServerStorage(deleteServerStorage);
  }
  
  public com.pahlsoft.iaas.ws.Storage[] getServerStorageInfo(java.lang.String serverName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getServerStorageInfo(serverName);
  }
  
  public com.pahlsoft.iaas.ws.Parent[] getParents() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.getParents();
  }
  
  public int deleteStorageEntity(com.pahlsoft.iaas.ws.Storage deleteStorageEntity) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.deleteStorageEntity(deleteStorageEntity);
  }
  
  public int deleteServerStatistics(java.lang.String deleteServerStatistics) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.deleteServerStatistics(deleteServerStatistics);
  }
  
  public boolean setSingleStorage(com.pahlsoft.iaas.ws.Storage storageEntity) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.setSingleStorage(storageEntity);
  }
  
  public int deleteParents(java.lang.String[] deleteParents) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception{
    if (reservationSystemEndpoint == null)
      _initReservationSystemEndpointProxy();
    return reservationSystemEndpoint.deleteParents(deleteParents);
  }
  
  
}