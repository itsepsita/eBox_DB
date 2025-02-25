package com.absa.barclays.eBoxDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.absa.barclays.eBoxDB.entity.DB;
import com.absa.barclays.eBoxDB.service.DBSearchService;
import com.absa.barclays.eBoxDB.service.DBUpdateService;

@Controller
@RequestMapping("/dbs")
public class DBSearchController {
	
	@Autowired
	private DBSearchService dbSearchService;
	
	@Autowired
	private DBUpdateService dbUpdateService;
	
	public DBSearchController(DBSearchService dbSearchService, DBUpdateService dbUpdateService) {
		this.dbSearchService = dbSearchService;
		this.dbUpdateService = dbUpdateService;
	}
	
	@GetMapping("/search/{searchString}")
	public String searchTickets(@PathVariable String searchString, Model model) {
		List<DB> dbs= dbSearchService.searchDB(searchString);
		model.addAttribute("dbs", dbs);
		model.addAttribute("searchString", searchString);
		return "DB";
	}
	
	@GetMapping("/search/")
	public String searchdefDBs() {
		return "redirect:/dbs";
	}
	
	@GetMapping("/{id}/view")
	public String viewDBButtonClicked(@PathVariable int id, Model model) {
		DB selectedDB = dbUpdateService.getDBById(id);
		model.addAttribute("db", selectedDB);
		return "view-table";
		
	}

}
