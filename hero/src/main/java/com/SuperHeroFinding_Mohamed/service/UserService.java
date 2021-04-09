package com.SuperHeroFinding_Mohamed.service;

import java.util.List;

import com.SuperHeroFinding_Mohamed.entity.User;





public interface UserService {
	//insert new user to the database
		public boolean addNewUser(User user);
		//get user by id
		public User getUserById(Integer id);
		//get all users from the data base
		public List<User> getAllUsers();
		//update user information
		public boolean updateUserById(Integer id, User user);
		//delete user from the database 
		public boolean deleteUserById(Integer id);
		//get user by username
		public User getUserByUserNmae(String username);
}
