package com.yea.enterprise.ws.model;

public class AddQuestionToSurveyRequest extends RequestType{

	private static final long serialVersionUID = -397606484835445398L;
	
	private Long questionId;
	private Long SurveyId;
	private Long order;
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public Long getSurveyId() {
		return SurveyId;
	}
	public void setSurveyId(Long surveyId) {
		SurveyId = surveyId;
	}
	public Long getOrder() {
		return order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}
}
