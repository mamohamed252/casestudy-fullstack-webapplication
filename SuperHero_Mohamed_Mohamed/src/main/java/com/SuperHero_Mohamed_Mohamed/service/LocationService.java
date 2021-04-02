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

	public boolean addLocation(Location location) {
		repository.save(location);
		return true;
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
			foundLocation.setCity(location.getCity());
			foundLocation.setCountry(location.getCountry());
			foundLocation.setLocationDescription(location.getLocationDescription());
			foundLocation.setLocationLatitude(location.getLocationLatitude());
			foundLocation.setLocationLongitude(location.getLocationLongitude());
			foundLocation.setLocationName(location.getLocationName());
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
