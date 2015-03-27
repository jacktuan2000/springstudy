package com.gejj.dao.common;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.google.common.base.Preconditions;

public class AbstractHibernateDao<T extends Serializable> implements
		IOperations<T> {
	private Class<T> clazz;

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	protected final void setClazz(final Class<T> clazzToSet) {
		this.clazz = Preconditions.checkNotNull(clazzToSet);
	}

	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public T findOne(long id) {
		// TODO Auto-generated method stub
		return (T) getCurrentSession().get(clazz, id);
	}

	public List<T> findAll() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from " + clazz.getName())
				.list();
	}

	public void create(T entity) {
		// TODO Auto-generated method stub
		Preconditions.checkNotNull(entity);
		// getCurrentSession().persist(entity);
		getCurrentSession().saveOrUpdate(entity);
	}

	public T update(T entity) {
		// TODO Auto-generated method stub
		Preconditions.checkNotNull(entity);
		getCurrentSession().update(entity);
		return entity;
	}

	public void delete(T entity) {
		// TODO Auto-generated method stub
		Preconditions.checkNotNull(entity);
		getCurrentSession().delete(entity);
	}

	public void deleteById(long entityId) {
		// TODO Auto-generated method stub
		final T entity = findOne(entityId);
		Preconditions.checkState(entity != null);
		delete(entity);
	}

}