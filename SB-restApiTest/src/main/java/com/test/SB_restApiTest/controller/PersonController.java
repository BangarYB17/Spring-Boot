package com.test.SB_restApiTest.controller;

import java.security.PrivateKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.SB_restApiTest.model.Person;
import com.test.SB_restApiTest.service.PersonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/persons")
@AllArgsConstructor
public class PersonController {
       
	   @Autowired
	   private PersonService personService;
	   
	   @PostMapping
	   public Person createPerson(@RequestBody Person person) {
		    return personService.createPerson(person);   
	   }
	   
	   @GetMapping
	   public List<Person> getPersons(){
		return personService.getAllPerson();   
	   }
	   @GetMapping("/{id}")
	   public Person getPerson(@PathVariable Long id){
		return personService.getPersonById(id);   
	   }
	   
	   @PutMapping("/{id}")
	   public Person updatePerson(@PathVariable Long id,@RequestBody Person person){
		   return personService.updatePerson(id,person);
	   }
	   @DeleteMapping("/{id}")
	   public String deletePerson(@PathVariable Long id){
		   return personService.deletePerson(id);
	   }
}
