package com.yea.enterprise.database.service;

import com.yea.enterprise.database.model.SurveyResponse;

public interface ISurveyResponseService {
	  public void persistSurveyResponse(SurveyResponse response);
	  public SurveyResponse findSurveyResponseById(Long id);
	  public void updateSurveyResponse(SurveyResponse response);
	  public void deleteSurveyResponse(SurveyResponse response);
}
