package com.pahlsoft.iaas.ws.messaging;

public class MessageSystemEndpointProxy implements com.pahlsoft.iaas.ws.messaging.MessageSystemEndpoint {
  private String _endpoint = null;
  private com.pahlsoft.iaas.ws.messaging.MessageSystemEndpoint messageSystemEndpoint = null;
  
  public MessageSystemEndpointProxy() {
    _initMessageSystemEndpointProxy();
  }
  
  public MessageSystemEndpointProxy(String endpoint) {
    _endpoint = endpoint;
    _initMessageSystemEndpointProxy();
  }
  
  private void _initMessageSystemEndpointProxy() {
    try {
      messageSystemEndpoint = (new com.pahlsoft.iaas.ws.messaging.MessagingSystemEndpointServiceLocator()).getMessageSystemEndpointPort();
      if (messageSystemEndpoint != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)messageSystemEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)messageSystemEndpoint)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (messageSystemEndpoint != null)
      ((javax.xml.rpc.Stub)messageSystemEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pahlsoft.iaas.ws.messaging.MessageSystemEndpoint getMessageSystemEndpoint() {
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    return messageSystemEndpoint;
  }
  
  public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsYesterday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception{
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    return messageSystemEndpoint.getEventsYesterday();
  }
  
  public int insertError(com.pahlsoft.iaas.ws.messaging.IaasError errorInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception{
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    return messageSystemEndpoint.insertError(errorInfo);
  }
  
  public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsLastMonth() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception{
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    return messageSystemEndpoint.getErrorsLastMonth();
  }
  
  public void init() throws java.rmi.RemoteException{
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    messageSystemEndpoint.init();
  }
  
  public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsToday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception{
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    return messageSystemEndpoint.getEventsToday();
  }
  
  public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsLastWeek() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception{
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    return messageSystemEndpoint.getErrorsLastWeek();
  }
  
  public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsYesterday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception{
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    return messageSystemEndpoint.getErrorsYesterday();
  }
  
  public int insertEvent(com.pahlsoft.iaas.ws.messaging.IaasEvent eventInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception{
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    return messageSystemEndpoint.insertEvent(eventInfo);
  }
  
  public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsToday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception{
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    return messageSystemEndpoint.getErrorsToday();
  }
  
  public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsLastMonth() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception{
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    return messageSystemEndpoint.getEventsLastMonth();
  }
  
  public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsLastWeek() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception{
    if (messageSystemEndpoint == null)
      _initMessageSystemEndpointProxy();
    return messageSystemEndpoint.getEventsLastWeek();
  }
  
  
}