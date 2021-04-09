package com.SuperHeroFinding_Mohamed;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

//	@Test
//	void testAddOrg() {
//		Organization addOrgTest = new Organization("Fire Nation", "Fire Villan HQ", new Location("test", "test","test", "test", "tt","test","test","test","test"));
//		Organization addedTest = orgS.addOrg(addOrgTest);
//		assertEquals(addOrgTest, addedTest);
//	}

	@Test
	void testGetOrgByID() {
		Organization foundByID = orgS.getOrgByID(38);
		Integer testGotID = foundByID.getOrgID();
		assertEquals(38, testGotID);
	}

	@Test
	void testGetAllOrg() {
		List<Organization> checkListOrg = orgS.getAllOrg();
		assertFalse(checkListOrg.isEmpty());
	}

	@Test
	void testUpdateOrg() {
	Organization updateOrg = new Organization(40, "Fire Nation", "Fire Villan HQ", new Location("test", "test","test", "test", "tt","test","test","test","test"));
	assertTrue(orgS.updateOrg(40, updateOrg));
	}

//	@Test
//	void testDeleteOrgByID() {
//		assertTrue(orgS.deleteOrgByID(42));
//	}

}
