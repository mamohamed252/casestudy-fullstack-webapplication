package com.SuperHero_Mohamed_Mohamed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperHero_Mohamed_Mohamed.entity.Hero;

@Repository
public interface HeroRepository extends JpaRepository<Hero, String>{

}
