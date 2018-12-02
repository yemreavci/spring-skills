package com.yea.enterprise.ws.model;

import java.util.List;

import com.yea.enterprise.database.model.Surveys;

public class ListSurveyResponse extends ResponseType{

	private static final long serialVersionUID = 8938417482965133443L;
	List<Surveys> resultList;
	public List<Surveys> getResultList() {
		return resultList;
	}
	public void setResultList(List<Surveys> resultList) {
		this.resultList = resultList;
	}
	
}
