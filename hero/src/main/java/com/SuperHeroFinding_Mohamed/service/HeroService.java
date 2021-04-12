package com.SuperHeroFinding_Mohamed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SuperHeroFinding_Mohamed.entity.Hero;
import com.SuperHeroFinding_Mohamed.repo.HeroRepository;

@Service
public class HeroService {

	@Autowired
	HeroRepository repository;

	@Transactional
	public Hero addHero(Hero hero) {
		return repository.save(hero);
		
	}
	
	@Transactional
	public Hero getHeroByID(int heroID) {

		return repository.getByHeroID(heroID);
	}

	@Transactional
	public List<Hero> getAllHeroes() {

		return repository.findAll();
	}

	@Transactional
	public boolean updateHero(int heroID, Hero hero) {
		Hero getHero = repository.getByHeroID(heroID);

		if (getHero != null) {
			getHero.setHeroDescription(hero.getHeroDescription());
			getHero.setHeroName(hero.getHeroName());
			getHero.setHeroStatus(hero.getHeroStatus());
			getHero.setSuperPower(hero.getSuperPower());
			getHero.setOrganizations(hero.getOrganizations());
			getHero.setPicture(hero.getPicture());
			repository.save(getHero);
			return true;
		}else {
			return false;
		}
	}

	@Transactional
	public boolean deleteHeroByID(int heroID) {
		Hero deleteSearch = repository.getByHeroID(heroID);
		if (deleteSearch != null) {
			repository.delete(deleteSearch);
			return true;
		}else {
			return false;
		}
	}
}
