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
	private int findingID;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "findingDate", nullable = false)
	private Date findingDate;

	@Column(name = "heroID", nullable = false)
	private int heroID;

	@Column(name = "locationID", nullable = false)
	private int locationID;

	public Finding() {
		super();
		this.findingID = 0;
		this.locationID = 0;
		// TODO Auto-generated constructor stub
	}

	public Finding(int findingID, Date findingDate, int heroID, int locationID) {
		super();
		this.findingID = findingID;
		this.findingDate = findingDate;
		this.heroID = heroID;
		this.locationID = locationID;
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

	public int getHeroID() {
		return heroID;
	}

	public void setHeroID(int heroID) {
		this.heroID = heroID;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((findingDate == null) ? 0 : findingDate.hashCode());
		result = prime * result + findingID;
		result = prime * result + heroID;
		result = prime * result + locationID;
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
		if (heroID != other.heroID)
			return false;
		if (locationID != other.locationID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Finding [findingID=" + findingID + ", findingDate=" + findingDate + ", heroID=" + heroID
				+ ", locationID=" + locationID + "]";
	}

}
