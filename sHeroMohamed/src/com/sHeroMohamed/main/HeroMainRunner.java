package com.sHeroMohamed.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sHeroMohamed.entity.Hero;
import com.sHeroMohamed.service.HeroDAOImpl;

public class HeroMainRunner {

	static HeroDAOImpl heroDaoService = new HeroDAOImpl();
	List<Hero> list = new ArrayList<Hero>();
	static Hero hero = new Hero();
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int option = 0;
		while (option != 7) {
			menu();
			System.out.println("select menu:");
			option = reader.nextInt();
			switch (option) {
			case 1:
				addHero();

				break;
			case 2:
				getHeroByID();
				break;
			case 3:
				getAllHeroes();
				break;
			case 4:

				updateHero();
				break;
			case 5:
				deleteHeroById();
				break;
			case 6:
				 getHeroByName();
				break;
			case 7:
				break;
			}
		}

	}

	private static void getHeroByName() {
		// TODO Auto-generated method stub
		reader.nextLine();
		System.out.println("Enter name:");
		String name = reader.nextLine();
		heroDaoService.getAllHeroesByNameQuery(name)
		.stream()
		.forEach(heroDaoS -> System.out.printf("%-10d %-30s %-10s %-10s %-10s\n", heroDaoS.getHeroID(), heroDaoS.getHeroDescription(),
				heroDaoS.getHeroName(), heroDaoS.getHeroStatus(), heroDaoS.getSuperPower()));
	}

	private static void deleteHeroById() {
		System.out.println("Enter ID: ");
		int id = reader.nextInt();
		if (heroDaoService.deleteHeroById(id)) {
			System.out.println("ID:"+ id + " Hero Deleted");
		}else {
			System.out.println("try again");
		}
		
	}

	private static void updateHero() {
		System.out.println("Enter ID: ");
		int id = reader.nextInt();

		Hero heroUpdate = new Hero();
		heroUpdate.setHeroID(id);
		reader.nextLine();
		System.out.println("Enter Name:");
		heroUpdate.setHeroName(reader.nextLine());
		System.out.println("Enter Hero Description:");
		heroUpdate.setHeroDescription(reader.nextLine());
		System.out.println("Enter Hero Status: A for Active or R for Retired");
		heroUpdate.setHeroStatus(reader.nextLine());
		System.out.println("Enter Super Power:");
		heroUpdate.setSuperPower(reader.nextLine());
		if (heroDaoService.updateHero(id, heroUpdate)) {
			System.out.println("Updated hero");
		} else {
			System.out.println("try again");
		}

	}

	private static void getAllHeroes() {
		System.out.printf("%-10s %-30s %-10s %-10s %-10s\n", "heroID", "heroDescription", "heroName", "heroStatus",
				"superPower");

		for (Hero hero : heroDaoService.getAllHeroes()) {
			System.out.printf("%-10d %-30s %-10s %-10s %-10s\n", hero.getHeroID(), hero.getHeroDescription(),
					hero.getHeroName(), hero.getHeroStatus(), hero.getSuperPower());
		}

	}

	private static void getHeroByID() {
		System.out.println("Enter ID: ");
		int id = reader.nextInt();
		Hero heroDaoS = heroDaoService.getHeroByID(id);
		System.out.printf("%-10s %-30s %-10s %-10s %-10s\n", "heroID", "heroDescription", "heroName", "heroStatus",
				"superPower");
		System.out.printf("%-10d %-30s %-10s %-10s %-10s\n", heroDaoS.getHeroID(), heroDaoS.getHeroDescription(),
				heroDaoS.getHeroName(), heroDaoS.getHeroStatus(), heroDaoS.getSuperPower());
	}

	private static void addHero() {
		reader.nextLine();
		System.out.println("Enter ID:");
		hero.setHeroID(reader.nextInt());
		reader.nextLine();

		System.out.println("Enter Name:");
		hero.setHeroName(reader.nextLine());
		System.out.println("Enter Hero Description:");
		hero.setHeroDescription(reader.nextLine());
		System.out.println("Enter Hero Status:");
		hero.setHeroStatus(reader.nextLine());
		System.out.println("Enter Super Power:");
		hero.setSuperPower(reader.nextLine());
		if (heroDaoService.addHero(hero)) {
			System.out.println("Added hero");
		} else {
			System.out.println("No hero added");
		}

	}

	public static void menu() {
		System.out.println("Choose an action:");
		System.out.println("1. Add Hero to System");
		System.out.println("2. Get Hero By Id");
		System.out.println("3. Get All Hero");
		System.out.println("4. Update Hero");
		System.out.println("5. Remove Hero");
		System.out.println("6. Show By Name");
		System.out.println("7. Quit");
	}

}
