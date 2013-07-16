package com.pahlsoft.iaas.ui.client;


import java.math.BigDecimal;

import com.extjs.gxt.ui.client.data.BaseModel;

public class AsyncError extends BaseModel {

	private static final long serialVersionUID = -7643750506400509110L;

	public AsyncError() {
		
	}
	
	public Integer getErrorId() {
		return get("errorId");
	}
	
	public void setErrorId(Integer errorId) {
		set("errorId", errorId);
	}
	
	public String getErrorDate() {
		return get("errorDate");
	}
	
	public void setErrorDate(String errorDate ) {
		set("errorDate", errorDate);
	}
	
	public String getErrorCid() {
		return get("errorCid");
	}
	
	public void setErrorCid(String errorCid) {
		set("errorCid", errorCid);
	}
	
	public String getErrorInfo() {
		return get("errorInfo");
	}
	
	public void setErrorInfo(String errorInfo) {
		set("errorInfo", errorInfo);
	}

}
