package assignmentScannerAndLoop;


import java.util.Scanner;

public class HeightCalculation {

	public static void main(String[] args) {
		
		
		int feet = 0;
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the user height in feet");
	feet = sc.nextInt();
	
				int inches = 0;
				System.out.println("Enter the user height in inches");
				inches = sc.nextInt();
				
				System.out.println("The user's height is "+feet+ " feet "+inches+" inches");
				
				double centimeter = (30.48 * feet) + (2.54 * inches);
				System.out.println("The height of the user in centimeter is "+centimeter+"cm");
				
	}

}
