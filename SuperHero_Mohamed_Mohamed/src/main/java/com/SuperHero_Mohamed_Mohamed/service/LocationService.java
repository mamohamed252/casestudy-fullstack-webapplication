package com.SuperHero_Mohamed_Mohamed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperHero_Mohamed_Mohamed.entity.Location;
import com.SuperHero_Mohamed_Mohamed.repo.LocationRepository;

@Service
public class LocationService {

	@Autowired
	LocationRepository repository;

	public Location addLocation(Location location) {
		return repository.save(location);
		 
	}

	public Location getLocationByID(int locationID) {
		return repository.getByLocationID(locationID);
	}

	public List<Location> getAllLocation() {
		return repository.findAll();
	}

	public boolean updateLocation(int locationID, Location location) {

		Location foundLocation = repository.getByLocationID(locationID);

		if (foundLocation != null) {
			foundLocation.setLocationName(location.getLocationName());
			foundLocation.setLocationDescription(location.getLocationDescription());
			foundLocation.setStreet(location.getStreet());
			foundLocation.setCity(location.getCity());
			foundLocation.setState(location.getState());
			foundLocation.setZipcode(location.getZipcode());
			foundLocation.setCountry(location.getCountry());
			foundLocation.setLocationLatitude(location.getLocationLatitude());
			foundLocation.setLocationLongitude(location.getLocationLongitude());
			repository.save(foundLocation);
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteLocationByID(int locationID) {
		Location deleteSearch = repository.getByLocationID(locationID);
		if (deleteSearch != null) {
			repository.delete(deleteSearch);
			return true;
		} else {
			return false;
		}
	}


}
