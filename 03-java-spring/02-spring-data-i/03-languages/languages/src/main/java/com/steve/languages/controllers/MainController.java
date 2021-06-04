package com.steve.languages.controllers;

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

import com.steve.languages.models.Language;
import com.steve.languages.services.LanguageService;

@Controller
public class MainController {
	@Autowired
	private LanguageService lService;
	@GetMapping("/languages")
	public String index(Model viewModel, @ModelAttribute("language") Language language) {
		viewModel.addAttribute("languages", this.lService.allLanguages());
		return "index.jsp";
	}
	@PostMapping("/languages")
	public String addLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
			
		}
		this.lService.newLanguage(language);
		return "redirect:/languages";
	}
	@RequestMapping("/languages/{id}")
	public String showLanguage(Model viewModel, @PathVariable("id") Long id) {
		Language language = lService.getSingleLanguage(id);
		viewModel.addAttribute("language", language);
		return "showLang.jsp";
	}
	@RequestMapping("/languages/{id}/edit")
	public String editPage(Model viewModel, @PathVariable("id") Long id) {
		Language language = lService.getSingleLanguage(id);
		viewModel.addAttribute("language", language);
		return "edit.jsp";
	}
	@PostMapping("/languages/{id}")
	public String edit(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		this.lService.updateLanguage(language);
		return "redirect:/languages";
	}
	@RequestMapping(value="/languages/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
		return "redirect:/languages";
	}
	

}
