
package com.yea.enterprise.service.impl;

import com.yea.enterprise.model.QuestionsList;
import com.yea.enterprise.service.ICoreSurveyService;
import com.yea.enterprise.service.IExternalSurvey;

public class CoreSurveyServiceImpl implements ICoreSurveyService{

	IExternalSurvey externalSurvey;

	public void setExternalSurvey(ExternalSurveyImpl externalSurvey) {
		this.externalSurvey = externalSurvey;
	}
	
	public QuestionsList listQuestions(Long compId) {
		
		return externalSurvey.listQuestions(compId);
	}

}
