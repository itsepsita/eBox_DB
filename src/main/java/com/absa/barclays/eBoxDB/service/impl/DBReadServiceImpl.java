package com.absa.barclays.eBoxDB.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.absa.barclays.eBoxDB.entity.DB;
import com.absa.barclays.eBoxDB.repository.DBRepository;
import com.absa.barclays.eBoxDB.service.DBReadService;

@Service
public class DBReadServiceImpl implements DBReadService{
	
	@Autowired
	private DBRepository dbRepository;
	
	public DBReadServiceImpl(DBRepository dbRepository) {
		this.dbRepository = dbRepository;
	}
	
	@Override
	public List<DB> listDBs(){
		return dbRepository.findAll();
	}

}
