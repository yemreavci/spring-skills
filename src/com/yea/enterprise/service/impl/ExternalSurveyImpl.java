package com.yea.enterprise.service.impl;

import java.util.List;

import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.QuestionOrder;
import com.yea.enterprise.database.model.Respondent;
import com.yea.enterprise.database.model.Response;
import com.yea.enterprise.database.model.Surveys;
import com.yea.enterprise.model.Questions;
import com.yea.enterprise.model.QuestionsList;
import com.yea.enterprise.service.IExternalSurvey;

public class ExternalSurveyImpl implements IExternalSurvey {

	ExternalSurveyComp1 externalSurveyComp1;

	ExternalSurveyComp2 externalSurveyComp2;

	
	
	public void setExternalSurveyComp1(ExternalSurveyComp1 xternalSurveyComp1) {
		this.externalSurveyComp1 = xternalSurveyComp1;
	}
	public void setExternalSurveyComp2(ExternalSurveyComp2 externalSurveyComp2) {
		this.externalSurveyComp2 = externalSurveyComp2;
	}
	
	private IExternalSurvey getExternalSurveyCompany(Long compId) {
		if (compId.longValue() == 1L) {
			return externalSurveyComp1;
		}
		if (compId.longValue() == 2L) {
			return externalSurveyComp2;
		} 
		return null;
	}
	public List<Question> listQuestions() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Question> listSurveyQuestions() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Surveys> listSurveys() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean addQuestions(Questions questions) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean addSurvey(Surveys surveys) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean addQuestionToSurvey(QuestionOrder questionToSurvey) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean addRespondent(Respondent respondent) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean addResponse(Response response) {
		// TODO Auto-generated method stub
		return false;
	}
}
