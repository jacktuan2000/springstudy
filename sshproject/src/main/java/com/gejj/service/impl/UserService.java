package com.gejj.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gejj.dao.IUserDao;
import com.gejj.dao.common.IOperations;
import com.gejj.model.User;
import com.gejj.service.IUserService;
import com.gejj.service.common.AbstractService;

@Service("userService")
public class UserService extends AbstractService<User> implements IUserService {

	@Resource(name = "usersDao")
	private IUserDao dao;

	public UserService() {
		super();
	}

	@Override
	protected IOperations<User> getDao() {
		return this.dao;
	}
}
