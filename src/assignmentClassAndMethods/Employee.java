package assignmentClassAndMethods;

import java.util.Scanner;

public class Employee {

	String firstName;
	String lastName;
	double hourlyRate;
	double hoursWorkedInADay;
	double daysWorkedInAWeek;
	double empWeeklySalary;

	Scanner sc = new Scanner(System.in);

	void displayEmployee() {

		System.out.println("**Emplyee Information**");
		System.out.println("\nFirstName : " + firstName);
		System.out.println("LastName : " + lastName);
		System.out.println("Hourly Rate : $" + hourlyRate);
	}

	// No inputs but returns a value
	double weeklySalary() {

		System.out.println("Enter the no. of hours worked in a day");
		hoursWorkedInADay = sc.nextDouble();

		System.out.println("Enter the no. of days worked in a week");
		daysWorkedInAWeek = sc.nextDouble();

		// Salary Before tax
		empWeeklySalary = hourlyRate * hoursWorkedInADay * daysWorkedInAWeek;
		return empWeeklySalary;

	}
}
