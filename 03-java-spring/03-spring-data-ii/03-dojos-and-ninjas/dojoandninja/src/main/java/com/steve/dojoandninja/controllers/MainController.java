package com.steve.dojoandninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steve.dojoandninja.models.Dojo;
import com.steve.dojoandninja.models.Ninja;
import com.steve.dojoandninja.services.DojoService;
import com.steve.dojoandninja.services.NinjaService;

@Controller
public class MainController {
	@Autowired
	private DojoService dService;
	@Autowired
	private NinjaService nService;
	@GetMapping("/dojos/new")
	public String index(@ModelAttribute("dojo")Dojo dojo) {
		return "newDojo.jsp";
	}
	@PostMapping("/dojos/new")
	public String newDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}
		this.dService.newDojo(dojo);
		return "redirect:/ninjas/new";
	}
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja")Ninja ninja, Model viewModel) {
		viewModel.addAttribute("allDojo", this.dService.allDojo());
		return"/ninjas/newNinja.jsp";
	}
	@PostMapping("/ninjas/new")
	public String addNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "ninjas/newNinja.jsp";
		}
		this.nService.newNinja(ninja);
		return"redirect:/dojos/new";
	}
	@GetMapping("/dojos/{id}")
	public String show(@PathVariable("id")Long id, Model viewModel) {
		Dojo dojo = dService.getSingleDojo(id);
		viewModel.addAttribute("dojo", dojo);
		return "show.jsp";
	}
	@RequestMapping("/ninjas/delete/{id}")
	public String deleteNinja(@PathVariable("id")Long id) {
		this.nService.deleteNinja(id);
		return "redirect:/dojos/new";
	}

}
