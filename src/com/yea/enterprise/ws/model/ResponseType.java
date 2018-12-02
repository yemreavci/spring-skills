package com.yea.enterprise.ws.model;

public class ResponseType extends BaseModel{

	private static final long serialVersionUID = 2992461363005208359L;
	private ResponseHeader responseHeader;
	public ResponseHeader getResponseHeader() {
		if(responseHeader == null) {
			responseHeader = new ResponseHeader();
		}
		return responseHeader;
	}
	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
}
