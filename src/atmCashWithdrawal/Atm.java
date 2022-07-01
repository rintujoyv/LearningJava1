package atmCashWithdrawal;

import java.util.Scanner;

public class Atm {

	int options = 0;

	Scanner sc = new Scanner(System.in);

	final double dailyLimit = 1000;

	void depositCash(Person p1, double cashToDeposit) {

		System.out.println("Select the account to do the cash deposit");
		System.out.println("1. Savings Account");
		System.out.println("2. Checking Account");
		options = sc.nextInt();

		switch (options) {

		case 1: {

			System.out.println("Available balance in Savings account: " + p1.totalFundsAvailableInSav);
			cashToDeposit = cashToDeposit + p1.totalFundsAvailableInSav;
			System.out.println("Total balance in Savings account: " + cashToDeposit);
			continueTrans(p1);

			break;

		}
		case 2: {

			System.out.println("Available balance in Checking account: " + p1.totalFundsAvailableInChec);
			cashToDeposit = cashToDeposit + p1.totalFundsAvailableInChec;
			System.out.println("Total balance in Checking account: " + cashToDeposit);
			continueTrans(p1);

			break;

		}
		default:

			System.out.println("Invalid Entry");
		}
	}

	void withdrawCash(Person p1, double cashToWithdraw) {

		if (cashToWithdraw <= dailyLimit) {
			System.out.println("Select the account to do the cash Withdrawal");
			System.out.println("1. Savings Account");
			System.out.println("2. Checking Account");
			options = sc.nextInt();

			switch (options) {

			case 1: {

				System.out.println("Available balance in Savings account: " + p1.totalFundsAvailableInSav);
				if (p1.totalFundsAvailableInSav >= cashToWithdraw) {

					cashToWithdraw = p1.totalFundsAvailableInSav - cashToWithdraw;
					System.out.println("Please collect the cash");
					System.out.println("Total balance in Savings account: " + cashToWithdraw);
					continueTrans(p1);
				} else {

					System.out.println(
							"Non sufficient funds or Daily Limit exceeded. Please try a lesser amount or try again later");

				}

				break;

			}
			case 2: {

				System.out.println("Available balance in Checking account: " + p1.totalFundsAvailableInChec);
				if (p1.totalFundsAvailableInChec >= cashToWithdraw) {

					cashToWithdraw = p1.totalFundsAvailableInChec - cashToWithdraw;
					System.out.println("Please collect the cash");
					System.out.println("Total balance in Checking account: " + cashToWithdraw);
					continueTrans(p1);
					break;
				} else {

					System.out.println("Non sufficient funds. Please try a lesser amount or try again later");

				}
				break;
			}

			default:

				System.out.println("Invalid Entry");
				break;
			}

		} else {

			System.out.println(
					"Daily Limit exceeded. Your daily limit is $" + dailyLimit + "\n Please try a lesser amount");
			System.out.println();

			System.out.println("Enter the cash Withdrawal limit: ");
			cashToWithdraw = sc.nextDouble();
			withdrawCash(p1, cashToWithdraw);

		}

	}

	void continueTrans(Person p1) {

		System.out.println("\nDo you want to continue transactions (y/n)");
		String option = sc.next();

		if (option.equals("y")) {

			p1.validpin();

		} else
			sc.close();
	}

	void dailyTranLimit(Person p1) {

		System.out.println("Your daily ATM withdrawal limit: " + dailyLimit);
		continueTrans(p1);

	}

}
