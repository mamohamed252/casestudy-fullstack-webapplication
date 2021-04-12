package com.SuperHeroFinding_Mohamed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.SuperHeroFinding_Mohamed.entity.Hero;
import com.SuperHeroFinding_Mohamed.repo.HeroRepository;
import com.SuperHeroFinding_Mohamed.service.HeroService;
@SpringBootTest
class TestHeroService {

	@Autowired
	HeroService heroS;
	@Autowired
	HeroRepository repo;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	@Transactional
	void testAddHero() {
		Hero addHero = new Hero("TestName", "testDesc", "TestPower", "Hero", "TestPicture");
		Hero getHeroID = new Hero("TestNameID", "testDesc", "TestPower", "Hero", "TestPicture");
		Hero deleteHero = new Hero("TestNameDelete", "testDesc", "TestPower", "Hero", "TestPicture");
		Assertions.assertFalse(heroS.addHero(addHero)==null);
		Assertions.assertFalse(heroS.addHero(getHeroID)==null);
		Assertions.assertFalse(heroS.addHero(deleteHero)==null);
	}

	@Test
	@Transactional
	void testGetHeroByID() {
		Hero getHero = new Hero(9,"TestNameID", "testDesc", "TestPower", "Hero", "TestPicture");
		
		Assertions.assertEquals(getHero, heroS.getHeroByID(9));
	}

	@Test
	@Transactional
	void testGetAllHeroes() {
		Assertions.assertFalse(heroS.getAllHeroes().isEmpty());
	}

	@Test
	@Transactional
	void testUpdateHero() {
		Hero updateHero = new Hero(9,"TestNameUpdate", "testDesc", "TestPower", "Hero", "TestPicture");
		
		Assertions.assertTrue(heroS.updateHero(9, updateHero));
	}

	@Test
	@Transactional
	void testDeleteHeroByID() {
		Assertions.assertTrue(heroS.deleteHeroByID(9));
	}

}
