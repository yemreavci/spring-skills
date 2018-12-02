package com.yea.enterprise.database.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * 

 CREATE TABLE  `world`.`Question_Order` (
  `ID` int(19) unsigned NOT NULL AUTO_INCREMENT,
  `SURVEY_ID` int(19) unsigned NOT NULL,
  `QUESTION_ID` int(19) unsigned NOT NULL,
  `ORDER` int(19) unsigned NOT NULL, 
  PRIMARY KEY (`ID`) USING BTREE
  ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
 */
@Entity
@Table(name = "Question_Order")
public class QuestionOrder implements Serializable{


	private static final long serialVersionUID = -8377931202676103391L;

	@Id
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="SURVEY_ID")
	private Surveys surveysId;
	
	@ManyToOne
	@JoinColumn(name="QUESTION_ID")
	private Question questionId;

	@Id
	@Column(name = "ORDER", nullable = false)
	private Long order;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Surveys getSurveysId() {
		return surveysId;
	}

	public void setSurveysId(Surveys surveysId) {
		this.surveysId = surveysId;
	}

	public Question getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Question questionId) {
		this.questionId = questionId;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}	
	
}
