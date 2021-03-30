package com.sHeroMohamed.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.sHeroMohamed.dao.FindingDAO;
import com.sHeroMohamed.entity.AbstractConnecetionMDB;
import com.sHeroMohamed.entity.Finding;
import com.sHeroMohamed.entity.Hero;

public class FindingDAOImpl extends AbstractConnecetionMDB implements FindingDAO {

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
		} finally {
			disconnect();
		}
	}

	@Override
	public List<Finding> getAllFinding() {
		try {
			connect();
			List<Finding> allFindings = new ArrayList<Finding>();
			Query query = em.createQuery("SELECT f FROM Finding f");// JPQL
			allFindings = query.getResultList();
			return allFindings;

		} catch (Exception e) {
			System.out.println("no findings");
			return null;
		} finally {
			disconnect();
		}
	}

	@Override
	public boolean updateFinding(int findingID, Finding finding) {

		try {
			connect();
			em.getTransaction().begin();
			Finding findingFound = em.find(Finding.class, findingID);
			findingFound.setFindingDate(finding.getFindingDate());
			em.persist(findingFound);
			em.getTransaction().commit();
			return true;

		} catch (Exception e) {
			return false;
		} finally {
			disconnect();
		}

	}

	@Override
	public boolean deleteFindingById(int findingID) {
		try {
			connect();
			em.getTransaction().begin();
			Finding deleteSearch = em.find(Finding.class, findingID);
			em.remove(deleteSearch);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			disconnect();
		}

	}

}
