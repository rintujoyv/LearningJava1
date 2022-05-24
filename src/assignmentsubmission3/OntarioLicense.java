package assignmentsubmission3;

public class OntarioLicense {

	public static void main(String[] args) {

		int age = 30;
		String currentLicense = "G2";
		String eligibleLicenseLevel1 = "G1";
		String eligibleLicenseLevel2 = "G2";
		String eligibleLicenseLevel3 = "G";
		String noLicense = "null";

		if (age >= 16 && currentLicense.equals(eligibleLicenseLevel1)) {

			System.out.println("The person is eligible for License");
			System.out.println("The current level of license is: " + currentLicense);
			System.out.println(
					"The person will be elgible for: " + eligibleLicenseLevel2 + " and " + eligibleLicenseLevel3);

		} else if (age >= 16 && currentLicense.equals(eligibleLicenseLevel2)) {

			System.out.println("The person is eligible for License");
			System.out.println("The current level of license is: " + currentLicense);
			System.out.println("The person will be elgible for: " + eligibleLicenseLevel3);

		} else if (age >= 16 && currentLicense.equals(eligibleLicenseLevel3)) {

			System.out.println("The person already have the highest level of License: " + currentLicense);

		} else if (age >= 16 && currentLicense.equals(noLicense)) {

			System.out.println("The person will be elgible for: " + eligibleLicenseLevel1);
		} else {

			System.out.println("The person is not eligible for License");
		}

	}
}

