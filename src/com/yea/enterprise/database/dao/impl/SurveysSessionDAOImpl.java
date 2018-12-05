package com.yea.enterprise.database.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.ISurveysSessionDAO;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.Surveys;

@Repository("surveyOrderDaoImpl")
@Transactional
public class SurveysSessionDAOImpl implements ISurveysSessionDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public void persistSurveys(Surveys surveys) {
		sessionFactory.getCurrentSession().persist(surveys);
	}

	public Surveys findSurveysById(Long id) {
		return (Surveys) sessionFactory.getCurrentSession().get(Surveys.class, id);
	}

	public void updateSurveys(Surveys surveys) {
		sessionFactory.getCurrentSession().update(surveys);

	}
	public void deleteSurveys(Surveys surveys) {
		sessionFactory.getCurrentSession().delete(surveys);

	}

	public List<Surveys> findSurveysList() {
		List<Surveys> result = null;
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("Select * from Surveys");
		query.addEntity(Surveys.class);
		result = castList(Surveys.class, query.list());
		return result;
	}
	public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
	    List<T> r = new ArrayList<T>(c.size());
	    for(Object o: c)
	      r.add(clazz.cast(o));
	    return r;
	}
}
