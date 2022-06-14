package assignmentClassAndMethods;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee rintu = new Employee();

		// Assigning values to the variables

		rintu.firstName = "Rintu";
		rintu.lastName = "Joy";
		rintu.hourlyRate = 25.5;

		// Printing the Employee details

		rintu.displayEmployee();

		//

		double weeklySalaryOfEmp = rintu.weeklySalary();
		System.out.println("The Weekly Salary of the Employee Before tax: $" + weeklySalaryOfEmp);

	}

}
