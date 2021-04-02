package com.SuperHero_Mohamed_Mohamed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHero_Mohamed_Mohamed.entity.Hero;
import com.SuperHero_Mohamed_Mohamed.service.HeroService;
@Controller
public class HeroController {
	@Autowired
	private HeroService heroS;
//	@RequestMapping("/") // "/" -> this is the root or home page
//	public String indexHandler() {
//		return "index"; // view file name - index.jsp
//	}
	
	@RequestMapping("/index") // "/" -> this is the root or home page
	public String homeHandler() {
		return "index"; // view file name - index.jsp
	}
	
	@RequestMapping("/addHero") // "/" -> this is the root or home page
	public ModelAndView heroesHandler() {
		ModelAndView mav = new ModelAndView("addHero");
		
		List<Hero> getAllHeroes = heroS.getAllHeroes();
		mav.addObject("heroList", getAllHeroes);
		
		return mav; // view file name - index.jsp
	}
	
}
