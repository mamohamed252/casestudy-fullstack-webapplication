//package com.SuperHero_Mohamed_Mohamed.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Query;
//
//import com.sHeroMohamed.dao.LocationDAO;
//import com.sHeroMohamed.entity.AbstractConnecetionMDB;
//import com.sHeroMohamed.entity.Location;
//
//public class LocationDAOImpl extends AbstractConnecetionMDB implements LocationDAO {
//
//	@Override
//	public boolean addLocation(Location location) {
//		try {
//			connect();
//			em.getTransaction().begin();
//			em.persist(location);
//			em.getTransaction().commit();
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		} finally {
//			disconnect();
//		}
//	}
//
//	@Override
//	public Location getLocationByID(int locationID) {
//		try {
//			connect();
//			Location location = null;
//			location = em.find(Location.class, locationID);
//			return location;
//		} catch (Exception e) {
//			return null;
//		} finally {
//			disconnect();
//		}
//	}
//
//	@Override
//	public List<Location> getAllLocation() {
//		try {
//			connect();
//			List<Location> allLocation = new ArrayList<Location>();
//			Query query = em.createQuery("SELECT l FROM Location l");
//			allLocation = query.getResultList();
//			return allLocation;
//		} catch (Exception e) {
//			System.out.println("no location");
//			return null;
//		} finally {
//			disconnect();
//		}
//	}
//
//	@Override
//	public boolean updateLocation(int locationID, Location location) {
//		try {
//			connect();
//			em.getTransaction().begin();
//			Location foundLocation = em.find(Location.class, locationID);
//			foundLocation.setCity(location.getCity());
//			foundLocation.setCountry(location.getCountry());
//			foundLocation.setLocationDescription(location.getLocationDescription());
//			foundLocation.setLocationLatitude(location.getLocationLatitude());
//			foundLocation.setLocationLongitude(location.getLocationLongitude());
//			foundLocation.setLocationName(location.getLocationName());
//			em.persist(foundLocation);
//			em.getTransaction().commit();
//			
//		} catch (Exception e) {
//			disconnect();
//			return false;
//		}
//		disconnect();
//		return true;
//	}
//
//	@Override
//	public boolean deleteLocationById(int locationID) {
//		try {
//			connect();
//			em.getTransaction().begin();
//			Location deleteSearch = em.find(Location.class, locationID);
//			em.remove(deleteSearch);
//			em.getTransaction().commit();
//		} catch (Exception e) {
//			disconnect();
//			return false;
//		}
//		disconnect();
//		return true;
//	}
//
//}
