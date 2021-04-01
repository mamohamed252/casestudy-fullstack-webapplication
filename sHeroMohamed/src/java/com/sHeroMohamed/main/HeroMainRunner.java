package com.sHeroMohamed.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.sHeroMohamed.entity.Finding;
import com.sHeroMohamed.entity.Hero;
import com.sHeroMohamed.service.FindingDAOImpl;
import com.sHeroMohamed.service.HeroDAOImpl;

public class HeroMainRunner {

	static HeroDAOImpl heroDaoService = new HeroDAOImpl();
	static FindingDAOImpl findingDaoService = new FindingDAOImpl();
	List<Hero> list = new ArrayList<Hero>();
	static Hero hero = new Hero();
	static Finding finding = new Finding();
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {

		int option = 0;
		while (option != 12) {
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
				addFinding();
				break;
			case 8:
				showFindingByID();
				break;
			case 9:
				editFinding();
				break;
			case 10:
				 deleteFinding();
				break;
			case 11:
				getAllFinding();
				break;
			case 12:
			
				break;
			}
		}

	}

	private static void getAllFinding() {
		System.out.printf("%-10s %-45s %-10s %-10s\n", "findingID", "findingDate", "heroID", "locationID");
		
		for (Finding findingDaoS : findingDaoService.getAllFinding()) {
			System.out.printf("%-10d %-45tc %-10d %-10d\n",findingDaoS.getFindingID(), findingDaoS.getFindingDate(), findingDaoS.getHeroID(), findingDaoS.getLocationID());
		}
		
	}

	private static void deleteFinding() {
		System.out.println("Enter ID: ");
		int id = reader.nextInt();
		if (findingDaoService.deleteFindingById(id)) {
			System.out.println("ID:" + id + " Finding Deleted");
		} else {
			System.out.println("try again");
		}
		
	}

	private static void editFinding() throws ParseException {
		System.out.println("Enter ID:");
		Finding findingUpdate = new Finding();
		int id = reader.nextInt();
		findingUpdate.setFindingID(id);
		reader.nextLine();
		System.out.println("Enter Date: dd-MM-yyyy");
		Scanner reader = new Scanner(System.in);
	    String date = reader.nextLine();
	    Date date1 =new SimpleDateFormat("dd-MM-yyyy").parse(date);
		
	    findingUpdate.setFindingDate(date1);
		
		
		if (findingDaoService.updateFinding(id, findingUpdate)) {
			System.out.println("Added Finding");
		} else {
			System.out.println("No finding added");
		}

		
	}

	private static void showFindingByID() {
		System.out.println("Enter Finding ID: ");
		int id = reader.nextInt();
		Finding findingDaoS = findingDaoService.getFindingByID(id);
		System.out.printf("%-10s %-45s %-10s %-10s\n", "findingID", "findingDate", "heroID", "locationID");
		System.out.printf("%-10d %-45tc %-10d %-10d\n",findingDaoS.getFindingID(), findingDaoS.getFindingDate(), findingDaoS.getHeroID(), findingDaoS.getLocationID());
		
	}

	private static void addFinding() throws ParseException {
		reader.nextLine();
		System.out.println("Enter ID:");
		finding.setFindingID(reader.nextInt());
		reader.nextLine();
		System.out.println("Enter Date: dd-MM-yyyy");
		Scanner reader = new Scanner(System.in);
	    String date = reader.nextLine();
	    Date date1 =new SimpleDateFormat("dd-MM-yyyy").parse(date);
		
		finding.setFindingDate(date1);
		
		System.out.println("Enter Hero ID:");
		finding.setHeroID(reader.nextInt());
		
		System.out.println("Enter Location ID:");
		finding.setLocationID(reader.nextInt());
		
		if (findingDaoService.addFinding(finding)) {
			System.out.println("Added Finding");
		} else {
			System.out.println("No finding added");
		}

	}

	private static void getHeroByName() {
		// TODO Auto-generated method stub
		reader.nextLine();
		System.out.println("Enter name:");
		String name = reader.nextLine();
		heroDaoService.getAllHeroesByNameQuery(name).stream()
				.forEach(heroDaoS -> System.out.printf("%-10d %-30s %-10s %-10s %-10s\n", heroDaoS.getHeroID(),
						heroDaoS.getHeroDescription(), heroDaoS.getHeroName(), heroDaoS.getHeroStatus(),
						heroDaoS.getSuperPower()));
	}

	private static void deleteHeroById() {
		System.out.println("Enter ID: ");
		int id = reader.nextInt();
		if (heroDaoService.deleteHeroById(id)) {
			System.out.println("ID:" + id + " Hero Deleted");
		} else {
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
		System.out.println("Enter Hero Status: Hero or Villan");
		heroUpdate.setHeroStatus(reader.nextLine());
		System.out.println("Enter Super Power: ");
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
		System.out.println("Enter Hero ID: ");
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
		System.out.println("Enter Hero Status: Hero or Villan");
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
		System.out.println("7. Add a finding");
		System.out.println("8. Show finding by ID");
		System.out.println("9. Edit a finding");
		System.out.println("10. Delete Finding");
		System.out.println("11. Get All Finding");
		System.out.println("12. add location");
		System.out.println("13. getLocationByID");
		System.out.println("14. getAllLocation");
		System.out.println("15. updateLocation");
		
		
		System.out.println("12. Quit");
	}

}
