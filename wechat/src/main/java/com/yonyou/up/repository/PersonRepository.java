package com.yonyou.up.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.yonyou.up.domain.Person;


public interface PersonRepository extends CrudRepository<Person, Long> {

      Long countByLastname(String lastname);
	
	  
	  @Query("select p from Person p where p.lastname = ?1")
	  Person findByname(String lastname);
}
