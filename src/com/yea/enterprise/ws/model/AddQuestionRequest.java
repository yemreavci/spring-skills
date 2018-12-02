package com.yea.enterprise.ws.model;

public class AddQuestionRequest extends RequestType{
	private static final long serialVersionUID = 5337336917850892731L;
	String text;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
