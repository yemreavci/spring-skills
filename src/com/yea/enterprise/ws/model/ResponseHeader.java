package com.yea.enterprise.ws.model;

public class ResponseHeader extends BaseModel {

	private static final long serialVersionUID = 8191531446827770503L;
	private Integer resultCode;
	private String resultDescription;
	public Integer getResultCode() {
		return resultCode;
	}
	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultDescription() {
		return resultDescription;
	}
	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}
}
