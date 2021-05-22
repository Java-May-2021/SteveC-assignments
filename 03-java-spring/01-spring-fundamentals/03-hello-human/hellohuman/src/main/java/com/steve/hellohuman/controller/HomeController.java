package com.steve.hellohuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/{name}")
	public String getName(@PathVariable("name") String newName,Model viewModel) {
		
		viewModel.addAttribute("newName", newName);
		return"name.jsp";
		
	}
	   

}
