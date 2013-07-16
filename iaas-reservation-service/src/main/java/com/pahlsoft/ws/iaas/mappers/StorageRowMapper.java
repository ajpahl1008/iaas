package com.pahlsoft.ws.iaas.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pahlsoft.ws.iaas.generated.Storage;

public class StorageRowMapper implements RowMapper<Storage> {

	public Storage mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storage storage = new Storage();
		storage.setServerName(rs.getString("server_name"));
		storage.setStorageEntity(rs.getString("storage_entity"));
		storage.setStorageSize(rs.getString("storage_size"));
		storage.setPercentFree(rs.getString("percent_free"));
		
		return storage;
	}

}
