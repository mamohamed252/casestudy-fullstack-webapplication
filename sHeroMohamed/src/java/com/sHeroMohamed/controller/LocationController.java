package com.sHeroMohamed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LocationController {

	@RequestMapping("/location") // "/contactUs" -> this is the href value
	public String locationHandeler() {
		return "location"; // view file name - contact.jsp
	}



}
