package oops;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee(89795);
		// boolean isCRA = true;

		CRA cra = new CRA();
		//boolean isCRA = cra instanceof CRA;

		System.out.println("Sin num :" + employee.getSinNumber());

		employee.setSinNumber(23456, cra, 6666);

		System.out.println("Sin num :" + employee.getSinNumber());

		employee.setSinNumber(342432, cra, 1234);

		System.out.println("Sin num :" + employee.getSinNumber());

		// only CRA can change the SIN Number

		employee.setSinNumber(23456, cra, 1234);

		System.out.println("Sin num :" + employee.getSinNumber());

	}

}