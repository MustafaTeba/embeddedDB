package com.imbera;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PersonController {

	@Autowired
	PersonService service;
	
	@RequestMapping(value = "/add/{firstName}/{lastName}")
	public Person addPerson( @PathVariable String firstName, @PathVariable String lastName) {
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		return service.addPersone(person);
	}
	
	@RequestMapping(value = "/getAllPersons")
	public List<Person> getAllPersons() {
		return service.getAllPersons();
	}
}
