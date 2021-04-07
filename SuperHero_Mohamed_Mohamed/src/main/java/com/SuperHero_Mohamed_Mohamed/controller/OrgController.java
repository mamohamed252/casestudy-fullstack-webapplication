package com.SuperHero_Mohamed_Mohamed.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		List<Organization> allOrgList = orgS.getAllOrg();
		List<Location> allLocationList = locationS.getAllLocation();
		mav.addObject("locationListBean", allLocationList);
		mav.addObject("orgList", allOrgList);
		mav.addObject("organization", new Organization());
		
		return mav; // view file name - contact.jsp
	}

	@RequestMapping(value="addOrgSubmit", method = RequestMethod.GET)
	public ModelAndView addOrgSubmitHandler( HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("success");
		System.out.println(request.getParameter("orgName"));
        System.out.println(request.getParameter("orgDescription"));
        System.out.println(request.getParameter("location"));
        Organization orgKey = new Organization();
        orgKey.setOrgName(request.getParameter("orgName"));
        orgKey.setOrgDescription(request.getParameter("orgDescription"));
        orgKey.setLocation(locationS.getLocationByID(Integer.parseInt(request.getParameter("location"))));
        orgS.addOrg(orgKey);


		return addOrgHandeler();
	}


}
