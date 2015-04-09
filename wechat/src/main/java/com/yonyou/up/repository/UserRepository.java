package com.yonyou.up.repository;

import org.springframework.data.repository.CrudRepository;

import com.yonyou.up.domain.User;

public interface UserRepository  extends CrudRepository<User, Long> {
 
	public User  findByUsername(String username);
	
}
