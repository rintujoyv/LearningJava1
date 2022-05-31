package assignmentScannerAndLoop;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		
		double celsius = 0;
		double fahrenheit = 0;
		
		
		//Celsius to Fahrenheit:  (0°C × 9/5) + 32 = 32°F
		//Fahrenheit to Celsius : Fo(32°F − 32) × 5/9 = 0°C

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit");
		fahrenheit = sc.nextDouble();
		double celsiusValue = (fahrenheit - 32) * 5/9;
		System.out.println("\t"+fahrenheit+"°F is converted to "+celsiusValue+"°C");
		
		
		System.out.println("\nEnter the temperature in Celsius ");
		celsius = sc.nextDouble();
		double fahrenheitValue = (celsius * 9/5) + 32;
		System.out.println("\t"+celsius+"°C is converted to "+fahrenheitValue+"°F");
		
		
		
		
		
		

	}

}
