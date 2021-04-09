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
		//Location testDummy = locationS.addLocation(new Location("Micro Center", "Computer Store", "3710 Highway 100 South", "St Louis Park", "MN", "55416", "USA", "44.936109", "93.3457114"));
	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

//	@Test
//	void testAddLocation() {
//	Location addLocationTest = new Location("Micro Center", "Computer Store", "3710 Highway 100 South", "St Louis Park", "MN", "55416", "USA", "44.936109", "93.3457114");
//	Location addedTest = locationS.addLocation(addLocationTest);
//		assertTrue(addLocationTest, addedTest);
//		
//
//	}
//
//	@Test
//	void testGetLocationByID() {
//	Location foundByID = locationS.getLocationByID(25);
//		Integer testGotID = foundByID.getLocationID();
//		
//		assertEquals(25, testGotID);
//	}
//
//	@Test
//	void testGetAllLocation() {
//		List<Location> checkListFinding = locationS.getAllLocation();
//		assertFalse(checkListFinding.isEmpty());
//	}
//
//	@Test
//	void testUpdateLocation() {
//	Location addLocationTest = new Location(31,"Micro Center", "Computer Store", "3710 Highway 100 South", "St Louis Park", "MN", "55416", "USA", "44.936109", "93.3457114");
//	Assertions.assertTrue(locationS.updateLocation(31, addLocationTest));
//	}

//	@Test
//	void testDeleteLocationByID() {
//		boolean deleteLocationbyID = locationS.deleteLocationByID(30);
//		assertTrue(deleteLocationbyID);
//	}

}
