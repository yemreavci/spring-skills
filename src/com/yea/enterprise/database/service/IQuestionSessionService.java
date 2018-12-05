package com.yea.enterprise.database.service;

import java.util.List;

import com.yea.enterprise.database.model.Question;

public interface IQuestionSessionService {
	void persistQuestion(Question employee);

	Question findQuestionById(Long id);

	void updateQuestion(Question employee);

	void deleteQuestion(Question employee);

	public List<Question> findQuestionList() ;
}
