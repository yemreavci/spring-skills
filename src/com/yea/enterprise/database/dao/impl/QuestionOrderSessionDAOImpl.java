package com.yea.enterprise.database.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.IQuestionOrderSessionDAO;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.QuestionOrder;
import com.yea.enterprise.database.model.Surveys;

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
	public List<QuestionOrder> findSurveyQuestionList(Surveys surveys) {
		List<QuestionOrder> result = null;
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("Select * from Question_Order where survey_Id= :surveys ");
		query.addEntity(QuestionOrder.class);
		query.setParameter("surveys", surveys.getId());
		result=castList(QuestionOrder.class, query.list());
		return result;
	}
	
	public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
	    List<T> r = new ArrayList<T>(c.size());
	    for(Object o: c)
	      r.add(clazz.cast(o));
	    return r;
	}
}
