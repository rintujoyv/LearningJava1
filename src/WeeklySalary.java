
public class WeeklySalary {

	public static void main(String[] args) {

		int perHourRate = 14;

		double weeklySalaryBfrTax = perHourRate * 40;

		System.out.println("Salary Per Hour rate is $" + perHourRate);
		System.out.println("Weekly Salary Before Tax will be $" + weeklySalaryBfrTax);

		double weeklySalaryAftTax = weeklySalaryBfrTax - (weeklySalaryBfrTax * 0.1);

		System.out.println("Weekly Salary After Tax will be $" + weeklySalaryAftTax);

	}

}
