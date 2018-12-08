package com.yea.enterprise.database.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yea.enterprise.database.dao.IQuestionOrderSpringJdbcDao;
import com.yea.enterprise.database.dao.rowmapper.SurveyQuestionCountRowMapper;
import com.yea.enterprise.model.SurveyQuestionCount;

@Service
public class QuestionOrderSpringJdbcDao implements IQuestionOrderSpringJdbcDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static final String QUERY_GET_SURVEY_QUESTION_COUNT="SELECT COUNT(*) a_count FROM Question_Order Where SURVEY_ID = ?";
	public List<SurveyQuestionCount> findSurveyResponse(Long surveyId) {
		return jdbcTemplate.query(QUERY_GET_SURVEY_QUESTION_COUNT, new SurveyQuestionCountRowMapper(),new Object[] {surveyId});
	}

}
