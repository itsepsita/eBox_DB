package com.absa.barclays.eBoxDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.absa.barclays.eBoxDB.service.DBDeleteService;

@Controller
public class DBDeleteController {
	
	@Autowired
	private DBDeleteService dbDeleteService;
	
	public DBDeleteController(DBDeleteService dbDeleteService) {
		this.dbDeleteService = dbDeleteService;
	}

	@GetMapping("/dbs/{id}/delete")
	public String deleteDB(@PathVariable int id) {
		dbDeleteService.deleteById(id);
		return "redirect:/dbs";
	}
}
