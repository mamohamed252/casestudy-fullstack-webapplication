//package com.SuperHero_Mohamed_Mohamed.entity;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public abstract class AbstractConnecetionMDB {
////	private final String url = "jdbc:mariadb://localhost:3306/users";
////	private final String user = "root";
////	private final String password = "root";
//
//	final static String PERSISTENCEUNITNAME = "sHeroMohamed";
//	protected static EntityManagerFactory emf = null;
//	protected static EntityManager em = null;
//
////	protected Connection con = null;
////	protected PreparedStatement ps = null;
////	protected ResultSet rs = null;
//
//	private static final String DATABASE_NAME = "superherofindingmohamed";
//	private static Connection connection;
//	private static Statement statement;
//
//	public static void connect() {
//		emf = Persistence.createEntityManagerFactory(PERSISTENCEUNITNAME);
//		em = emf.createEntityManager();
//	}
//
//	public static void disconnect() {
//		if (em != null) {
//			em.close();
//		}
//		if (emf != null) {
//			emf.close();
//		}
//	}
//
//	public static boolean runSQLFile(String filePath) {
//		try {
//			connect();
//			try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./resources/sql/" + filePath))) {
//				StringBuffer query = new StringBuffer();
//				String line;
//				while ((line = bufferedReader.readLine()) != null) {
//					query.append(line);
//					if (line.contains(";")) {
//						em.getTransaction().begin();
//						em.createNativeQuery(query.toString()).executeUpdate();
//						em.getTransaction().commit();
//						query = new StringBuffer();
//					}
//				}
//				disconnect();
//				return true;
//			} catch (Exception e) {
//				// e.printStackTrace();
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		disconnect();
//		return false;
//	}
//
//	public static boolean createTables() {
//		boolean ret = false;
//		try{ 
//			connect();
//			em.getTransaction().begin();
//			em.getTransaction().commit();
//			ret = true;
//		} catch(Exception e) {
//			//e.printStackTrace();
//		}
//		disconnect();
//		return ret;
//	}
//
//	// JDBC methods
//
//	public static boolean startJDBC(int databaseType, String user, String pass) {
//		try {
//			String dbUrl = null;
//			// 1. mariadb
//			// 2. mysql
//			if (databaseType == 1) {
//				DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
//				dbUrl = "jdbc:mariadb://localhost:3306/";
//			} else {
//				//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//				//dbUrl = "jdbc:mysql://localhost:3306/";
//			}
//			connection = DriverManager.getConnection(dbUrl, user, pass);
//			return true;
//		} catch (Exception e) {
//			System.out.println("Please make sure you have configured the persistence.xml file with");
//			System.out.println("your database details and that your database program is running.");
//		}
//		return false;
//	}
//
//	public static boolean stopJDBC() {
//		try {
//			statement.close();
//			connection.close();
//			return true;
//		} catch (Exception e) {
//			// e.printStackTrace();
//		}
//		return false;
//	}
//
//	public static boolean createDatabase() {
//		try {
//			statement = connection.createStatement();
//			statement.execute("CREATE database IF NOT EXISTS " + DATABASE_NAME);
//			statement.execute("USE " + DATABASE_NAME);
//			return true;
//		} catch (Exception e) {
//			// e.printStackTrace();
//		}
//		return false;
//	}
//
//	public static boolean dropDatabase() {
//		try {
//			statement = connection.createStatement();
//			statement.execute("DROP database IF EXISTS " + DATABASE_NAME);
//			return true;
//		} catch (Exception e) {
//			// e.printStackTrace();
//		}
//		return false;
//	}
//}
