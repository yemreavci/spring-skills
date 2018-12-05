package com.yea.enterprise.database.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="SURVEY_ID")
	private Surveys surveysId;
	
	@ManyToOne
	@JoinColumn(name="QUESTION_ID")
	private Question questionId;

	@Column(name = "ORDER_NO", nullable = false)
	private Long orderNo;

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

	public Long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	
}
