package com.yea.enterprise.database.service;

import java.util.List;

import com.yea.enterprise.database.model.Question;
import com.yea.enterprise.database.model.Surveys;

public interface ISurveysSessionService {
	  public void persistSurveys(Surveys surveys);
	  
	  public Surveys findSurveysById(Long id);
	  
	  public void updateSurveys(Surveys surveys);
	  
	  public void deleteSurveys(Surveys surveys);

	public List<Surveys> findSurveysList();

}
