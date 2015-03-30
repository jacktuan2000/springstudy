package com.yonyou.up.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.yonyou.up.domain.Person;
import com.yonyou.up.service.IPersonService;
@Service
@Transactional
public class PersonService extends BaseService<Person,Long> implements IPersonService  {

	/**
	 * 注入DAO
	 */
	@Resource(name = "personRepository")
	public void setRepository(CrudRepository<Person, Long> repository) {
		super.repository = repository;
	}
	
	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "com.yonyou.up";
	}
	

}
