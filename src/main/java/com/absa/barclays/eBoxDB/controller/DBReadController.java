package com.absa.barclays.eBoxDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.absa.barclays.eBoxDB.entity.DB;
import com.absa.barclays.eBoxDB.service.DBReadService;

@Controller
@RequestMapping("/dbs")
public class DBReadController {
	
	@Autowired
	private DBReadService dbReadService;
	
	public DBReadController(DBReadService dbReadService) {
		this.dbReadService = dbReadService;
	}
	
	@GetMapping
	public String listDBs(Model model) {
		
		List<DB> dbs = dbReadService.listDBs();
		
		model.addAttribute("dbs",dbs);
		
		return "DB";
	}

}
