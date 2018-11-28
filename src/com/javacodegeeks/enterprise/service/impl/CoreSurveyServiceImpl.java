
package com.javacodegeeks.enterprise.service.impl;

import java.util.ArrayList;
import java.util.List;


import com.javacodegeeks.enterprise.model.Questions;
import com.javacodegeeks.enterprise.model.QuestionsList;
import com.javacodegeeks.enterprise.service.ICoreSurveyService;

public class CoreSurveyServiceImpl implements ICoreSurveyService{

	public QuestionsList listQuestions() {
		QuestionsList list=new QuestionsList();
		List<Questions> questions= new ArrayList<Questions>();
		Questions e= new Questions(1L, "wHERE ARE YOU FROM ?") ;
		questions.add(e);
		list.setList(questions);
		return list;
	}

}
