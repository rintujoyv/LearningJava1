package assignmentClassAndMethods;

public class AmusmentParkRide {
	
	//String parkName= "Wonderland";
	
	void isEligible(int height, int weight) {

		if ((height < 90 || height > 200) || (weight < 15 || weight > 95)) {

			System.out.println("Person is not allowed to board the ride");

		} else {

			System.out.println("Person is allowed to board the ride");
		}

	}
		

}
