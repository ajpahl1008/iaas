/**
 * ReservationSystemEndpointServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws.reservation;

public class ReservationSystemEndpointServiceLocator extends org.apache.axis.client.Service implements com.pahlsoft.iaas.ws.reservation.ReservationSystemEndpointService {

    public ReservationSystemEndpointServiceLocator() {
    }


    public ReservationSystemEndpointServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReservationSystemEndpointServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReservationSystemEndpointPort
    private java.lang.String ReservationSystemEndpointPort_address = System.getProperty("iaas.reservation.service.url");

    public java.lang.String getReservationSystemEndpointPortAddress() {
        return ReservationSystemEndpointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReservationSystemEndpointPortWSDDServiceName = "ReservationSystemEndpointPort";

    public java.lang.String getReservationSystemEndpointPortWSDDServiceName() {
        return ReservationSystemEndpointPortWSDDServiceName;
    }

    public void setReservationSystemEndpointPortWSDDServiceName(java.lang.String name) {
        ReservationSystemEndpointPortWSDDServiceName = name;
    }

    public com.pahlsoft.iaas.ws.reservation.ReservationSystemEndpoint getReservationSystemEndpointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReservationSystemEndpointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReservationSystemEndpointPort(endpoint);
    }

    public com.pahlsoft.iaas.ws.reservation.ReservationSystemEndpoint getReservationSystemEndpointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.pahlsoft.iaas.ws.reservation.ReservationSystemEndpointServiceSoapBindingStub _stub = new com.pahlsoft.iaas.ws.reservation.ReservationSystemEndpointServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getReservationSystemEndpointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReservationSystemEndpointPortEndpointAddress(java.lang.String address) {
        ReservationSystemEndpointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.pahlsoft.iaas.ws.reservation.ReservationSystemEndpoint.class.isAssignableFrom(serviceEndpointInterface)) {
                com.pahlsoft.iaas.ws.reservation.ReservationSystemEndpointServiceSoapBindingStub _stub = new com.pahlsoft.iaas.ws.reservation.ReservationSystemEndpointServiceSoapBindingStub(new java.net.URL(ReservationSystemEndpointPort_address), this);
                _stub.setPortName(getReservationSystemEndpointPortWSDDServiceName());
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
        if ("ReservationSystemEndpointPort".equals(inputPortName)) {
            return getReservationSystemEndpointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "ReservationSystemEndpointService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "ReservationSystemEndpointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReservationSystemEndpointPort".equals(portName)) {
            setReservationSystemEndpointPortEndpointAddress(address);
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
