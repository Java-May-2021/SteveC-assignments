package com.steve.license.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steve.license.models.Person;
import com.steve.license.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository pRepo;
	
	public PersonService(PersonRepository repo) {
		this.pRepo = repo;
	}
	public List<Person> allPeople(){
		return this.pRepo.findAll();
	}
	public Person newPerson(Person person) {
		return pRepo.save(person);
	}
	public Person getSinglePerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public List<Person> listOfUnlicensedPeople() {
		return pRepo.findByLicenseIdIsNull();
	}

}
