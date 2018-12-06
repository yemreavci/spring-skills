package com.yea.enterprise.database.dao.impl.base;

import java.io.Serializable;
import java.util.List;

public interface IGenericBaseJPA <T extends Serializable>{
	public List<T> findAll();
	public T findOne(long id);
	public void save(T entity);
	public void save(List<T> entityList);
}
