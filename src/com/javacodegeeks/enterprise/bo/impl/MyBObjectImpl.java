package com.javacodegeeks.enterprise.bo.impl;

import java.util.ArrayList;
import java.util.List;

import com.javacodegeeks.enterprise.bo.MyBObject;
import com.javacodegeeks.enterprise.model.Questions;
import com.javacodegeeks.enterprise.model.QuestionsList;

public class MyBObjectImpl implements MyBObject {

	public String printMessage() {
		return "Hello from Java Code Geeks JAXWS with Spring Tutorial";
	}

	public QuestionsList listQuestions() {
		QuestionsList list=new QuestionsList();
		List<Questions> questions= new ArrayList<Questions>();
		Questions e= new Questions(1L, "wHERE ARE YOU FROM ?") ;
		questions.add(e);
		list.setList(questions);
		return list;
	}
}