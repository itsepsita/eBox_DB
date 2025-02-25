package com.absa.barclays.eBoxDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.absa.barclays.eBoxDB.entity.DB;
import com.absa.barclays.eBoxDB.service.DBUpdateService;

@Controller
public class DBUpdateController {
	
	@Autowired
	private DBUpdateService dbUpdateService;
	
	public DBUpdateController(DBUpdateService dbUpdateService) {
		this.dbUpdateService = dbUpdateService;
	
	}
	
	@GetMapping("/dbs/{id}/edit")
	public String updateTableButtonClicked(@PathVariable int id, Model model) {

		DB selectedTable = dbUpdateService.getDBById(id);

		model.addAttribute("db", selectedTable);

		return "edit-table";
	}

	@PostMapping("/dbs/{id}/edit")
	public String submitButtonClickedForUpdateTable(@PathVariable int id, @ModelAttribute("db") DB db) {

		// Update the ticket object
		DB existingTableObj = dbUpdateService.getDBById(id);

		existingTableObj.setTitle(db.getTitle());
		existingTableObj.setDescription(db.getDescription());
		existingTableObj.setContent(db.getContent());

		dbUpdateService.updateDB(db);

		return "redirect:/dbs";
	}


}
