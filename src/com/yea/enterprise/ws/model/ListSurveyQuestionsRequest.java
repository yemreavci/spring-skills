package com.yea.enterprise.ws.model;

public class ListSurveyQuestionsRequest extends RequestType{

	private static final long serialVersionUID = -6637224216408976745L;

	private Long surveyId;

	public Long getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Long surveyId) {
		this.surveyId = surveyId;
	}
	
}
