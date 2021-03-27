package com.sHeroMohamed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrgController {
	@RequestMapping("/orgs") // "/contactUs" -> this is the href value
	public String spottingHandeler() {
		return "orgs"; // view file name - contact.jsp
	}
}
