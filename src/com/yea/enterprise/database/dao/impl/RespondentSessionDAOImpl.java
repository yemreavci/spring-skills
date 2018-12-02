package com.yea.enterprise.database.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.IQuestionOrderSessionDAO;
import com.yea.enterprise.database.dao.IRespondentSessionDAO;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.Respondent;

@Repository("respondentOrderDaoImpl")
public class RespondentSessionDAOImpl implements IRespondentSessionDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public void persistRespondent(Respondent respondent) {
		sessionFactory.getCurrentSession().persist(respondent);
	}

	public Respondent findRespondentById(String id) {
		return (Respondent) sessionFactory.getCurrentSession().get(Respondent.class, id);
	}

	public void updateRespondent(Respondent respondent) {
		sessionFactory.getCurrentSession().update(respondent);

	}
	public void deleteRespondent(Respondent respondent) {
		sessionFactory.getCurrentSession().delete(respondent);

	}

}
