/**
 * ReservationSystemEndpointServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws;

public class ReservationSystemEndpointServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.pahlsoft.iaas.ws.ReservationSystemEndpoint {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[30];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addParent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parentInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "parent"), com.pahlsoft.iaas.ws.Parent.class, false, false);
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
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getReservations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "serverArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.Server[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
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
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jaxb.dev.java.net/array", "stringArray"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
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
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllServerStats");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "statisticsArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.Statistics[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "AllStatistics"));
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
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUsers");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "userArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.User[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Users"));
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
        oper.setName("setReservation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "serverArray"), com.pahlsoft.iaas.ws.Server[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
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
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getParent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getServer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "parent"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.Parent.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Parent"));
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
        oper.setName("deleteServers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deleteServers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jaxb.dev.java.net/array", "stringArray"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
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
        oper.setName("getUnreservedServers");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "serverArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.Server[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "UnreservedServers"));
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
        oper.setName("setServerStats");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "setServerStats"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "statistics"), com.pahlsoft.iaas.ws.Statistics.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
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
        oper.setName("addServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "server"), com.pahlsoft.iaas.ws.Server.class, false, false);
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
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServerStats");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "statistics"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.Statistics.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Statistics"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setMultiStorage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "storageEntityList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "storageArray"), com.pahlsoft.iaas.ws.Storage[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServers");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "serverArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.Server[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Servers"));
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
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "server"), com.pahlsoft.iaas.ws.Server.class, false, false);
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
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "user"), com.pahlsoft.iaas.ws.User.class, false, false);
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
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getServer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "serverArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.Server[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Server"));
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
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("init");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "user"), com.pahlsoft.iaas.ws.User.class, false, false);
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
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getReservedServers");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "serverArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.Server[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ReservedServers"));
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
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllStorageInfo");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "storageArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.Storage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "AllStorage"));
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
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setExpiration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "servers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "serverArray"), com.pahlsoft.iaas.ws.Server[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
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
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteServerStorage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deleteServerStorage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
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
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "userArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.User[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
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
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServerStorageInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "storageArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.Storage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Storage"));
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
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getParents");
        oper.setReturnType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "parentArray"));
        oper.setReturnClass(com.pahlsoft.iaas.ws.Parent[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Parents"));
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
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteStorageEntity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deleteStorageEntity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "storage"), com.pahlsoft.iaas.ws.Storage.class, false, false);
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
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteServerStatistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deleteServerStatistics"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
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
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setSingleStorage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "storageEntity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "storage"), com.pahlsoft.iaas.ws.Storage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"),
                      "com.pahlsoft.ws.iaas.Exception",
                      new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteParents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deleteParents"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jaxb.dev.java.net/array", "stringArray"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
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
        _operations[29] = oper;

    }

    public ReservationSystemEndpointServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ReservationSystemEndpointServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ReservationSystemEndpointServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "category");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.Category.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "Exception");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.Exception.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "operatingSystemEnum");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.OperatingSystemEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "parent");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.Parent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "parentArray");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.Parent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "parent");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "server");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.Server.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "serverArray");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.Server[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "server");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "statistics");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.Statistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "statisticsArray");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.Statistics[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "statistics");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "status");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "storage");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.Storage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "storageArray");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.Storage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "storage");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "user");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "userArray");
            cachedSerQNames.add(qName);
            cls = com.pahlsoft.iaas.ws.User[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "user");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://jaxb.dev.java.net/array", "stringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
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

    public int addParent(com.pahlsoft.iaas.ws.Parent parentInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "addParent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parentInfo});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.Server[] getReservations(java.lang.String userName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getReservations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.Server[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.Server[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.Server[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int deleteUsers(java.lang.String[] userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "deleteUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userInfo});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.Statistics[] getAllServerStats() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getAllServerStats"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.Statistics[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.Statistics[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.Statistics[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.User[] getUsers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.User[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.User[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.User[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int setReservation(com.pahlsoft.iaas.ws.Server[] serverName, java.lang.String user) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "setReservation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverName, user});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.Parent getParent(java.lang.String getServer) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getParent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getServer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.Parent) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.Parent) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.Parent.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int deleteServers(java.lang.String[] deleteServers) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "deleteServers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteServers});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.Server[] getUnreservedServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getUnreservedServers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.Server[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.Server[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.Server[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean setServerStats(com.pahlsoft.iaas.ws.Statistics setServerStats) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "setServerStats"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setServerStats});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int addServer(com.pahlsoft.iaas.ws.Server serverInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "addServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverInfo});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.Statistics getServerStats(java.lang.String serverName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getServerStats"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.Statistics) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.Statistics) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.Statistics.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean setMultiStorage(com.pahlsoft.iaas.ws.Storage[] storageEntityList) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "setMultiStorage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {storageEntityList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.Server[] getServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getServers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.Server[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.Server[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.Server[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int setServer(com.pahlsoft.iaas.ws.Server serverInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "setServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverInfo});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int setUser(com.pahlsoft.iaas.ws.User userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "setUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userInfo});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.Server[] getServer(java.lang.String getServer) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getServer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.Server[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.Server[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.Server[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
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
        _call.setOperation(_operations[17]);
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

    public int addUser(com.pahlsoft.iaas.ws.User userInfo) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "addUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userInfo});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.Server[] getReservedServers() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getReservedServers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.Server[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.Server[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.Server[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.Storage[] getAllStorageInfo() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getAllStorageInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.Storage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.Storage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.Storage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int setExpiration(com.pahlsoft.iaas.ws.Server[] servers) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "setExpiration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {servers});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int deleteServerStorage(java.lang.String deleteServerStorage) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "deleteServerStorage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteServerStorage});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.User[] getUser(java.lang.String userName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.User[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.User[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.User[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.Storage[] getServerStorageInfo(java.lang.String serverName) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getServerStorageInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.Storage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.Storage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.Storage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.pahlsoft.iaas.ws.Parent[] getParents() throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "getParents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pahlsoft.iaas.ws.Parent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pahlsoft.iaas.ws.Parent[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.pahlsoft.iaas.ws.Parent[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int deleteStorageEntity(com.pahlsoft.iaas.ws.Storage deleteStorageEntity) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "deleteStorageEntity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteStorageEntity});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int deleteServerStatistics(java.lang.String deleteServerStatistics) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "deleteServerStatistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteServerStatistics});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean setSingleStorage(com.pahlsoft.iaas.ws.Storage storageEntity) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "setSingleStorage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {storageEntity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int deleteParents(java.lang.String[] deleteParents) throws java.rmi.RemoteException, com.pahlsoft.iaas.ws.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "deleteParents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteParents});

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
        if (axisFaultException.detail instanceof com.pahlsoft.iaas.ws.Exception) {
              throw (com.pahlsoft.iaas.ws.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
