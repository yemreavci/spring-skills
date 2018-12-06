package com.yea.enterprise.database.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IEmployeeEMDAO;
import com.yea.enterprise.database.dao.IQuestionSessionDao;
import com.yea.enterprise.database.model.Employee;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.Surveys;
import com.yea.enterprise.database.service.IQuestionSessionService;

@Service("questionServiceImpl")
public class QuestionServiceSessionImpl implements IQuestionSessionService {

	@Autowired
	IQuestionSessionDao questionSessionDAO;
	@Autowired
	IEmployeeEMDAO employeeEMDAO;
	@Transactional
	public void persistQuestion(Question employee) {
		try {
			Employee product = new Employee();
			product.setAge(11L);
			product.setId("2");
			product.setName("MRS.ALEX");
			employeeEMDAO.save(product);
		} catch (Exception ex) {
			int i = 0;
			i++;
		}

	}

	@Transactional
	public void updateQuestion(Question employee) {
		questionSessionDAO.updateQuestion(employee);

	}

	@Transactional
	public Question findQuestionById(Long id) {
		return questionSessionDAO.findQuestionById(id);
	}


	@Transactional
	public void deleteQuestion(Question question) {
		questionSessionDAO.deleteQuestion(question);

	}

	@Transactional
	public List<Question> findQuestionList() {
		return questionSessionDAO.findQuestionList();
	}

}
