/**
 * Statistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws.reservation;

public class Statistics  implements java.io.Serializable {
    private java.lang.String serverName;

    private java.lang.String serverUptime;

    private java.lang.String serverLoad;

    private java.lang.String conextSwitching;

    public Statistics() {
    }

    public Statistics(
           java.lang.String serverName,
           java.lang.String serverUptime,
           java.lang.String serverLoad,
           java.lang.String conextSwitching) {
           this.serverName = serverName;
           this.serverUptime = serverUptime;
           this.serverLoad = serverLoad;
           this.conextSwitching = conextSwitching;
    }


    /**
     * Gets the serverName value for this Statistics.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this Statistics.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the serverUptime value for this Statistics.
     * 
     * @return serverUptime
     */
    public java.lang.String getServerUptime() {
        return serverUptime;
    }


    /**
     * Sets the serverUptime value for this Statistics.
     * 
     * @param serverUptime
     */
    public void setServerUptime(java.lang.String serverUptime) {
        this.serverUptime = serverUptime;
    }


    /**
     * Gets the serverLoad value for this Statistics.
     * 
     * @return serverLoad
     */
    public java.lang.String getServerLoad() {
        return serverLoad;
    }


    /**
     * Sets the serverLoad value for this Statistics.
     * 
     * @param serverLoad
     */
    public void setServerLoad(java.lang.String serverLoad) {
        this.serverLoad = serverLoad;
    }


    /**
     * Gets the conextSwitching value for this Statistics.
     * 
     * @return conextSwitching
     */
    public java.lang.String getConextSwitching() {
        return conextSwitching;
    }


    /**
     * Sets the conextSwitching value for this Statistics.
     * 
     * @param conextSwitching
     */
    public void setConextSwitching(java.lang.String conextSwitching) {
        this.conextSwitching = conextSwitching;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Statistics)) return false;
        Statistics other = (Statistics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.serverUptime==null && other.getServerUptime()==null) || 
             (this.serverUptime!=null &&
              this.serverUptime.equals(other.getServerUptime()))) &&
            ((this.serverLoad==null && other.getServerLoad()==null) || 
             (this.serverLoad!=null &&
              this.serverLoad.equals(other.getServerLoad()))) &&
            ((this.conextSwitching==null && other.getConextSwitching()==null) || 
             (this.conextSwitching!=null &&
              this.conextSwitching.equals(other.getConextSwitching())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getServerUptime() != null) {
            _hashCode += getServerUptime().hashCode();
        }
        if (getServerLoad() != null) {
            _hashCode += getServerLoad().hashCode();
        }
        if (getConextSwitching() != null) {
            _hashCode += getConextSwitching().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Statistics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "statistics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverUptime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverUptime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverLoad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverLoad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conextSwitching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conextSwitching"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
