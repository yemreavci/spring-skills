package com.yea.enterprise.database.dao.impl.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericBaseJPAImpl <T extends Serializable>{
	@PersistenceContext
	private EntityManager entityManager;

	private Class<T> persistenceClass;
	
	public GenericBaseJPAImpl(final Class<T> persistenceClass) {
		this.persistenceClass=persistenceClass;
	}
	
	public GenericBaseJPAImpl() {
		Class<?> clazz=getClass();
		while(!(clazz.getGenericSuperclass() instanceof ParameterizedType)) {
			clazz = clazz.getSuperclass();
		}
		this.persistenceClass=(Class<T>) ((ParameterizedType)clazz.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public Class<T> getPersistentClass(){
		return persistenceClass;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public List<T> findAll(){
		String sql = "SELECT o FROM " + getPersistentClass().getSimpleName() + " o";
		return getEntityManager().createQuery(sql).getResultList();
	}
	public T findOne(long id) {
		return getEntityManager().find(getPersistentClass(), id);
	}

	public void save(T entity) {
		entity = getEntityManager().merge(entity);
		getEntityManager().flush();
		getEntityManager().clear();
	}

	public void save(List<T> entityList) {
		if (entityList!=null && entityList.size()>0) {
			int i = 1;
			for (int j = 0; j < entityList.size(); j++) {
				T entity = entityList.get(j);
				entity = getEntityManager().merge(entity);
				entityList.set(j, entity);
				i++;
				if ((i % 10000) == 0) {
					getEntityManager().flush();
					getEntityManager().clear();
				}
			}
			getEntityManager().flush();
			getEntityManager().clear();
		}

	}
}

