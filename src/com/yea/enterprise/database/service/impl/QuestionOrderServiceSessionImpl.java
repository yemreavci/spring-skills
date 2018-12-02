package com.yea.enterprise.database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IQuestionOrderSessionDAO;
import com.yea.enterprise.database.model.QuestionOrder;
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

}
