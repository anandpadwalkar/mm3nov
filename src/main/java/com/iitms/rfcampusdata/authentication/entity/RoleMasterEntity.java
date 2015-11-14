package com.iitms.rfcampusdata.authentication.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ua_role_master")
public class RoleMasterEntity implements Serializable {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ua_role_id", columnDefinition = "serial")
    private int roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_desc")
    private String roleDescription;

    @Column(name = "created_by")
    private int createdBy;

    @Column(name = "cretaed_dt", columnDefinition = "timestamptz")
    @DateTimeFormat(pattern = "YYYY-MM-DD HH:mm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "modified_by")
    private int modifiedBy;

    @Column(name = "modified_dt", columnDefinition = "timestamptz")
    @DateTimeFormat(pattern = "YYYY-MM-DD HH:mm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    @Column(name = "ipaddress")
    private String ipAddress;

    @Column(name = "macaddress")
    private String macAddress;

    @Column(name = "active")
    private int active;

    @Column(name = "user_type_id")
    private int userTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_type_id", referencedColumnName = "id", insertable = false, updatable = false, nullable = false)
    private RoleTypeMasterEntity roleTypeMasterEntity;

   /* @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ua_role_id", referencedColumnName = "ua_role_id", insertable = false, updatable = false, nullable = false)
    private List<RoleMenuAllocation> roleMenuAllocation;*/
    
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
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

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
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

    public RoleTypeMasterEntity getRoleTypeMasterEntity() {
        return roleTypeMasterEntity;
    }

    public void setRoleTypeMasterEntity(RoleTypeMasterEntity roleTypeMasterEntity) {
        this.roleTypeMasterEntity = roleTypeMasterEntity;
    }

    @Override
    public String toString() {
        return "RoleMasterEntity [roleId=" + roleId + ", roleName=" + roleName + ", roleDescription=" + roleDescription
            + ", active=" + active + ", userTypeId=" + userTypeId + "]";
    }

}
