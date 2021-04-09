package com.SuperHeroFinding_Mohamed;
//package com.SuperHero_Mohamed_Mohamed.test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.List;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import com.sHeroMohamed.entity.AbstractConnecetionMDB;
//import com.sHeroMohamed.entity.Hero;
//import com.sHeroMohamed.service.HeroDAOImpl;
//
//class HeroServiceTest extends AbstractConnecetionMDB {
//	static HeroDAOImpl heroS = null;
//
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//		heroS = new HeroDAOImpl();
//		startJDBC (1, "root", "123456");
//		dropDatabase();
//		createDatabase();
//		createTables();
//		runSQLFile("heroInsert.sql");
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//		heroS = null;
//		stopJDBC();
//	}
//
//	@Test
//	void testAddHero() {
//		Hero addTestH = new Hero("TestName", "Des", "Pow", "Hero", null);
//
//		boolean actual = heroS.addHero(addTestH);
//
//		assertTrue(actual);
//	}
//
//	@Test
//	void testGetHeroByID() {
//		Hero foundHero = heroS.getHeroByID(10);
//
//		Integer testIdGot = foundHero.getHeroID();
//
//		assertEquals(10, testIdGot);
//	}
//
//	@Test
//	void testGetAllHeroes() {
//		List<Hero> checkList = heroS.getAllHeroes();
//		// if not empty > then it's in DB.
//		assertFalse(checkList.isEmpty());
//	}
//
//	@Test
//	void testUpdateHero() {
//		Hero dummyHTest = new Hero("TestUpdate", "Des", "Pow", "Hero", null);
//		boolean updateHTest = heroS.updateHero(17, dummyHTest);
//		assertTrue(updateHTest);
//
//	}
//
//	@Test
//	void testDeleteHeroById() {
//
//		boolean deletedH = heroS.deleteHeroById(15);
//		assertTrue(deletedH);
//	}
//
//	@Test
//	void testGetAllHeroesByNameQuery() {
//		List<Hero> getAllByNameTest = heroS.getAllHeroesByNameQuery("TestName");
//		assertFalse(getAllByNameTest.isEmpty());
//	}
//
//}
