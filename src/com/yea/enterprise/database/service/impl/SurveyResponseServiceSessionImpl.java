package com.yea.enterprise.database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.ISurveyResponseSessionDAO;
import com.yea.enterprise.database.model.SurveyResponse;
import com.yea.enterprise.database.service.ISurveyResponseSessionService;

@Service("surveyResponseServiceImpl")
public class SurveyResponseServiceSessionImpl implements ISurveyResponseSessionService{
	@Autowired
	ISurveyResponseSessionDAO employeeSessionDAO;
	
	@Transactional
	public void persistSurveyResponse(SurveyResponse surveyResponse) {
		employeeSessionDAO.persistSurveyResponse(surveyResponse);
		
	}

	@Transactional
	public void updateSurveyResponse(SurveyResponse surveyResponse) {
		employeeSessionDAO.updateSurveyResponse(surveyResponse);
		
	}
	@Transactional
	public SurveyResponse findSurveyResponseById(String id) {
		return employeeSessionDAO.findSurveyResponseById(id);
	}

	@Transactional
	public void deleteSurveyResponse(SurveyResponse surveyResponse) {
		employeeSessionDAO.deleteSurveyResponse(surveyResponse);
		
	}

}
