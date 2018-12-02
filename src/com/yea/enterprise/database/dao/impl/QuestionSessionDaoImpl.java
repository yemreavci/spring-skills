package com.yea.enterprise.database.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.IQuestionSessionDao;
import com.yea.enterprise.database.model.Question;

@Repository("questionDaoImpl")
public class QuestionSessionDaoImpl implements IQuestionSessionDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void persistQuestion(Question question) {
		sessionFactory.getCurrentSession().persist(question);
	}

	public Question findQuestionById(String id) {
		return (Question) sessionFactory.getCurrentSession().get(Question.class, id);
	}

	public void updateQuestion(Question question) {
		sessionFactory.getCurrentSession().update(question);

	}
	public void deleteQuestion(Question question) {
		sessionFactory.getCurrentSession().delete(question);

	}

	public List<Question> findQuestionList() {
		List<Question> result = sessionFactory.getCurrentSession().createSQLQuery("Select * from Question").list();
		return result;
	}

}
