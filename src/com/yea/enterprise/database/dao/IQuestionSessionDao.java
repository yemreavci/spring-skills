package com.yea.enterprise.database.dao;

import java.util.List;

import com.yea.enterprise.database.model.Question;

public interface IQuestionSessionDao {
	
	  public void persistQuestion(Question question);
	  
	  public Question findQuestionById(String id);
	  
	  public List<Question> findQuestionList();
	  
	  public void updateQuestion(Question question);
	  
	  public void deleteQuestion(Question question);
	  
}