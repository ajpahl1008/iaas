package com.pahlsoft.iaas.ui.client;

import com.extjs.gxt.ui.client.data.BaseModel;

public class AsyncParent extends BaseModel {

	private static final long serialVersionUID = -9061104785230959394L;

	public AsyncParent() {
		
	}
	
	public Integer getParentId() {
		return get("parentId");
	}
	
	public void setParentId(Integer id) {
		set("parentId", id);
	}
	
	public String getParentName() {
		return get("parentName");
	}
	
	public void setParentName(String parentName) {
		set("parentName", parentName);
	}
	
	public String getIpAddress() {
		return get("ipAddress");
	}
	
	public void setIpAddress(String ipAddress) {
		set("ipAddress", ipAddress);
	}
	
	public String getDnsName() {
		return get("dnsName");
	}
	
	public void setDnsName(String dnsName) {
		set("dnsName", dnsName);
	}

}
