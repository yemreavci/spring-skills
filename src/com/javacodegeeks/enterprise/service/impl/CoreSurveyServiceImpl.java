
package com.javacodegeeks.enterprise.service.impl;

import com.javacodegeeks.enterprise.model.QuestionsList;
import com.javacodegeeks.enterprise.service.ICoreSurveyService;
import com.javacodegeeks.enterprise.service.IExternalSurvey;

public class CoreSurveyServiceImpl implements ICoreSurveyService{

	IExternalSurvey externalSurvey;

	public void setExternalSurvey(ExternalSurveyImpl externalSurvey) {
		this.externalSurvey = externalSurvey;
	}
	
	public QuestionsList listQuestions(Long compId) {
		
		return externalSurvey.listQuestions(compId);
	}

}
