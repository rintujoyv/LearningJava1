package assignmentsubmission3;

import java.util.Scanner;

public class CovidRestrictions {

	public static void main(String[] args) {

		int maxPeopleCapacity = 50;
		
		int peopleCurrentlyInShop = 0; // Values should be always less than or equal to 50
		System.out.println("Enter the people currently in the shop");
		Scanner sc = new Scanner(System.in);
		peopleCurrentlyInShop = sc.nextInt();
		
		int peopleLeavingTheShop = 0;
		System.out.println("Enter the people leaving from the shop");
		peopleLeavingTheShop = sc.nextInt();
		
		int peopleWaitingToEnter = 0;
		System.out.println("Enter the people waiting to enter in to the shop");
		peopleWaitingToEnter = sc.nextInt();
		
		
		
		int remainingPeopleCapacity = (peopleCurrentlyInShop - peopleLeavingTheShop) + peopleWaitingToEnter;

		while (remainingPeopleCapacity < maxPeopleCapacity) {

			if (peopleLeavingTheShop > peopleCurrentlyInShop) {

				System.out.println("Invalid data Entry");

				break;
			}

			System.out.println("Number of people in the shop is: " + remainingPeopleCapacity);

			remainingPeopleCapacity = maxPeopleCapacity - remainingPeopleCapacity;

			System.out.println("Number of people can enter into the shop: " + remainingPeopleCapacity);

			break;

		}

		if (remainingPeopleCapacity > maxPeopleCapacity) {

			remainingPeopleCapacity = maxPeopleCapacity - (remainingPeopleCapacity - peopleWaitingToEnter);

			System.out.println("Number of People can enter into the shop: " + remainingPeopleCapacity);
			System.out.println("Remaining people waiting to enter: "+ (peopleWaitingToEnter- remainingPeopleCapacity));

			System.out.println("Maximum capacity reached");

		}

	}

}
