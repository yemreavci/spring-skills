package com.javacodegeeks.enterprise.ws;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacodegeeks.enterprise.bo.MyBObject;
import com.javacodegeeks.enterprise.model.QuestionsList;
import com.javacodegeeks.enterprise.service.impl.CoreSurveyServiceImpl;

@WebService(serviceName="MyWebService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
@Service
public class MyWebService{

	//Dependency Injection (DI) via Spring
	MyBObject myBObject;

	CoreSurveyServiceImpl coreSurveyService;

	@WebMethod(exclude=true)
	public void setMyBObject(MyBObject bObject) {
		this.myBObject = bObject;
	}
	@WebMethod(exclude=true)
	public void setCoreSurveyService(CoreSurveyServiceImpl coreSurveyService) {
		this.coreSurveyService = coreSurveyService;
	}

	@WebMethod(operationName="printMessage")
	public String printMessage() {
		return myBObject.printMessage();
	}

	@WebMethod(operationName="listQuestions")
	public QuestionsList listQuestions(Long compId) {
		return coreSurveyService.listQuestions(compId);
	}
}