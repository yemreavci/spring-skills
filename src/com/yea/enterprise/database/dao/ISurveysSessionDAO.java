package com.yea.enterprise.database.dao;

import java.util.List;

import com.yea.enterprise.database.model.Surveys;

public interface ISurveysSessionDAO {
	  public void persistSurveys(Surveys surveys);
	  
	  public Surveys findSurveysById(Long id);
	  
	  public void updateSurveys(Surveys surveys);
	  
	  public void deleteSurveys(Surveys surveys);

	public List<Surveys> findSurveysList();
}
