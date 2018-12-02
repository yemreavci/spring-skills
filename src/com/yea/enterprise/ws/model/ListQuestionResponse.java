package com.yea.enterprise.ws.model;

import java.util.List;

import com.yea.enterprise.database.model.Question;

public class ListQuestionResponse  extends ResponseType{

	private static final long serialVersionUID = -8617438893979975581L;
	
	private List<Question> listQuestions;

	public List<Question> getListQuestions() {
		return listQuestions;
	}

	public void setListQuestions(List<Question> listQuestions) {
		this.listQuestions = listQuestions;
	}

}
