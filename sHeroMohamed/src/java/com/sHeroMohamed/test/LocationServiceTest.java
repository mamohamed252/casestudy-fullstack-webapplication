package com.sHeroMohamed.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sHeroMohamed.entity.AbstractConnecetionMDB;
import com.sHeroMohamed.service.LocationDAOImpl;

class LocationServiceTest extends AbstractConnecetionMDB {
	static LocationDAOImpl locationS = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		locationS = new LocationDAOImpl();
		startJDBC (1, "root", "123456");
		dropDatabase();
		createDatabase();
		createTables();
		runSQLFile("heroInsert.sql");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testAddLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLocationByID() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteLocationById() {
		fail("Not yet implemented");
	}

}
