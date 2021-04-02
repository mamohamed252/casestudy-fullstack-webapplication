package com.SuperHero_Mohamed_Mohamed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHero_Mohamed_Mohamed.entity.Login;
import com.SuperHero_Mohamed_Mohamed.service.LoginService;

@Controller
public class RegisterController {

	@Autowired
	LoginService loginS;

	@RequestMapping("/register")
	public ModelAndView registerHandler() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}

	@RequestMapping("registerSubmit")
	public ModelAndView registerUserHandler(@ModelAttribute Login loginKey) {
		ModelAndView mav = new ModelAndView("register");
		if (loginKey.getPassword().equals(loginKey.getVerifyPassword())) {
			loginS.addUser(loginKey);
			mav.setViewName("login");
		}
		return mav;
	}
}
