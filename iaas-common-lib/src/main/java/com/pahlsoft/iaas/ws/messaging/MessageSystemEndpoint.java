/**
 * MessageSystemEndpoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws.messaging;

public interface MessageSystemEndpoint extends java.rmi.Remote {
    public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsYesterday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception;
    public int insertError(com.pahlsoft.iaas.ws.messaging.IaasError errorInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception;
    public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsLastMonth() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception;
    public void init() throws java.rmi.RemoteException;
    public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsToday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception;
    public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsLastWeek() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception;
    public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsYesterday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception;
    public int insertEvent(com.pahlsoft.iaas.ws.messaging.IaasEvent eventInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception;
    public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsToday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception;
    public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsLastMonth() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception;
    public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsLastWeek() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception;
}
