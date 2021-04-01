package com.SuperHero_Mohamed_Mohamed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SuperHero_Mohamed_Mohamed.service.HeroService;
@Controller
public class HeroController {
	
	private HeroService heroS;
	@RequestMapping("/") // "/" -> this is the root or home page
	public String indexHandler() {
		return "index"; // view file name - index.jsp
	}
	
	@RequestMapping("/index") // "/" -> this is the root or home page
	public String homeHandler() {
		return "index"; // view file name - index.jsp
	}
	
	@RequestMapping("/addHero") // "/" -> this is the root or home page
	public String heroesHandler() {
		return "addHero"; // view file name - index.jsp
	}
	
}
