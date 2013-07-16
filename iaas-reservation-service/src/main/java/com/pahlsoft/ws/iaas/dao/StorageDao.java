package com.pahlsoft.ws.iaas.dao;

import java.util.ArrayList;
import java.util.List;

import com.pahlsoft.ws.iaas.generated.Storage;

public interface StorageDao {
		public List<Storage> getServerStorageInfo(String serverName);
		public List<Storage> getAllStorageInfo();
		public boolean setSingleStorage(Storage storage);
		public boolean setMultiStorage(ArrayList<Storage> serverStorage);
		public int deleteServerStorage(String serverName);
		public int deleteStorageEntity(Storage storage);
}
