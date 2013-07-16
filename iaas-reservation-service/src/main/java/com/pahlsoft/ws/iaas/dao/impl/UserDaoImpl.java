package com.pahlsoft.ws.iaas.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pahlsoft.ws.iaas.dao.UserDao;
import com.pahlsoft.ws.iaas.generated.User;

public class UserDaoImpl implements UserDao {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public Logger daoLog = Logger.getLogger(UserDaoImpl.class);

	public List<User> getUser(String userName) {
		String sql = "select * from iaas.users where login='"+userName+"'";
		daoLog.info("Querying for " +userName);
		List<User> users= new ArrayList<User>();
		 
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<?, ?> row : rows) {
			User user = new User();
			user.setUserId((Integer)row.get("id"));
			user.setFirstName((String)row.get("first_name"));
			user.setLastName((String)row.get("last_name"));
			user.setPhoneNumber((String)row.get("phone_number"));
			user.setLoginId((String)row.get("login"));
			users.add(user);
		}
		return users;
	}

	public List<User> getUsers() {
			String sql = "select * from users";
			daoLog.info("Querying for All Users");
			List<User> users= new ArrayList<User>();
			 
			List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
			for (Map<?, ?> row : rows) {
				User user = new User();
				user.setUserId((Integer)row.get("id"));
				user.setFirstName((String)row.get("first_name"));
				user.setLastName((String)row.get("last_name"));
				user.setPhoneNumber((String)row.get("phone_number"));
				user.setLoginId((String)row.get("login"));
				users.add(user);
			}
			return users;
	}

	public int addUser(User user) {
		
			String user_sql = "INSERT INTO iaas.users VALUES (default,?,?,?,?,null,null)";
			daoLog.info("Added User: " + user.getLoginId());
			return getJdbcTemplate().update(user_sql, new Object[] {
																	user.getFirstName(),
																	user.getLastName(),
																	user.getPhoneNumber(),
																	user.getLoginId()});
	}

	private int deleteUser(String userId) {
			String user_sql = "DELETE FROM iaas.users where login=?";
			daoLog.info("Deleted User: " + userId);
			return getJdbcTemplate().update(user_sql, new Object[] {userId});
			
	}

	public int deleteUsers(ArrayList<String> users) {
		int deletedUsers = 0;
		for (String user: users) {
			deletedUsers = deletedUsers + deleteUser(user);
		}
		return deletedUsers;
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
		this.jdbcTemplate = new JdbcTemplate(dataSource);	}

	public int setUser(User user) {
		String user_sql = "UPDATE iaas.users set first_name=?,last_name=?,phone_number=?,login=? where id=?";
		daoLog.info("Updated User: " + user.getLoginId());
		return getJdbcTemplate().update(user_sql, new Object[] {user.getFirstName(),
																user.getLastName(),
																user.getPhoneNumber(),
																user.getLoginId(),
																user.getUserId()});
		
	}


	
}
