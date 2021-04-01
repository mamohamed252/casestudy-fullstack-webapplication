package com.sHeroMohamed.dao;

import java.util.List;

import com.sHeroMohamed.entity.Finding;


public interface FindingDAO {

	public boolean addFinding(Finding finding);
	public Finding getFindingByID(int findingID);
	public List<Finding> getAllFinding();
	public boolean updateFinding(int findingID, Finding finding);
	public boolean deleteFindingById(int findingID);
	
}
