package com.sHeroMohamed.entity;

import java.util.List;
// many to many

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HeroOrg {
	@Id
	@Column(name = "orgID", nullable = false)
	private Integer orgID;
	
	private List<Hero> heroID;

	
	
	public HeroOrg() {
		super();
		// TODO Auto-generated constructor stub
	}



	public HeroOrg(Integer orgID, List<Hero> heroID) {
		super();
		this.orgID = orgID;
		this.heroID = heroID;
	}



	public Integer getOrgID() {
		return orgID;
	}



	public void setOrgID(Integer orgID) {
		this.orgID = orgID;
	}



	public List<Hero> getHeroID() {
		return heroID;
	}



	public void setHeroID(List<Hero> heroID) {
		this.heroID = heroID;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((heroID == null) ? 0 : heroID.hashCode());
		result = prime * result + ((orgID == null) ? 0 : orgID.hashCode());
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
		HeroOrg other = (HeroOrg) obj;
		if (heroID == null) {
			if (other.heroID != null)
				return false;
		} else if (!heroID.equals(other.heroID))
			return false;
		if (orgID == null) {
			if (other.orgID != null)
				return false;
		} else if (!orgID.equals(other.orgID))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "HeroOrg [orgID=" + orgID + ", heroID=" + heroID + "]";
	}
	
	
	
	
}