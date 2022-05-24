package assigment3;

public class CovidRestrictions {

	public static void main(String[] args) {

		int maxPeopleCapacity = 50;
		int peopleCurrentlyInShop = 49; //Values should be less than or equal to 50
		int peopleWaitingToEnter = 6;
		int peopleLeavingTheShop = 0;
		
		
		
		int remainingPeopleCapacity = (peopleCurrentlyInShop - peopleLeavingTheShop) + peopleWaitingToEnter;

		
		
		while (remainingPeopleCapacity < maxPeopleCapacity) {
			
			if(peopleLeavingTheShop > peopleCurrentlyInShop) {
				
				System.out.println("Invalid data Entry");
				break;
			}

			System.out.println("Remaining people in the shop is: " + remainingPeopleCapacity);

			remainingPeopleCapacity = maxPeopleCapacity - remainingPeopleCapacity;

			System.out.println("People can enter the shop: " + remainingPeopleCapacity);
			break;

		}

		if (remainingPeopleCapacity >= maxPeopleCapacity) {

			remainingPeopleCapacity = maxPeopleCapacity - (remainingPeopleCapacity - peopleWaitingToEnter);

			System.out.println("Number of People can enter the shop: " + remainingPeopleCapacity);

			System.out.println("Maximum capacity reached");

		}

	}

}
