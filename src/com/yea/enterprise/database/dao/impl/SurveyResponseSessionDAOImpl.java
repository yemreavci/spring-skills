package com.yea.enterprise.database.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.ISurveyResponseSessionDAO;
import com.yea.enterprise.database.model.SurveyResponse;

@Repository("surveyResponseOrderDaoImpl")
public class SurveyResponseSessionDAOImpl implements ISurveyResponseSessionDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public void persistSurveyResponse(SurveyResponse surveyResponse) {
		sessionFactory.getCurrentSession().persist(surveyResponse);
	}

	public SurveyResponse findSurveyResponseById(String id) {
		return (SurveyResponse) sessionFactory.getCurrentSession().get(SurveyResponse.class, id);
	}

	public void updateSurveyResponse(SurveyResponse surveyResponse) {
		sessionFactory.getCurrentSession().update(surveyResponse);

	}
	public void deleteSurveyResponse(SurveyResponse surveyResponse) {
		sessionFactory.getCurrentSession().delete(surveyResponse);

	}

}
