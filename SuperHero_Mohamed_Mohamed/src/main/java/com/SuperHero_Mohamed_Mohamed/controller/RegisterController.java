package com.SuperHero_Mohamed_Mohamed.controller;

import javax.servlet.http.HttpServletRequest;

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
	    public ModelAndView registerUserHandler(@ModelAttribute Login user, HttpServletRequest request) {
	        ModelAndView mav = new ModelAndView("register");
	        if(user.getPassword().equals(user.getVerifyPassword()) && user.getPassword().length() > 4) {
	            if(loginS.getUser(user.getUsername()) != null) {
	                request.setAttribute("usernameMessage", "Username already taken, please use another.");
	                request.getRequestDispatcher("/register");
	            } else {
	            	loginS.addUser(user);
	                mav.setViewName("login");
	            }
	        } else {
	            request.setAttribute("message", "\"Password\" field must match \"Verify Password\" field. Please try again.");
	            if(user.getPassword().length() < 7) {
	                request.setAttribute("passwordMessage", "\"Password\" must be greater than 6 characters.");
	                request.getRequestDispatcher("/register");
	            }
	        }
			return mav;
	   }      
}
