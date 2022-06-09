package assigmentSwitchAndArray;

import java.util.Scanner;

public class PhoneProducts {

	public static void main(String[] args) {

		String brandName = "";
		String productName = "";
		String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] google = {"GooglePixel6", "GooglePixel6pro", "GooglePixelPro", "GooglePixel5" };
		String[] apple = {"Iphone12", "Iphone12mini", "Iphone11", "Iphone11Pro" };
		int errorMessage = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one of the brand name of the phone given below ");
		System.out.println("\t 1.Samsung \t");
		System.out.println("\t 2.Google \t");
		System.out.println("\t 3.Apple \t");
		brandName = sc.next();

		switch (brandName) {

		case "Samsung": {

			System.out.println("Display the available " + brandName + " products");

			for (int i = 0; i < samsung.length; i++) {

				System.out.println("\t\t  " + samsung[i] + "  \t\t");
			}
			System.out.println("Enter a product");
			productName = sc.next();

			for (int i = 0; i < samsung.length; i++) {

				if (productName.equals(samsung[i])) {
					System.out.println("The product selected is: " + samsung[i]);
					errorMessage = 1;

				}
			}

			break;
		}

		case "Google": {

			System.out.println("Display the available " + brandName + " products");

			for (int i = 0; i < google.length; i++) {

				System.out.println("\t\t  " + google[i] + "  \t\t");
				;

			}
			System.out.println("Enter a product");
			productName = sc.next();
			for (int i = 0; i < google.length; i++) {

				if (productName.equals(google[i])) {
					System.out.println("The product selected is: " + google[i]);
					errorMessage = 1;

				}
			}

			break;

		}
		case "Apple": {

			System.out.println("Display the available " + brandName + " products");

			for (int i = 0; i < apple.length; i++) {

				System.out.println("\t\t  " + apple[i] + "  \t\t");

			}
			System.out.println("Enter a product");
			productName = sc.next();

			for (int i = 0; i < apple.length; i++) {

				if (productName.equals(apple[i])) {
					System.out.println("The product selected is: " + apple[i]);
					errorMessage = 1;

				}
			}
			break;
		}
		default:

			System.out.println("Enter the valid input");
		}

		if (errorMessage == 0) {
			System.out.println("Please select a product from the list");
		}
	}
}