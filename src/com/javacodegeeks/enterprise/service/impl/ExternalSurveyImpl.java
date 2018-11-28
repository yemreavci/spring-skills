package com.javacodegeeks.enterprise.service.impl;

import com.javacodegeeks.enterprise.model.QuestionsList;
import com.javacodegeeks.enterprise.service.IExternalSurvey;

public class ExternalSurveyImpl implements IExternalSurvey {

	ExternalSurveyComp1 externalSurveyComp1;

	ExternalSurveyComp2 externalSurveyComp2;

	
	
	public void setExternalSurveyComp1(ExternalSurveyComp1 xternalSurveyComp1) {
		this.externalSurveyComp1 = xternalSurveyComp1;
	}
	public void setExternalSurveyComp2(ExternalSurveyComp2 externalSurveyComp2) {
		this.externalSurveyComp2 = externalSurveyComp2;
	}
	
	public QuestionsList listQuestions(Long compId) {
		return getExternalSurveyCompany(compId).listQuestions(compId);
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
}
