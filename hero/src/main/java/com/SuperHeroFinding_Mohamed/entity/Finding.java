package com.SuperHeroFinding_Mohamed.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Finding {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "findingID", nullable = false)
	private int findingID;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "findingDate", nullable = false)
	private Date findingDate;

	@Column(name = "heroName", nullable = false)
	private String heroName;

	@Column(name = "locationName", nullable = false)
	private String locationName;
	
	@Column(name = "orgName", nullable = false)
	private String orgName;

	public Finding() {
		super();
		this.findingDate=null;
		this.heroName="";
		this.locationName="";
		this.orgName="";
	}

	public Finding(int findingID, Date findingDate, String heroName, String locationName, String orgName) {
		super();
		this.findingID = findingID;
		this.findingDate = findingDate;
		this.heroName = heroName;
		this.locationName = locationName;
		this.orgName = orgName;
	}

	public int getFindingID() {
		return findingID;
	}

	public void setFindingID(int findingID) {
		this.findingID = findingID;
	}

	public Date getFindingDate() {
		return findingDate;
	}

	public void setFindingDate(Date findingDate) {
		this.findingDate = findingDate;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((findingDate == null) ? 0 : findingDate.hashCode());
		result = prime * result + findingID;
		result = prime * result + ((heroName == null) ? 0 : heroName.hashCode());
		result = prime * result + ((locationName == null) ? 0 : locationName.hashCode());
		result = prime * result + ((orgName == null) ? 0 : orgName.hashCode());
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
		Finding other = (Finding) obj;
		if (findingDate == null) {
			if (other.findingDate != null)
				return false;
		} else if (!findingDate.equals(other.findingDate))
			return false;
		if (findingID != other.findingID)
			return false;
		if (heroName == null) {
			if (other.heroName != null)
				return false;
		} else if (!heroName.equals(other.heroName))
			return false;
		if (locationName == null) {
			if (other.locationName != null)
				return false;
		} else if (!locationName.equals(other.locationName))
			return false;
		if (orgName == null) {
			if (other.orgName != null)
				return false;
		} else if (!orgName.equals(other.orgName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Finding [findingID=" + findingID + ", findingDate=" + findingDate + ", heroName=" + heroName
				+ ", locationName=" + locationName + ", orgName=" + orgName + "]";
	}	
}
