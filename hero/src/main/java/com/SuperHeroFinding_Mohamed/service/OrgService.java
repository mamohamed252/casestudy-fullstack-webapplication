package com.SuperHeroFinding_Mohamed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperHeroFinding_Mohamed.entity.Organization;
import com.SuperHeroFinding_Mohamed.repo.OrgRepository;

@Service
public class OrgService {

	@Autowired
	OrgRepository repository;

	public Organization addOrg(Organization org) {
		return repository.save(org);
		 
	}
	
	public Organization getOrgByID(int orgID) {
		return repository.getByOrgID(orgID);
	}
	
	public List<Organization> getAllOrg(){
		return repository.findAll();
	}
	
	public boolean updateOrg(int orgID, Organization org) {
	
		Organization updateOrg = repository.getByOrgID(orgID);
		
		if (updateOrg != null) {
			updateOrg.setOrgName(org.getOrgName());
			updateOrg.setOrgDescription(org.getOrgDescription());
			repository.save(updateOrg);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deleteOrgByID(int orgID) {
		Organization deleteSearch = repository.getByOrgID(orgID);
		if (deleteSearch != null) {
			repository.delete(deleteSearch);
			return true;
		}else {
			return false;
		}
	}

}
