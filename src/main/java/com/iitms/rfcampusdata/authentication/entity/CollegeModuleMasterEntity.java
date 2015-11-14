package com.iitms.rfcampusdata.authentication.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ua_col_mod_master")
public class CollegeModuleMasterEntity implements Serializable{

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "col_mod_id", columnDefinition = "serial")
    private int id;
    @Column(name = "college_id")
    private int collegeId;
    @Column(name = "module_id ")
    private int moduleId;
    @Column(name = "society_id")
    private int societyId;
    @Column(name = "created_by")
    private int createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "ipaddress")
    private String ipAddress;
    @Column(name = "mac_address")
    private String macAddress;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCollegeId() {
        return collegeId;
    }
    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }
    public int getModuleId() {
        return moduleId;
    }
    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }
    public int getSocietyId() {
        return societyId;
    }
    public void setSocietyId(int societyId) {
        this.societyId = societyId;
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + moduleId;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CollegeModuleMasterEntity other = (CollegeModuleMasterEntity) obj;
        if (moduleId != other.moduleId)
            return false;
        return true;
    }
    public CollegeModuleMasterEntity(int moduleId) {
        super();
        this.moduleId = moduleId;
    }
    public CollegeModuleMasterEntity() {
        super();
    }
    
    
}
