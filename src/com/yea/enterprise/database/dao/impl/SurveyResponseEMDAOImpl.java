package com.yea.enterprise.database.dao.impl;

import org.springframework.stereotype.Repository;
import com.yea.enterprise.database.dao.ISurveyResponseEMDAO;
import com.yea.enterprise.database.dao.impl.base.GenericBaseJPAImpl;
import com.yea.enterprise.database.model.SurveyResponse;

@Repository("surveyResponseOrderDaoImpl")
public class SurveyResponseEMDAOImpl  extends GenericBaseJPAImpl<SurveyResponse>implements ISurveyResponseEMDAO{

}
