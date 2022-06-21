package classAndConstructor;

public class Calculator {

	double result;

	double addition(double num1, double num2) {
		result = num1 + num2;
		return result;
	}

	double substraction(double num1, double num2) {
		result = num1 - num2;
		return result;
	}

	double multiplication(double num1, double num2) {
		result = num1 * num2;
		return result;
	}

	double division(double num1, double num2) {
		result = num1 / num2;
		return result;
	}
}
