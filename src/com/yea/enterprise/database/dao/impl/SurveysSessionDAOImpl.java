package com.yea.enterprise.database.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.ISurveysSessionDAO;
import com.yea.enterprise.database.model.Surveys;

@Repository("surveyOrderDaoImpl")
public class SurveysSessionDAOImpl implements ISurveysSessionDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public void persistSurveys(Surveys surveys) {
		sessionFactory.getCurrentSession().persist(surveys);
	}

	public Surveys findSurveysById(String id) {
		return (Surveys) sessionFactory.getCurrentSession().get(Surveys.class, id);
	}

	public void updateSurveys(Surveys surveys) {
		sessionFactory.getCurrentSession().update(surveys);

	}
	public void deleteSurveys(Surveys surveys) {
		sessionFactory.getCurrentSession().delete(surveys);

	}

}
