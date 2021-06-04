package com.steve.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steve.languages.models.Language;
import com.steve.languages.services.LanguageService;

@RestController
@RequestMapping("/api")
public class LanguageApi {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("")
	public List<Language> getLanguages(){
		return this.lService.allLanguages();
	}
	@GetMapping("{id}")
	public Language getSingle(@PathVariable("id") Long id) {
		return this.lService.getSingleLanguage(id);
	}
	@PostMapping("/new")
	public Language newLanguage(Language newLanguage) {
		return this.lService.newLanguage(newLanguage);
	}
	@PutMapping("/update")
	public Language edit(@PathVariable("id")Long id, Language updateLang) {
		return this.lService.updateLanguage(updateLang);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id")Long id) {
		this.lService.deleteLanguage(id);
	}

}
