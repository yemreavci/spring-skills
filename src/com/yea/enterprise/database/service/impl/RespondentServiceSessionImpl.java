package com.yea.enterprise.database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yea.enterprise.database.dao.IRespondentEMDAO;
import com.yea.enterprise.database.model.Respondent;
import com.yea.enterprise.database.service.IRespondentSessionService;

@Service("respondentServiceImpl")
public class RespondentServiceSessionImpl implements IRespondentSessionService{
	@Autowired
	IRespondentEMDAO respondentEMDAO;
	
	@Transactional
	public void persistRespondent(Respondent respondent) {
		respondentEMDAO.save(respondent);
		
	}

	@Transactional
	public void updateRespondent(Respondent respondent) {
		respondentEMDAO.save(respondent);
		
	}
	@Transactional
	public Respondent findRespondentById(Long id) {
		return respondentEMDAO.findOne(id);
	}

	@Transactional
	public void deleteRespondent(Respondent respondent) {
		
	}

}
