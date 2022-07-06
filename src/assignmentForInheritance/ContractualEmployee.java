package assignmentForInheritance;

public class ContractualEmployee extends Employee {

	double extraHours;
	double totalSalary = 0;

	public ContractualEmployee(String firstName, String lastName, long sinNumber, double wage, double extraHours) {

		super(firstName, lastName, sinNumber, wage);

		this.extraHours = extraHours;

	}

	@Override
	double calculatePay(double hoursWorked) {

		if (hoursWorked > 40) {

			double overtimeSalary = 1.5 * getSalaryWage() * extraHours;

			totalSalary = (getSalaryWage() * hoursWorked) + overtimeSalary;

		} else {

			totalSalary = getSalaryWage() * hoursWorked;
		}
		return totalSalary;
	}
}
