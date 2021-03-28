package com.sHeroMohamed.dao;

import java.util.List;

import com.sHeroMohamed.entity.Hero;

public interface HeroDAO {
	
	//CRUD methods
	
	
	public boolean addHero(Hero hero);
	public Hero getHeroByID(int heroID);
	public List<Hero> getAllHeroes();
	public boolean updateHero(int heroID, Hero hero);
	public boolean deleteHeroById(int heroID);

}
