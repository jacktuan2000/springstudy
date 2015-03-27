package com.gejj.service.common;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import com.gejj.dao.common.IOperations;

@Transactional
public abstract class AbstractService<T extends Serializable> implements IOperations<T> {
    
    protected abstract IOperations<T> getDao();

	public T findOne(long id) {
		// TODO Auto-generated method stub
		 return getDao().findOne(id);
	}

	public List<T> findAll() {
		// TODO Auto-generated method stub
		  return getDao().findAll();
	}

	public void create(T entity) {
		// TODO Auto-generated method stub
		getDao().create(entity);
	}

	public T update(T entity) {
		// TODO Auto-generated method stub
		return getDao().update(entity);
	}

	public void delete(T entity) {
		// TODO Auto-generated method stub
		 getDao().delete(entity);
	}

	public void deleteById(long entityId) {
		// TODO Auto-generated method stub
		getDao().deleteById(entityId);
	}

}