package com.pahlsoft.ws.iaas.dao.impl;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

//import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pahlsoft.iaas.jms.Publisher;
import com.pahlsoft.ws.iaas.dao.ServerDao;
import com.pahlsoft.ws.iaas.generated.Category;
import com.pahlsoft.ws.iaas.generated.OperatingSystemEnum;
import com.pahlsoft.ws.iaas.generated.Parent;
import com.pahlsoft.ws.iaas.generated.Server;
import com.pahlsoft.ws.iaas.generated.Status;
import com.pahlsoft.ws.iaas.generated.User;
import com.pahlsoft.ws.iaas.mappers.ServerOverviewRowMapper;


public class ServerDaoImpl implements ServerDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public Logger daoLog = Logger.getLogger(ServerDaoImpl.class);
	
	public List<Server> getServer(String serverName)  {
		daoLog.info("Querying for Server: " + serverName);
		String sql = "select * from iaas.overview_j04 where server_name='" + serverName + "'";
		List<Server> servers = new ArrayList<Server>();
		 
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<?, ?> row : rows) {
			Server server = new Server();
			User userInfo = new User();
			Parent parent = new Parent();
			server.setServerId((Integer)row.get("id"));
			server.setServerName((String)row.get("server_name"));
			server.setServerStatus(Status.fromValue((String)row.get("status")));
			server.setStartDate((String)row.get("start_date"));
			server.setExpirationDate((String)row.get("expiration_date"));
			server.setServerCategory(Category.fromValue((String)row.get("category")));
			parent.setParentName((String)row.get("parent_name"));
			server.setDnsName((String)row.get("dns_name"));
			server.setIpAddress((String)row.get("ip_address"));
			server.setParentName((String)row.get("parent_name"));
			server.setCpuQuantity((String)row.get("cpu_qty"));
			server.setCpuSpeed((String)row.get("cpu_speed"));
			server.setMemoryQuantity((String)row.get("memory"));
			userInfo.setFirstName((String)row.get("first_name"));
			userInfo.setLastName((String)row.get("last_name"));
			userInfo.setPhoneNumber((String)row.get("phone_number"));
			userInfo.setLoginId((String)row.get("login"));
			userInfo.setUserId(getUserId(userInfo));
			server.setOperatingSystem(OperatingSystemEnum.fromValue((String)row.get("os_name")));
			server.setServerUser(userInfo);
			servers.add(server);
		}
	 
		return servers;
	}
	
	public List<Server> getServers() {
		String sql = "select * from iaas.overview_j04";
		daoLog.info("Querying for All Servers");
		List<Server> servers = new ArrayList<Server>();
		 
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<?, ?> row : rows) {
			Server server = new Server();
			User userInfo = new User();
			Parent parent = new Parent();
			server.setServerId((Integer)row.get("id"));
			server.setServerName((String)row.get("server_name"));
			server.setServerStatus(Status.fromValue((String)row.get("status")));
			server.setStartDate((String)row.get("start_date"));
			server.setExpirationDate((String)row.get("expiration_date"));
			server.setServerCategory(Category.fromValue((String)row.get("category")));
			parent.setParentName((String)row.get("parent_name"));
			server.setDnsName((String)row.get("dns_name"));
			server.setIpAddress((String)row.get("ip_address"));
			server.setParentName((String)row.get("parent_name"));
			server.setCpuQuantity((String)row.get("cpu_qty"));
			server.setCpuSpeed((String)row.get("cpu_speed"));
			server.setMemoryQuantity((String)row.get("memory"));
			userInfo.setFirstName((String)row.get("first_name"));
			userInfo.setLastName((String)row.get("last_name"));
			userInfo.setPhoneNumber((String)row.get("phone_number"));
			userInfo.setLoginId((String)row.get("login"));
			userInfo.setUserId(getUserId(userInfo));
			server.setOperatingSystem(OperatingSystemEnum.fromValue((String)row.get("os_name")));
			server.setServerUser(userInfo);
			servers.add(server);
		}
	 
		return servers;
	}
	
	public List<Server> getUnreservedServers() {
		String sql = "select * from iaas.overview_j04 where start_date =''";
		daoLog.info("Querying for All Unreserved Servers");
		List<Server> servers = new ArrayList<Server>();
		 
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<?, ?> row : rows) {
			Server server = new Server();
			User userInfo = new User();
			Parent parent = new Parent();
			server.setServerId((Integer)row.get("id"));
			server.setServerName((String)row.get("server_name"));
			server.setServerStatus(Status.fromValue((String)row.get("status")));
			server.setStartDate((String)row.get("start_date"));
			server.setExpirationDate((String)row.get("expiration_date"));
			server.setServerCategory(Category.fromValue((String)row.get("category")));
			parent.setParentName((String)row.get("parent_name"));
			server.setParentName((String)row.get("parent_name"));
			server.setCpuQuantity((String)row.get("cpu_qty"));
			server.setCpuSpeed((String)row.get("cpu_speed"));
			server.setMemoryQuantity((String)row.get("memory"));
			userInfo.setFirstName((String)row.get("first_name"));
			userInfo.setLastName((String)row.get("last_name"));
			userInfo.setPhoneNumber((String)row.get("phone_number"));
			userInfo.setLoginId((String)row.get("login"));
			server.setOperatingSystem(OperatingSystemEnum.fromValue((String)row.get("os_name")));
			server.setIpAddress((String)row.get("ip_address"));
			server.setDnsName((String)row.get("dns_name"));
			server.setServerUser(userInfo);
			servers.add(server);
		}
	 
		return servers;
	}
	
	public List<Server> getReservedServers() {
		String sql = "select * from iaas.overview_j04 where login !='' and start_date!=''";
		daoLog.info("Querying for All Reserved Servers");
		List<Server> servers = new ArrayList<Server>();
		 
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<?, ?> row : rows) {
			Server server = new Server();
			User userInfo = new User();
			Parent parent = new Parent();
			server.setServerId((Integer)row.get("id"));
			server.setServerName((String)row.get("server_name"));
			server.setServerStatus(Status.fromValue((String)row.get("status")));
			server.setStartDate((String)row.get("start_date"));
			server.setExpirationDate((String)row.get("expiration_date"));
			server.setServerCategory(Category.fromValue((String)row.get("category")));
			server.setCpuQuantity((String)row.get("cpu_qty"));
			server.setCpuSpeed((String)row.get("cpu_speed"));
			server.setMemoryQuantity((String)row.get("memory"));
			parent.setParentName((String)row.get("parent_name"));
			server.setParentName((String)row.get("parent_name"));
			userInfo.setFirstName((String)row.get("first_name"));
			userInfo.setLastName((String)row.get("last_name"));
			userInfo.setPhoneNumber((String)row.get("phone_number"));
			userInfo.setLoginId((String)row.get("login"));
			server.setOperatingSystem(OperatingSystemEnum.fromValue((String)row.get("os_name")));
			server.setIpAddress((String)row.get("ip_address"));
			server.setDnsName((String)row.get("dns_name"));
			server.setServerUser(userInfo);
			servers.add(server);
		}
	 
		return servers;
	}
	
	public List<Server> getReservations(String userName) {
		String sql = "select * from iaas.overview_j04 where login='" + userName + "'";
		daoLog.info("Querying for Servers Reserved by: " + userName);
		List<Server> servers = new ArrayList<Server>();
		 
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<?, ?> row : rows) {
			Server server = new Server();
			User userInfo = new User();
			Parent parent = new Parent();
			server.setServerId((Integer)row.get("id"));
			server.setServerName((String)row.get("server_name"));
			server.setServerStatus(Status.fromValue((String)row.get("status")));
			server.setStartDate((String)row.get("start_date"));
			server.setExpirationDate((String)row.get("expiration_date"));
			server.setServerCategory(Category.fromValue((String)row.get("category")));
			server.setCpuQuantity((String)row.get("cpu_qty"));
			server.setCpuSpeed((String)row.get("cpu_speed"));
			server.setMemoryQuantity((String)row.get("memory"));
			parent.setParentName((String)row.get("parent_name"));
			server.setParentName((String)row.get("parent_name"));
			userInfo.setFirstName((String)row.get("first_name"));
			userInfo.setLastName((String)row.get("last_name"));
			userInfo.setPhoneNumber((String)row.get("phone_number"));
			userInfo.setLoginId((String)row.get("login"));
			server.setOperatingSystem(OperatingSystemEnum.fromValue((String)row.get("os_name")));
			server.setServerUser(userInfo);
			servers.add(server);
		}
	 
		return servers;
	}
	
	public int addServer(Server serverInfo) {
		if (checkServerExists(serverInfo.getServerName())) {
			return updateServer(serverInfo);
		} else {
			return insertServer(serverInfo);
		}
	}
	
	public int setServer(Server serverInfo) {
		return updateServer(serverInfo);

	}
	
	private int insertServer(Server serverInfo) {
		String server_sql = "INSERT INTO iaas.servers VALUES (default, ?, '', '', 0, ?, '', ?, ?, ?, ?, ?, ? ,? ,?)";
		daoLog.info("Added Server: " + serverInfo.getServerName());
		Publisher.publish("eventQueue", "Server: " + serverInfo.getServerName() + " added");
		return getJdbcTemplate().update(server_sql, new Object[] {serverInfo.getServerName(),
																  getCategoryId(serverInfo.getServerCategory()),
				                                                  getStatusId(serverInfo.getServerStatus()),
				                                                  getParentId(serverInfo.getParentName()),
				                                                  serverInfo.getIpAddress(),
				                                                  serverInfo.getDnsName(),
				                                                  getOperatingSystemId(serverInfo.getOperatingSystem().value()),
				                                                  serverInfo.getCpuQuantity(),
				                                                  serverInfo.getCpuSpeed(),
				                                                  serverInfo.getMemoryQuantity()});
	}
	
	private int updateServer(Server serverInfo) {
		String server_sql = "UPDATE iaas.servers set start_date=?,expiration_date=?,user_id=?,category_id=?,status_id=?,parent_id=?,ip_address=?,dns_name=?,os_id=?,cpu_qty=?,cpu_speed=?,memory=? where server_name=?";
		daoLog.info("Updated Server: " + serverInfo.getServerName());
		Publisher.publish("eventQueue", "Server: " + serverInfo.getServerName() + " updated");
		return getJdbcTemplate().update(server_sql, new Object[] {
				                                                  serverInfo.getStartDate(),
				                                                  serverInfo.getExpirationDate(),
				                                                  serverInfo.getServerUser().getUserId(),
				                                                  getCategoryId(serverInfo.getServerCategory()),
				                                                  getStatusId(serverInfo.getServerStatus()),
				                                                  getParentId(serverInfo.getParentName()),
				                                                  serverInfo.getIpAddress(),
				                                                  serverInfo.getDnsName(),
				                                                  getOperatingSystemId(serverInfo.getOperatingSystem().value()),
				                                                  serverInfo.getCpuQuantity(),
				                                                  serverInfo.getCpuSpeed(),
				                                                  serverInfo.getMemoryQuantity(),
																  serverInfo.getServerName()});
	}
	
	private int reserveServer(Server serverInfo, String userId) {
		String server_sql = "UPDATE iaas.servers set start_date=?,expiration_date=?,user_id=?  where server_name=?";
		daoLog.info("Updated Server: " + serverInfo.getServerName());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String startDate = sdf.format(date); 
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 90); // add 90 days to today's date
		date = cal.getTime();
		String expirationDate = sdf.format(date);
		Publisher.publish("eventQueue", "Server: " + serverInfo.getServerName() + " reserved by " + userId);
		return getJdbcTemplate().update(server_sql, new Object[] {
				                                                  startDate,
				                                                  expirationDate,
				                                                  userId,
				                                                  serverInfo.getServerName()});
	}
	
	private int updateUser(Server serverInfo) {
		String user_sql = "UPDATE iaas.users set first_name=?,last_name=?,phone_number=?,login=? where id=?";
		daoLog.info("Updated User: " + serverInfo.getServerUser().getLoginId());
		return getJdbcTemplate().update(user_sql, new Object[] {serverInfo.getServerUser().getFirstName(),
																serverInfo.getServerUser().getLastName(),
																serverInfo.getServerUser().getPhoneNumber(),
																serverInfo.getServerUser().getLoginId(),
																serverInfo.getServerUser().getUserId()});
	}
	
	private int insertUser(Server serverInfo) {
		String user_sql = "INSERT INTO iaas.users VALUES (default,?,?,?,?,null,null)";
		daoLog.info("Added User: " + serverInfo.getServerUser().getLoginId());
		Publisher.publish("eventQueue", "User: " + serverInfo.getServerUser().getUserId() + " added");
		return getJdbcTemplate().update(user_sql, new Object[] {serverInfo.getServerUser().getFirstName(),
																serverInfo.getServerUser().getLastName(),
																serverInfo.getServerUser().getPhoneNumber(),
																serverInfo.getServerUser().getLoginId()});
	}
	
	private int deleteServer(String serverName) {
		String sql = "DELETE FROM iaas.servers where server_name=?";
		try {
			daoLog.info("Deleting Server: " + serverName);
			Publisher.publish("eventQueue", "Server: " + serverName + " deleted");
			return getJdbcTemplate().update(sql,new Object[] {serverName});
		} catch (Exception e) {
			daoLog.info("Unable to find server " + serverName + " to delete");
			return 0;
		}
	}
	
	public int deleteServers(ArrayList<String> serverNames) {
		int deleteCtr = 0;
		for (String server: serverNames) {
			daoLog.info("Calling local deleteServer(" + server + ")");
			deleteCtr = deleteCtr + deleteServer(server);
		}
		
		return deleteCtr;
	}
	
	private int expireServer(String serverName) {
		String server_sql = "UPDATE iaas.servers set start_date='',expiration_date='',user_id='0' where server_name=?";
		daoLog.info("Expired Server: " + serverName);
		Publisher.publish("eventQueue", "Server: " + serverName + " unreserved");
		return getJdbcTemplate().update(server_sql, new Object[] {serverName});
	}

	public int setReservation(ArrayList<Server> servers, String userId) {
		int serverCount = 0;
		for (Server server: servers) {
			reserveServer(server, userId);
			serverCount++;
		}
		return serverCount;
	}
	
	public int setExpiration(ArrayList<String> servers) {
		int serverCount = 0;
		for (String server: servers) {
			expireServer(server);
			serverCount++;
		}
		return serverCount;
	}
	

	public List<Parent> getParents() { 
		String sql = "select * from iaas.parents";
		daoLog.info("Querying for All Parents");
		List<Parent> parents = new ArrayList<Parent>();
		 
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<?, ?> row : rows) {
			Parent parent = new Parent();
			parent.setParentId((Integer)row.get("id"));
			parent.setParentName((String)row.get("parent_name"));
			parent.setIpAddress((String)row.get("ip_address"));
			parent.setDnsName((String)row.get("dns_name"));
			parents.add(parent);
		}
		return parents;
	}
	
	public Parent getParent(String serverName) {
		String sql = "select * from iaas.parents where parent_name='" + serverName +"'";
		daoLog.info("Querying for Parent for - " + serverName);
		Parent parent = null;
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<?, ?> row : rows) {
			parent = new Parent();
			parent.setParentId((Integer)row.get("id"));
			parent.setParentName((String)row.get("parent_name"));
			parent.setIpAddress((String)row.get("ip_address"));
			parent.setDnsName((String)row.get("dns_name"));
			
		}
		return parent;

	}

	public int addParent(Parent parentInfo) {
		String server_sql = "INSERT INTO iaas.parents VALUES (default, ?, ?, ?)";
		daoLog.info("Added Parent: " + parentInfo.getParentName());
		return getJdbcTemplate().update(server_sql, new Object[] {
				parentInfo.getParentName(),
				parentInfo.getIpAddress(),
				parentInfo.getDnsName()});
	}
	
	public int deleteParents(ArrayList<String> parentNames) {
		int deleteCtr = 0;
		for (String parent: parentNames) {
			daoLog.info("Calling local deleteParent(" + parent+ ")");
			deleteCtr = deleteCtr + deleteParent(parent);
		}
		
		return deleteCtr;
	}

	
	private int deleteParent(String parentName) {
		String sql = "DELETE FROM iaas.parents where parent_name=?";
		try {
			daoLog.info("Deleting Parent: " + parentName);
			Publisher.publish("eventQueue", "Parent: " + parentName + " added");
			return getJdbcTemplate().update(sql,new Object[] {parentName});
		} catch (Exception e) {
			daoLog.info("Unable to find parent " + parentName + " to delete");
			return 0;
		}
	}
	
	
	
	private boolean checkServerExists(String serverName) {
		String sql = "select * from iaas.overview_j04 where server_name=?";
		Server _server = null;
		try {
			_server = getJdbcTemplate().queryForObject(sql, new Object[] {serverName}, new ServerOverviewRowMapper());
		} catch (Exception e) {
			daoLog.info("No Results in Query for server: " + serverName);
		}
		if (_server != null) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean checkUserExists(User user) {
		if (getUserId(user) > 0 ) {
			return true;
		} else {
			return false;
		}
	}
	
	private int getUserId(User user) {
		String sql = "select id from iaas.users where first_name=? and last_name=?";
		return getJdbcTemplate().queryForInt(sql,new Object[] {user.getFirstName() , user.getLastName()} );
	}
	
	private int getParentId(String parentName) {
		String sql = "select id from iaas.parents where parent_name=?";
		return getJdbcTemplate().queryForInt(sql,new Object[] {parentName} );
	}
	
	private int getCategoryId(Category category) {
		String sql = "select id from iaas.categories where category=?";
		return getJdbcTemplate().queryForInt(sql,new Object[] {category.value()} );
	}
	
	private int getOperatingSystemId(String osName) {
		String sql = "select id from iaas.os where os_name=?";
		return getJdbcTemplate().queryForInt(sql,new Object[] {osName} );
	}
	
	private int getStatusId(Status status) {
		String sql = "select id from iaas.status where status=?";
		return getJdbcTemplate().queryForInt(sql,new Object[] {status.value()} );
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

	@Override
	public List<String> getChildrenByParent(String parentName) {
		int parentId = this.getParentId(parentName);

		String sql = "select server_name from iaas.servers where parent_id='" + parentId +"'";
		daoLog.info("Querying for Children for - " + parentName);
		List<String> servers = new ArrayList<String>();
		 
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<?, ?> row : rows) {
			servers.add((String)row.get("server_name"));
		}
		return servers;
	}



	
	
	
}
