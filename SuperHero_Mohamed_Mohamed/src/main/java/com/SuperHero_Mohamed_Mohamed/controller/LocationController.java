package com.SuperHero_Mohamed_Mohamed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LocationController {

	@RequestMapping("/addLocation") // "/contactUs" -> this is the href value
	public String locationHandeler() {
		return "addLocation"; // view file name - contact.jsp
	}



}
