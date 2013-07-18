/**
 * OperatingSystemEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws.reservation;

public class OperatingSystemEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OperatingSystemEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "unknown";
    public static final java.lang.String _value2 = "AIX6.1";
    public static final java.lang.String _value3 = "AIX7.1";
    public static final java.lang.String _value4 = "AIX5.3";
    public static final java.lang.String _value5 = "WIN2003";
    public static final java.lang.String _value6 = "WIN2008";
    public static final java.lang.String _value7 = "WIN7";
    public static final java.lang.String _value8 = "WINXP";
    public static final java.lang.String _value9 = "Solaris";
    public static final java.lang.String _value10 = "RHEL6.1";
    public static final java.lang.String _value11 = "RHEL5.5";
    public static final OperatingSystemEnum value1 = new OperatingSystemEnum(_value1);
    public static final OperatingSystemEnum value2 = new OperatingSystemEnum(_value2);
    public static final OperatingSystemEnum value3 = new OperatingSystemEnum(_value3);
    public static final OperatingSystemEnum value4 = new OperatingSystemEnum(_value4);
    public static final OperatingSystemEnum value5 = new OperatingSystemEnum(_value5);
    public static final OperatingSystemEnum value6 = new OperatingSystemEnum(_value6);
    public static final OperatingSystemEnum value7 = new OperatingSystemEnum(_value7);
    public static final OperatingSystemEnum value8 = new OperatingSystemEnum(_value8);
    public static final OperatingSystemEnum value9 = new OperatingSystemEnum(_value9);
    public static final OperatingSystemEnum value10 = new OperatingSystemEnum(_value10);
    public static final OperatingSystemEnum value11 = new OperatingSystemEnum(_value11);
    public java.lang.String getValue() { return _value_;}
    public static OperatingSystemEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OperatingSystemEnum enumeration = (OperatingSystemEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OperatingSystemEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperatingSystemEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "operatingSystemEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
