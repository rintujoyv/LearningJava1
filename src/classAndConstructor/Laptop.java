package classAndConstructor;

public class Laptop {

	// Declaring the class level variables
	String laptopName;
	String ramSize;
	String processorType;

	// No argument constructor
	Laptop() {

	}

	// Parameterized method defined
	void specification(String name, String size, String processor) {

		laptopName = name;
		ramSize = size;
		processorType = processor;

	}

	// Parameterized Constructor defined
	Laptop(String name, String size, String processor) {

		laptopName = name;
		ramSize = size;
		processorType = processor;

	}

}
