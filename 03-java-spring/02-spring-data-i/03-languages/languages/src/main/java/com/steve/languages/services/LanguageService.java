package com.steve.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steve.languages.models.Language;
import com.steve.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	
	
	   private final LanguageRepository lRepo;
	    
	    public LanguageService(LanguageRepository repo) {
	        this.lRepo = repo;
	    }
	   
	    public List<Language> allLanguages() {
	        return this.lRepo.findAll();
	    }
	  
	    public Language newLanguage(Language language) {
	        return lRepo.save(language);
	    }
	  
	   
	    public Language getSingleLanguage(Long id) {
	    	return this.lRepo.findById(id).orElse(null);
	  
	   
	    }
	    public void deleteLanguage(Long id) {
	    	this.lRepo.deleteById(id);
	    }
	    
	    public Language updateLanguage(Language language) {
	    	return lRepo.save(language);
	    }

}
