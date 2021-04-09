package com.SuperHeroFinding_Mohamed.hero;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JDBCTest {

	public static void main(String[] args) {

		testDBConnection();
	}

	private static void testDBConnection() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sHeroMohamed");
		EntityManager em = emf.createEntityManager();
		
		String msg = em.isOpen()?"Connected DB":"Not Connected";
		System.out.println(msg);
		
		em.close();
		emf.close();
	}

}
