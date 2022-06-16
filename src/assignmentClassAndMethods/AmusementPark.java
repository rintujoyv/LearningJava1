package assignmentClassAndMethods;

import java.util.Scanner;

public class AmusementPark {

	public static void main(String[] args) {
		
		//Creating an object
		
		AmusmentParkRide rollerCoaster = new AmusmentParkRide();
		
		
		Person rintu = new Person();
		rintu.height=35;
		rintu.weight= 98;
		rintu.postToFacebook("Wonderland");
		
		//Check Eligibilty of rintu for Rollercoaster
		
		rollerCoaster.isEligible(rintu.height, rintu.weight);

	}

}
