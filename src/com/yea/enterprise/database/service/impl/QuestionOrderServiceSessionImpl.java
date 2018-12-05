package com.yea.enterprise.database.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IQuestionOrderSessionDAO;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.QuestionOrder;
import com.yea.enterprise.database.model.Surveys;
import com.yea.enterprise.database.service.IQuestionOrderSessionService;

@Service("questionOrderServiceImpl")
public class QuestionOrderServiceSessionImpl implements IQuestionOrderSessionService{
	@Autowired
	IQuestionOrderSessionDAO questionOrderSessionDAO;
	
	@Transactional
	public void persistQuestionOrder(QuestionOrder questionOrder) {
		questionOrderSessionDAO.persistQuestionOrder(questionOrder);
	}

	@Transactional
	public void updateQuestionOrder(QuestionOrder questionOrder) {
		questionOrderSessionDAO.updateQuestionOrder(questionOrder);
		
	}
	@Transactional
	public QuestionOrder findQuestionOrderById(String id) {
		return questionOrderSessionDAO.findQuestionOrderById(id);
	}

	@Transactional
	public void deleteQuestionOrder(QuestionOrder questionOrder) {
		questionOrderSessionDAO.deleteQuestionOrder(questionOrder);
		
	}

	@Transactional
	public List<Question> findSurveyQuestionList(Surveys surveys) {
		List<QuestionOrder> questionOrderList=questionOrderSessionDAO.findSurveyQuestionList(surveys);
		List<Question> qList= new ArrayList<Question>();
		for (QuestionOrder item : questionOrderList) {
			qList.add(item.getQuestionId());
		}
		return qList;
	}

}
