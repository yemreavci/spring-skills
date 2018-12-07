package com.yea.enterprise.database.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.ISurveysEMDAO;
import com.yea.enterprise.database.model.Surveys;
import com.yea.enterprise.database.service.ISurveysService;

@Service("surveysServiceImpl")
public class SurveysServiceSessionImpl implements ISurveysService{
	@Autowired
	ISurveysEMDAO surveyResponseEMDAO;
	
	@Transactional
	public void persistSurveys(Surveys surveys) {
		surveyResponseEMDAO.save(surveys);
		
	}

	@Transactional
	public void updateSurveys(Surveys surveys) {
		surveyResponseEMDAO.save(surveys);
		
	}
	@Transactional
	public Surveys findSurveysById(Long id) {
		return surveyResponseEMDAO.findOne(id);
	}

	@Transactional
	public void deleteSurveys(Surveys surveys) {
		
	}

	@Transactional
	public List<Surveys> findSurveysList() {
		return surveyResponseEMDAO.findAll();
	}

}
