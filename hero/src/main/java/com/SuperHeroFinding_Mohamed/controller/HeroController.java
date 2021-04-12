package com.SuperHeroFinding_Mohamed.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHeroFinding_Mohamed.entity.Hero;
import com.SuperHeroFinding_Mohamed.entity.Organization;
import com.SuperHeroFinding_Mohamed.service.HeroService;
import com.SuperHeroFinding_Mohamed.service.OrgService;

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
		if (!getAllOrg.isEmpty()) {
			mav.addObject("orgListBean", getAllOrg);
		}
		
		mav.addObject("heroList", getAllHeroes);
		return mav; // view file name - index.jsp
	}

//	@RequestMapping("/success") // "/" -> this is the root or home page
//	public String successHandler() {
//		return "success"; // view file name - index.jsp
//	}

	@RequestMapping(value = "addHero", method = RequestMethod.POST)
	public ModelAndView createHeroHandler(@ModelAttribute Hero createKey, @ModelAttribute("orgID") Organization orgID) {
		ModelAndView mav = new ModelAndView("redirect:/addHero");
		List<Hero> getAllHeroes = heroS.getAllHeroes();
		createKey.getOrganizations().add(orgS.getOrgByID(orgID.getOrgID()));
		heroS.addHero(createKey);
		mav.addObject("heroList", getAllHeroes);
		mav.addObject(createKey);
		return heroesHandler();
	}

	@RequestMapping(value = "/deleteHero{HeroID}", method = RequestMethod.GET)
	public ModelAndView deleteHandelerSubmit(@PathVariable("HeroID") Integer heroID) {
		ModelAndView mav = new ModelAndView("redirect:/addHero");
		heroS.deleteHeroByID(heroID);
		return mav; // view file name - contact.jsp
	}
	
	@RequestMapping(value = "/editHero{HeroID}", method = RequestMethod.GET)
	public ModelAndView showEditInfoHandelerSubmit(@PathVariable("HeroID") Integer heroID) {
		ModelAndView mav = new ModelAndView("addHero");
		List<Organization> getAllOrg = orgS.getAllOrg();
		Hero getHero = heroS.getHeroByID(heroID);
		mav.addObject("orgListBean", getAllOrg);
		mav.addObject("hero", getHero);
		return mav; // view file name - contact.jsp
	}
	
	@RequestMapping(value = "/editHero", method = RequestMethod.POST)
	public ModelAndView postEditHandelerSubmit(@ModelAttribute Hero createKey) {
		ModelAndView mav = new ModelAndView("redirect:/addHero");
		
		heroS.updateHero(createKey.getHeroID(), createKey);
		return mav; // view file name - contact.jsp
	}

}
