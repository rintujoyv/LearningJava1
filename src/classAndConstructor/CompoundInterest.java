package classAndConstructor;

public class CompoundInterest {

	double principal;
	double interestRate;
	double time;

	double comInterest(double principal, double interestRate, double time) {

		int n = 12;
		double amount = 1;
		double result1 = 1 + ((interestRate / 100) / 12);
		double result2 = n * time;
		int i = 0;
		while (i < result2) {

			amount = amount * result1;
			i++;
		}

		amount = principal * amount;
		return amount;
	}

}