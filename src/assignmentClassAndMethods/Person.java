package assignmentClassAndMethods;

public class Person {

	int height;
	int weight;

	void isEligible() {

		if ((height < 90 || height > 200) || (weight < 15 || weight > 95)) {

			System.out.println("Person is not allowed to board the ride");

		
		} else {

			System.out.println("Person is allowed to board the ride");
		}

	}
		
		}


