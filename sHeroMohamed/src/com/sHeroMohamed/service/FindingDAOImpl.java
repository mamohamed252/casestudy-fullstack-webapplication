package com.sHeroMohamed.service;

import java.util.List;

import com.sHeroMohamed.dao.FindingDAO;
import com.sHeroMohamed.entity.AbstractConnecetionMDB;
import com.sHeroMohamed.entity.Finding;


public class FindingDAOImpl extends AbstractConnecetionMDB implements FindingDAO{

	@Override
	public boolean addFinding(Finding finding) {
		try {
			connect();
			em.getTransaction().begin();
			em.persist(finding);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			disconnect();
		}
	}

	@Override
	public Finding getFindingByID(int findingID) {
		try {
			connect();
			Finding finding = null;
			finding = em.find(Finding.class, findingID);
			return finding;
		} catch (Exception e) {
			return null;
		}finally {
			disconnect();
		}
	}

	@Override
	public List<Finding> getAllFinding() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateFinding(int findingID, Finding finding) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteHeroById(int findingID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Finding> getAllFindingByNameQuery(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

}
