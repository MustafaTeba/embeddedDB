package com.imbera;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonRepository repo;
	
	@Override
	public Person addPersone(Person person) {
		repo.save(person);
		return person;
	}

	@Override
	public List<Person> getAllPersons() {
		return repo.findAll();
	}	
}
