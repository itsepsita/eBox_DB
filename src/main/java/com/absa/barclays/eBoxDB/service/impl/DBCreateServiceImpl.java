package com.absa.barclays.eBoxDB.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.absa.barclays.eBoxDB.entity.DB;
import com.absa.barclays.eBoxDB.repository.DBRepository;
import com.absa.barclays.eBoxDB.service.DBCreateService;

@Service
public class DBCreateServiceImpl implements DBCreateService {

	@Autowired
	private DBRepository dbRepository;

	public DBCreateServiceImpl(DBRepository dbRepository) {
		this.dbRepository = dbRepository;

	}

	@Override
	public DB saveDB(DB db) {
		db.setCreatedate(LocalDate.now().toString());
		return dbRepository.save(db);
	}

}
