package com.SuperHero_Mohamed_Mohamed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FindingController {
	@RequestMapping("/spotting") // "/contactUs" -> this is the href value
	public String spottingHandeler() {
		return "spotting"; // view file name - contact.jsp
	}

}
