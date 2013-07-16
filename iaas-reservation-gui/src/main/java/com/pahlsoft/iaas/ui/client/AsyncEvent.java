package com.pahlsoft.iaas.ui.client;

import com.extjs.gxt.ui.client.data.BaseModel;

public class AsyncEvent extends BaseModel {

	private static final long serialVersionUID = -7643750506400509110L;

	public AsyncEvent() {
		
	}
	
	public Integer getEventId() {
		return get("eventId");
	}
	
	public void setEventId(Integer eventId) {
		set("eventId", eventId);
	}
	
	public String getEventDate() {
		return get("eventDate");
	}
	
	public void setEventDate(String eventDate ) {
		set("eventDate", eventDate);
	}

	
	public String getEventCid() {
		return get("eventCid");
	}
	
	public void setEventCid(String eventCid) {
		set("eventCid", eventCid);
	}
	
	public String getEventInfo() {
		return get("eventInfo");
	}
	
	public void setEventInfo(String eventInfo) {
		set("eventInfo", eventInfo);
	}

}
