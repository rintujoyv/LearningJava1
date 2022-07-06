package assignmentForInheritance;

public class EmployeeMain {

	public static void main(String[] args) {

		double max = 0;
		double totalSalary;

		PermanentEmployee emp1 = new PermanentEmployee("Rintu", "Joy", 4556777, 20);
		totalSalary = emp1.calculatePay(70);

		ContractualEmployee emp2 = new ContractualEmployee("Ebin", "Paul", 86445566, 20, 35);
		totalSalary = emp2.calculatePay(50);

		CommissionBasedEmployee emp3 = new CommissionBasedEmployee("Richu", "Joy", 55677434, 20, true, 34, 20000);
		totalSalary = emp3.calculatePay(30);

		PermanentEmployee emp4 = new PermanentEmployee("George", "Thomas", 44546777, 25);
		totalSalary = emp4.calculatePay(70);

		ContractualEmployee emp5 = new ContractualEmployee("Sheeja", "Varghese", 86586566, 20, 34);
		totalSalary = emp5.calculatePay(50);

		CommissionBasedEmployee emp6 = new CommissionBasedEmployee("Joy", "Jacob", 555567434, 20, true, 34, 30000);
		totalSalary = emp6.calculatePay(30);

		PermanentEmployee emp7 = new PermanentEmployee("Paul", "Varghese", 55556777, 20);
		totalSalary = emp7.calculatePay(70);

		ContractualEmployee emp8 = new ContractualEmployee("Elby", "Paul", 865645566, 20, 50);
		totalSalary = emp8.calculatePay(50);

		CommissionBasedEmployee emp9 = new CommissionBasedEmployee("Irene", "Susan", 346735434, 20, true, 34, 20000);
		totalSalary = emp9.calculatePay(30);

		CommissionBasedEmployee emp10 = new CommissionBasedEmployee("Tressa", "Thomas", 534435434, 20, false, 0, 20000);
		totalSalary = emp10.calculatePay(30);

		Employee[] empList = { emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10 };

		System.out.println("\tEmployee details\t");

		for (int i = 0; i < empList.length; i++) {
			System.out.println("*********************************");
			System.out.println("Name of Employee: " + empList[i].firstName + " " + empList[i].lastName);
			System.out.println("Salary: " + empList[i].calculatePay(totalSalary));
			System.out.println("***********************************");
		}

		for (int i = 0; i < empList.length; i++) {
			if (empList[i].calculatePay(totalSalary) > max) {
				max = empList[i].calculatePay(totalSalary);
			}

		}

		for (int i = 0; i < empList.length; i++) {
			if (empList[i].calculatePay(totalSalary) == max) {
				System.out
						.println("Maximum Salary of Employee is :" + empList[i].firstName + " " + empList[i].lastName);

			}

		}

	}

}
