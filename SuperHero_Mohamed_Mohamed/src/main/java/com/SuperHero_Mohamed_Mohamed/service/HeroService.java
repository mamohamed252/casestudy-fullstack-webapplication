package com.SuperHero_Mohamed_Mohamed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.SuperHero_Mohamed_Mohamed.entity.Hero;
import com.SuperHero_Mohamed_Mohamed.repo.HeroRepository;

@Service
public class HeroService {

	@Autowired
	HeroRepository repository;

	public Hero addHero(Hero hero) {
		return repository.save(hero);
		
	}

	public Hero getHeroByID(int heroID) {

		return repository.getByHeroID(heroID);
	}

	public List<Hero> getAllHeroes() {

		return repository.findAll();
	}

	public boolean updateHero(int heroID, Hero hero) {
		Hero getHero = repository.getByHeroID(heroID);

		if (getHero != null) {
			getHero.setHeroDescription(hero.getHeroDescription());
			getHero.setHeroName(hero.getHeroName());
			getHero.setHeroStatus(hero.getHeroStatus());
			getHero.setSuperPower(hero.getSuperPower());
			repository.save(getHero);
			return true;
		}else {
			return false;
		}
	}

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
