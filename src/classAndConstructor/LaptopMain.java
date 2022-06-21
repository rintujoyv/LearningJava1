package classAndConstructor;

public class LaptopMain {

	public static void main(String[] args) {

		// Created an object "sony" for class Laptop or "sony" is an instance of class
		// Laptop
		Laptop sony = new Laptop();

		// Assigning the values to the variable of a class "Laptop" in an object "sony"
		sony.laptopName = "Sony";
		sony.ramSize = "8GB";
		sony.processorType = "Intel core i5";

		// Created an object "acer" for class Laptop
		Laptop acer = new Laptop();

		/*
		 * Passing values in the method "specification" of Object "acer" or calling the
		 * method "specification"of object "acer"
		 */
		acer.specification("Acer", "8GB", "Intel Core i7");

		/* Parameterized Constructor- Assigning the values while creating an object
		"lenova" in class Laptop */
		Laptop lenova = new Laptop("Lenova Chromebook", "16GB", "Intel Core i7");

	}

}
