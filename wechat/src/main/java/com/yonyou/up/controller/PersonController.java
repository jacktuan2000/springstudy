package com.yonyou.up.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.up.domain.Person;
import com.yonyou.up.repository.PersonRepository;
import com.yonyou.up.service.IPersonService;

@RestController
public class PersonController {
	Logger logger = LoggerFactory.getLogger(PersonController.class);     
	@Autowired
	private PersonRepository repository;
	@Autowired
	private IPersonService service;

	@RequestMapping("/person/add")
	public Person Add(Person person) {

		Person pe = repository.save(person);
		return pe;
	}

	@RequestMapping("/person/count")
	public long Count() {

		logger.info("人员数量");
		return repository.count();

	}

	@RequestMapping("/person/test")
	public String test() {

		return service.test();

	}
}
