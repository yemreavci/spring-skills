package com.yea.enterprise.database.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.IQuestionOrderSessionDAO;
import com.yea.enterprise.database.model.QuestionOrder;

@Repository("questionOrderDaoImpl")
public class QuestionOrderSessionDAOImpl implements IQuestionOrderSessionDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public void persistQuestionOrder(QuestionOrder questionOrder) {
		sessionFactory.getCurrentSession().persist(questionOrder);
	}

	public QuestionOrder findQuestionOrderById(String id) {
		return (QuestionOrder) sessionFactory.getCurrentSession().get(QuestionOrder.class, id);
	}

	public void updateQuestionOrder(QuestionOrder questionOrder) {
		sessionFactory.getCurrentSession().update(questionOrder);

	}
	public void deleteQuestionOrder(QuestionOrder questionOrder) {
		sessionFactory.getCurrentSession().delete(questionOrder);

	}

}
