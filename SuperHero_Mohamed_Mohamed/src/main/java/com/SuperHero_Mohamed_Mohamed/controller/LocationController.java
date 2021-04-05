package com.SuperHero_Mohamed_Mohamed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHero_Mohamed_Mohamed.entity.Location;
import com.SuperHero_Mohamed_Mohamed.service.LocationService;
@Controller
public class LocationController {

	@Autowired
	private LocationService locationS;
	
	@RequestMapping("/addLocation") // "/contactUs" -> this is the href value
	public ModelAndView locationHandeler() {
		ModelAndView mav = new ModelAndView("addLocation");
		
		List<Location> getAllLocation = locationS.getAllLocation();
		mav.addObject("locationList", getAllLocation);
		return mav; // view file name - contact.jsp
	}
	
	@RequestMapping("addLocationSubmit")
	public ModelAndView addLocationSubmit(@ModelAttribute Location addLocationKey) {
		ModelAndView mav = new ModelAndView("addLocation");
		Location addLocation = locationS.addLocation(addLocationKey);
		List<Location> getAllLocation = locationS.getAllLocation();
		mav.addObject("locationList", getAllLocation);
		mav.addObject(addLocation);
		mav.setViewName("addLocation");
		return mav;
	}
	



}
