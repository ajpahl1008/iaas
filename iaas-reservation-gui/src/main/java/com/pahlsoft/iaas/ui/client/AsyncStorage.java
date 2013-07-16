package com.pahlsoft.iaas.ui.client;

import com.extjs.gxt.ui.client.data.BaseModel;

public class AsyncStorage extends BaseModel {

	private static final long serialVersionUID = 2859494464602151755L;

	public AsyncStorage() {
		
	}
    public String getServerName() {
		return get("serverName");
	}

	public void setServerName(String serverName) {
		set("serverName",serverName);
	}

	public String getStorageEntity() {
		return get("storageEntity");
	}

	public void setStorageEntity(String storageEntity) {
		set("storageEntity",storageEntity);
	}

	public String getStorageSize() {
		return get("storageSize");
	}

	public void setStorageSize(String storageSize) {
		set("storageSize",storageSize);
	}

	public String getPercentFree() {
		return get("percentFree");
	}

	public void setPercentFree(String percentFree) {
		set("percentFree",percentFree);
	}

	
}
