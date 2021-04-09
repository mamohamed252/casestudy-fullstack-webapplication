package com.SuperHeroFinding_Mohamed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperHeroFinding_Mohamed.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String>{

		Login getLoginByUsername(String username);
}
