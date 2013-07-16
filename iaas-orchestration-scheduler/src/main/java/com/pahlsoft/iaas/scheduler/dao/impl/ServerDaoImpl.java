package com.pahlsoft.iaas.scheduler.dao.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pahlsoft.iaas.scheduler.dao.ServerDao;

public class ServerDaoImpl implements ServerDao {
 
private DataSource dataSource;
private JdbcTemplate jdbcTemplate;

Logger daoLog = LoggerFactory.getLogger(ServerDaoImpl.class);

public List<String> getExpiredServers() {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
	String todaysDate = sdf.format(date); 
	daoLog.debug("Searching for Expired Servers");
	
	String sql = "select server_name from iaas.servers where user_id>0 and expiration_date < '" +  todaysDate + "'";
	List<String> servers = new ArrayList<String>();
	 
	List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
	for (Map<?, ?> row : rows) {
		String server;
		server = (String) row.get("server_name");
		servers.add(server);
	}
 
	return servers;
}

public Map<String,String> getAllServers() {
	daoLog.debug("Getting All Servers");
	
	String sql = "select server_name,ip_address from iaas.servers";
	Map<String,String> servers = new HashMap<String,String>();
	 
	List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
	for (Map<?, ?> row : rows) {
		String server;
		String ip;
		server = (String) row.get("server_name");
		ip = (String) row.get("ip_address"); 
		servers.put(server, ip);
	}
 	return servers;
}

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

public DataSource getDataSource() {
	return dataSource;
}

public void setDataSource(DataSource dataSource) {
	this.jdbcTemplate = new JdbcTemplate(dataSource);
}

}
