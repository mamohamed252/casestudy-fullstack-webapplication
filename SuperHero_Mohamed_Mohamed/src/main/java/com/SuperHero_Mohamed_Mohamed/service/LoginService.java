package com.SuperHero_Mohamed_Mohamed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperHero_Mohamed_Mohamed.entity.Login;
import com.SuperHero_Mohamed_Mohamed.repo.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository repository;
	
	
	public Login addUser(Login user) {
		return repository.save(user);
	}
	
	public Login validateLogin(String username, String password) {
		Login userLogin = repository.getLoginByUsername(username);
		if (userLogin!=null) {
			if (userLogin.getUsername().equals(password)) {
				return userLogin;	
			}
		}
		return null;
		

		
	}
}
