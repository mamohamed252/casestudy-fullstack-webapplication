package com.sHeroMohamed.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sHeroMohamed.entity.AbstractConnecetionMDB;
import com.sHeroMohamed.entity.Finding;
import com.sHeroMohamed.service.FindingDAOImpl;

class FindingServiceTest extends AbstractConnecetionMDB{
static FindingDAOImpl findingS = null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		findingS = new FindingDAOImpl();
		startJDBC (1, "root", "123456");
		dropDatabase();
		createDatabase();
		createTables();
		runSQLFile("findingInsert.sql");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		findingS = null;
		stopJDBC();
	}

	@Test
	void testAddFinding() {
		Finding addFindingTest = new Finding(Date.valueOf("2000-10-05"), 23, 43);
		boolean addedTest = findingS.addFinding(addFindingTest);
		assertTrue(addedTest);
	}

	@Test
	void testGetFindingByID() {
		Finding foundByID = findingS.getFindingByID(15);
		Integer testGotID = foundByID.getFindingID();
		
		assertEquals(15, testGotID);
	}

	@Test
	void testGetAllFinding() {
		List<Finding> checkListFinding = findingS.getAllFinding();
		
		assertFalse(checkListFinding.isEmpty());
	}

	@Test
	void testUpdateFinding() {
		Finding dummyAdd = new Finding(Date.valueOf("2000-06-02"), 12, 53);
		boolean updateTest = findingS.updateFinding(15, dummyAdd);
		assertTrue(updateTest);
	}

	@Test
	void testDeleteHeroById() {
		boolean deleteFinding = findingS.deleteFindingById(34);
		assertTrue(deleteFinding);
	}

}
