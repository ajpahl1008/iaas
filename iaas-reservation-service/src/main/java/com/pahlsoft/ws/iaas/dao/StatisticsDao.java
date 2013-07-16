package com.pahlsoft.ws.iaas.dao;

import java.util.List;

import com.pahlsoft.ws.iaas.generated.Statistics;

public interface StatisticsDao {
		public Statistics getServerStats(String serverName);
		public List<Statistics> getAllServerStats();
		public boolean setServerStats(Statistics serverStats);
		public int deleteServerStatistics(String serverName);
		
}
