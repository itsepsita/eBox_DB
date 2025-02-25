package com.absa.barclays.eBoxDB.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.absa.barclays.eBoxDB.repository.DBRepository;
import com.absa.barclays.eBoxDB.service.DBDeleteService;

@Service
public class DBDeleteServiceImpl implements DBDeleteService {
	
	@Autowired
	private DBRepository dbRepository;
	
	public DBDeleteServiceImpl(DBRepository dbRepository) {
		this.dbRepository = dbRepository;
		
	}
	
	@Override
	public void deleteById(int id) {
		dbRepository.deleteById(id);
	}
	
	

}
