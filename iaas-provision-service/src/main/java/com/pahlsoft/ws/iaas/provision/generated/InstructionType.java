//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.16 at 11:20:35 PM EDT 
//


package com.pahlsoft.ws.iaas.provision.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instructionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="instructionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BACKUP"/>
 *     &lt;enumeration value="BOOT"/>
 *     &lt;enumeration value="BUILD"/>
 *     &lt;enumeration value="CLEAN"/>
 *     &lt;enumeration value="CONFIGURE"/>
 *     &lt;enumeration value="DEPLOY"/>
 *     &lt;enumeration value="INSTALL"/>
 *     &lt;enumeration value="REBUILD"/>
 *     &lt;enumeration value="REDEPLOY"/>
 *     &lt;enumeration value="REINSTALL"/>
 *     &lt;enumeration value="RELOAD"/>
 *     &lt;enumeration value="REBOOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "instructionType")
@XmlEnum
public enum InstructionType {

    BACKUP,
    BOOT,
    BUILD,
    CLEAN,
    CONFIGURE,
    DEPLOY,
    INSTALL,
    REBUILD,
    REDEPLOY,
    REINSTALL,
    RELOAD,
    REBOOT;

    public String value() {
        return name();
    }

    public static InstructionType fromValue(String v) {
        return valueOf(v);
    }

}
