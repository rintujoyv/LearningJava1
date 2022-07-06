package assignmentForInheritance;

public class CommissionBasedEmployee extends Employee {

	double totalSalary = 0;
	boolean isSalesDone = true;
	double salesAmount;
	double baseSalary;

	public CommissionBasedEmployee(String firstName, String lastName, long sinNumber, double wage, boolean isSalesDone,
			double salesAmount, double baseSalary) {

		super(firstName, lastName, sinNumber, wage);

		this.isSalesDone = isSalesDone;
		this.salesAmount = salesAmount;
		this.baseSalary = baseSalary;
	}

	@Override
	double calculatePay(double hoursWorked) {

		if (isSalesDone) {

			totalSalary = (baseSalary / 24) + (0.15 * salesAmount);

		} else {

			totalSalary = baseSalary / 24;
		}

		return totalSalary;

	}

}
