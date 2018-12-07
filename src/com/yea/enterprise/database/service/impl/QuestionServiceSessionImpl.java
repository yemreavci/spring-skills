package com.yea.enterprise.database.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IQuestionEMDao;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.service.IQuestionSessionService;

@Service("questionServiceImpl")
public class QuestionServiceSessionImpl implements IQuestionSessionService {

	@Autowired
	IQuestionEMDao questionSessionDAO;

	@Transactional
	public void persistQuestion(Question question) {
		questionSessionDAO.save(question);
	}

	@Transactional
	public void updateQuestion(Question employee) {
		questionSessionDAO.save(employee);

	}

	@Transactional
	public Question findQuestionById(Long id) {
		return questionSessionDAO.findOne(id);
	}


	@Transactional
	public void deleteQuestion(Question question) {

	}

	@Transactional
	public List<Question> findQuestionList() {
		return questionSessionDAO.findAll();
	}
}
