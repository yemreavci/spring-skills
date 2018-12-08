package com.yea.enterprise.database.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.yea.enterprise.model.SurveyQuestionCount;

public class SurveyQuestionCountRowMapper extends BaseRowMapper<SurveyQuestionCount>{

	public SurveyQuestionCount mapRow(ResultSet rs, int rownum) throws SQLException {
		SurveyQuestionCount entity=new SurveyQuestionCount();
		entity.setCount(getInteger(rs,"a_count",0));
		return entity;
	}
	
}
