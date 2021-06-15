package com.steve.dojoandninja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steve.dojoandninja.models.Dojo;
import com.steve.dojoandninja.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dRepo;
	public DojoService(DojoRepository repo) {
		this.dRepo = repo;
	}
	public List<Dojo> allDojo(){
		return this.dRepo.findAll();
	}
	public Dojo newDojo(Dojo dojo) {
		return dRepo.save(dojo);
	}
	public Dojo getSingleDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}

}
