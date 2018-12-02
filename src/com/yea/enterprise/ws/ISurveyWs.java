package com.yea.enterprise.ws;

import com.yea.enterprise.model.QuestionsList;
import com.yea.enterprise.ws.model.AddQuestionRequest;
import com.yea.enterprise.ws.model.AddQuestionResponse;
import com.yea.enterprise.ws.model.AddQuestionToSurveyRequest;
import com.yea.enterprise.ws.model.AddQuestionToSurveyResponse;
import com.yea.enterprise.ws.model.AddRespondentRequest;
import com.yea.enterprise.ws.model.AddRespondentResponse;
import com.yea.enterprise.ws.model.AddResponseRequest;
import com.yea.enterprise.ws.model.AddResponseResponse;
import com.yea.enterprise.ws.model.AddSurveyRequest;
import com.yea.enterprise.ws.model.AddSurveyResponse;
import com.yea.enterprise.ws.model.ListQuestionRequest;
import com.yea.enterprise.ws.model.ListQuestionResponse;
import com.yea.enterprise.ws.model.ListSurveyQuestionsRequest;
import com.yea.enterprise.ws.model.ListSurveyQuestionsResponse;
import com.yea.enterprise.ws.model.ListSurveyRequest;
import com.yea.enterprise.ws.model.ListSurveyResponse;

public interface ISurveyWs {
	public ListQuestionResponse listQuestions(ListQuestionRequest request) ;
	public ListSurveyQuestionsResponse listSurveyQuestions(ListSurveyQuestionsRequest request) ;
	public ListSurveyResponse listSurveys(ListSurveyRequest request) ;
	public AddQuestionResponse addQuestions(AddQuestionRequest request) ;
	public AddSurveyResponse addSurvey(AddSurveyRequest request) ;
	public AddQuestionToSurveyResponse addQuestionToServey(AddQuestionToSurveyRequest request) ;
	public AddRespondentResponse addRespondent(AddRespondentRequest request) ;
	public AddResponseResponse  addResponse(AddResponseRequest request) ;
}
