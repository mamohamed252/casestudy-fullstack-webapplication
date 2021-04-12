package com.SuperHeroFinding_Mohamed;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.SuperHeroFinding_Mohamed.entity.Location;
import com.SuperHeroFinding_Mohamed.repo.LocationRepository;
import com.SuperHeroFinding_Mohamed.service.LocationService;



@SpringBootTest
class TestLocationService {
	@Autowired
	LocationService locationS;
	@Autowired
	LocationRepository repo;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	@BeforeEach
	void setUpBefore() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	@Transactional
	void testAddLocation() {
	Location addLocationTest = new Location(5,"Micro Center", "Computer Store", "3710 Highway 100 South", "St Louis Park", "MN", "55416", "USA", "44.936109", "93.3457114");
	Assertions.assertFalse(locationS.addLocation(addLocationTest)==null);
		

	}

	@Test
	@Transactional
	void testGetLocationByID() {
	Location foundByID = locationS.getLocationByID(26);
		Integer testGotID = foundByID.getLocationID();
		
		assertEquals(26, testGotID);
	}

	@Test
	@Transactional
	void testGetAllLocation() {
		List<Location> checkListFinding = locationS.getAllLocation();
		assertFalse(checkListFinding.isEmpty());
	}

	@Test
	@Transactional
	void testUpdateLocation() {
	Location addLocationTest = new Location(26,"Micro Center", "Computer Store", "3710 Highway 100 South", "St Louis Park", "MN", "55416", "USA", "44.936109", "93.3457114");
	Assertions.assertTrue(locationS.updateLocation(26, addLocationTest));
	}

	@Test
	@Transactional
	void testDeleteLocationByID() {
		boolean deleteLocationbyID = locationS.deleteLocationByID(26);
		assertTrue(deleteLocationbyID);
	}

}
