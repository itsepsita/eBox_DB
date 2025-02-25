package com.absa.barclays.eBoxDB.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.absa.barclays.eBoxDB.entity.DB;
import com.absa.barclays.eBoxDB.repository.DBRepository;
import com.absa.barclays.eBoxDB.service.DBSearchService;

@Service
public class DBSearchServiceImpl implements DBSearchService {
	
	@Autowired
	private DBRepository dbRepository;
	
	public DBSearchServiceImpl(DBRepository dbRepository) {
		this.dbRepository = dbRepository;
	}

	@Override
	public List<DB> searchDB(String keyword){
		List<DB> searchResult = dbRepository.findByTitleContainsOrDescriptionContainsIgnoreCase(keyword, keyword);
		return searchResult;
	}
}
