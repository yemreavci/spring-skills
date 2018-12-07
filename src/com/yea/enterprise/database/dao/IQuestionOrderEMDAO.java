package com.yea.enterprise.database.dao;

import java.util.List;

import com.yea.enterprise.database.dao.impl.base.IGenericBaseJPA;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.QuestionOrder;
import com.yea.enterprise.database.model.Surveys;

public interface IQuestionOrderEMDAO  extends IGenericBaseJPA<QuestionOrder> {
	  public List<QuestionOrder>findSurveyQuestionList(Surveys surveys);
}
