package com.sHeroMohamed.dao;

import java.util.List;


import com.sHeroMohamed.entity.Location;

public interface LocationDAO {
	public boolean addLocation(Location location);
	public Location getLocationByID(int locationID);
	public List<Location> getAllLocation();
	public boolean updateLocation(int locationID, Location location);
	public boolean deleteLocationById(int locationID);

}
