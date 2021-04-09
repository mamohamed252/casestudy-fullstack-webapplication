package com.SuperHero_Mohamed_Mohamed.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHero_Mohamed_Mohamed.entity.Hero;
import com.SuperHero_Mohamed_Mohamed.entity.Location;
import com.SuperHero_Mohamed_Mohamed.entity.Organization;
import com.SuperHero_Mohamed_Mohamed.service.LocationService;
import com.SuperHero_Mohamed_Mohamed.service.OrgService;

@Controller
public class OrgController {

	@Autowired
	private OrgService orgS;
	@Autowired
	private LocationService locationS;

	@RequestMapping("/addOrg") // "/contactUs" -> this is the href value
	public ModelAndView addOrgHandeler() {
		ModelAndView mav = new ModelAndView("addOrg");
		List<Organization> allOrgList = orgS.getAllOrg();
		List<Location> allLocationList = locationS.getAllLocation();
		if (!allOrgList.isEmpty()) {
			mav.addObject("orgList", allOrgList);
		}
		mav.addObject("locationList", allLocationList);
		return mav; // view file name - contact.jsp
	}

//	@RequestMapping(value = "addOrg", method = RequestMethod.GET)
//	public ModelAndView addOrgSubmitHandler(HttpServletRequest request) {
//		ModelAndView mav = new ModelAndView("addOrg");
//		Organization orgKey = new Organization();
//		orgKey.setOrgName(request.getParameter("orgName"));
//		orgKey.setOrgDescription(request.getParameter("orgDescription"));
//		if (request.getParameter("location")!=null) {
//			orgKey.setLocation(locationS.getLocationByID(Integer.parseInt(request.getParameter("location"))));	
//		}
//		
//		orgS.addOrg(orgKey);
//		return addOrgHandeler();
//	}

	@RequestMapping(value = "addOrg", method = RequestMethod.POST)
	public ModelAndView addOrg(@RequestParam("orgName") String orgName, @RequestParam("orgDescription") String orgDescription, @RequestParam("locationID") Integer locationID) {
		ModelAndView mav = new ModelAndView("addOrg");
		Organization orgKey = new Organization();
		List<Organization> allOrgList = orgS.getAllOrg();
		List<Location> allLocationList = locationS.getAllLocation();
		orgKey.setOrgName(orgName);
		orgKey.setOrgDescription(orgDescription);
		orgKey.setLocation(locationS.getLocationByID(locationID));
		mav.addObject("locationList", allLocationList);
		mav.addObject("orgList", allOrgList);
		orgS.addOrg(orgKey);
		return mav;
	}

	@RequestMapping(value = "/deleteOrg{OrgID}", method = RequestMethod.GET)
	public ModelAndView deleteHandelerSubmit(@PathVariable("OrgID") Integer orgID) {
		ModelAndView mav = new ModelAndView("redirect:/addOrg");
		orgS.deleteOrgByID(orgID);
		return mav; // view file name - contact.jsp
	}

	@RequestMapping(value = "/editOrg{HeroID}", method = RequestMethod.GET)
	public ModelAndView showEditInfoHandelerSubmit(@PathVariable("OrgID") Integer orgID) {
		ModelAndView mav = new ModelAndView("addOrg");
		List<Organization> getAllOrg = orgS.getAllOrg();
		Organization getOrg = orgS.getOrgByID(orgID);
		mav.addObject("organization", getOrg);
		return mav; // view file name - contact.jsp
	}

	@RequestMapping(value = "/editOrg", method = RequestMethod.POST)
	public ModelAndView postEditHandelerSubmit(@ModelAttribute Organization orgKey) {
		ModelAndView mav = new ModelAndView("redirect:/addOrg");
		orgS.updateOrg(orgKey.getOrgID(), orgKey);
		return mav; // view file name - contact.jsp
	}

}
