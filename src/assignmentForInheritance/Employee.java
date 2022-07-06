package assignmentForInheritance;

public class Employee {

	String firstName;
	String lastName;
	private long sinNumber;
	private double wage;

	public Employee() {

	}

	public Employee(String firstName, String lastName, long sinNumber, double wage) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.sinNumber = sinNumber;
		this.wage = wage;
	}

	public String getFirstNamee() {
		return firstName;
	}

	public void setFirstNamee(String firstNamee) {
		this.firstName = firstNamee;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalaryWage() {
		return wage;
	}

	public void setSalaryWage(double salaryWage) {
		if (salaryWage > 0) {

			this.wage = salaryWage;
		} else {

			System.out.println("No salary in this month.");
		}
	}

	public long getSinNumber() {
		return sinNumber;
	}

	public void setSinNumber(long sinNumber) {
		this.sinNumber = sinNumber;
	}

	double calculatePay(double hoursWorked) {

		double salary = wage * hoursWorked;
		return salary;

	}

}
