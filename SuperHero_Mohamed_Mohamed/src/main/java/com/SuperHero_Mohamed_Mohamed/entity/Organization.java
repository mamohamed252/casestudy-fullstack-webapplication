package com.SuperHero_Mohamed_Mohamed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Organization {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orgID", nullable = false)
	private Integer orgID;
	
	@Column(name = "orgName", nullable = false, length = 50)
	private String orgName;
	
	@Column(name = "orgDescription", nullable = false, length = 200)
	private String orgDescription;
	
	@Column(name = "locationID", nullable = false)
	private Integer locationID;

	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organization(Integer orgID, String orgName, String orgDescription, Integer locationID) {
		super();
		this.orgID = orgID;
		this.orgName = orgName;
		this.orgDescription = orgDescription;
		this.locationID = locationID;
	}

	public Integer getOrgID() {
		return orgID;
	}

	public void setOrgID(Integer orgID) {
		this.orgID = orgID;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgDescription() {
		return orgDescription;
	}

	public void setOrgDescription(String orgDescription) {
		this.orgDescription = orgDescription;
	}

	public Integer getLocationID() {
		return locationID;
	}

	public void setLocationID(Integer locationID) {
		this.locationID = locationID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locationID == null) ? 0 : locationID.hashCode());
		result = prime * result + ((orgDescription == null) ? 0 : orgDescription.hashCode());
		result = prime * result + ((orgID == null) ? 0 : orgID.hashCode());
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
		Organization other = (Organization) obj;
		if (locationID == null) {
			if (other.locationID != null)
				return false;
		} else if (!locationID.equals(other.locationID))
			return false;
		if (orgDescription == null) {
			if (other.orgDescription != null)
				return false;
		} else if (!orgDescription.equals(other.orgDescription))
			return false;
		if (orgID == null) {
			if (other.orgID != null)
				return false;
		} else if (!orgID.equals(other.orgID))
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
		return "Organization [orgID=" + orgID + ", orgName=" + orgName + ", orgDescription=" + orgDescription
				+ ", locationID=" + locationID + "]";
	}
	
	
}
