/**
 * Server.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pahlsoft.iaas.ws.reservation;

public class Server  implements java.io.Serializable {
    private int serverId;

    private java.lang.String serverName;

    private com.pahlsoft.iaas.ws.reservation.Category serverCategory;

    private com.pahlsoft.iaas.ws.reservation.User serverUser;

    private java.lang.String startDate;

    private java.lang.String expirationDate;

    private com.pahlsoft.iaas.ws.reservation.Status serverStatus;

    private java.lang.String parentName;

    private java.lang.String ipAddress;

    private java.lang.String dnsName;

    private com.pahlsoft.iaas.ws.reservation.OperatingSystemEnum operatingSystem;

    private java.lang.String cpuQuantity;

    private java.lang.String cpuSpeed;

    private java.lang.String memoryQuantity;

    public Server() {
    }

    public Server(
           int serverId,
           java.lang.String serverName,
           com.pahlsoft.iaas.ws.reservation.Category serverCategory,
           com.pahlsoft.iaas.ws.reservation.User serverUser,
           java.lang.String startDate,
           java.lang.String expirationDate,
           com.pahlsoft.iaas.ws.reservation.Status serverStatus,
           java.lang.String parentName,
           java.lang.String ipAddress,
           java.lang.String dnsName,
           com.pahlsoft.iaas.ws.reservation.OperatingSystemEnum operatingSystem,
           java.lang.String cpuQuantity,
           java.lang.String cpuSpeed,
           java.lang.String memoryQuantity) {
           this.serverId = serverId;
           this.serverName = serverName;
           this.serverCategory = serverCategory;
           this.serverUser = serverUser;
           this.startDate = startDate;
           this.expirationDate = expirationDate;
           this.serverStatus = serverStatus;
           this.parentName = parentName;
           this.ipAddress = ipAddress;
           this.dnsName = dnsName;
           this.operatingSystem = operatingSystem;
           this.cpuQuantity = cpuQuantity;
           this.cpuSpeed = cpuSpeed;
           this.memoryQuantity = memoryQuantity;
    }


    /**
     * Gets the serverId value for this Server.
     * 
     * @return serverId
     */
    public int getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this Server.
     * 
     * @param serverId
     */
    public void setServerId(int serverId) {
        this.serverId = serverId;
    }


    /**
     * Gets the serverName value for this Server.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this Server.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the serverCategory value for this Server.
     * 
     * @return serverCategory
     */
    public com.pahlsoft.iaas.ws.reservation.Category getServerCategory() {
        return serverCategory;
    }


    /**
     * Sets the serverCategory value for this Server.
     * 
     * @param serverCategory
     */
    public void setServerCategory(com.pahlsoft.iaas.ws.reservation.Category serverCategory) {
        this.serverCategory = serverCategory;
    }


    /**
     * Gets the serverUser value for this Server.
     * 
     * @return serverUser
     */
    public com.pahlsoft.iaas.ws.reservation.User getServerUser() {
        return serverUser;
    }


    /**
     * Sets the serverUser value for this Server.
     * 
     * @param serverUser
     */
    public void setServerUser(com.pahlsoft.iaas.ws.reservation.User serverUser) {
        this.serverUser = serverUser;
    }


    /**
     * Gets the startDate value for this Server.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Server.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the expirationDate value for this Server.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this Server.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the serverStatus value for this Server.
     * 
     * @return serverStatus
     */
    public com.pahlsoft.iaas.ws.reservation.Status getServerStatus() {
        return serverStatus;
    }


    /**
     * Sets the serverStatus value for this Server.
     * 
     * @param serverStatus
     */
    public void setServerStatus(com.pahlsoft.iaas.ws.reservation.Status serverStatus) {
        this.serverStatus = serverStatus;
    }


    /**
     * Gets the parentName value for this Server.
     * 
     * @return parentName
     */
    public java.lang.String getParentName() {
        return parentName;
    }


    /**
     * Sets the parentName value for this Server.
     * 
     * @param parentName
     */
    public void setParentName(java.lang.String parentName) {
        this.parentName = parentName;
    }


    /**
     * Gets the ipAddress value for this Server.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this Server.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the dnsName value for this Server.
     * 
     * @return dnsName
     */
    public java.lang.String getDnsName() {
        return dnsName;
    }


    /**
     * Sets the dnsName value for this Server.
     * 
     * @param dnsName
     */
    public void setDnsName(java.lang.String dnsName) {
        this.dnsName = dnsName;
    }


    /**
     * Gets the operatingSystem value for this Server.
     * 
     * @return operatingSystem
     */
    public com.pahlsoft.iaas.ws.reservation.OperatingSystemEnum getOperatingSystem() {
        return operatingSystem;
    }


    /**
     * Sets the operatingSystem value for this Server.
     * 
     * @param operatingSystem
     */
    public void setOperatingSystem(com.pahlsoft.iaas.ws.reservation.OperatingSystemEnum operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    /**
     * Gets the cpuQuantity value for this Server.
     * 
     * @return cpuQuantity
     */
    public java.lang.String getCpuQuantity() {
        return cpuQuantity;
    }


    /**
     * Sets the cpuQuantity value for this Server.
     * 
     * @param cpuQuantity
     */
    public void setCpuQuantity(java.lang.String cpuQuantity) {
        this.cpuQuantity = cpuQuantity;
    }


    /**
     * Gets the cpuSpeed value for this Server.
     * 
     * @return cpuSpeed
     */
    public java.lang.String getCpuSpeed() {
        return cpuSpeed;
    }


    /**
     * Sets the cpuSpeed value for this Server.
     * 
     * @param cpuSpeed
     */
    public void setCpuSpeed(java.lang.String cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }


    /**
     * Gets the memoryQuantity value for this Server.
     * 
     * @return memoryQuantity
     */
    public java.lang.String getMemoryQuantity() {
        return memoryQuantity;
    }


    /**
     * Sets the memoryQuantity value for this Server.
     * 
     * @param memoryQuantity
     */
    public void setMemoryQuantity(java.lang.String memoryQuantity) {
        this.memoryQuantity = memoryQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Server)) return false;
        Server other = (Server) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.serverId == other.getServerId() &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.serverCategory==null && other.getServerCategory()==null) || 
             (this.serverCategory!=null &&
              this.serverCategory.equals(other.getServerCategory()))) &&
            ((this.serverUser==null && other.getServerUser()==null) || 
             (this.serverUser!=null &&
              this.serverUser.equals(other.getServerUser()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.serverStatus==null && other.getServerStatus()==null) || 
             (this.serverStatus!=null &&
              this.serverStatus.equals(other.getServerStatus()))) &&
            ((this.parentName==null && other.getParentName()==null) || 
             (this.parentName!=null &&
              this.parentName.equals(other.getParentName()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.dnsName==null && other.getDnsName()==null) || 
             (this.dnsName!=null &&
              this.dnsName.equals(other.getDnsName()))) &&
            ((this.operatingSystem==null && other.getOperatingSystem()==null) || 
             (this.operatingSystem!=null &&
              this.operatingSystem.equals(other.getOperatingSystem()))) &&
            ((this.cpuQuantity==null && other.getCpuQuantity()==null) || 
             (this.cpuQuantity!=null &&
              this.cpuQuantity.equals(other.getCpuQuantity()))) &&
            ((this.cpuSpeed==null && other.getCpuSpeed()==null) || 
             (this.cpuSpeed!=null &&
              this.cpuSpeed.equals(other.getCpuSpeed()))) &&
            ((this.memoryQuantity==null && other.getMemoryQuantity()==null) || 
             (this.memoryQuantity!=null &&
              this.memoryQuantity.equals(other.getMemoryQuantity())));
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
        _hashCode += getServerId();
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getServerCategory() != null) {
            _hashCode += getServerCategory().hashCode();
        }
        if (getServerUser() != null) {
            _hashCode += getServerUser().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getServerStatus() != null) {
            _hashCode += getServerStatus().hashCode();
        }
        if (getParentName() != null) {
            _hashCode += getParentName().hashCode();
        }
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getDnsName() != null) {
            _hashCode += getDnsName().hashCode();
        }
        if (getOperatingSystem() != null) {
            _hashCode += getOperatingSystem().hashCode();
        }
        if (getCpuQuantity() != null) {
            _hashCode += getCpuQuantity().hashCode();
        }
        if (getCpuSpeed() != null) {
            _hashCode += getCpuSpeed().hashCode();
        }
        if (getMemoryQuantity() != null) {
            _hashCode += getMemoryQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Server.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "server"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "category"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "user"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatingSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://iaas.ws.pahlsoft.com", "operatingSystemEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpuQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpuSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memoryQuantity"));
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
