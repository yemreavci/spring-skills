package com.javacodegeeks.enterprise.ws.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.springframework.stereotype.Service;

import com.javacodegeeks.enterprise.model.QuestionsList;
import com.javacodegeeks.enterprise.service.impl.CoreSurveyServiceImpl;
import com.javacodegeeks.enterprise.ws.ISurveyWs;

@WebService(serviceName="SurveyWs")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
@Service
public class SurveyWs implements ISurveyWs{

	CoreSurveyServiceImpl coreSurveyService;

	@WebMethod(exclude=true)
	public void setCoreSurveyService(CoreSurveyServiceImpl coreSurveyService) {
		this.coreSurveyService = coreSurveyService;
	}

	@WebMethod(operationName="listQuestions")
	public QuestionsList listQuestions(Long compId) {
		return coreSurveyService.listQuestions(compId);
	}
}