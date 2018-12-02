package com.yea.enterprise.ws.model;

import java.io.Serializable;

public class RequestHeader implements Serializable {

	private static final long serialVersionUID = -6304221029475569084L;
	private String password;
	private String username;
	private String transactionId;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
