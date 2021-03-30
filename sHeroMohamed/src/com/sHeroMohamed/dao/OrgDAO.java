package com.sHeroMohamed.dao;

import java.util.List;

import com.sHeroMohamed.entity.Organization;



public interface OrgDAO {
	public boolean addOrg(Organization org);
	public Organization getOrgByID(int orgID);
	public List<Organization> getAllOrg();
	public boolean updateOrg(int orgID, Organization org);
	public boolean deleteOrgById(int orgID);

}
