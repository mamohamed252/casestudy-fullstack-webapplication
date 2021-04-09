package com.SuperHeroFinding_Mohamed.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperHeroFinding_Mohamed.entity.Finding;

@Repository
public interface FindingRepository extends JpaRepository<Finding, String>{

	public Finding getByFindingID(int findingID);
	public Finding findAllByFindingDate(Date findingDate);
}
