package com.yea.enterprise.database.dao;

import com.yea.enterprise.database.model.Surveys;

public interface ISurveysSessionDAO {
	  public void persistSurveys(Surveys surveys);
	  
	  public Surveys findSurveysById(String id);
	  
	  public void updateSurveys(Surveys surveys);
	  
	  public void deleteSurveys(Surveys surveys);
}
