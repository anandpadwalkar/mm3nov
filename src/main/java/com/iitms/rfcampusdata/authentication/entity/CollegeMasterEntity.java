package com.iitms.rfcampusdata.authentication.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "\"COLLEGE_MASTER\"")
public class CollegeMasterEntity implements Serializable{

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "college_id")
	private int collegeId;
	@Column(name = "\"COLL_NAME\"")
	private String collegeName;
	@Column(name = "\"COLL_CODE\"")
	private String collegeCode;
	@Column(name = "\"COLL_LOGO\"")
	private String collegeLogo;
	@Column(name = "\"PANNO\"")
	private String panNumber;
	@Column(name = "\"TINNO\"")
	private String tinNumber;
	@Column(name = "\"TANNO\"")
	private String tanNumber;
	@Column(name = "\"PRINCIPAL\"")
	private String principalName;
	@Column(name = "\"WORKORDERNO\"")
	private String workOrderNumber;
	@Column(name = "\"WORKORDERDATE\"")
	private Date workOrderDate;
	@Column(name = "\"PRO_START_DT\"")
	private Date projectStartDate;
	@Column(name = "\"PRO_END_DT\"")
	private Date projectEndDate;
	@Column(name = "\"IS_SOC_COLL\"")
	private int socialCollege;
	@Column(name = "\"ACTIVE\"")
	private int active;
	@Column(name = "\"NO_OF_USERS\"")
	private int numberOfUsers;
	@Column(name = "\"IPADDRESS\"")
	private String ipAddress;
	@Column(name = "\"MACADDRESS\"")
	private String macAddress;
	@Column(name = "\"CREATED_BY\"")
	private int createdBy;
	@Column(name = "\"CREATE_DT\"")
	private Date createdDate;
	@Column(name = "\"MODIFIED_BY\"")
	private int modifiedBy;
	@Column(name = "\"MODIFIED_DT\"")
	private Date modifiedDate;
	
	@Column(name = "\"SOC_ID\"")
	private int societyId;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "\"SOC_ID\"", referencedColumnName = "soc_id", insertable = false, updatable = false, nullable = false)
	private SocietyMaster societyMaster;
	
	@Column(name = "\"UNIVID\"")
	private int universityId;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "\"UNIVID\"", referencedColumnName = "univsrno", insertable = false, updatable = false, nullable = false)
	private UniversityMaster universityMaster;
	
	@Transient
	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}
	public String getCollegeLogo() {
		return collegeLogo;
	}
	public void setCollegeLogo(String collegeLogo) {
		this.collegeLogo = collegeLogo;
	}
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public int getSocietyId() {
		return societyId;
	}
	public void setSocietyId(int societyId) {
		this.societyId = societyId;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getTinNumber() {
		return tinNumber;
	}
	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	public String getTanNumber() {
		return tanNumber;
	}
	public void setTanNumber(String tanNumber) {
		this.tanNumber = tanNumber;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	public String getWorkOrderNumber() {
		return workOrderNumber;
	}
	public void setWorkOrderNumber(String workOrderNumber) {
		this.workOrderNumber = workOrderNumber;
	}
	public Date getWorkOrderDate() {
		return workOrderDate;
	}
	public void setWorkOrderDate(Date workOrderDate) {
		this.workOrderDate = workOrderDate;
	}
	public Date getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public Date getProjectEndDate() {
		return projectEndDate;
	}
	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	
	public int getSocialCollege() {
        return socialCollege;
    }
    public void setSocialCollege(int socialCollege) {
        this.socialCollege = socialCollege;
    }
    public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getNumberOfUsers() {
		return numberOfUsers;
	}
	public void setNumberOfUsers(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
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
	public SocietyMaster getSocietyMaster() {
		return societyMaster;
	}
	public void setSocietyMaster(SocietyMaster societyMaster) {
		this.societyMaster = societyMaster;
	}
	public UniversityMaster getUniversityMaster() {
		return universityMaster;
	}
	public void setUniversityMaster(UniversityMaster universityMaster) {
		this.universityMaster = universityMaster;
	}
    public CollegeMasterEntity(int collegeId, String collegeName, String collegeCode, String collegeLogo,
        String panNumber, String tinNumber, String tanNumber, String principalName, String workOrderNumber,
        Date workOrderDate, Date projectStartDate, Date projectEndDate, int socialCollege, int active,
        int numberOfUsers, String ipAddress, String macAddress, int createdBy, Date createdDate, int modifiedBy,
        Date modifiedDate, int societyId, int universityId) {
        super();
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.collegeCode = collegeCode;
        this.collegeLogo = collegeLogo;
        this.panNumber = panNumber;
        this.tinNumber = tinNumber;
        this.tanNumber = tanNumber;
        this.principalName = principalName;
        this.workOrderNumber = workOrderNumber;
        this.workOrderDate = workOrderDate;
        this.projectStartDate = projectStartDate;
        this.projectEndDate = projectEndDate;
        this.socialCollege = socialCollege;
        this.active = active;
        this.numberOfUsers = numberOfUsers;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.societyId = societyId;
        this.universityId = universityId;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + active;
        result = prime * result + ((collegeCode == null) ? 0 : collegeCode.hashCode());
        result = prime * result + collegeId;
        result = prime * result + ((collegeLogo == null) ? 0 : collegeLogo.hashCode());
        result = prime * result + ((collegeName == null) ? 0 : collegeName.hashCode());
        result = prime * result + numberOfUsers;
        result = prime * result + ((panNumber == null) ? 0 : panNumber.hashCode());
        result = prime * result + ((principalName == null) ? 0 : principalName.hashCode());
        result = prime * result + socialCollege;
        result = prime * result + societyId;
        result = prime * result + ((tanNumber == null) ? 0 : tanNumber.hashCode());
        result = prime * result + ((tinNumber == null) ? 0 : tinNumber.hashCode());
        result = prime * result + universityId;
        result = prime * result + ((workOrderDate == null) ? 0 : workOrderDate.hashCode());
        result = prime * result + ((workOrderNumber == null) ? 0 : workOrderNumber.hashCode());
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
        CollegeMasterEntity other = (CollegeMasterEntity) obj;
        if (active != other.active)
            return false;
        if (collegeCode == null) {
            if (other.collegeCode != null)
                return false;
        } else if (!collegeCode.equals(other.collegeCode))
            return false;
        if (collegeId != other.collegeId)
            return false;
        if (collegeLogo == null) {
            if (other.collegeLogo != null)
                return false;
        } else if (!collegeLogo.equals(other.collegeLogo))
            return false;
        if (collegeName == null) {
            if (other.collegeName != null)
                return false;
        } else if (!collegeName.equals(other.collegeName))
            return false;
        if (numberOfUsers != other.numberOfUsers)
            return false;
        if (panNumber == null) {
            if (other.panNumber != null)
                return false;
        } else if (!panNumber.equals(other.panNumber))
            return false;
        if (principalName == null) {
            if (other.principalName != null)
                return false;
        } else if (!principalName.equals(other.principalName))
            return false;
        if (socialCollege != other.socialCollege)
            return false;
        if (societyId != other.societyId)
            return false;
        if (tanNumber == null) {
            if (other.tanNumber != null)
                return false;
        } else if (!tanNumber.equals(other.tanNumber))
            return false;
        if (tinNumber == null) {
            if (other.tinNumber != null)
                return false;
        } else if (!tinNumber.equals(other.tinNumber))
            return false;
        if (universityId != other.universityId)
            return false;
        if (workOrderDate == null) {
            if (other.workOrderDate != null)
                return false;
        } else if (!sdf.format(workOrderDate).equals(sdf.format(other.workOrderDate)))
            return false;
        if (workOrderNumber == null) {
            if (other.workOrderNumber != null)
                return false;
        } else if (!workOrderNumber.equals(other.workOrderNumber))
            return false;
        return true;
    }
	
    public void setProperties(String collegeName, String collegeCode, String collegeLogo,
        String panNumber, String tinNumber, String tanNumber, String principalName, String workOrderNumber,
        Date workOrderDate, int socialCollege, int active,
        int numberOfUsers, String ipAddress, String macAddress, int modifiedBy,
        Date modifiedDate, int societyId, int universityId){
        
        this.collegeName = collegeName;
        this.collegeCode = collegeCode;
        this.collegeLogo = collegeLogo;
        this.panNumber = panNumber;
        this.tinNumber = tinNumber;
        this.tanNumber = tanNumber;
        this.principalName = principalName;
        this.workOrderNumber = workOrderNumber;
        this.workOrderDate = workOrderDate;
        this.socialCollege = socialCollege;
        this.active = active;
        this.numberOfUsers = numberOfUsers;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.societyId = societyId;
        this.universityId = universityId;
    }
    @Override
    public String toString() {
        return "CollegeMasterEntity [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeCode="
            + collegeCode + ", collegeLogo=" + collegeLogo + ", panNumber=" + panNumber + ", tinNumber=" + tinNumber
            + ", tanNumber=" + tanNumber + ", principalName=" + principalName + ", workOrderNumber=" + workOrderNumber
            + ", workOrderDate=" + workOrderDate + ", socialCollege=" + socialCollege + ", active=" + active
            + ", numberOfUsers=" + numberOfUsers + ", societyId=" + societyId + ", universityId=" + universityId + "]";
    }
    public CollegeMasterEntity() {
        super();
    }
    
}
