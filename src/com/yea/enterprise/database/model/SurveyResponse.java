package com.yea.enterprise.database.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/*
 * 
 
 CREATE TABLE  `world`.`Survey_Response` (
  `ID` int(19) unsigned NOT NULL AUTO_INCREMENT,
  `SURVEY_ID` int(19) unsigned NOT NULL,
  `RESPONDENT_ID` int(19) unsigned NOT NULL,
    `UPDATED` DATE NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
  ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
 */
@Entity
@Table(name = "Survey_Response")
public class SurveyResponse {
	@Id
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="SURVEY_ID")
	private Surveys surveysId;
	
	@ManyToOne
	@JoinColumn(name="RESPONDENT_ID")
	private Respondent respondentId;	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED")
	private Date updated;

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

	public Respondent getRespondentId() {
		return respondentId;
	}

	public void setRespondentId(Respondent respondentId) {
		this.respondentId = respondentId;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	
}
