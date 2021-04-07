package com.SuperHero_Mohamed_Mohamed.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHero_Mohamed_Mohamed.entity.Hero;
import com.SuperHero_Mohamed_Mohamed.entity.Organization;
import com.SuperHero_Mohamed_Mohamed.service.HeroService;
import com.SuperHero_Mohamed_Mohamed.service.OrgService;

@Controller
public class HeroController {
	@Autowired
	private HeroService heroS;
	
	@Autowired
	private OrgService orgS;
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
		List<Organization> getAllOrg = orgS.getAllOrg();
		mav.addObject("orgListBean",getAllOrg);
		mav.addObject("heroList", getAllHeroes);
		return mav; // view file name - index.jsp
	}

//	@RequestMapping("/success") // "/" -> this is the root or home page
//	public String successHandler() {
//		return "success"; // view file name - index.jsp
//	}

	@RequestMapping(value="createHero", method=RequestMethod.GET)
	public ModelAndView createHeroHandler(@ModelAttribute Hero createKey, @ModelAttribute("orgID") Organization orgID) {
		ModelAndView mav = new ModelAndView("addHero");
		List<Hero> getAllHeroes = heroS.getAllHeroes();
		Hero addHero =heroS.addHero(createKey);
		//List<Organization> orgList = new ArrayList<Organization>();
		//addHero.setOrganizations(orgList);
		addHero.getOrganizations().add(orgS.getOrgByID(orgID.getOrgID()));
		heroS.addHero(addHero);
		mav.addObject("heroList", getAllHeroes);
		mav.addObject(addHero);
		mav.setViewName("success");
		return mav;
	}

}
