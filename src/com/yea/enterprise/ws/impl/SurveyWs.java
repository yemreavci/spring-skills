package com.yea.enterprise.ws.impl;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.yea.enterprise.service.impl.CoreSurveyServiceImpl;
import com.yea.enterprise.util.Util;
import com.yea.enterprise.ws.ISurveyWs;
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
import com.yea.enterprise.ws.model.RequestType;
import com.yea.enterprise.ws.model.ResponseType;
//http://localhost:8080/JAXWS-Spring/jaxws-spring
@WebService(serviceName="SurveyWs")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
@Service
public class SurveyWs implements ISurveyWs{
	private static final Logger logger = Logger.getLogger(SurveyWs.class);

	CoreSurveyServiceImpl coreSurveyService;

	@WebMethod(exclude=true)
	public void setCoreSurveyService(CoreSurveyServiceImpl coreSurveyService) {
		this.coreSurveyService = coreSurveyService;
	}

	@WebMethod(operationName="listQuestions")
	public ListQuestionResponse listQuestions(ListQuestionRequest request) {
		ListQuestionResponse response= new ListQuestionResponse();
		try {
			checkHeader(request);
			response=coreSurveyService.listQuestions(request);
			if(!Util.isListEmpty(response.getListQuestions())) {
				logger.info("listQuestions-listQuestions size " + response.getListQuestions().size());				
			}
			setResonseSuccess(response);
		}catch(Exception e) {
			logger.error("listQuestions-listQuestions" + e.getMessage());
			setResonseError(response);
		}
		return response;
	}

	@WebMethod(operationName="listSurveyQuestions")
	public ListSurveyQuestionsResponse listSurveyQuestions(ListSurveyQuestionsRequest request) {
		ListSurveyQuestionsResponse response= new ListSurveyQuestionsResponse();
		try {
			checkHeader(request);
			response=coreSurveyService.listSurveyQuestions(request);
			setResonseSuccess(response);
		}catch(Exception e) {
			logger.error("listQuestions-listSurveyQuestions" + e.getMessage());
			setResonseError(response);
		}
		return response;
	}

	@WebMethod(operationName="listSurveys")
	public ListSurveyResponse listSurveys(ListSurveyRequest request) {
		ListSurveyResponse response= new ListSurveyResponse();
		try {
			checkHeader(request);
			response=coreSurveyService.listSurveys(request);
			setResonseSuccess(response);
		}catch(Exception e) {
			logger.error("listQuestions-listSurveys" + e.getMessage());
			setResonseError(response);
		}
		return response;
	}

	@WebMethod(operationName="addQuestions")
	public AddQuestionResponse addQuestions(AddQuestionRequest request) {
		AddQuestionResponse response= new AddQuestionResponse();
		try {
			checkHeader(request);
			response=coreSurveyService.addQuestions(request);
			setResonseSuccess(response);
		}catch(Exception e) {
			logger.error("listQuestions-addQuestions" + e.getMessage());
			setResonseError(response);
		}
		return response;
	}

	@WebMethod(operationName="addSurvey")
	public AddSurveyResponse addSurvey(AddSurveyRequest request) {
		AddSurveyResponse response= new AddSurveyResponse();
		try {
			checkHeader(request);
			response=coreSurveyService.addSurvey(request);
			setResonseSuccess(response);
		}catch(Exception e) {
			logger.error("listQuestions-addSurvey" + e.getMessage());
			setResonseError(response);
		}
		return response;
	}

	@WebMethod(operationName="addQuestionToServey")
	public AddQuestionToSurveyResponse addQuestionToServey(AddQuestionToSurveyRequest request) {
		AddQuestionToSurveyResponse response= new AddQuestionToSurveyResponse();
		try {
			checkHeader(request);
			response=coreSurveyService.addQuestionToSurveys(request);
			setResonseSuccess(response);
		}catch(Exception e) {
			logger.error("listQuestions-addQuestionToServey" + e.getMessage());
			setResonseError(response);
		}
		return response;
	}

	@WebMethod(operationName="addRespondent")
	public AddRespondentResponse addRespondent(AddRespondentRequest request) {
		AddRespondentResponse response= new AddRespondentResponse();
		try {
			checkHeader(request);
			response=coreSurveyService.addRespondent(request);
			setResonseSuccess(response);
		}catch(Exception e) {
			logger.error("listQuestions-addRespondent" + e.getMessage());
			setResonseError(response);
		}
		return response;
	}

	@WebMethod(operationName="addResponse")
	public AddResponseResponse  addResponse(AddResponseRequest request) {
		AddResponseResponse response= new AddResponseResponse();
		try {
			checkHeader(request);
			response=coreSurveyService.addResponse(request);
			setResonseSuccess(response);
		}catch(Exception e) {
			logger.error("listQuestions-addResponse" + e.getMessage());
			setResonseError(response);
		}
		return response;
	}

	private ResponseType setResonseSuccess(ResponseType response) {
		response.getResponseHeader().setResultCode(1);
		response.getResponseHeader().setResultDescription("SUCCESS");
		return response;
	}
	private ResponseType setResonseError(ResponseType response) {
		response.getResponseHeader().setResultCode(0);
		response.getResponseHeader().setResultDescription("ERROR");
		return response;
	}
	
	private <T extends RequestType> boolean checkHeader(T t) throws Exception {
		if(t.getRequestHeader().getPassword() == null || t.getRequestHeader().getPassword().length() ==0) {
			throw new Exception("Password not given");
		}
		return false;
		
	}


	/**
	 * Read with FileSystemXmlApplicationContext
        ConfigurableApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\yea\\Desktop\\JAXWS-Spring\\WebContent\\WEB-INF\\applicationContext.xml");
		Employee em = new Employee();
		em.setId("123");
		em.setName("John");
		em.setAge(35);
		IEmployeeSessionService emService = (IEmployeeSessionService) context.getBean("employeeService");
		emService.persistEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());
		em.setAge(32);
		emService.updateEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());
//		emService.deleteEmployee(em);
		context.close();
	 */
}