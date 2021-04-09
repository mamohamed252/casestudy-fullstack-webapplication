package com.SuperHeroFinding_Mohamed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SuperHeroFinding_Mohamed.entity.MyUserDetails;
import com.SuperHeroFinding_Mohamed.entity.User;
import com.SuperHeroFinding_Mohamed.repo.UserRepository;





@Service
public class MyUserDetailsService implements UserDetailsService {
	
	
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    	User user = userRepository.getUserByUsername(userName);

    	if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
         
        return new MyUserDetails(user);
    }  
}
