package com.pahlsoft.ws.iaas.dao;

import java.util.List;

import com.pahlsoft.ws.iaas.generated.IaasEvent;

public interface EventDao {
	// Setters
	public int insertEvent(IaasEvent event);
	// Getters
	public List<IaasEvent>  getEventsToday();
	public List<IaasEvent>  getEventsYesterday();
	public List<IaasEvent>  getEventsLastWeek();
	public List<IaasEvent>  getEventsLastMonth();
	
	
}
