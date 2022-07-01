package atmCashWithdrawal;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {

		Person rintu = new Person("Rintu Joy", 1234, 435677890, 2000, 699754784, 1000);

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to HDFC bank ATM");

		rintu.validpin();

		if (rintu.noOfAttempts > 2) {

			System.out.println("Account locked, Please visit the branch and reset the pin");

		} else {

			System.out.println("Choose the below options for ATM transactions");
			System.out.println("1. Cash Deposit");
			System.out.println("2. Cash Withdrawal");
			System.out.println("3. Your Daily Atm Withdrawal Limit");

			int options = 0;
			double cashDeposit = 0;
			double cashWithdraw = 0;
			options = sc.nextInt();
			Atm atmTransaction = new Atm();

			switch (options) {

			case 1: {
				System.out.println("Enter the amount of cash to deposit");
				cashDeposit = sc.nextDouble();
				atmTransaction.depositCash(rintu, cashDeposit);
				break;

			}

			case 2: {

				System.out.println("Enter the amount of cash to Withdraw");
				cashWithdraw = sc.nextDouble();
				atmTransaction.withdrawCash(rintu, cashWithdraw);
				break;

			}
			case 3: {
				atmTransaction.dailyTranLimit(rintu);
				break;
			}
			default:
				System.out.println("Invalid Entry");

			}

		}
	}

}
