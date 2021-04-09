package com.SuperHeroFinding_Mohamed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperHeroFinding_Mohamed.entity.Organization;

@Repository
public interface OrgRepository extends JpaRepository<Organization, Integer>{

	 Organization getByOrgID(int orgID);
}
