//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.11 at 09:09:42 PM EDT 
//


package com.pahlsoft.iaas.ws.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for category.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="category">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMALL"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="LARGE"/>
 *     &lt;enumeration value="X_LARGE"/>
 *     &lt;enumeration value="X_SMALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "category")
@XmlEnum
public enum Category {

    SMALL,
    MEDIUM,
    LARGE,
    X_LARGE,
    X_SMALL;

    public String value() {
        return name();
    }

    public static Category fromValue(String v) {
        return valueOf(v);
    }

}
