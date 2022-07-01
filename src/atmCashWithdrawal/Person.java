package atmCashWithdrawal;

import java.util.Scanner;

public class Person {

	String accountHolder;
	private int pin;
	int typesOfAccount = 0;
	long accountNumberForSav;
	long accountNumberForChec;

	double totalFundsAvailableInSav;
	double totalFundsAvailableInChec;
	int noOfAttempts = 0;
	Scanner sc = new Scanner(System.in);

	void validpin() {
		System.out.println("Swipe your card and enter the pin");

		pin = sc.nextInt();

		do {
			if (pin == 1234) {

				balance();

				break;

			} else {
				System.out.println("Invalid pin, Enter the pin again");
				pin = sc.nextInt();
				noOfAttempts++;
			}
		} while (noOfAttempts <= 2);

	}

	void balance() {

		System.out.println("***Welcome " + accountHolder + "***");
		System.out.println("Choose the type of bank account to know the balance");
		System.out.println("1. Checking account");
		System.out.println("2. Savings account");
		System.out.println("3. Other accounts");

		typesOfAccount = sc.nextInt();

		switch (typesOfAccount) {

		case 1: {

			System.out.println("Account number: " + accountNumberForChec);
			System.out.println("Total Funds Available: $" + totalFundsAvailableInChec);
			break;
		}
		case 2: {

			System.out.println("Account number: " + accountNumberForSav);
			System.out.println("Total Funds Available: $" + totalFundsAvailableInSav);
			break;
		}

		case 3: {

			System.out.println("No Atm transcations allowed. Please visit the branch");
			break;
		}

		default:

			System.out.println("Invalid Entry");

		}

	}

	// if (noOfAttempts == 2) {
	// System.out.println("Account locked, Please visit the branch and reset the
	// pin");
	// }

	Person(String accHolder, int pinNo, long accNoSav, double totalFundSav, long accNoChec, double totalFundsChec) {

		accountHolder = accHolder;
		pin = pinNo;
		accountNumberForSav = accNoSav;
		totalFundsAvailableInSav = totalFundSav;
		accountNumberForChec = accNoChec;
		totalFundsAvailableInChec = totalFundsChec;

	}

}
