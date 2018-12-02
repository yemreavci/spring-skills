package com.yea.enterprise.database.service;

import com.yea.enterprise.database.model.QuestionOrder;

public interface IQuestionOrderSessionService {
	  public void persistQuestionOrder(QuestionOrder questionOrder);
	  
	  public QuestionOrder findQuestionOrderById(String id);
	  
	  public void updateQuestionOrder(QuestionOrder questionOrder);
	  
	  public void deleteQuestionOrder(QuestionOrder questionOrder);

}
