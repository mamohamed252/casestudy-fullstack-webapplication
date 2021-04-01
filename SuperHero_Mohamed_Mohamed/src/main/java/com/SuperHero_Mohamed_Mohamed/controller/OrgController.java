package com.SuperHero_Mohamed_Mohamed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrgController {
	@RequestMapping("/addOrg") // "/contactUs" -> this is the href value
	public String spottingHandeler() {
		return "addOrg"; // view file name - contact.jsp
	}
}
