package assignmentScannerAndLoop;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {

		int num = 0;
		int numCount = 0;

		Scanner sc = new Scanner(System.in);

		String yourChoice = "";

		do {

			System.out.println("Enter the number");
			num = sc.nextInt();

			System.out.println("Do you want to continue entering the number(y/n)");
			yourChoice = sc.next();

			numCount++;

		} while(yourChoice.equals("y") || yourChoice.equals("Y"));

		if (yourChoice.equals("n") || yourChoice.equals("N")) {

			System.out.println("Enter the number of values entered by the user: " + numCount);

		}

	}

}
