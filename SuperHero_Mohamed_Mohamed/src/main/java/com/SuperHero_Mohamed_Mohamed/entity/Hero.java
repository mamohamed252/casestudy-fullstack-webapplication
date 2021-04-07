package com.SuperHero_Mohamed_Mohamed.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


// many to many
@Entity
@NamedQuery(name="getHeroByName", query="SELECT h FROM Hero h WHERE h.heroName= :heroName")//JPQL
public class Hero {
	
	// properties
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "heroID", nullable = false)
	private Integer heroID;
	

	@Column(name = "heroName", nullable = false, length = 50)
	@NotBlank(message = "Hero name must not be empty.")
	@Size(max = 50, message= "Hero name must be less than 50 characters.")
	private String heroName;

	@Column(name = "heroDescription", nullable = false, length = 200)
	@NotBlank(message = "Hero description must not be empty.")
	@Size(max = 200, message= "Hero description must be less than 200 characters.")
	private String heroDescription;
	

	@Column(name = "superPower", nullable = false, length = 50)
	@NotBlank(message = "Superpower must not be empty.")
	@Size(max = 50, message= "Superpower must be less than 50 characters.")
	private String superPower;
	

	@Column(name = "heroStatus", nullable = false, length = 8)
	@NotBlank(message = "Please choose a status. Either Hero or Villain")
	@Size(max = 7, message= "Status must be less than 8 characters.")
	private String heroStatus;
//	@Column(name = "picture", nullable = false, length= 50)
//	private String picture;
	
	
	@ManyToMany(targetEntity = Organization.class, fetch= FetchType.LAZY)
	@JoinTable(name = "hero_org")
		
	private List<Organization> organizations = new ArrayList<>();
	
	
	public Hero() {
		super();
		this.heroID = 0;
	}


	public Hero(Integer heroID,
			@NotBlank(message = "Hero name must not be empty.") @Size(max = 50, message = "Hero name must be less than 50 characters.") String heroName,
			@NotBlank(message = "Hero description must not be empty.") @Size(max = 200, message = "Hero description must be less than 200 characters.") String heroDescription,
			@NotBlank(message = "Superpower must not be empty.") @Size(max = 50, message = "Superpower must be less than 50 characters.") String superPower,
			@NotBlank(message = "Please choose a status. Either Hero or Villain") @Size(max = 7, message = "Status must be less than 8 characters.") String heroStatus,
			List<Organization> organizations) {
		super();
		this.heroID = heroID;
		this.heroName = heroName;
		this.heroDescription = heroDescription;
		this.superPower = superPower;
		this.heroStatus = heroStatus;
		this.organizations = organizations;
	}


	public Integer getHeroID() {
		return heroID;
	}


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


	public List<Organization> getOrganizations() {
		return organizations;
	}


	public void setOrganizations(List<Organization> organizations) {
		this.organizations = organizations;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((heroDescription == null) ? 0 : heroDescription.hashCode());
		result = prime * result + ((heroID == null) ? 0 : heroID.hashCode());
		result = prime * result + ((heroName == null) ? 0 : heroName.hashCode());
		result = prime * result + ((heroStatus == null) ? 0 : heroStatus.hashCode());
		result = prime * result + ((organizations == null) ? 0 : organizations.hashCode());
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
		if (organizations == null) {
			if (other.organizations != null)
				return false;
		} else if (!organizations.equals(other.organizations))
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
				+ ", superPower=" + superPower + ", heroStatus=" + heroStatus + ", organizations=" + organizations
				+ "]";
	}
}
