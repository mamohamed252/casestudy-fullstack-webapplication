package com.SuperHero_Mohamed_Mohamed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperHero_Mohamed_Mohamed.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String>{

		Login getLoginByUsername(String username);
}
