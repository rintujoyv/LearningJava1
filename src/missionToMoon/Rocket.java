package missionToMoon;

import java.util.ArrayList;

public class Rocket implements Spaceship {

	int rocketCost;
	double rocketWeight;
	double maxWeight;
	double chanceToLaunchExplosion;
	double chanceToLandCrash;

	double currentWeight = 0;

	public ArrayList<Item> items = new ArrayList<>();

	@Override
	public boolean hasLaunch() {

		return true;

	}

	@Override
	public boolean hasLand() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		if ((currentWeight + item.weight) <= (maxWeight)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void carry(Item item) {

		// items.add(item);

		currentWeight = currentWeight + item.getWeight();

		// System.out.println("Updated weight of the item: " + currentWeight);

	}
}
