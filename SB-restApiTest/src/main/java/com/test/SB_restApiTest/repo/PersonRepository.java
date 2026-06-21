package com.test.SB_restApiTest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.SB_restApiTest.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
       
}
