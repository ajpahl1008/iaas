package com.pahlsoft.iaas.ui.client;

import com.extjs.gxt.ui.client.data.BaseModel;

public class AsyncServer extends BaseModel {
	private static final long serialVersionUID = 766811374647698011L;

	public AsyncServer() {
	}
	
	public String getOperatingSystem() {
		return get("operatingSystem");
	}

	public String getParentName() {
		return get("parentName");
	}
	
	public String getIpAddress() {
		return get("ipAddress");
	}

	public String getDnsName() {
		return get("dnsName");
	}
	
	
	public String getCategory() {
		return get("category");
	}
	
	public String getExpirationDate() {
		return get("expirationDate");
	}

	public String getName() {
		return get("name");
	}
	
	public AsyncUser getOwner() {
		return get("owner");
	}
	
	public Integer getServerId() {
		return get("serverId");
	}

	public String getStartDate() {
		return get("startDate");
	}

	public String getStatus() {
		return get("status");
	}
	
	public String getCpuQuantity() {
		return get("cpuQuantity");
	}
	
	public String getCpuSpeed() {
		return get("cpuSpeed");
	}
	
	public String getMemoryQuantity() {
		return get("memoryQuantity");
	}
	
	public void setCategory(String category) {
		set("category",category);
	}

	public void setExpirationDate(String expirationDate) {
		set("expirationDate",expirationDate);
	}
	
	public void setName(String name) {
		 set("name",name);
	}
	
	public void setOwner(AsyncUser owner) {
		set("owner", owner);
	}

	public void setServerId(Integer serverId) {
		set("serverId",serverId);
	}

	public void setStartDate(String startDate) {
		set("startDate",startDate);
	}

	public void setStatus(String status) {
		set("status",status);
	}
	
	public void setOperatingSystem(String operatingSystem) {
		set("operatingSystem", operatingSystem);
	}
	
	public void setParentName(String parentName) {
		set("parentName",parentName);
	}
	
	public void setIpAddress(String ipAddress) {
		set("ipAddress", ipAddress);
	}
	
	public void setDnsName(String dnsName) {
		set("dnsName", dnsName);
	}

	public void setCpuQuantity(String cpuQuantity) {
		set("cpuQuantity",cpuQuantity);
	}
	
	public void setCpuSpeed(String cpuSpeed) {
		set("cpuSpeed",cpuSpeed);
	}
	
	public void setMemoryQuantity(String memoryQuantity) {
	    set("memoryQuantity",memoryQuantity);
	}
	
	
}
