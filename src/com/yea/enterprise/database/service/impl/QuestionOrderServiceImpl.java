package com.yea.enterprise.database.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IQuestionOrderEMDAO;
import com.yea.enterprise.database.dao.IQuestionOrderSpringJdbcDao;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.QuestionOrder;
import com.yea.enterprise.database.model.Surveys;
import com.yea.enterprise.database.service.IQuestionOrderService;
import com.yea.enterprise.model.SurveyQuestionCount;

@Service("questionOrderServiceImpl")
public class QuestionOrderServiceImpl implements IQuestionOrderService{
	@Autowired
	IQuestionOrderEMDAO questionOrderEMDAO;
	
	@Autowired
	IQuestionOrderSpringJdbcDao questionOrderSpringJdbcDao;
	
	@Transactional
	public void persistQuestionOrder(QuestionOrder questionOrder) {
		questionOrderEMDAO.save(questionOrder);
	}

	@Transactional
	public void updateQuestionOrder(QuestionOrder questionOrder) {
		questionOrderEMDAO.save(questionOrder);
		
	}
	@Transactional
	public QuestionOrder findQuestionOrderById(Long id) {
		return questionOrderEMDAO.findOne(id);
	}

	@Transactional
	public void deleteQuestionOrder(QuestionOrder questionOrder) {
		
	}

	@Transactional
	public List<Question> findSurveyQuestionList(Surveys surveys) {
		List<QuestionOrder> questionOrderList=questionOrderEMDAO.findSurveyQuestionList(surveys);
		List<Question> qList= new ArrayList<Question>();
		List<SurveyQuestionCount> result = getSurveyQuestionCount(surveys);
		for (QuestionOrder item : questionOrderList) {
			qList.add(item.getQuestionId());
		}
		return qList;
	}
	
	public List<SurveyQuestionCount> getSurveyQuestionCount(Surveys surveys) {
		return questionOrderSpringJdbcDao.findSurveyResponse(surveys.getId());
	}

}
