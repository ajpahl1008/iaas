package com.pahlsoft.ws.iaas.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pahlsoft.ws.iaas.generated.IaasError;


public class ErrorRowMapper implements RowMapper<IaasError>{

	public IaasError mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			IaasError error = new IaasError();
						
			error.setErrorId(rs.getInt("errorID"));
			error.setErrorDate(rs.getString("error_date"));
			error.setCorrelationId(rs.getString("error_cid"));
			error.setErrorInfo(rs.getString("error_info"));
			
			return error;
	}
	
}
