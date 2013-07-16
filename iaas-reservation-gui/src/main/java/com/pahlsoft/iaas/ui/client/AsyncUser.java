package com.pahlsoft.iaas.ui.client;

import com.extjs.gxt.ui.client.data.BaseModel;

public class AsyncUser extends BaseModel {
	private static final long serialVersionUID = -1277564846460702543L;

	public AsyncUser() {
		
	}
	
	public Integer getUserId() {
		return get("id");
	}
	
	public void setUserId(Integer id) {
		set("id", id);
	}
	
	public String getFirstName() {
		return get("firstname");
	}
	
	public void setFirstName(String firstName) {
		set("firstname", firstName);
	}
	
	public String getLastName() {
		return get("lastname");
	}
	
	public void setLastName(String lastName) {
		set("lastname", lastName);
	}
	
	public String getPhoneNumber() {
		return get("phonenumber");
	}
	
	public void setPhoneNumber(String phoneNumber) {
		set("phonenumber", phoneNumber);
	}
	
	public String getLoginId() {
		return get("loginid");
	}
	
	public void setLoginId(String loginId) {
		set("loginid", loginId);
	}
}
