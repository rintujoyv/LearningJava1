package assigmentSwitchAndArray;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		double firstNumber = 0;
		double secondNumber = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First number");
		firstNumber = sc.nextDouble();

		System.out.println("Enter the Second number");
		secondNumber = sc.nextDouble();

		System.out.println("Enter the mathematic operation to be performed");
		System.out.println("\t 1.Addition \t");
		System.out.println("\t 2.Substraction \t");
		System.out.println("\t 3.Multiplication \t");
		System.out.println("\t 4.Division \t");

		String opertion = "";
		opertion = sc.next();

		double result = 0;

		switch (opertion) {

		case "Addition": {

			result = firstNumber + secondNumber;
			System.out.println("Result after adding " + firstNumber + " and " + secondNumber + " is " + result);
			break;
		}
		case "Substraction": {

			result = firstNumber - secondNumber;
			System.out.println("Result after substracting " + firstNumber + " and " + secondNumber + " is " + result);
			break;
		}

		case "Multiplication": {

			result = firstNumber * secondNumber;
			System.out.println("Result after multiplying " + firstNumber + " and " + secondNumber + " is " + result);
			break;
		}

		case "Division": {

			result = firstNumber / secondNumber;
			System.out.println("Result after dividing " + firstNumber + " and " + secondNumber + " is " + result);
			break;

		}
		default: {

			System.out.println("Enter a valid input");
		}

		}

	}

}
