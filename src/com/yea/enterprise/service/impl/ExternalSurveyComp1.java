package com.yea.enterprise.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.QuestionOrder;
import com.yea.enterprise.database.model.Respondent;
import com.yea.enterprise.database.model.Response;
import com.yea.enterprise.database.model.Surveys;
import com.yea.enterprise.model.Questions;
import com.yea.enterprise.model.QuestionsList;
import com.yea.enterprise.service.IExternalSurvey;

public class ExternalSurveyComp1 implements IExternalSurvey{

	public QuestionsList listQuestions(Long compId) {
		QuestionsList list=new QuestionsList();
		List<Questions> questions= new ArrayList<Questions>();
		Questions e= new Questions(1L, "Hi, where are you from? (ExternalSurveyComp1)") ;
		questions.add(e);
		list.setList(questions);
		return list;
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
