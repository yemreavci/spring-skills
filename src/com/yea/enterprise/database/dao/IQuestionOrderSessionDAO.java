package com.yea.enterprise.database.dao;

import com.yea.enterprise.database.model.QuestionOrder;

public interface IQuestionOrderSessionDAO {
	  public void persistQuestionOrder(QuestionOrder questionOrder);
	  
	  public QuestionOrder findQuestionOrderById(String id);
	  
	  public void updateQuestionOrder(QuestionOrder questionOrder);
	  
	  public void deleteQuestionOrder(QuestionOrder questionOrder);

}
