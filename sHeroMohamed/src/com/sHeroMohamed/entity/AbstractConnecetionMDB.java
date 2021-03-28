package com.sHeroMohamed.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractConnecetionMDB {
//	private final String url = "jdbc:mariadb://localhost:3306/users";
//	private final String user = "root";
//	private final String password = "root";
	
	final static String PERSISTENCEUNITNAME = "sHeroMohamed";
	protected static EntityManagerFactory emf = null;
	protected static EntityManager em = null;
	
//	protected Connection con = null;
//	protected PreparedStatement ps = null;
//	protected ResultSet rs = null;
	public static void connect(){
		emf = Persistence.createEntityManagerFactory(PERSISTENCEUNITNAME);
		em = emf.createEntityManager();
	}
	
	
	public static void disconnect() {
		if(em != null) {
			em.close();
		}
		if(emf != null) {
			emf.close();
		}	
	}
}
