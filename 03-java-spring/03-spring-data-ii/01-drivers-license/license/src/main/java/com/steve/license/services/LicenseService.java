package com.steve.license.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steve.license.models.License;
import com.steve.license.repositories.LicenseRepository;

@Service
public class LicenseService {
	@Autowired
	private LicenseRepository lRepo;
	public LicenseService(LicenseRepository repo) {
		this.lRepo = repo;
	}
	public License newLicense(License license) {
		return lRepo.save(license);
	}

}
