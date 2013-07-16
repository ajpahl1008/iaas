package com.pahlsoft.iaas.ui.client;

import com.extjs.gxt.ui.client.data.BaseModel;

public class AsyncStatistics extends BaseModel  {
	private static final long serialVersionUID = 1795871709506391609L;
    
	public String getServerName() {
		return get("serverName");
	}
	
	public void setServerName(String serverName) {
		set("serverName",serverName);
	}
	
	public String getServerUptime() {
		return get("serverUptime");
	}
	public void setServerUptime(String serverUptime) {
		set("serverUptime", serverUptime);
	}
	public String getServerLoad() {
		return get("serverLoad");
	}
	public void setServerLoad(String serverLoad) {
		set("serverLoad",serverLoad);
	}
	public String getConextSwitching() {
		return get("contextSwitching");
	}
	public void setContextSwitching(String contextSwitching) {
		set("contextSwitching", contextSwitching);
	}
    
    
}
