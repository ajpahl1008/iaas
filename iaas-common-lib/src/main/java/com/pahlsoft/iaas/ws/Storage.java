/**
 * Storage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws;

public class Storage  implements java.io.Serializable {
    private java.lang.String serverName;

    private java.lang.String storageEntity;

    private java.lang.String storageSize;

    private java.lang.String percentFree;

    public Storage() {
    }

    public Storage(
           java.lang.String serverName,
           java.lang.String storageEntity,
           java.lang.String storageSize,
           java.lang.String percentFree) {
           this.serverName = serverName;
           this.storageEntity = storageEntity;
           this.storageSize = storageSize;
           this.percentFree = percentFree;
    }


    /**
     * Gets the serverName value for this Storage.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this Storage.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the storageEntity value for this Storage.
     * 
     * @return storageEntity
     */
    public java.lang.String getStorageEntity() {
        return storageEntity;
    }


    /**
     * Sets the storageEntity value for this Storage.
     * 
     * @param storageEntity
     */
    public void setStorageEntity(java.lang.String storageEntity) {
        this.storageEntity = storageEntity;
    }


    /**
     * Gets the storageSize value for this Storage.
     * 
     * @return storageSize
     */
    public java.lang.String getStorageSize() {
        return storageSize;
    }


    /**
     * Sets the storageSize value for this Storage.
     * 
     * @param storageSize
     */
    public void setStorageSize(java.lang.String storageSize) {
        this.storageSize = storageSize;
    }


    /**
     * Gets the percentFree value for this Storage.
     * 
     * @return percentFree
     */
    public java.lang.String getPercentFree() {
        return percentFree;
    }


    /**
     * Sets the percentFree value for this Storage.
     * 
     * @param percentFree
     */
    public void setPercentFree(java.lang.String percentFree) {
        this.percentFree = percentFree;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Storage)) return false;
        Storage other = (Storage) obj;
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
            ((this.storageEntity==null && other.getStorageEntity()==null) || 
             (this.storageEntity!=null &&
              this.storageEntity.equals(other.getStorageEntity()))) &&
            ((this.storageSize==null && other.getStorageSize()==null) || 
             (this.storageSize!=null &&
              this.storageSize.equals(other.getStorageSize()))) &&
            ((this.percentFree==null && other.getPercentFree()==null) || 
             (this.percentFree!=null &&
              this.percentFree.equals(other.getPercentFree())));
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
        if (getStorageEntity() != null) {
            _hashCode += getStorageEntity().hashCode();
        }
        if (getStorageSize() != null) {
            _hashCode += getStorageSize().hashCode();
        }
        if (getPercentFree() != null) {
            _hashCode += getPercentFree().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Storage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "storage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentFree");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentFree"));
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
