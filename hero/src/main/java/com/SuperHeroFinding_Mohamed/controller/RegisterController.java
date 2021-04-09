package com.SuperHeroFinding_Mohamed.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHeroFinding_Mohamed.entity.User;
import com.SuperHeroFinding_Mohamed.service.UserService;
@Controller
public class RegisterController {

	@Autowired
	UserService userS;

	@RequestMapping("/register")
	public ModelAndView registerHandler() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}

	   @RequestMapping("signup")
	    public ModelAndView registerUserHandler(@ModelAttribute User user) {
	        ModelAndView mav = new ModelAndView("register");
	        userS.addNewUser(user);
			return mav;
	   }      
}
