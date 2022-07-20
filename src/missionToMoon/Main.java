package missionToMoon;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		// Create a Simulation object
		Simulation sim = new Simulation();

		// Load Items for phase-1
		ArrayList<Item> phase1 = sim.loadItems();

		// Load a fleet of R1 rockets for Phase-1
		ArrayList<Rocket> fleetR1 = sim.loadU1(phase1);

		// Load a fleet of R2 rockets for Phase-1
		ArrayList<Rocket> fleetR2 = sim.loadU2(phase1);

		// Run the simulation using the fleet of R1 rockets and display the total budget
		// required
		System.out.println("\nR1 rocket cost = $100");
		double budgetR1 = sim.runSimulation(fleetR1);
		System.out.println(" Total budget of R1 fleet = $" + budgetR1 + " Million");

		// Run the simulation using the fleet of R2 rockets and display the total budget
		// required
		System.out.println("\nR2 rocket cost = $120");

		double budgetR2 = sim.runSimulation(fleetR2);
		System.out.println("Total budget of R2 fleet = $" + budgetR2 + " Million");

	}

}
