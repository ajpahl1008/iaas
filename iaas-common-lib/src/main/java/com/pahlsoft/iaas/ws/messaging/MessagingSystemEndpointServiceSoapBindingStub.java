/**
 * MessagingSystemEndpointServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws.messaging;

public class MessagingSystemEndpointServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.pahlsoft.iaas.ws.messaging.MessageSystemEndpoint {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEventsYesterday");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasEventArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.messaging.IaasEvent[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "eventsYesterday"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertError");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errorInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasError"), com.pahlsoft.iaas.ws.messaging.IaasError.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getErrorsLastMonth");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasErrorArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.messaging.IaasError[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "errorsLastMonth"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("init");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEventsToday");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasEventArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.messaging.IaasEvent[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "eventsToday"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getErrorsLastWeek");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasErrorArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.messaging.IaasError[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "errorsLastWeek"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getErrorsYesterday");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasErrorArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.messaging.IaasError[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "errorsYesterday"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertEvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "eventInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasEvent"), com.pahlsoft.iaas.ws.messaging.IaasEvent.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getErrorsToday");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasErrorArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.messaging.IaasError[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "errorsToday"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEventsLastMonth");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasEventArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.messaging.IaasEvent[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "eventsLastMonth"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEventsLastWeek");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasEventArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.messaging.IaasEvent[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "eventsLastWeek"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[10] = oper;

    }

    public MessagingSystemEndpointServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MessagingSystemEndpointServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MessagingSystemEndpointServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.messaging.Exception.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasError");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.messaging.IaasError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasErrorArray");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.messaging.IaasError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasError");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasEvent");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.messaging.IaasEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasEventArray");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.messaging.IaasEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasEvent");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsYesterday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getEventsYesterday"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.messaging.IaasEvent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.messaging.IaasEvent[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.messaging.IaasEvent[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.messaging.Exception) {
              throw (com.pahlsoft.iaas.ws.messaging.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int insertError(com.pahlsoft.iaas.ws.messaging.IaasError errorInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "insertError"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {errorInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.messaging.Exception) {
              throw (com.pahlsoft.iaas.ws.messaging.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsLastMonth() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getErrorsLastMonth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.messaging.IaasError[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.messaging.IaasError[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.messaging.IaasError[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.messaging.Exception) {
              throw (com.pahlsoft.iaas.ws.messaging.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void init() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "init"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsToday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getEventsToday"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.messaging.IaasEvent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.messaging.IaasEvent[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.messaging.IaasEvent[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.messaging.Exception) {
              throw (com.pahlsoft.iaas.ws.messaging.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsLastWeek() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getErrorsLastWeek"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.messaging.IaasError[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.messaging.IaasError[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.messaging.IaasError[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.messaging.Exception) {
              throw (com.pahlsoft.iaas.ws.messaging.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsYesterday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getErrorsYesterday"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.messaging.IaasError[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.messaging.IaasError[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.messaging.IaasError[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.messaging.Exception) {
              throw (com.pahlsoft.iaas.ws.messaging.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int insertEvent(com.pahlsoft.iaas.ws.messaging.IaasEvent eventInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "insertEvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {eventInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.messaging.Exception) {
              throw (com.pahlsoft.iaas.ws.messaging.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.messaging.IaasError[] getErrorsToday() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getErrorsToday"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.messaging.IaasError[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.messaging.IaasError[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.messaging.IaasError[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.messaging.Exception) {
              throw (com.pahlsoft.iaas.ws.messaging.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsLastMonth() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getEventsLastMonth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.messaging.IaasEvent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.messaging.IaasEvent[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.messaging.IaasEvent[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.messaging.Exception) {
              throw (com.pahlsoft.iaas.ws.messaging.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.messaging.IaasEvent[] getEventsLastWeek() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.messaging.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getEventsLastWeek"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.messaging.IaasEvent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.messaging.IaasEvent[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.messaging.IaasEvent[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.messaging.Exception) {
              throw (com.pahlsoft.iaas.ws.messaging.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}