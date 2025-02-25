package com.absa.barclays.eBoxDB.service;

import java.util.List;

import com.absa.barclays.eBoxDB.entity.DB;

public interface DBSearchService {
	
	List<DB> searchDB(String keyword);

}
