package com.SuperHero_Mohamed_Mohamed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperHero_Mohamed_Mohamed.repo.HeroRepository;

@Service
public class HeroService {

	@Autowired
	HeroRepository respository;
	
	
}
