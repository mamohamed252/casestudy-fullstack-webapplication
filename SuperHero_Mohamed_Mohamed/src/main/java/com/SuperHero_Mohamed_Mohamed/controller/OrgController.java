package com.SuperHero_Mohamed_Mohamed.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		List<Location> getAllLocation = locationS.getAllLocation();
		mav.addObject("locationListBean", getAllLocation);
		mav.addObject("orgList", getallOrg);
		mav.addObject("organization", new Organization());
		
		return mav; // view file name - contact.jsp
	}

	@RequestMapping(value="addOrgSubmit", method = RequestMethod.POST)
	public ModelAndView addOrgSubmitHandler(@ModelAttribute @Valid Organization orgKey, 
		 BindingResult errors) {
		ModelAndView mav = new ModelAndView("success");
		System.out.println("1111" + orgKey);
		
		
		if (orgKey.getLocation() != null) {
			System.out.println("222222222222222222222" +orgKey.getLocation().getLocationID());
		}
		if(errors.hasErrors()){
			return new ModelAndView("login");
		}
		
		Organization addOrg = orgS.addOrg(orgKey);
		System.out.println("2222" + orgKey);
		List<Organization> getallOrg = orgS.getAllOrg();
		mav.addObject("orgList", getallOrg);
		mav.addObject(addOrg);

		return addOrgHandeler();
	}


}
