package com.javacodegeeks.enterprise.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.javacodegeeks.enterprise.model.Questions;
import com.javacodegeeks.enterprise.model.QuestionsList;
import com.javacodegeeks.enterprise.service.IExternalSurvey;

public class ExternalSurveyComp1 implements IExternalSurvey{

	public QuestionsList listQuestions(Long compId) {
		QuestionsList list=new QuestionsList();
		List<Questions> questions= new ArrayList<Questions>();
		Questions e= new Questions(1L, "Hi, where are you from? (ExternalSurveyComp1)") ;
		questions.add(e);
		list.setList(questions);
		return list;
	}
	
	
}
