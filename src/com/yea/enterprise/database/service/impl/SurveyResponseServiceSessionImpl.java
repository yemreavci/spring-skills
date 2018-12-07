package com.yea.enterprise.database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.ISurveyResponseEMDAO;
import com.yea.enterprise.database.model.SurveyResponse;
import com.yea.enterprise.database.service.ISurveyResponseService;

@Service("surveyResponseServiceImpl")
public class SurveyResponseServiceSessionImpl implements ISurveyResponseService{
	@Autowired
	ISurveyResponseEMDAO surveyResponseEMDAO;
	
	@Transactional
	public void persistSurveyResponse(SurveyResponse surveyResponse) {
		surveyResponseEMDAO.save(surveyResponse);
		
	}

	@Transactional
	public void updateSurveyResponse(SurveyResponse surveyResponse) {
		surveyResponseEMDAO.save(surveyResponse);
		
	}
	@Transactional
	public SurveyResponse findSurveyResponseById(Long id) {
		return surveyResponseEMDAO.findOne(id);
	}

	@Transactional
	public void deleteSurveyResponse(SurveyResponse surveyResponse) {
		
	}

}
