package assignmentsubmission3;

import java.util.Scanner;

public class OntarioLicense {

	public static void main(String[] args) {

		int age = 0;
		System.out.println("Enter the age of person");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();

		System.out.println("Enter the current License of the person");
		String currentLicense = "";

		currentLicense = sc.next();

		String eligibleLicenseLevel1 = "G1";
		String eligibleLicenseLevel2 = "G2";
		String eligibleLicenseLevel3 = "G";

		if (age >= 16 && currentLicense.equals(eligibleLicenseLevel1)) {

			System.out.println("The current level of license is: " + currentLicense);
			System.out.println(
					"The person will be elgible for: " + eligibleLicenseLevel2 + " and " + eligibleLicenseLevel3);

		} else if (age >= 16 && currentLicense.equals(eligibleLicenseLevel2)) {

			System.out.println("The current level of license is: " + currentLicense);
			System.out.println("The person will be elgible for: " + eligibleLicenseLevel3);

		} else if (age >= 16 && currentLicense.equals(eligibleLicenseLevel3)) {

			System.out.println("The person already have the highest level of License: " + currentLicense);

		} else if (age >= 16 && currentLicense.equals("null")) {

			System.out.println("The person will be elgible for License: " + eligibleLicenseLevel1);
		} else {

			System.out.println("The person is not eligible for License");
		}

	}
}
