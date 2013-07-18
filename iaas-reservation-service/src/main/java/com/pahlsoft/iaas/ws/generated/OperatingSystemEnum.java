//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.15 at 11:33:25 PM EDT 
//


package com.pahlsoft.iaas.ws.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operatingSystemEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operatingSystemEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="AIX6.1"/>
 *     &lt;enumeration value="AIX7.1"/>
 *     &lt;enumeration value="AIX5.3"/>
 *     &lt;enumeration value="WIN2003"/>
 *     &lt;enumeration value="WIN2008"/>
 *     &lt;enumeration value="WIN7"/>
 *     &lt;enumeration value="WINXP"/>
 *     &lt;enumeration value="Solaris"/>
 *     &lt;enumeration value="RHEL6.1"/>
 *     &lt;enumeration value="RHEL5.5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operatingSystemEnum")
@XmlEnum
public enum OperatingSystemEnum {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("AIX6.1")
    AIX_6_1("AIX6.1"),
    @XmlEnumValue("AIX7.1")
    AIX_7_1("AIX7.1"),
    @XmlEnumValue("AIX5.3")
    AIX_5_3("AIX5.3"),
    @XmlEnumValue("WIN2003")
    WIN_2003("WIN2003"),
    @XmlEnumValue("WIN2008")
    WIN_2008("WIN2008"),
    @XmlEnumValue("WIN7")
    WIN_7("WIN7"),
    WINXP("WINXP"),
    @XmlEnumValue("Solaris")
    SOLARIS("Solaris"),
    @XmlEnumValue("RHEL6.1")
    RHEL_6_1("RHEL6.1"),
    @XmlEnumValue("RHEL5.5")
    RHEL_5_5("RHEL5.5");
    private final String value;

    OperatingSystemEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatingSystemEnum fromValue(String v) {
        for (OperatingSystemEnum c: OperatingSystemEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
