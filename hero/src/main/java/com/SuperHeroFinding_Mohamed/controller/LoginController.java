package com.SuperHeroFinding_Mohamed.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHeroFinding_Mohamed.entity.User;
import com.SuperHeroFinding_Mohamed.service.UserServiceImp;


@Controller
@RequestMapping(value = "/")
public class LoginController {
	@Autowired
	UserServiceImp us;
	@RequestMapping("/login")
	public ModelAndView loginHandler1() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
}
