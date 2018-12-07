package com.yea.enterprise.database.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
  `SURVEY_ID` int(19) unsigned NOT NULL,
  `ANSWER` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
  ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
  
 alter table `world`.`Response` drop id;
 
ALTER TABLE `world`.`Response`
ADD id INT UNSIGNED NOT NULL AUTO_INCREMENT FIRST,
ADD PRIMARY KEY (id);
 */
@Entity
@Table(name = "Response")
public class Response implements Serializable{
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="QUESTION_ID")
	private Question questionId;
	
	@ManyToOne
	@JoinColumn(name="SURVEY_ID")
	private Surveys surveysId;

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


	public Surveys getSurveysId() {
		return surveysId;
	}


	public void setSurveysId(Surveys surveysId) {
		this.surveysId = surveysId;
	}
	
	
}
