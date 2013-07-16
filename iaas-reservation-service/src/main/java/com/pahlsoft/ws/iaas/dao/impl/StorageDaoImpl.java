package com.pahlsoft.ws.iaas.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import com.pahlsoft.ws.iaas.dao.StorageDao;
import com.pahlsoft.ws.iaas.generated.Storage;

import com.pahlsoft.ws.iaas.mappers.StorageRowMapper;

public class StorageDaoImpl implements StorageDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public Logger daoLog = Logger.getLogger(StorageDaoImpl.class);
	
	public List<Storage> getServerStorageInfo(String serverName) {
		String sql = "select * from storage_j02 where server_name=?";
		daoLog.info("Querying Storage for " + serverName);
		List<Storage> storages = new ArrayList<Storage>();
		 
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql, new Object[] {serverName});
		for (Map<?, ?> row : rows) {
			Storage storage = new Storage();
			storage.setServerName((String)row.get("server_name"));
			storage.setStorageEntity((String)row.get("storage_entity"));
			storage.setStorageSize((String)row.get("storage_size"));
			storage.setPercentFree((String)row.get("percent_free"));
			storages.add(storage);
		}
		return storages;
	}

	public List<Storage> getAllStorageInfo() {
		String sql = "select * from storage_j02";
		daoLog.info("Querying Storage for All Servers");
		List<Storage> storages = new ArrayList<Storage>();
		 
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<?, ?> row : rows) {
			Storage storage = new Storage();
			storage.setServerName((String)row.get("server_name"));
			storage.setStorageEntity((String)row.get("storage_entity"));
			storage.setStorageSize((String)row.get("storage_size"));
			storage.setPercentFree((String)row.get("percent_free"));
			storages.add(storage);
		}
	 
		return storages;
	}

	public boolean setSingleStorage(Storage storage) {
		if (checkStorageExists(storage)) {
			updateStorage(storage);
			daoLog.info("Updated Storage Entity: " + storage.getStorageEntity());
		} else {
			insertStorage(storage);
			daoLog.info("Added Storage Entity: " + storage.getStorageEntity());
		}
		return true;
	}

	public boolean setMultiStorage(ArrayList<Storage> storage) {
		for ( Storage eachEntity : storage) {
			if (checkStorageExists(eachEntity)) {
				updateStorage(eachEntity);
				daoLog.info("Updated Storage Entity: " + eachEntity.getStorageEntity());
			} else {
				insertStorage(eachEntity);
				daoLog.info("Added Storage Entity: " + eachEntity.getStorageEntity());
			}
		}
		return true;
	}

	private int updateStorage(Storage storage) {
		String storage_sql = "UPDATE iaas.storage set storage_entity=?,storage_size=?,percent_free=? where id=?";
		return getJdbcTemplate().update(storage_sql, new Object[] {storage.getStorageEntity(),
				                                                   storage.getStorageSize(),
				                                                   storage.getPercentFree(),
				                                                   getStorageId(storage)});
	}
	
	private int insertStorage(Storage storage) {
		String storage_sql = "INSERT INTO iaas.storage VALUES (default, ?, ?, ?, ?)";
		return getJdbcTemplate().update(storage_sql, new Object[] {storage.getStorageEntity(),
																  storage.getStorageSize(),
																  storage.getPercentFree(),
																  getServerId(storage.getServerName())});
	}

	public int deleteServerStorage(String serverName) {
		String delete_sql = "DELETE FROM iaas.storage where server_id=?";
		try {
			daoLog.info("Deleting Storage for server: " + serverName);
			return getJdbcTemplate().update(delete_sql, new Object[] {getServerId(serverName)});
		} catch (Exception e) {
			daoLog.info("Storage for Server " + serverName + " not found" );
			return 0;
		}
	}
	
	public int deleteStorageEntity(Storage storage) {
		String delete_sql = "DELETE FROM iaas.storage where id=?";
		try {
			daoLog.info("Deleting Storage Entity: " + storage.getStorageEntity() + " for server " + storage.getServerName());
			return getJdbcTemplate().update(delete_sql, new Object[] {getStorageId(storage)});
		} catch (Exception e) {
			daoLog.info("Storage Entity Not Found: " + storage.getStorageEntity());
			return 0;
		}
	}
	
	private boolean checkStorageExists(Storage storage) {
		String sql = "select * from storage_j02 where storage_entity=? and server_name=?";
		Storage _storage = null;
		try {
			_storage = getJdbcTemplate().queryForObject(sql, new Object[] {storage.getStorageEntity(), storage.getServerName()}, new StorageRowMapper());
		} catch (Exception e) {
			daoLog.info("No Results in Query for server: " + storage.getStorageEntity());
		}
		if (_storage != null) {
			return true;
		} else {
			return false;
		}
	}
	
	private int getStorageId(Storage storage) {
			String sql = "select id from iaas.storage where storage_entity=? and server_id=?";
			return getJdbcTemplate().queryForInt(sql,new Object[] {storage.getStorageEntity(), getServerId(storage.getServerName())} );
	}
	
	private int getServerId(String serverName) {
		String sql = "select id from iaas.servers where server_name=?";
		return getJdbcTemplate().queryForInt(sql,new Object[] {serverName} );
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


	
}
