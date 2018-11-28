package com.yea.enterprise.model;

import java.util.Date;

public class Questions {
	private Long id;
	private String text;
	private Date updateDate;
	public String getText() {
		return text;
	}
	
	public Questions(Long id,String text) {
		this.id=id;
		this.text=text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
