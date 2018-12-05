package com.yea.enterprise.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/*
 * 

 CREATE TABLE  `world`.`Response` (
  `ID` int(19) unsigned NOT NULL AUTO_INCREMENT,
  `RESPONDENT_ID` int(19) unsigned NOT NULL,
  `QUESTION_ID` int(19) unsigned NOT NULL,
  `ANSWER` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
  ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
 */
@Entity
@Table(name = "Response")
public class Response {
	@Id
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="QUESTION_ID")
	private Question questionId;
	

	@ManyToOne
	@JoinColumn(name="RESPONDENT_ID")
	private Respondent respondentId;	
	
	
	@Column(name = "ANSWER", nullable = false)
	private String answer;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Question getQuestionId() {
		return questionId;
	}


	public void setQuestionId(Question questionId) {
		this.questionId = questionId;
	}


	public Respondent getRespondentId() {
		return respondentId;
	}


	public void setRespondentId(Respondent respondentId) {
		this.respondentId = respondentId;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}