package com.pahlsoft.ws.iaas.provision.persistence.dao.impl;


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

import com.pahlsoft.ws.iaas.provision.generated.Category;
import com.pahlsoft.ws.iaas.provision.persistence.dao.ServerDao;


public class ServerDaoImpl implements ServerDao {

//	private DataSource dataSource;
//	private JdbcTemplate jdbcTemplate;
//	
//	public Logger daoLog = Logger.getLogger(ServerDaoImpl.class);
//	
//	public List<Server> getServer(String serverName)  {
//		daoLog.info("Querying for Server: " + serverName);
//		String sql = "select * from iaas.overview_j04 where server_name='" + serverName + "'";
//		List<Server> servers = new ArrayList<Server>();
//		 
//		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
//		for (Map<?, ?> row : rows) {
//			Server server = new Server();
//			User userInfo = new User();
//			server.setServerId((Integer)row.get("id"));
//			server.setServerName((String)row.get("server_name"));
//			server.setServerStatus(Status.fromValue((String)row.get("status")));
//			server.setStartDate((String)row.get("start_date"));
//			server.setExpirationDate((String)row.get("expiration_date"));
//			server.setServerCategory(Category.fromValue((String)row.get("category")));
//			userInfo.setFirstName((String)row.get("first_name"));
//			userInfo.setLastName((String)row.get("last_name"));
//			userInfo.setPhoneNumber((String)row.get("phone_number"));
//			userInfo.setLoginId((String)row.get("login"));
//			server.setServerUser(userInfo);
//			servers.add(server);
//		}
//	 
//		return servers;
//	}
//	
//	public List<Server> getServers() {
//		String sql = "select * from iaas.overview_j04";
//		daoLog.info("Querying for All Servers");
//		List<Server> servers = new ArrayList<Server>();
//		 
//		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
//		for (Map<?, ?> row : rows) {
//			Server server = new Server();
//			User userInfo = new User();
//			server.setServerId((Integer)row.get("id"));
//			server.setServerName((String)row.get("server_name"));
//			server.setServerStatus(Status.fromValue((String)row.get("status")));
//			server.setStartDate((String)row.get("start_date"));
//			server.setExpirationDate((String)row.get("expiration_date"));
//			server.setServerCategory(Category.fromValue((String)row.get("category")));
//			userInfo.setFirstName((String)row.get("first_name"));
//			userInfo.setLastName((String)row.get("last_name"));
//			userInfo.setPhoneNumber((String)row.get("phone_number"));
//			userInfo.setLoginId((String)row.get("login"));
//			server.setServerUser(userInfo);
//			servers.add(server);
//		}
//	 
//		return servers;
//	}
//	
//	public List<Server> getUnreservedServers() {
//		String sql = "select * from iaas.overview_j04 where start_date =''";
//		daoLog.info("Querying for All Unreserved Servers");
//		List<Server> servers = new ArrayList<Server>();
//		 
//		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
//		for (Map<?, ?> row : rows) {
//			Server server = new Server();
//			User userInfo = new User();
//			server.setServerId((Integer)row.get("id"));
//			server.setServerName((String)row.get("server_name"));
//			server.setServerStatus(Status.fromValue((String)row.get("status")));
//			server.setStartDate((String)row.get("start_date"));
//			server.setExpirationDate((String)row.get("expiration_date"));
//			server.setServerCategory(Category.fromValue((String)row.get("category")));
//			userInfo.setFirstName((String)row.get("first_name"));
//			userInfo.setLastName((String)row.get("last_name"));
//			userInfo.setPhoneNumber((String)row.get("phone_number"));
//			userInfo.setLoginId((String)row.get("login"));
//			server.setServerUser(userInfo);
//			servers.add(server);
//		}
//	 
//		return servers;
//	}
//	
//	public List<Server> getReservedServers() {
//		String sql = "select * from iaas.overview_j04 where login !='' and start_date!=''";
//		daoLog.info("Querying for All Reserved Servers");
//		List<Server> servers = new ArrayList<Server>();
//		 
//		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
//		for (Map<?, ?> row : rows) {
//			Server server = new Server();
//			User userInfo = new User();
//			server.setServerId((Integer)row.get("id"));
//			server.setServerName((String)row.get("server_name"));
//			server.setServerStatus(Status.fromValue((String)row.get("status")));
//			server.setStartDate((String)row.get("start_date"));
//			server.setExpirationDate((String)row.get("expiration_date"));
//			server.setServerCategory(Category.fromValue((String)row.get("category")));
//			userInfo.setFirstName((String)row.get("first_name"));
//			userInfo.setLastName((String)row.get("last_name"));
//			userInfo.setPhoneNumber((String)row.get("phone_number"));
//			userInfo.setLoginId((String)row.get("login"));
//			server.setServerUser(userInfo);
//			servers.add(server);
//		}
//	 
//		return servers;
//	}
//	
//	public List<Server> getReservations(String userName) {
//		String sql = "select * from iaas.overview_j04 where login='" + userName + "'";
//		daoLog.info("Querying for Servers Reserved by: " + userName);
//		List<Server> servers = new ArrayList<Server>();
//		 
//		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
//		for (Map<?, ?> row : rows) {
//			Server server = new Server();
//			User userInfo = new User();
//			server.setServerId((Integer)row.get("id"));
//			server.setServerName((String)row.get("server_name"));
//			server.setServerStatus(Status.fromValue((String)row.get("status")));
//			server.setStartDate((String)row.get("start_date"));
//			server.setExpirationDate((String)row.get("expiration_date"));
//			server.setServerCategory(Category.fromValue((String)row.get("category")));
//			userInfo.setFirstName((String)row.get("first_name"));
//			userInfo.setLastName((String)row.get("last_name"));
//			userInfo.setPhoneNumber((String)row.get("phone_number"));
//			userInfo.setLoginId((String)row.get("login"));
//			server.setServerUser(userInfo);
//			servers.add(server);
//		}
//	 
//		return servers;
//	}
//
//	
//	
//	public int addServer(Server serverInfo) {
//		return insertServer(serverInfo);
//	}
//	public int setServer(Server serverInfo) {
//		return updateUser(serverInfo);
//
//	}
//	
//	private int insertServer(Server serverInfo) {
//		String server_sql = "INSERT INTO iaas.servers VALUES (default, ?, '', '', 0, ?, '', ?)";
//		daoLog.info("Added Server: " + serverInfo.getServerName());
//		return getJdbcTemplate().update(server_sql, new Object[] {serverInfo.getServerName(),
//																  getCategoryId(serverInfo.getServerCategory()),
//				                                                  getStatusId(serverInfo.getServerStatus())});
//	}
//	
//	private int updateServer(Server serverInfo) {
//		String server_sql = "UPDATE iaas.servers set start_date=?,expiration_date=?,user_id=?,category_id=?,status_id=? where server_name=?";
//		daoLog.info("Updated Server: " + serverInfo.getServerName());
//		return getJdbcTemplate().update(server_sql, new Object[] {
//				                                                  serverInfo.getStartDate(),
//				                                                  serverInfo.getExpirationDate(),
//				                                                  serverInfo.getServerUser().getUserId(),
//				                                                  getCategoryId(serverInfo.getServerCategory()),
//				                                                  getStatusId(serverInfo.getServerStatus()),
//																  serverInfo.getServerName()});
//	}
//	
//	private int reserveServer(Server serverInfo, String userId) {
//		String server_sql = "UPDATE iaas.servers set start_date=?,expiration_date=?,user_id=?,category_id=?,status_id=? where server_name=?";
//		daoLog.info("Updated Server: " + serverInfo.getServerName());
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = new Date();
//		String startDate = sdf.format(date); 
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(date);
//		cal.add(Calendar.DATE, 90); // add 10 days
//		date = cal.getTime();
//		String expirationDate = sdf.format(date);
//		return getJdbcTemplate().update(server_sql, new Object[] {
//				                                                  startDate,
//				                                                  expirationDate,
//				                                                  userId,
//				                                                  getCategoryId(serverInfo.getServerCategory()),
//				                                                  getStatusId(serverInfo.getServerStatus()),
//																  serverInfo.getServerName()});
//	}
//	
//	private int updateUser(Server serverInfo) {
//		String user_sql = "UPDATE iaas.users set first_name=?,last_name=?,phone_number=?,login=? where id=?";
//		daoLog.info("Updated User: " + serverInfo.getServerUser().getLoginId());
//		return getJdbcTemplate().update(user_sql, new Object[] {serverInfo.getServerUser().getFirstName(),
//																serverInfo.getServerUser().getLastName(),
//																serverInfo.getServerUser().getPhoneNumber(),
//																serverInfo.getServerUser().getLoginId(),
//																serverInfo.getServerUser().getUserId()});
//	}
//	
//	private int insertUser(Server serverInfo) {
//		String user_sql = "INSERT INTO iaas.users VALUES (default,?,?,?,?,null,null)";
//		daoLog.info("Added User: " + serverInfo.getServerUser().getLoginId());
//		return getJdbcTemplate().update(user_sql, new Object[] {serverInfo.getServerUser().getFirstName(),
//																serverInfo.getServerUser().getLastName(),
//																serverInfo.getServerUser().getPhoneNumber(),
//																serverInfo.getServerUser().getLoginId()});
//	}
//	
//	private int deleteServer(String serverName) {
//		String sql = "DELETE FROM iaas.servers where server_name=?";
//		try {
//			daoLog.info("Deleting Server: " + serverName);
//			return getJdbcTemplate().update(sql,new Object[] {serverName});
//		} catch (Exception e) {
//			daoLog.info("Unable to find server " + serverName + " to delete");
//			return 0;
//		}
//	}
//	
//	public int deleteServers(ArrayList<String> serverNames) {
//		int deleteCtr = 0;
//		for (String server: serverNames) {
//			daoLog.info("Calling local deleteServer(" + server + ")");
//			deleteCtr = deleteCtr + deleteServer(server);
//		}
//		
//		return deleteCtr;
//	}
//	
//	private int expireServer(String serverName) {
//		String server_sql = "UPDATE iaas.servers set start_date='',expiration_date='',user_id='0' where server_name=?";
//		daoLog.info("Expired Server: " + serverName);
//		return getJdbcTemplate().update(server_sql, new Object[] {serverName});
//	}
//
//	public int setReservation(ArrayList<Server> servers, String userId) {
//		int serverCount = 0;
//		for (Server server: servers) {
//			reserveServer(server, userId);
//			serverCount++;
//		}
//		return serverCount;
//	}
//	
//	public int setExpiration(ArrayList<Server> servers) {
//		int serverCount = 0;
//		for (Server server: servers) {
//			expireServer(server.getServerName());
//			serverCount++;
//		}
//		return serverCount;
//	}
//	
//	
//	
//	private boolean checkServerExists(String serverName) {
//		String sql = "select * from iaas.overview_j04 where server_name=?";
//		Server _server = null;
//		try {
//			_server = getJdbcTemplate().queryForObject(sql, new Object[] {serverName}, new ServerOverviewRowMapper());
//		} catch (Exception e) {
//			daoLog.info("No Results in Query for server: " + serverName);
//		}
//		if (_server != null) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	private boolean checkUserExists(User user) {
//		if (getUserId(user) > 0 ) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	private int getUserId(User user) {
//		String sql = "select id from iaas.users where first_name=? and last_name=?";
//		return getJdbcTemplate().queryForInt(sql,new Object[] {user.getFirstName() , user.getLastName()} );
//	}
//	
//	
//	private int getCategoryId(Category category) {
//		String sql = "select id from iaas.categories where category=?";
//		return getJdbcTemplate().queryForInt(sql,new Object[] {category.value()} );
//	}
//	
//	private int getStatusId(Status status) {
//		String sql = "select id from iaas.status where status=?";
//		return getJdbcTemplate().queryForInt(sql,new Object[] {status.value()} );
//	}
//
//
//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//	public DataSource getDataSource() {
//		return dataSource;
//	}
//
//	public void setDataSource(DataSource dataSource) {
//		this.jdbcTemplate = new JdbcTemplate(dataSource);	
//	}
//

	
	
}
