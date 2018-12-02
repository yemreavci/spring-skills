package com.yea.enterprise.database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IRespondentSessionDAO;
import com.yea.enterprise.database.model.Respondent;
import com.yea.enterprise.database.service.IRespondentSessionService;

@Service("respondentServiceImpl")
public class RespondentServiceSessionImpl implements IRespondentSessionService{
	@Autowired
	IRespondentSessionDAO respondentSessionDAO;
	
	@Transactional
	public void persistRespondent(Respondent employee) {
		respondentSessionDAO.persistRespondent(employee);
		
	}

	@Transactional
	public void updateRespondent(Respondent employee) {
		respondentSessionDAO.updateRespondent(employee);
		
	}
	@Transactional
	public Respondent findRespondentById(String id) {
		return respondentSessionDAO.findRespondentById(id);
	}

	@Transactional
	public void deleteRespondent(Respondent employee) {
		respondentSessionDAO.deleteRespondent(employee);
		
	}

}
