package com.SuperHero_Mohamed_Mohamed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FindingController {
	@RequestMapping("/finding") // "/contactUs" -> this is the href value
	public String spottingHandeler() {
		return "finding"; // view file name - contact.jsp
	}

}
