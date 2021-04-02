package com.SuperHero_Mohamed_Mohamed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperHero_Mohamed_Mohamed.entity.Organization;

@Repository
public interface OrgRepository extends JpaRepository<Organization, String>{

}
