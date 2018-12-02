package com.yea.enterprise.ws.model;

public class AddSurveyRequest extends RequestType{

	private static final long serialVersionUID = 6788264077839878268L;
	
	private String name;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
