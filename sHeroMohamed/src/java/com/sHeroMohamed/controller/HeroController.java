package com.sHeroMohamed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HeroController {
	
	
	@RequestMapping("/") // "/" -> this is the root or home page
	public String indexHandler() {
		return "index"; // view file name - index.jsp
	}
	
	@RequestMapping("/index") // "/" -> this is the root or home page
	public String homeHandler() {
		return "index"; // view file name - index.jsp
	}
	
	@RequestMapping("/heroes") // "/" -> this is the root or home page
	public String heroesHandler() {
		return "heroes"; // view file name - index.jsp
	}
	
}
