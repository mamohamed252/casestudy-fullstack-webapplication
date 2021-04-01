package com.sHeroMohamed.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.sHeroMohamed.dao.HeroDAO;
import com.sHeroMohamed.entity.AbstractConnecetionMDB;
import com.sHeroMohamed.entity.Hero;

public class HeroDAOImpl extends AbstractConnecetionMDB implements HeroDAO {

	@Override
	public boolean addHero(Hero hero) {
		try {
			connect();
			em.getTransaction().begin();
			em.persist(hero);
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
	public Hero getHeroByID(int heroID) {

		try {
			connect();
			Hero hero = null;
			hero = em.find(Hero.class, heroID);
			return hero;
		} catch (Exception e) {
			return null;
		} finally {
			disconnect();
		}

	}

	@Override
	public List<Hero> getAllHeroes() {

		try {
			connect();
			List<Hero> allHeroes = new ArrayList<Hero>();
			Query query = em.createQuery("SELECT h FROM Hero h");// JPQL
			allHeroes = query.getResultList();
			return allHeroes;

		} catch (Exception e) {
			System.out.println("no heroes");
			return null;
		} finally {
			disconnect();
		}

	}

	@Override
	public boolean updateHero(int heroID, Hero hero) {
		try {
			connect();
			em.getTransaction().begin();
			Hero foundHero = em.find(Hero.class, heroID);
			foundHero.setHeroDescription(hero.getHeroDescription());
			foundHero.setHeroName(hero.getHeroName());
			foundHero.setHeroStatus(hero.getHeroStatus());
			foundHero.setSuperPower(hero.getSuperPower());
			em.persist(foundHero);
			em.getTransaction().commit();
			return true;

		} catch (Exception e) {
			return false;
		} finally {
			disconnect();
		}
	}

	@Override
	public boolean deleteHeroById(int heroID) {

		try {
			connect();
			em.getTransaction().begin();
			Hero deleteSearch = em.find(Hero.class, heroID);
			em.remove(deleteSearch);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			disconnect();
		}

	}

	@Override
	public List<Hero> getAllHeroesByNameQuery(String Name) {
		try {
			connect();
			List<Hero> allHeroes = new ArrayList<Hero>();
			Query query = em.createNamedQuery("getHeroByName");
			query.setParameter("heroName", Name);
			allHeroes = query.getResultList();
			return allHeroes;
		} catch (Exception e) {
			System.out.println("no heroes");
			return null;
		} finally {
			disconnect();
		}
	}

}
