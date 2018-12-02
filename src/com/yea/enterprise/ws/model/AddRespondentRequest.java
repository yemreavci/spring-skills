package com.yea.enterprise.ws.model;

public class AddRespondentRequest extends RequestType{

	private static final long serialVersionUID = 7773822083107061662L;
	
	private String name;
	private String hashedPassword;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHashedPassword() {
		return hashedPassword;
	}
	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
