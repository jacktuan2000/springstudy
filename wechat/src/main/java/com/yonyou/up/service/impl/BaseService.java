package com.yonyou.up.service.impl;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.yonyou.up.service.IBaseService;

public class BaseService <T, ID extends Serializable> implements IBaseService   <T, ID> {

	protected CrudRepository<T, ID>  repository;

	@Override
	public <S extends T> S save(S entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	public <S extends T> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return repository.save(entities);
	}

	@Override
	public T findOne(ID id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public boolean exists(ID id) {
		// TODO Auto-generated method stub
		return repository.exists(id);
	}

	@Override
	public Iterable<T> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Iterable<T> findAll(Iterable<ID> ids) {
		// TODO Auto-generated method stub
		return repository.findAll(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return repository.count();
	}

	@Override
	public void delete(ID id) {
		// TODO Auto-generated method stub
		repository.delete(id);
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		repository.delete(entity);
	}

	@Override
	public void delete(Iterable<? extends T> entities) {
		// TODO Auto-generated method stub
		repository.delete(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}

	

}
