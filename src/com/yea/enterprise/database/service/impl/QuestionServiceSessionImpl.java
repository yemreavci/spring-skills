package com.yea.enterprise.database.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IQuestionSessionDao;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.service.IQuestionSessionService;

@Service("questionServiceImpl")
public class QuestionServiceSessionImpl implements IQuestionSessionService {

	@Autowired
	IQuestionSessionDao questionSessionDAO;

	@Transactional
	public void persistQuestion(Question question) {
		questionSessionDAO.persistQuestion(question);

	}

	@Transactional
	public void updateQuestion(Question employee) {
		questionSessionDAO.updateQuestion(employee);

	}

	@Transactional
	public Question findQuestionById(String id) {
		return questionSessionDAO.findQuestionById(id);
	}

	public void deleteEmployee(Question question) {
		questionSessionDAO.deleteQuestion(question);

	}

	@Transactional
	public void deleteQuestion(Question question) {
		questionSessionDAO.deleteQuestion(question);

	}

	public List<Question> findQuestionList() {
		return questionSessionDAO.findQuestionList();
	}

}
