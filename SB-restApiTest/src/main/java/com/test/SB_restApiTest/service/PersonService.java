package com.test.SB_restApiTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.SB_restApiTest.exception.PersonNotFoundException;
import com.test.SB_restApiTest.model.Person;
import com.test.SB_restApiTest.repo.PersonRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonService {
	   @Autowired
       private PersonRepository personRepository;
       
	   public Person createPerson(Person person) {
		return personRepository.save(person);  
	   }
	   
	   public Person getPersonById(Long id) {
			return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException("Person not found with mention id"));  
	   } 
	   
	   public List<Person> getAllPerson() {
			return personRepository.findAll();  
	   }
	   public String deletePerson(Long id) {
		   if(personRepository.existsById(id)) {
			   personRepository.deleteById(id); 
				return "Person Delete Successfully!";  
		   }else {
			   return "Person not found with mention id";
		   }
				
	   } 
	   public Person updatePerson(Long id,Person person) {
			Person existingPerson = personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException("Person not found with mention id"));
			if(existingPerson != null){
				existingPerson.setName(person.getName());
				existingPerson.setEmail(person.getEmail());
				return personRepository.save(existingPerson);
			}
				
			return null;
	   } 
	   
	   
}
