package com.yonyou.up.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.up.repository.PersonRepository;
import com.yonyou.up.service.IPersonService;

@Service
@Transactional
public class PersonService implements IPersonService {

	@Autowired
	private PersonRepository repository;

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "com.yonyou.up";
	}

}
