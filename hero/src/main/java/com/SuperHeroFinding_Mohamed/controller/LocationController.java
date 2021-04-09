package com.SuperHeroFinding_Mohamed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHeroFinding_Mohamed.entity.Hero;
import com.SuperHeroFinding_Mohamed.entity.Location;
import com.SuperHeroFinding_Mohamed.entity.Organization;
import com.SuperHeroFinding_Mohamed.service.LocationService;
@Controller
public class LocationController {

	@Autowired
	private LocationService locationS;
	
	@RequestMapping("/addLocation") // "/contactUs" -> this is the href value
	public ModelAndView locationHandeler() {
		ModelAndView mav = new ModelAndView("addLocation");
		
		List<Location> getAllLocation = locationS.getAllLocation();
		if (!getAllLocation.isEmpty()) {
			mav.addObject("locationList", getAllLocation);
		}
		
		
		return mav; 
	}
	
	@RequestMapping(value ="addLocation", method = RequestMethod.POST)
	public ModelAndView addLocationSubmit(@ModelAttribute Location addLocationKey) {
		ModelAndView mav = new ModelAndView("addLocation");
		Location addLocation = locationS.addLocation(addLocationKey);
		List<Location> getAllLocation = locationS.getAllLocation();
		mav.addObject("locationList", getAllLocation);
		mav.addObject(addLocation);
		return mav;
	}
	
	
	@RequestMapping(value = "/deleteLocation{LocationID}", method = RequestMethod.GET)
	public ModelAndView deleteHandelerSubmit(@PathVariable("LocationID") Integer locationID) {
		ModelAndView mav = new ModelAndView("redirect:/addLocation");
		locationS.deleteLocationByID(locationID);
		return mav; // view file name - contact.jsp
	}
	
	@RequestMapping(value = "/editLocation{LocationID}", method = RequestMethod.GET)
	public ModelAndView showEditInfoHandelerSubmit(@PathVariable("LocationID") Integer locationID) {
		ModelAndView mav = new ModelAndView("addLocation");
		List<Location> getAllLocation = locationS.getAllLocation();
		Location getLocation = locationS.getLocationByID(locationID);
		mav.addObject("locationList", getAllLocation);
		mav.addObject("location", getLocation);
		return mav; // view file name - contact.jsp
	}
	
	@RequestMapping(value = "/editLocation", method = RequestMethod.POST)
	public ModelAndView postEditHandelerSubmit(@ModelAttribute Location addLocationKey) {
		ModelAndView mav = new ModelAndView("redirect:/addLocation");
		locationS.updateLocation(addLocationKey.getLocationID(), addLocationKey);
		return mav; // view file name - contact.jsp
	}
	



}
