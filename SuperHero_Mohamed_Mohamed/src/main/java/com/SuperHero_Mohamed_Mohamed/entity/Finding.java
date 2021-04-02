package com.SuperHero_Mohamed_Mohamed.entity;

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
	private Integer findingID;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "findingDate", nullable = false)
	private Date findingDate;
	
	@Column(name = "heroID", nullable = false)
	private Integer heroID;
	
	@Column(name = "locationID", nullable = false)
	private Integer locationID;

	public Finding() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Finding(Date findingDate, Integer heroID, Integer locationID) {
		super();
		this.findingDate = findingDate;
		this.heroID = heroID;
		this.locationID = locationID;
	}

	public Integer getFindingID() {
		return findingID;
	}

	public void setFindingID(Integer findingID) {
		this.findingID = findingID;
	}

	public Date getFindingDate() {
		return findingDate;
	}

	public void setFindingDate(Date findingDate) {
		this.findingDate = findingDate;
	}

	public Integer getHeroID() {
		return heroID;
	}

	public void setHeroID(Integer heroID) {
		this.heroID = heroID;
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
		result = prime * result + ((findingDate == null) ? 0 : findingDate.hashCode());
		result = prime * result + ((findingID == null) ? 0 : findingID.hashCode());
		result = prime * result + ((heroID == null) ? 0 : heroID.hashCode());
		result = prime * result + ((locationID == null) ? 0 : locationID.hashCode());
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
		} else if (!findingDate.toString().equals(other.findingDate.toString()))
			return false;
		if (findingID == null) {
			if (other.findingID != null)
				return false;
		} else if (!findingID.equals(other.findingID))
			return false;
		if (heroID == null) {
			if (other.heroID != null)
				return false;
		} else if (!heroID.equals(other.heroID))
			return false;
		if (locationID == null) {
			if (other.locationID != null)
				return false;
		} else if (!locationID.equals(other.locationID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Finding [findingID=" + findingID + ", findingDate=" + findingDate + ", heroID=" + heroID
				+ ", locationID=" + locationID + "]";
	}
	
	
}
