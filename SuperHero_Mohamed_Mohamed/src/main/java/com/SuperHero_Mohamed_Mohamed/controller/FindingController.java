package com.SuperHero_Mohamed_Mohamed.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHero_Mohamed_Mohamed.entity.Finding;
import com.SuperHero_Mohamed_Mohamed.entity.Hero;
import com.SuperHero_Mohamed_Mohamed.entity.Location;
import com.SuperHero_Mohamed_Mohamed.entity.Organization;
import com.SuperHero_Mohamed_Mohamed.service.FindingService;
import com.SuperHero_Mohamed_Mohamed.service.HeroService;
import com.SuperHero_Mohamed_Mohamed.service.LocationService;
import com.SuperHero_Mohamed_Mohamed.service.OrgService;

@Controller
public class FindingController {
	@Autowired
	private FindingService findingS;
	@Autowired
	private OrgService orgS;
	@Autowired
	private LocationService locationS;
	@Autowired
	private HeroService heroS;
//	//Dynamic Api Map Finding
//	@RequestMapping("/addFinding") // "/contactUs" -> this is the href value
//	public ModelAndView findingHandeler() {
//		ModelAndView mav = new ModelAndView("addFinding");
//		
//		List<Finding> findingList = findingS.getAllFinding();
//		List<Organization> allOrgList = orgS.getAllOrg();
//		List<Location> allLocationList = locationS.getAllLocation();
//		List<Hero> allHeroList = heroS.getAllHeroes();
//		mav.addObject("heroList", allHeroList);
//		mav.addObject("locationList", allLocationList);
//		mav.addObject("orgList", allOrgList);
//		mav.addObject("organization", new Organization());
//		mav.addObject(findingList);
//		return mav; // view file name - contact.jsp
//	}
//	
//	
//	//Dynamic Api Map Finding
//	@RequestMapping(value="addFindingSubmit", method = RequestMethod.GET)
//	public ModelAndView addFindingSubmit(HttpServletRequest request) {
//		ModelAndView mav = new ModelAndView("addFinding");
//		Finding findKey = new Finding();
//		Date date1;
//		System.out.println(request.getParameter("findingDate"));
//		try {
//			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("findingDate"));
//			findKey.setFindingDate(date1);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			System.out.println("5555555555");
//			e.printStackTrace();
//		}
//	
//		findKey.setHeroName(request.getParameter("heroName"));
//		findKey.setLocationName(request.getParameter("locationName"));
//		//findKey.setLocationID(locationS.getLocationByID(Integer.parseInt(request.getParameter("locationID"))).getLocationID());
//		findingS.addFinding(findKey);
//		return findingHandeler();
//	}

	// Static Finding
	@RequestMapping("/addFindingStatic") // "/contactUs" -> this is the href value
	public ModelAndView findingStaticHandeler() {
		ModelAndView mav = new ModelAndView("addFindingStatic");

		List<Finding> findingList = findingS.getAllFinding();
		List<Organization> allOrgList = orgS.getAllOrg();
		List<Location> allLocationList = locationS.getAllLocation();
		List<Hero> allHeroList = heroS.getAllHeroes();
		mav.addObject("heroList", allHeroList);
		mav.addObject("locationList", allLocationList);
		mav.addObject("orgList", allOrgList);
		mav.addObject("organization", new Organization());
		mav.addObject("FindingList", findingList);
		return mav; // view file name - contact.jsp
	}

	// Static Finding
	@RequestMapping(value = "addFindingStatic", method = RequestMethod.POST)
	public ModelAndView addFindingStatic(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("addFindingStatic");
		Finding findKey = new Finding();
		Date date1;
		System.out.println(request.getParameter("findingDate"));
		try {
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("findingDate"));
			findKey.setFindingDate(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		findKey.setHeroName(request.getParameter("heroName"));
		findKey.setLocationName(request.getParameter("locationName"));
		findKey.setOrgName(request.getParameter("orgName"));
		// findKey.setLocationID(locationS.getLocationByID(Integer.parseInt(request.getParameter("locationID"))).getLocationID());
		findingS.addFinding(findKey);
		return findingStaticHandeler();
	}

	// static
	// commit github 12:10Am 4/9/2021
	@RequestMapping(value = "/deleteFindingStatic{FindingID}", method = RequestMethod.GET)
	public ModelAndView deleteHandelerSubmit(@PathVariable("FindingID") Integer findingID) {
		ModelAndView mav = new ModelAndView("redirect:/addFindingStatic");
		findingS.deleteFindingByID(findingID);
		return mav; // view file name - contact.jsp
	}

	@RequestMapping(value = "/editFindingStatic{FindingID}", method = RequestMethod.GET)
	public ModelAndView showEditInfoHandelerSubmit(@PathVariable("FindingID") Integer findingID) {
		ModelAndView mav = new ModelAndView("addFindingStatic");
		List<Finding> findingList = findingS.getAllFinding();
		List<Organization> allOrgList = orgS.getAllOrg();
		List<Location> allLocationList = locationS.getAllLocation();
		List<Hero> allHeroList = heroS.getAllHeroes();
		Finding getFinding = findingS.getFindingByID(findingID);
		mav.addObject("heroList", allHeroList);
		mav.addObject("locationList", allLocationList);
		mav.addObject("orgList", allOrgList);
		mav.addObject("finding", getFinding);
		mav.addObject(findingList);
		return mav; // view file name - contact.jsp
	}

	@RequestMapping(value = "/editFindingStatic", method = RequestMethod.POST)
	public ModelAndView postEditHandelerSubmit(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("redirect:/addFindingStatic");
		Finding findKey = new Finding();
		Date date1;
		System.out.println(request.getParameter("findingDate"));
		try {
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("findingDate"));
			findKey.setFindingDate(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		findKey.setHeroName(request.getParameter("heroName"));
		findKey.setLocationName(request.getParameter("locationName"));
		findKey.setOrgName(request.getParameter("orgName"));
		findKey.setFindingID(Integer.parseInt(request.getParameter("findingID")));
		
		findingS.updateFinding(findKey.getFindingID(), findKey);
		return mav; // view file name - contact.jsp

	}

}
