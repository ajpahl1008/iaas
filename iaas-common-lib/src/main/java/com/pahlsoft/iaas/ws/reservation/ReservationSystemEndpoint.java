/**
 * ReservationSystemEndpoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws.reservation;

public interface ReservationSystemEndpoint extends java.rmi.Remote {
    public com.pahlsoft.iaas.ws.reservation.Statistics[] getAllServerStats() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.Server[] getReservations(java.lang.String userName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int addParent(com.pahlsoft.iaas.ws.reservation.Parent parentInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int deleteUsers(java.lang.String[] userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int setReservation(com.pahlsoft.iaas.ws.reservation.Server[] serverName, java.lang.String user) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.User[] getUsers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.Parent getParent(java.lang.String getServer) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int deleteServers(java.lang.String[] deleteServers) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.Server[] getUnreservedServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public boolean setServerStats(com.pahlsoft.iaas.ws.reservation.Statistics setServerStats) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int addServer(com.pahlsoft.iaas.ws.reservation.Server serverInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public boolean setMultiStorage(com.pahlsoft.iaas.ws.reservation.Storage[] storageEntityList) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.Statistics getServerStats(java.lang.String serverName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.Server[] getServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int setUser(com.pahlsoft.iaas.ws.reservation.User userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int setServer(com.pahlsoft.iaas.ws.reservation.Server serverInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.Server[] getServer(java.lang.String getServer) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public void init() throws java.rmi.RemoteException;
    public int addUser(com.pahlsoft.iaas.ws.reservation.User userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.Server[] getReservedServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.Storage[] getAllStorageInfo() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int setExpiration(java.lang.String[] servers) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public java.lang.String[] getChildrenByParent(java.lang.String getChildrenByParent) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.User[] getUser(java.lang.String userName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int deleteServerStorage(java.lang.String deleteServerStorage) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.Storage[] getServerStorageInfo(java.lang.String serverName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public com.pahlsoft.iaas.ws.reservation.Parent[] getParents() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int deleteStorageEntity(com.pahlsoft.iaas.ws.reservation.Storage deleteStorageEntity) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int deleteServerStatistics(java.lang.String deleteServerStatistics) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public int deleteParents(java.lang.String[] deleteParents) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
    public boolean setSingleStorage(com.pahlsoft.iaas.ws.reservation.Storage storageEntity) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.reservation.Exception;
}
