package com.SuperHero_Mohamed_Mohamed.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Location {

	// properties
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "locationID", nullable = false)
	private Integer locationID;

	@Column(name = "locationName", nullable = false, length = 50 )
	@NotBlank(message = "Location name must not be empty.")
	@Size(max = 50, message= "Location name must be less than 50 characters.")
	private String locationName; 

	@Column(name = "locationDescription", nullable = false, length = 200)
	@NotBlank(message = "Location description must not be empty.")
	@Size(max = 200, message= "Location description must be less than 200 characters.")
	private String locationDescription;

	@Column(name = "street", nullable = false, length = 100)
	@NotBlank(message = "Street Address must not be empty.")
	@Size(max = 100, message= "Street Address must be less than 100 characters.")
	private String street;

	@Column(name = "city", nullable = false, length = 50)
	@NotBlank(message = "City must not be empty.")
	@Size(max = 50, message= "City must be less than 50 characters.")
	private String city;

	@Column(name = "state", nullable = false, length = 3)
	@NotBlank(message = "State must not be empty.")
	@Size(max = 3, message= "State must be less than 3 characters.")
	private String state;

	@Column(name = "zipcode", nullable = false, length = 5)
	@NotBlank(message = "Zipcode must not be empty.")
	@Size(max = 5, message= "Zipcode must be less than 5 characters.")
	private String zipcode;

	@Column(name = "country", nullable = false, length = 80)
	@NotBlank(message = "Country must not be empty.")
	@Size(max = 80, message= "Country description must be less than 80 characters.")
	private String country;

	@Column(name = "locationLatitude", nullable = false, length = 15)
	@NotBlank(message = "Location Latitude must not be empty.")
	@Size(max = 15, message= "Location Latitude must be less than 15 characters.")
	private String locationLatitude;

	@Column(name = "locationLongitude", nullable = false, length = 15)
	@NotBlank(message = "Location Longitude must not be empty.")
	@Size(max = 15, message= "Location Longitude must be less than 15 characters.")
	private String locationLongitude;

	@OneToMany(mappedBy = "location", fetch = FetchType.EAGER)
    private List<Organization> org;
	
	// constructor with parameters
	public Location() {
		super();
		this.locationID = 0;
	}

	public Location(Integer locationID,
			@NotBlank(message = "Location name must not be empty.") @Size(max = 50, message = "Location name must be less than 50 characters.") String locationName,
			@NotBlank(message = "Location description must not be empty.") @Size(max = 200, message = "Location description must be less than 200 characters.") String locationDescription,
			@NotBlank(message = "Street Address must not be empty.") @Size(max = 100, message = "Street Address must be less than 100 characters.") String street,
			@NotBlank(message = "City must not be empty.") @Size(max = 50, message = "City must be less than 50 characters.") String city,
			@NotBlank(message = "State must not be empty.") @Size(max = 3, message = "State must be less than 3 characters.") String state,
			@NotBlank(message = "Zipcode must not be empty.") @Size(max = 5, message = "Zipcode must be less than 5 characters.") String zipcode,
			@NotBlank(message = "Country must not be empty.") @Size(max = 80, message = "Country description must be less than 80 characters.") String country,
			@NotBlank(message = "Location Latitude must not be empty.") @Size(max = 15, message = "Location Latitude must be less than 15 characters.") String locationLatitude,
			@NotBlank(message = "Location Longitude must not be empty.") @Size(max = 15, message = "Location Longitude must be less than 15 characters.") String locationLongitude,
			List<Organization> org) {
		super();
		this.locationID = locationID;
		this.locationName = locationName;
		this.locationDescription = locationDescription;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.locationLatitude = locationLatitude;
		this.locationLongitude = locationLongitude;
		this.org = org;
	}

	public Integer getLocationID() {
		return locationID;
	}

	public void setLocationID(Integer locationID) {
		this.locationID = locationID;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocationLatitude() {
		return locationLatitude;
	}

	public void setLocationLatitude(String locationLatitude) {
		this.locationLatitude = locationLatitude;
	}

	public String getLocationLongitude() {
		return locationLongitude;
	}

	public void setLocationLongitude(String locationLongitude) {
		this.locationLongitude = locationLongitude;
	}

	public List<Organization> getOrg() {
		return org;
	}

	public void setOrg(List<Organization> org) {
		this.org = org;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((locationDescription == null) ? 0 : locationDescription.hashCode());
		result = prime * result + ((locationID == null) ? 0 : locationID.hashCode());
		result = prime * result + ((locationLatitude == null) ? 0 : locationLatitude.hashCode());
		result = prime * result + ((locationLongitude == null) ? 0 : locationLongitude.hashCode());
		result = prime * result + ((locationName == null) ? 0 : locationName.hashCode());
		result = prime * result + ((org == null) ? 0 : org.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
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
		Location other = (Location) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (locationDescription == null) {
			if (other.locationDescription != null)
				return false;
		} else if (!locationDescription.equals(other.locationDescription))
			return false;
		if (locationID == null) {
			if (other.locationID != null)
				return false;
		} else if (!locationID.equals(other.locationID))
			return false;
		if (locationLatitude == null) {
			if (other.locationLatitude != null)
				return false;
		} else if (!locationLatitude.equals(other.locationLatitude))
			return false;
		if (locationLongitude == null) {
			if (other.locationLongitude != null)
				return false;
		} else if (!locationLongitude.equals(other.locationLongitude))
			return false;
		if (locationName == null) {
			if (other.locationName != null)
				return false;
		} else if (!locationName.equals(other.locationName))
			return false;
		if (org == null) {
			if (other.org != null)
				return false;
		} else if (!org.equals(other.org))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (zipcode == null) {
			if (other.zipcode != null)
				return false;
		} else if (!zipcode.equals(other.zipcode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Location [locationID=" + locationID + ", locationName=" + locationName + ", locationDescription="
				+ locationDescription + ", street=" + street + ", city=" + city + ", state=" + state + ", zipcode="
				+ zipcode + ", country=" + country + ", locationLatitude=" + locationLatitude + ", locationLongitude="
				+ locationLongitude + ", org=" + org + "]";
	}

	
}
