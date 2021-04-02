package com.SuperHero_Mohamed_Mohamed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperHero_Mohamed_Mohamed.entity.Finding;

@Repository
public interface FindingRepository extends JpaRepository<Finding, String>{

	public Finding getByFindingID(int findingID);
}
