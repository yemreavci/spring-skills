
package com.yea.enterprise.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.QuestionOrder;
import com.yea.enterprise.database.model.Surveys;
import com.yea.enterprise.database.service.IQuestionOrderSessionService;
import com.yea.enterprise.database.service.IQuestionSessionService;
import com.yea.enterprise.database.service.IRespondentSessionService;
import com.yea.enterprise.database.service.ISurveyResponseSessionService;
import com.yea.enterprise.database.service.ISurveysSessionService;
import com.yea.enterprise.service.ICoreSurveyService;
import com.yea.enterprise.service.IExternalSurvey;
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

public class CoreSurveyServiceImpl implements ICoreSurveyService{

	IExternalSurvey externalSurvey;
	
	@Autowired
	IQuestionSessionService questionSessionService;

	@Autowired
	IQuestionOrderSessionService questionOrderSessionService;		
	
	@Autowired
	IRespondentSessionService respondentSessionService;

	@Autowired
	ISurveyResponseSessionService surveyResponseSessionService;	
	
	@Autowired
	ISurveysSessionService surveysSessionService;	
	
	public void setExternalSurvey(ExternalSurveyImpl externalSurvey) {
		this.externalSurvey = externalSurvey;
	}


	public ListQuestionResponse listQuestions(ListQuestionRequest request) {
		ListQuestionResponse response= new ListQuestionResponse();
		response.setListQuestions(questionSessionService.findQuestionList());
		return response;
	}

	public ListSurveyQuestionsResponse listSurveyQuestions(ListSurveyQuestionsRequest request) {
		ListSurveyQuestionsResponse response= new ListSurveyQuestionsResponse();
		Surveys surveys=surveysSessionService.findSurveysById(request.getSurveyId());
		response.setListQuestions(questionOrderSessionService.findSurveyQuestionList(surveys));
		return response;
	}

	public ListSurveyResponse listSurveys(ListSurveyRequest request) {
		ListSurveyResponse response= new ListSurveyResponse();
		response.setResultList(surveysSessionService.findSurveysList());
		return response;
	}

	public AddQuestionResponse addQuestions(AddQuestionRequest request) {
		AddQuestionResponse response= new AddQuestionResponse();
		Question question= new Question();
		question.setText(request.getText());
		question.setUpdated(new Date());
		questionSessionService.persistQuestion(question);
		return response;
	}

	public AddSurveyResponse addSurvey(AddSurveyRequest request) {
		AddSurveyResponse response= new AddSurveyResponse();
		Surveys surveys= new Surveys();
		surveys.setDescription(request.getDescription());
		surveys.setName(request.getName());
		surveys.setUpdated(new Date());
		surveysSessionService.persistSurveys(surveys);
		return response;
	}

	public AddQuestionToSurveyResponse addQuestionToSurveys(AddQuestionToSurveyRequest request) {
		AddQuestionToSurveyResponse response= new AddQuestionToSurveyResponse();
		QuestionOrder qOrder = new QuestionOrder();
		qOrder.setOrderNo(request.getOrder());
		qOrder.setSurveysId(surveysSessionService.findSurveysById(request.getSurveyId()));
		qOrder.setQuestionId(questionSessionService.findQuestionById(request.getQuestionId()));
		questionOrderSessionService.persistQuestionOrder(qOrder);
		return response;
	}

	public AddRespondentResponse addRespondent(AddRespondentRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public AddResponseResponse  addResponse(AddResponseRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
