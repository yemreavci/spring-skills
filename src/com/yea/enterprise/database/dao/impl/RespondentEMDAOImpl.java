package com.yea.enterprise.database.dao.impl;

import org.springframework.stereotype.Repository;

import com.yea.enterprise.database.dao.IRespondentEMDAO;
import com.yea.enterprise.database.dao.impl.base.GenericBaseJPAImpl;
import com.yea.enterprise.database.model.Respondent;

@Repository("respondentOrderDaoImpl")
public class RespondentEMDAOImpl extends GenericBaseJPAImpl<Respondent>implements IRespondentEMDAO{

}
