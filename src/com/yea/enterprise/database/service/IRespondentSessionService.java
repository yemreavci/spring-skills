package com.yea.enterprise.database.service;

import com.yea.enterprise.database.model.Respondent;

public interface IRespondentSessionService {
	  public void persistRespondent(Respondent respondent);
	  public Respondent findRespondentById(String id);
	  public void updateRespondent(Respondent respondent);
	  public void deleteRespondent(Respondent respondent);
}
