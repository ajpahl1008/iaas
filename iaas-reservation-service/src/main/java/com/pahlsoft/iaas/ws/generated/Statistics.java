//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.18 at 06:32:03 PM EDT 
//


package com.pahlsoft.iaas.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverUptime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverLoad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conextSwitching" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statistics", propOrder = {
    "serverName",
    "serverUptime",
    "serverLoad",
    "conextSwitching"
})
public class Statistics {

    @XmlElement(required = true)
    protected String serverName;
    @XmlElement(required = true)
    protected String serverUptime;
    @XmlElement(required = true)
    protected String serverLoad;
    @XmlElement(required = true)
    protected String conextSwitching;

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the serverUptime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerUptime() {
        return serverUptime;
    }

    /**
     * Sets the value of the serverUptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerUptime(String value) {
        this.serverUptime = value;
    }

    /**
     * Gets the value of the serverLoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerLoad() {
        return serverLoad;
    }

    /**
     * Sets the value of the serverLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerLoad(String value) {
        this.serverLoad = value;
    }

    /**
     * Gets the value of the conextSwitching property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConextSwitching() {
        return conextSwitching;
    }

    /**
     * Sets the value of the conextSwitching property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConextSwitching(String value) {
        this.conextSwitching = value;
    }

}
