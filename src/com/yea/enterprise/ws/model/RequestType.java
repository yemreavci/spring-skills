package com.yea.enterprise.ws.model;

public class RequestType extends BaseModel{

	private static final long serialVersionUID = -5230104916170484648L;
	private RequestHeader requestHeader;
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(RequestHeader requestHeader) {
		this.requestHeader = requestHeader;
	}
}
