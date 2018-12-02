package com.yea.enterprise.service;

import java.util.List;

import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.QuestionOrder;
import com.yea.enterprise.database.model.Respondent;
import com.yea.enterprise.database.model.Response;
import com.yea.enterprise.database.model.Surveys;
import com.yea.enterprise.model.Questions;
import com.yea.enterprise.model.QuestionsList;

public interface IExternalSurvey {
	public List<Question> listQuestions() ;
	public List<Question> listSurveyQuestions() ;
	public List<Surveys> listSurveys() ;
	public boolean addQuestions(Questions questions) ;
	public boolean addSurvey(Surveys surveys) ;
	public boolean addQuestionToSurvey(QuestionOrder questionToSurvey) ;
	public boolean addRespondent(Respondent respondent) ;
	public boolean  addResponse(Response response) ;
}
