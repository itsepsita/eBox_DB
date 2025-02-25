package com.absa.barclays.eBoxDB.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.absa.barclays.eBoxDB.entity.DB;
import com.absa.barclays.eBoxDB.repository.DBRepository;
import com.absa.barclays.eBoxDB.service.DBUpdateService;

@Service
public class DBUpdateServiceImpl implements DBUpdateService {
	
	@Autowired
	private DBRepository dbRepository;
	
	public DBUpdateServiceImpl(DBRepository dbRepository) {
		this.dbRepository = dbRepository;
		
	}
	
	@Override
	public DB updateDB(DB db) {
		db.setCreatedate(LocalDate.now().toString());
		return dbRepository.save(db);
	}
	
	@Override
	public DB getDBById(int id) {
		return dbRepository.findById(id).get();
	}

}
