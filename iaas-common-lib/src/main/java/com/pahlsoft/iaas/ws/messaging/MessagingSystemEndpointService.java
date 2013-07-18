/**
 * MessagingSystemEndpointService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws.messaging;

public interface MessagingSystemEndpointService extends javax.xml.rpc.Service {
    public java.lang.String getMessageSystemEndpointPortAddress();

    public com.pahlsoft.iaas.ws.messaging.MessageSystemEndpoint getMessageSystemEndpointPort() throws javax.xml.rpc.ServiceException;

    public com.pahlsoft.iaas.ws.messaging.MessageSystemEndpoint getMessageSystemEndpointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
