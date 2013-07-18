/**
 * IaasError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws.messaging;

public class IaasError  implements java.io.Serializable {
    private int errorId;

    private java.lang.String errorDate;

    private java.lang.String correlationId;

    private java.lang.String errorInfo;

    public IaasError() {
    }

    public IaasError(
           int errorId,
           java.lang.String errorDate,
           java.lang.String correlationId,
           java.lang.String errorInfo) {
           this.errorId = errorId;
           this.errorDate = errorDate;
           this.correlationId = correlationId;
           this.errorInfo = errorInfo;
    }


    /**
     * Gets the errorId value for this IaasError.
     * 
     * @return errorId
     */
    public int getErrorId() {
        return errorId;
    }


    /**
     * Sets the errorId value for this IaasError.
     * 
     * @param errorId
     */
    public void setErrorId(int errorId) {
        this.errorId = errorId;
    }


    /**
     * Gets the errorDate value for this IaasError.
     * 
     * @return errorDate
     */
    public java.lang.String getErrorDate() {
        return errorDate;
    }


    /**
     * Sets the errorDate value for this IaasError.
     * 
     * @param errorDate
     */
    public void setErrorDate(java.lang.String errorDate) {
        this.errorDate = errorDate;
    }


    /**
     * Gets the correlationId value for this IaasError.
     * 
     * @return correlationId
     */
    public java.lang.String getCorrelationId() {
        return correlationId;
    }


    /**
     * Sets the correlationId value for this IaasError.
     * 
     * @param correlationId
     */
    public void setCorrelationId(java.lang.String correlationId) {
        this.correlationId = correlationId;
    }


    /**
     * Gets the errorInfo value for this IaasError.
     * 
     * @return errorInfo
     */
    public java.lang.String getErrorInfo() {
        return errorInfo;
    }


    /**
     * Sets the errorInfo value for this IaasError.
     * 
     * @param errorInfo
     */
    public void setErrorInfo(java.lang.String errorInfo) {
        this.errorInfo = errorInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IaasError)) return false;
        IaasError other = (IaasError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.errorId == other.getErrorId() &&
            ((this.errorDate==null && other.getErrorDate()==null) || 
             (this.errorDate!=null &&
              this.errorDate.equals(other.getErrorDate()))) &&
            ((this.correlationId==null && other.getCorrelationId()==null) || 
             (this.correlationId!=null &&
              this.correlationId.equals(other.getCorrelationId()))) &&
            ((this.errorInfo==null && other.getErrorInfo()==null) || 
             (this.errorInfo!=null &&
              this.errorInfo.equals(other.getErrorInfo())));
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
        _hashCode += getErrorId();
        if (getErrorDate() != null) {
            _hashCode += getErrorDate().hashCode();
        }
        if (getCorrelationId() != null) {
            _hashCode += getCorrelationId().hashCode();
        }
        if (getErrorInfo() != null) {
            _hashCode += getErrorInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IaasError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "IaasError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correlationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorInfo"));
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
