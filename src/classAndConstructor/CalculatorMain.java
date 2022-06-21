package classAndConstructor;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator operation = new Calculator();
		double resultOfOperation = 0;

		resultOfOperation = operation.addition(4.8, 5.6);
		System.out.println("Addition: " + resultOfOperation);

		resultOfOperation = operation.substraction(5, 4);
		System.out.println("Substraction: " + resultOfOperation);

		resultOfOperation = operation.multiplication(6, 5);
		System.out.println("Multiplication: " + resultOfOperation);

		resultOfOperation = operation.division(5, 10);
		System.out.println("Division: " + resultOfOperation);

	}

}
