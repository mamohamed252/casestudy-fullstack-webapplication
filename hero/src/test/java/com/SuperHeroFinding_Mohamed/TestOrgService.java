package com.SuperHeroFinding_Mohamed;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.SuperHeroFinding_Mohamed.entity.Location;
import com.SuperHeroFinding_Mohamed.entity.Organization;
import com.SuperHeroFinding_Mohamed.service.OrgService;

@SpringBootTest
class TestOrgService {
	@Autowired
	OrgService orgS;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	@Transactional
	void testAddOrg() {
		Organization addOrgTest = new Organization("Fire Nation", "Fire Villan HQ", new Location("test", "test","test", "test", "tt","test","test","test","test"));
		Organization addedTest = orgS.addOrg(addOrgTest);
		assertEquals(addOrgTest, addedTest);
	}

	@Test
	@Transactional
	void testGetOrgByID() {
		Organization foundByID = orgS.getOrgByID(38);
		Integer testGotID = foundByID.getOrgID();
		assertEquals(38, testGotID);
	}

	@Test
	@Transactional
	void testGetAllOrg() {
		List<Organization> checkListOrg = orgS.getAllOrg();
		assertFalse(checkListOrg.isEmpty());
	}

	@Test
	@Transactional
	void testUpdateOrg() {
	Organization updateOrg = new Organization(38, "Fire Nation", "Fire Villan HQ", new Location("test", "test","test", "test", "tt","test","test","test","test"));
	assertTrue(orgS.updateOrg(38, updateOrg));
	}

	@Test
	@Transactional
	void testDeleteOrgByID() {
		assertTrue(orgS.deleteOrgByID(38));
	}

}
