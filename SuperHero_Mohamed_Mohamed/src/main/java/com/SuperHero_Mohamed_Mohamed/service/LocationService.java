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
	
	public List<Location> getAllLocation(){
		return repository.findAll();
	}
	
	public boolean updateLocation(int locationID, Location location) {
		return false;
	}
}
