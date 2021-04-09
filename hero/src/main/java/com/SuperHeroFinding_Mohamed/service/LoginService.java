package com.SuperHeroFinding_Mohamed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperHeroFinding_Mohamed.entity.Login;
import com.SuperHeroFinding_Mohamed.repo.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository repository;
	
	
	public Login addUser(Login user) {
		return repository.save(user);
	}
	
	public Login getUser(String user) {
		return repository.getLoginByUsername(user);
	}
	
	public Login validateLogin(String username, String password) {
		Login userLogin = repository.getLoginByUsername(username);
		if (userLogin!= null) {
			if (userLogin.getPassword().equals(password)) {
				return userLogin;	
			}
		}
		return null;
	}
}
