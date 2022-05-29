package dynamicInput;

import java.util.Scanner;


public class ForLoopExample {

	public static void main(String[] args) {
		double loanAmount = 0;
		
		System.out.println("Enter the loan amount");
		
		Scanner sc = new Scanner(System.in);
		
	loanAmount =  sc.nextDouble();
	
	for (int i=1;i<=3;i++) {
		System.out.println("Month "+i);
		System.out.println("Payment: 10% of " +loanAmount+" ="+loanAmount/10);
		System.out.println("Remaining amount: "+(loanAmount-(loanAmount/10)));
		loanAmount = loanAmount-(loanAmount/10);
	}
	

	}

}
