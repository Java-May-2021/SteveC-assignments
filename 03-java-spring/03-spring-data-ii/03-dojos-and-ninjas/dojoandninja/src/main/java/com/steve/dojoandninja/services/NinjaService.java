package com.steve.dojoandninja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steve.dojoandninja.models.Ninja;
import com.steve.dojoandninja.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository nRepo;
	public NinjaService(NinjaRepository repo) {
		this.nRepo = repo;
	}
	public Ninja newNinja(Ninja ninja) {
		return nRepo.save(ninja);
	}
	public void deleteNinja(Long id) {
		this.nRepo.deleteById(id);
	}

}
