package com.yea.enterprise.database.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.IQuestionOrderSessionDAO;
import com.yea.enterprise.database.dao.IResponseSessionDAO;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.Response;

@Repository("responseOrderDaoImpl")
public class ResponseSessionDAOImpl implements IResponseSessionDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void persistResponse(Response question) {
		sessionFactory.getCurrentSession().persist(question);
	}

	public Response findResponseById(String id) {
		return (Response) sessionFactory.getCurrentSession().get(Response.class, id);
	}

	public void updateResponse(Response question) {
		sessionFactory.getCurrentSession().update(question);

	}
	public void deleteResponse(Response question) {
		sessionFactory.getCurrentSession().delete(question);

	}
}
