package com.yea.enterprise.database.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.ISurveysSessionDAO;
import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.Surveys;
import com.yea.enterprise.database.service.ISurveysSessionService;

@Service("surveysServiceImpl")
public class SurveysServiceSessionImpl implements ISurveysSessionService{
	@Autowired
	ISurveysSessionDAO surveysSessionDAO;
	
	@Transactional
	public void persistSurveys(Surveys surveys) {
		surveysSessionDAO.persistSurveys(surveys);
		
	}

	@Transactional
	public void updateSurveys(Surveys surveys) {
		surveysSessionDAO.updateSurveys(surveys);
		
	}
	@Transactional
	public Surveys findSurveysById(Long id) {
		return surveysSessionDAO.findSurveysById(id);
	}

	@Transactional
	public void deleteSurveys(Surveys surveys) {
		surveysSessionDAO.deleteSurveys(surveys);
		
	}

	@Transactional
	public List<Surveys> findSurveysList() {
		return surveysSessionDAO.findSurveysList();
	}

}
