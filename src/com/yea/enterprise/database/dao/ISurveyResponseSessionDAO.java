package com.yea.enterprise.database.dao;

import com.yea.enterprise.database.model.SurveyResponse;

public interface ISurveyResponseSessionDAO {
	  public void persistSurveyResponse(SurveyResponse response);
	  public SurveyResponse findSurveyResponseById(String id);
	  public void updateSurveyResponse(SurveyResponse response);
	  public void deleteSurveyResponse(SurveyResponse response);
}
