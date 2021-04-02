package com.SuperHero_Mohamed_Mohamed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperHero_Mohamed_Mohamed.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, String>{

	
	public Location getByLocationID(int locationID);
}
