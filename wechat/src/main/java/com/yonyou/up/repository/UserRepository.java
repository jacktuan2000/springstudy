package com.yonyou.up.repository;

import org.springframework.data.repository.CrudRepository;

import com.yonyou.up.domain.Person;

public interface UserRepository  extends CrudRepository<Person, Long> {

}
