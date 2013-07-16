package com.pahlsoft.ws.iaas.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pahlsoft.ws.iaas.generated.User;

public class UserRowMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		
		user.setFirstName(rs.getString("first_name"));
		user.setLastName(rs.getString("last_name"));
		user.setUserId(rs.getInt("id"));
		user.setLoginId(rs.getString("login"));
		user.setPhoneNumber(rs.getString("phone_number"));
		
		return user;
	}
	
}
