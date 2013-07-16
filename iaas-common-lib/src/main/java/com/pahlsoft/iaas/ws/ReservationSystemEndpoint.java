/**
 * ReservationSystemEndpoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws;

public interface ReservationSystemEndpoint extends java.rmi.Remote {
    public com.pahlsoft.iaas.ws.Server[] getReservations(java.lang.String userName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int addParent(com.pahlsoft.iaas.ws.Parent parentInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int deleteUsers(java.lang.String[] userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.Statistics[] getAllServerStats() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int setReservation(com.pahlsoft.iaas.ws.Server[] serverName, java.lang.String user) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.User[] getUsers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.Parent getParent(java.lang.String getServer) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int deleteServers(java.lang.String[] deleteServers) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.Server[] getUnreservedServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public boolean setServerStats(com.pahlsoft.iaas.ws.Statistics setServerStats) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int addServer(com.pahlsoft.iaas.ws.Server serverInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public boolean setMultiStorage(com.pahlsoft.iaas.ws.Storage[] storageEntityList) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.Statistics getServerStats(java.lang.String serverName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.Server[] getServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int setUser(com.pahlsoft.iaas.ws.User userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int setServer(com.pahlsoft.iaas.ws.Server serverInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.Server[] getServer(java.lang.String getServer) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public void init() throws java.rmi.RemoteException;
    public int addUser(com.pahlsoft.iaas.ws.User userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.Server[] getReservedServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.Storage[] getAllStorageInfo() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int setExpiration(com.pahlsoft.iaas.ws.Server[] servers) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.User[] getUser(java.lang.String userName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int deleteServerStorage(java.lang.String deleteServerStorage) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.Storage[] getServerStorageInfo(java.lang.String serverName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public com.pahlsoft.iaas.ws.Parent[] getParents() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int deleteStorageEntity(com.pahlsoft.iaas.ws.Storage deleteStorageEntity) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int deleteServerStatistics(java.lang.String deleteServerStatistics) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public boolean setSingleStorage(com.pahlsoft.iaas.ws.Storage storageEntity) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
    public int deleteParents(java.lang.String[] deleteParents) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception;
}
