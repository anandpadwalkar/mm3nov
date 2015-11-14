package com.iitms.rfcampusdata.authentication.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"ACD_UNIVERSITY_MASTER\"")
public class UniversityMaster implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "univsrno", columnDefinition = "serial")
	private int id; 
	@Column(name = "\"UNIVCODE\"")
	private String universityCode;
	@Column(name = "\"UNIVNAME\"")
	private String universityName;
	@Column(name = "\"ACTIVE\"")
	private int active;
	@Column(name = "\"COLLEGE_ID\"")
	private int collegeId;
	@Column(name = "\"CREATED_BY\"")
	private int createdBy;
	@Column(name = "\"CREATED_DT\"")
	private Date createdDate;
	@Column(name = "\"MODIFIED_BY\"")
	private int modifiedBy;
	@Column(name = "\"MODIFIED_DT\"")
	private Date modifiedDate;
	@Column(name = "\"IPADDRESS\"")
	private String ipAddress;
	@Column(name = "\"MACADDRESS\"")
	private String macAddress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUniversityCode() {
		return universityCode;
	}
	public void setUniversityCode(String universityCode) {
		this.universityCode = universityCode;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	
}
