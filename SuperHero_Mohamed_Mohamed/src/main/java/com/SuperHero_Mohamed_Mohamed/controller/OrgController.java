package com.SuperHero_Mohamed_Mohamed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
		List<Organization> getallOrg = orgS.getAllOrg();
		List<Location>	getAllLocation = locationS.getAllLocation();
		mav.addObject("locationListBean",getAllLocation);
		mav.addObject("orgList", getallOrg);
		return mav; // view file name - contact.jsp
	}
	
	@RequestMapping("addOrgSubmit")
	public ModelAndView addOrgSubmitHandler(@ModelAttribute Organization orgKey) {
		ModelAndView mav = new ModelAndView("addOrg");
		Organization addOrg = orgS.addOrg(orgKey);
		List<Organization> getallOrg = orgS.getAllOrg();
		mav.addObject("orgList", getallOrg);
		mav.addObject(addOrg);
		
		return addOrgHandeler();
	}
	
	
	
}
