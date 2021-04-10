package com.SuperHeroFinding_Mohamed.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SuperHeroFinding_Mohamed.entity.User;
import com.SuperHeroFinding_Mohamed.service.UserService;

@Controller
public class RegisterController {

	@Autowired
	UserService us;

	@RequestMapping("/register")
	public ModelAndView registerHandler() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}

//	@RequestMapping("signup")
//	public ModelAndView registerUserHandler(@ModelAttribute User user) {
//		ModelAndView mav = new ModelAndView("register");
//		us.addNewUser(user);
//		return mav;
//	}

	// register new user to the database
	@PostMapping(value = "/signup")
	public ModelAndView signupNewAccount(@ModelAttribute @Valid User user, BindingResult bindingResult,
			@RequestParam("passCon") String passCon) {
		ModelAndView mav = new ModelAndView("register");
		// check the user information validity
		if (bindingResult.hasErrors()) {
			// check if there is any error related to the user name field
			if (bindingResult.getFieldError("userName") != null) {
				mav.addObject("nameError", bindingResult.getFieldError("userName").getDefaultMessage());
			}
			// check if there is any errors related to the email field
			if (bindingResult.getFieldError("email") != null) {
				mav.addObject("emailError", bindingResult.getFieldError("email").getDefaultMessage());
			}
			// check if there is any errors related to the password field
			if (bindingResult.getFieldError("password") != null) {
				mav.addObject("passError", bindingResult.getFieldError("password").getDefaultMessage());
			}

			String message = "Register Account Failed";
			mav.addObject("message", message);
		}
		// check if the password matches the confirmation password field
		else if (!user.getPassword().equals(passCon)) {
			String conPassError = "Password does not match";
			mav.addObject("conPassError", conPassError);
			String message = "Register new account failed";
			mav.addObject("message", message);
		}
		// if all the validations are passed register the new user account
		else {

			us.addNewUser(user);
			String message = "Registered successefully";
			mav.addObject("message", message);
		}
		return mav;
	}

}
