package assigmentSwitchAndArray;

import java.util.Scanner;

public class PhoneProducts {

	public static void main(String[] args) {

		String brandName = "";

		String[] samsung = new String[4];
		String[] google = new String[4];
		String[] apple = new String[4];

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one of the brand name of the phone given below ");
		System.out.println("\t 1.Samsung \t");
		System.out.println("\t 2.Google \t");
		System.out.println("\t 3.Apple \t");
		brandName = sc.next();

		switch (brandName) {

		case "Samsung": {
			System.out.println("Enter the available " + brandName + " products");
			for (int i = 0; i < samsung.length; i++) {

				samsung[i] = sc.next();

			}
			System.out.println("Display the available " + brandName + " products");

			for (int i = 0; i < samsung.length; i++) {

				System.out.println("\t\t  " + samsung[i] + "  \t\t");
				;

			}
			break;
		}

		case "Google": {

			System.out.println("Enter the available " + brandName + " products");
			for (int i = 0; i < google.length; i++) {

				google[i] = sc.next();

			}
			System.out.println("Display the available " + brandName + " products");

			for (int i = 0; i < google.length; i++) {

				System.out.println("\t\t  " + google[i] + "  \t\t");
				;

			}

			break;

		}
		case "Apple": {

			System.out.println("Enter the available " + brandName + " products");
			for (int i = 0; i < apple.length; i++) {

				apple[i] = sc.next();

			}
			System.out.println("Display the available " + brandName + " products");

			for (int i = 0; i < apple.length; i++) {

				System.out.println("\t\t  " + apple[i] + "  \t\t");

			}
			break;
		}
		default:

			System.out.println("Enter the valid input");
		}

		
		//2Q part of the question
		
		
		System.out.println("Enter a product");

		String productName = "";
		productName = sc.next();
		int errorMessage = 0;

		for (int i = 0; i < samsung.length; i++) {

			if (productName.equals(samsung[i])) {
				System.out.println("The product selected is: " + samsung[i]);
				errorMessage = 1;
				break;
			}

		}

		for (int i = 0; i < google.length; i++) {

			if (productName.equals(google[i])) {
				System.out.println("The product selected is: " + google[i]);
				errorMessage = 1;
				break;
			}

		}
		for (int i = 0; i < apple.length; i++) {

			if (productName.equals(apple[i])) {
				System.out.println("The product selected is: " + apple[i]);
				errorMessage = 1;
				break;
			}

		}
		if (errorMessage == 0) {
			System.out.println("Please select a product from the list");
		}
	}
}