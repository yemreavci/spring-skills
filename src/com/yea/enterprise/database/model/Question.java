package com.yea.enterprise.database.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/*
 * 
 CREATE TABLE  `world`.`Respondent` (
  `ID` int(19) unsigned NOT NULL AUTO_INCREMENT,
  `EMAIL` varchar(100) NOT NULL,
  `HASHED_PASSWORD` varchar(100) NOT NULL,
  `NAME` varchar(100) NOT NULL,
    `CREATED` DATE NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
  ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
  
 alter table `world`.`Respondent` drop id;
 
ALTER TABLE `world`.`Respondent`
ADD id INT UNSIGNED NOT NULL AUTO_INCREMENT FIRST,
ADD PRIMARY KEY (id);

 */
@Entity
@Table(name = "Question")
public class Question {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "TEXT", nullable = false)
	private String text;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED")
	private Date updated;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	
}
