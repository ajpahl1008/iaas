/**
 * Category.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws;

public class Category implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Category(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SMALL = "SMALL";
    public static final java.lang.String _MEDIUM = "MEDIUM";
    public static final java.lang.String _LARGE = "LARGE";
    public static final java.lang.String _X_LARGE = "X_LARGE";
    public static final java.lang.String _X_SMALL = "X_SMALL";
    public static final Category SMALL = new Category(_SMALL);
    public static final Category MEDIUM = new Category(_MEDIUM);
    public static final Category LARGE = new Category(_LARGE);
    public static final Category X_LARGE = new Category(_X_LARGE);
    public static final Category X_SMALL = new Category(_X_SMALL);
    public java.lang.String getValue() { return _value_;}
    public static Category fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Category enumeration = (Category)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Category fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Category.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "category"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
