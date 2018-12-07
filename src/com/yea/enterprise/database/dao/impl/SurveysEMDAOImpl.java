package com.yea.enterprise.database.dao.impl;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.ISurveysEMDAO;
import com.yea.enterprise.database.dao.impl.base.GenericBaseJPAImpl;
import com.yea.enterprise.database.model.Surveys;

@Repository("surveyOrderDaoImpl")
@Transactional
public class SurveysEMDAOImpl extends GenericBaseJPAImpl<Surveys>implements ISurveysEMDAO{

}
