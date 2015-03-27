package com.gejj.dao.impl;

import org.springframework.stereotype.Repository;

import com.gejj.dao.IUserDao;
import com.gejj.dao.common.AbstractHibernateDao;
import com.gejj.model.User;

@Repository("usersDao")
public class UserDao extends AbstractHibernateDao<User> implements IUserDao {

    public UserDao() {
        super();
        
        setClazz(User.class);
    }
}