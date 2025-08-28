package br.com.naor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.naor.model.Person;

@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());

	public List<Person> findAll() {
		logger.info("find all People");
		List<Person> list = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person mockPerson = mockPerson(i);
			list.add(mockPerson);
		}
		return list;

	}

	public Person findById(String id) {
		logger.info("find one person");

		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Artur");
		person.setLastName("silva");
		person.setAddress("Goaia - Goias - Brasil");
		person.setGender("Male");
		return person;

	}
	
	public Person creatPerson(Person person) {
		logger.info("creat a Person");
		return person;
		
	}
	
	public Person update(Person person) {
		logger.info("updating a Person");
		return person;
		
	}
	
	public void delet(String id) {
		logger.info("deleting a Person");
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("FirstName" + i);
		person.setLastName("LastName" + i);
		person.setAddress("any addresss");
		person.setGender("Male");

		return person;

	}

}
