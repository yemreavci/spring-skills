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
 CREATE TABLE  `world`.`Respondent` (
  `ID` int(19) unsigned NOT NULL AUTO_INCREMENT,
  `EMAIL` varchar(100) NOT NULL,
  `HASHED_PASSWORD` varchar(100) NOT NULL,
  `NAME` varchar(100) NOT NULL,
    `CREATED` DATE NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
  ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
 */
@Entity
@Table(name = "Respondent")
public class Respondent {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "HASHED_PASSWORD", nullable = false)
	private String hashedPassword;	
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED")
	private Date created;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
