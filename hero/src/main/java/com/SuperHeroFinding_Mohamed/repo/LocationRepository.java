package com.SuperHeroFinding_Mohamed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperHeroFinding_Mohamed.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{

	
	public Location getByLocationID(int locationID);
}
