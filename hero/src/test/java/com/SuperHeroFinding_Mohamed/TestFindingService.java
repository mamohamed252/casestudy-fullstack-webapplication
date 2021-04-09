package com.SuperHeroFinding_Mohamed;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.SuperHeroFinding_Mohamed.entity.Finding;
import com.SuperHeroFinding_Mohamed.repo.FindingRepository;
import com.SuperHeroFinding_Mohamed.service.FindingService;

@SpringBootTest
class TestFindingService {
	Finding testFinding;
	Finding testFindingUpdate;
	@Autowired
	FindingService findingS;
	@Autowired
	FindingRepository repo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception{
		testFinding =  new Finding(Date.valueOf("2000-10-05"), "heroNameTest", "locationName", "orgName");
		findingS.addFinding(testFinding);
		testFindingUpdate =  new Finding(Date.valueOf("2000-10-05"), "heroNameUpdate", "locationName", "orgName");
		findingS.addFinding(testFindingUpdate);
		
	}
	@Test
	@Transactional
	void testAddFinding() {
		Assertions.assertTrue(findingS.addFinding(testFinding)!=null);
	}

	@Test
	@Transactional
	void testGetFindingByID() {
		Finding foundByID = findingS.getFindingByID(47);
		Integer testGotID = foundByID.getFindingID();

		assertEquals(47, testGotID);
	}

	@Test
	void testFindAllByFindingDate() {
		assertNotNull(findingS.findAllByFindingDate(Date.valueOf("2000-10-05")));
	}

	@Test
	@Transactional
	void testGetAllFinding() {
		List<Finding> checkListFinding = findingS.getAllFinding();
		assertFalse(checkListFinding.isEmpty());
	}

	@Test
	@Transactional
	void testUpdateFinding() {
		boolean updateTest = findingS.updateFinding(53, testFindingUpdate);
		assertTrue(updateTest);
	}

	@Test
	@Transactional
	void testDeleteFindingByID() {
		boolean deleteFinding = findingS.deleteFindingByID(62);
		assertTrue(deleteFinding);
	}

}
