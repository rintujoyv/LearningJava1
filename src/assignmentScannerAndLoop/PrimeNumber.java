package assignmentScannerAndLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 
		
		//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
		
		
		int num = 0;
		int num1 = 0;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");

		 num = sc.nextInt();
	
		 if(num==0 || num==1) {
				
				
				System.out.println(num +" is not a prime number");
			}else {
					

			 for(int i=2;i<=num/2;i++) {
		 
			 
			 if(num%i== 0) {
				 System.out.println(num +" is not a prime number");
				 num1=1;
				break;
				
			 }
		 
			 }
		 if(num1==0) {
				
				System.out.println(num +" is a prime number");
		 }
			}
	}
		 
}
						
			
				 
			
		 

	

