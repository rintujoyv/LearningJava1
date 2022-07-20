package missionToMoon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

	public ArrayList<Item> loadItems() throws FileNotFoundException {

		File phaseFile = new File("D:\\Automated testing\\Assignment\\phase-1.txt");
		Scanner sc = new Scanner(phaseFile);
		ArrayList<Item> items = new ArrayList<>();

		while (sc.hasNextLine()) {

			String readLine = sc.nextLine();
			String[] eachItem = readLine.split("=");
			items.add(new Item(eachItem[0], Double.valueOf(eachItem[1])));
		}

		for (Item i : items) {
			System.out.println(i.name + " = " + i.weight);

		}

		return items;

	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {

		ArrayList<Rocket> fleet = new ArrayList<>();

		Rocket rocket = new R1();
		int rocketCount = 1;
		int itemCount = 1;

		System.out.println();
		System.out.println("R1 Rocket weight:" + rocket.rocketWeight);
		System.out.println("R1 Rocket Maximum weight:" + rocket.maxWeight);
		System.out.println();

		for (Item i : items) {

			while (!rocket.canCarry(i)) {

				System.out.println("R1 is full, rocket count is " + rocketCount + ". Loading the next item " + itemCount
						+ ": " + i.name + " = " + i.weight);

				rocketCount++;
				fleet.add(rocket);
				rocket = new R1();

			}

			rocket.carry(i);
			System.out.println("********");
			System.out.println("Item " + itemCount + ": " + i.name + " = " + i.weight + "; Rocket weight = "
					+ rocket.currentWeight + "; Item loaded");

			System.out.println();

			itemCount++;
		}

		fleet.add(rocket);
		System.out.println("R1 fleet contains " + fleet.size() + " rockets");
		return fleet;

	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {

		ArrayList<Rocket> fleet = new ArrayList<>();

		Rocket rocket = new R2();
		int rocketCount = 1;
		int itemCount = 1;

		System.out.println();
		System.out.println("R2 Rocket weight:" + rocket.rocketWeight);
		System.out.println("R2 Rocket Maximum weight:" + rocket.maxWeight);
		System.out.println();

		for (Item i : items) {

			while (!rocket.canCarry(i)) {

				System.out.println("R2 is full, rocket count is " + rocketCount + ". Loading the next item " + itemCount
						+ ": " + i.name + " = " + i.weight);

				rocketCount++;
				fleet.add(rocket);
				rocket = new R2();

			}

			rocket.carry(i);
			System.out.println("********");
			System.out.println("Item " + itemCount + ": " + i.name + " = " + i.weight + "; Rocket weight = "
					+ rocket.currentWeight + "; Item loaded");
			itemCount++;
		}

		fleet.add(rocket);
		System.out.println("R2 fleet contains " + fleet.size() + " rockets");
		return fleet;

	}

	public double runSimulation(ArrayList<Rocket> rockets) {

		int failCount = 0;
		int successCount = 1;

		for (Rocket roc : rockets) {

			while (!roc.hasLaunch()) {

				roc.hasLaunch();
				failCount++;
			}

			// System.out.println("No of rockets Launched: " + successCount + " rocket
			// lanuched");

			while (!roc.hasLand()) {

				roc.hasLand();
				failCount++;

			}

			// System.out.println("No of rockets Landed: " + successCount + " rocket
			// landed");
			successCount++;
		}
		double totalBudget = rockets.get(0).rocketCost * (rockets.size() + failCount);

		System.out.println("No. of rockets crashed of Explode: " + failCount);
		System.out.println("Total no. of rockets: " + rockets.size());

		return totalBudget;

	}

}
