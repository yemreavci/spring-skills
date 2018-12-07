package com.yea.enterprise.database.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.IQuestionOrderEMDAO;
import com.yea.enterprise.database.dao.impl.base.GenericBaseJPAImpl;
import com.yea.enterprise.database.model.QuestionOrder;
import com.yea.enterprise.database.model.Surveys;

@Repository("questionOrderDaoImpl")
public class QuestionOrderEMDAOImpl extends GenericBaseJPAImpl<QuestionOrder>implements IQuestionOrderEMDAO{
	public List<QuestionOrder> findSurveyQuestionList(Surveys surveys) {
		List<QuestionOrder> result = null;
		Query query = getEntityManager().createNamedQuery("NQ_GET_SURVEY_QUESTIONLIST");
		query.setParameter("surveysId", surveys);
		result=castList(QuestionOrder.class,query.getResultList());
		return result;
	}
	
	public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
	    List<T> r = new ArrayList<T>(c.size());
	    for(Object o: c)
	      r.add(clazz.cast(o));
	    return r;
	}
}
