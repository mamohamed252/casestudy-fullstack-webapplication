package com.sHeroMohamed.entity;

import java.util.List;
// many to many
public class Hero {
	
	// properties
	private Integer heroID;
	private String heroName, heroDescription, superPower, heroStatus;
	private List<Organization> orgID;
	
	
	public Integer getHeroID() {
		return heroID;
	}
	
	
	// getters and setters
	public void setHeroID(Integer heroID) {
		this.heroID = heroID;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroDescription() {
		return heroDescription;
	}
	public void setHeroDescription(String heroDescription) {
		this.heroDescription = heroDescription;
	}
	public String getSuperPower() {
		return superPower;
	}
	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}
	public String getHeroStatus() {
		return heroStatus;
	}
	public void setHeroStatus(String heroStatus) {
		this.heroStatus = heroStatus;
	}

// hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((heroDescription == null) ? 0 : heroDescription.hashCode());
		result = prime * result + ((heroID == null) ? 0 : heroID.hashCode());
		result = prime * result + ((heroName == null) ? 0 : heroName.hashCode());
		result = prime * result + ((heroStatus == null) ? 0 : heroStatus.hashCode());
		result = prime * result + ((superPower == null) ? 0 : superPower.hashCode());
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
		Hero other = (Hero) obj;
		if (heroDescription == null) {
			if (other.heroDescription != null)
				return false;
		} else if (!heroDescription.equals(other.heroDescription))
			return false;
		if (heroID == null) {
			if (other.heroID != null)
				return false;
		} else if (!heroID.equals(other.heroID))
			return false;
		if (heroName == null) {
			if (other.heroName != null)
				return false;
		} else if (!heroName.equals(other.heroName))
			return false;
		if (heroStatus == null) {
			if (other.heroStatus != null)
				return false;
		} else if (!heroStatus.equals(other.heroStatus))
			return false;
		if (superPower == null) {
			if (other.superPower != null)
				return false;
		} else if (!superPower.equals(other.superPower))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Hero [heroID=" + heroID + ", heroName=" + heroName + ", heroDescription=" + heroDescription
				+ ", superPower=" + superPower + ", heroStatus=" + heroStatus + "]";
	}
	
	
	
	
}
