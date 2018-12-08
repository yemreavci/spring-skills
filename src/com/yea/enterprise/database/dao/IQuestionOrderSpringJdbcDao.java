package com.yea.enterprise.database.dao;

import java.util.List;

import com.yea.enterprise.model.SurveyQuestionCount;

public interface IQuestionOrderSpringJdbcDao {
	public List<SurveyQuestionCount> findSurveyResponse(Long surveyId);
}
