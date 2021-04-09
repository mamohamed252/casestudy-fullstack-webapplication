package com.SuperHeroFinding_Mohamed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperHeroFinding_Mohamed.entity.Hero;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer>{

	public Hero getByHeroID (int heroID);

}
