package com.yea.enterprise.database.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.IQuestionSessionDao;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.Surveys;

@Repository("questionDaoImpl")
public class QuestionSessionDaoImpl implements IQuestionSessionDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void persistQuestion(Question question) {
		sessionFactory.getCurrentSession().persist(question);
	}

	public Question findQuestionById(Long id) {
		return (Question) sessionFactory.getCurrentSession().get(Question.class, id);
	}

	public void updateQuestion(Question question) {
		sessionFactory.getCurrentSession().update(question);

	}
	public void deleteQuestion(Question question) {
		sessionFactory.getCurrentSession().delete(question);

	}

	public List<Question> findQuestionList() {
		List<Question> result = null;
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("Select * from Question");
		query.addEntity(Question.class);
		result=castList(Question.class, query.list());
		return result;
	}

	
	public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
	    List<T> r = new ArrayList<T>(c.size());
	    for(Object o: c)
	      r.add(clazz.cast(o));
	    return r;
	}


}
