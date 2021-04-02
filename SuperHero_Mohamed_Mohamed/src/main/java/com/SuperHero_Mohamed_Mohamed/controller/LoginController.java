package com.SuperHero_Mohamed_Mohamed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHero_Mohamed_Mohamed.entity.Login;
import com.SuperHero_Mohamed_Mohamed.service.LoginService;

@Controller
@RequestMapping(value = "/")
public class LoginController {

	@Autowired
	LoginService loginS;

	@RequestMapping("/")
	    public ModelAndView loginHandler1() {
	        ModelAndView mav = new ModelAndView("login");    
	        return mav;
	}

	@RequestMapping(value = "loginProcess")
	public ModelAndView loginPageHandler(@ModelAttribute Login loginKey) {
		ModelAndView mav = new ModelAndView();

		if (loginS.validateLogin(loginKey.getUsername(), loginKey.getPassword()) != null) {
			mav.setViewName("index");
			mav.addObject(loginKey);
		} else
			mav.setViewName("index");
		return mav;
	}

}
