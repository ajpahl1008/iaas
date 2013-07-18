/**
 * MessagingSystemEndpointServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws.messaging;

public class MessagingSystemEndpointServiceLocator extends org.apache.axis.client.Service implements com.pahlsoft.iaas.ws.messaging.MessagingSystemEndpointService {

    public MessagingSystemEndpointServiceLocator() {
    }


    public MessagingSystemEndpointServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MessagingSystemEndpointServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MessageSystemEndpointPort
    private java.lang.String MessageSystemEndpointPort_address = System.getProperty("iaas.messaging.service.url");

    public java.lang.String getMessageSystemEndpointPortAddress() {
        return MessageSystemEndpointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MessageSystemEndpointPortWSDDServiceName = "MessageSystemEndpointPort";

    public java.lang.String getMessageSystemEndpointPortWSDDServiceName() {
        return MessageSystemEndpointPortWSDDServiceName;
    }

    public void setMessageSystemEndpointPortWSDDServiceName(java.lang.String name) {
        MessageSystemEndpointPortWSDDServiceName = name;
    }

    public com.pahlsoft.iaas.ws.messaging.MessageSystemEndpoint getMessageSystemEndpointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MessageSystemEndpointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMessageSystemEndpointPort(endpoint);
    }

    public com.pahlsoft.iaas.ws.messaging.MessageSystemEndpoint getMessageSystemEndpointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.pahlsoft.iaas.ws.messaging.MessagingSystemEndpointServiceSoapBindingStub _stub = new com.pahlsoft.iaas.ws.messaging.MessagingSystemEndpointServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMessageSystemEndpointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMessageSystemEndpointPortEndpointAddress(java.lang.String address) {
        MessageSystemEndpointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.pahlsoft.iaas.ws.messaging.MessageSystemEndpoint.class.isAssignableFrom(serviceEndpointInterface)) {
                com.pahlsoft.iaas.ws.messaging.MessagingSystemEndpointServiceSoapBindingStub _stub = new com.pahlsoft.iaas.ws.messaging.MessagingSystemEndpointServiceSoapBindingStub(new java.net.URL(MessageSystemEndpointPort_address), this);
                _stub.setPortName(getMessageSystemEndpointPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MessageSystemEndpointPort".equals(inputPortName)) {
            return getMessageSystemEndpointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "MessagingSystemEndpointService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "MessageSystemEndpointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MessageSystemEndpointPort".equals(portName)) {
            setMessageSystemEndpointPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
