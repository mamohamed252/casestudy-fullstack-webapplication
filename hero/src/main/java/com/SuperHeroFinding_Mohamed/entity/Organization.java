package com.SuperHeroFinding_Mohamed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class Organization {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orgID", nullable = false)
	private Integer orgID;
	
	@Column(name = "orgName", nullable = false, length = 50)
	@NotBlank(message = "Organization name must not be empty.")
	@Size(max = 50, message= "Organization name must be less than 50 characters.")
	private String orgName;
	
	@Column(name = "orgDescription", nullable = false, length = 200)
	@NotBlank(message = "Organization description must not be empty.")
	@Size(max = 200, message= "Organization description must be less than 200 characters.")
	private String orgDescription;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "locationID")
	private Location location;

	public Organization() {
		super();
		this.orgID = 0;
	}

	public Organization(Integer orgID, String orgName, String orgDescription) {
		super();
		this.orgID = orgID;
		this.orgName = orgName;
		this.orgDescription = orgDescription;
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

	public Location getLocation() {
		return this.location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		return "Organization [orgID=" + orgID + ", orgName=" + orgName + ", orgDescription=" + orgDescription + "]";
	}
	
	
}
