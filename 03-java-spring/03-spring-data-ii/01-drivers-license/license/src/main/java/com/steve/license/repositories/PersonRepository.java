package com.steve.license.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.steve.license.models.Person;
@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll();
	List<Person> findByLicenseIdIsNull();

}
