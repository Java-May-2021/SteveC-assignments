package com.steve.license.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.steve.license.models.License;
import com.steve.license.models.Person;
import com.steve.license.services.LicenseService;
import com.steve.license.services.PersonService;
@Controller
public class MainController {
	@Autowired
	private PersonService pService;
	@Autowired
	private LicenseService lService;
	@GetMapping("/")
	public String index(@ModelAttribute("person") Person person) {
		return "NewPerson.jsp";
	}
	@PostMapping("/person/new")
	public String newPerson(@Valid @ModelAttribute("person")Person person, BindingResult result) {
		if(result.hasErrors()) {
			return"NewPerson.jsp";
		}
		this.pService.newPerson(person);
		return "redirect:/license";
	}
	@GetMapping("/license")
	public String newLicense(@ModelAttribute("license")License license, Model viewModel) {
		viewModel.addAttribute("persons", this.pService.listOfUnlicensedPeople());
		return "NewLicense.jsp";
	}
	@PostMapping("/license/new")
	public String newLicense(@Valid @ModelAttribute("license")License license, BindingResult result) {
		if (result.hasErrors()) {
			return"NewLicense.jsp";
		}
		this.lService.newLicense(license);
		return"redirect:/";
	}
	@GetMapping("/persons/{id}")
	public String show(@PathVariable("id")Long id, Model viewModel) {
		Person person = pService.getSinglePerson(id);
		viewModel.addAttribute("person", person);
		return "show.jsp";
	}

}
