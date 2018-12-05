package com.yea.enterprise.database.service;

import java.util.List;

import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.QuestionOrder;
import com.yea.enterprise.database.model.Surveys;

public interface IQuestionOrderSessionService {
	  public void persistQuestionOrder(QuestionOrder questionOrder);
	  
	  public QuestionOrder findQuestionOrderById(String id);
	  
	  public void updateQuestionOrder(QuestionOrder questionOrder);
	  
	  public void deleteQuestionOrder(QuestionOrder questionOrder);
	  public List<Question> findSurveyQuestionList(Surveys surveys);
}
