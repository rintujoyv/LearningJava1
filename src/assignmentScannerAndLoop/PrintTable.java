package assignmentScannerAndLoop;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
		
		
		double fahrenheit = 0;
		Scanner sc = new Scanner(System.in);
		
		String valueEntered = "";
		
		System.out.println("Enter the value");
		valueEntered = sc.next();
		
		if(valueEntered.equals("0") || valueEntered.equals("zero") || valueEntered.equals("Zero")) {
			System.out.println("Celsius \t Fahrenheit "); 
			
			for (double celsius = -20;celsius <= 25;celsius += 5) {
				
				double fahrenheitValue = (celsius * 9/5) + 32.;
				System.out.println("  "+celsius+ "\t\t    " +fahrenheitValue);
			}
		}
			
			else{
				
				System.out.println("Invalid Entry");
			}
			
			
		}
			
		
	}
		
		
		



