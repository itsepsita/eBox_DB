package com.absa.barclays.eBoxDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.absa.barclays.eBoxDB.entity.DB;
import com.absa.barclays.eBoxDB.service.DBCreateService;

@Controller
@RequestMapping("/dbs")
public class DBCreateController {

	@Autowired
	private DBCreateService dbCreateService;

	public DBCreateController(DBCreateService dbCreateService) {

		this.dbCreateService = dbCreateService;
	}

	@GetMapping("/newTable")
	public String addDBButtonClick(Model model) {
		DB db = new DB();
		model.addAttribute("db", db);
		return "create-table";
	}

	@PostMapping
	public String submitButtonClickforAdd(@ModelAttribute("db") DB db) {
		dbCreateService.saveDB(db);
		return "redirect:/dbs";
	}

}
