package com.absa.barclays.eBoxDB.service;

import com.absa.barclays.eBoxDB.entity.DB;

public interface DBUpdateService {
	
	DB getDBById(int id);
	
	DB updateDB(DB db);

}
