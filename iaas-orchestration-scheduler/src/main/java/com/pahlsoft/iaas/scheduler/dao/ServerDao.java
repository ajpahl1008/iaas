package com.pahlsoft.iaas.scheduler.dao;

import java.util.List;
import java.util.Map;

public interface ServerDao {
	public List<String> getExpiredServers();
	public Map<String,String> getAllServers();
}
