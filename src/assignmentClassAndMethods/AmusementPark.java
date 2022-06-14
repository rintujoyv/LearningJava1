package assignmentClassAndMethods;

import java.util.Scanner;

public class AmusementPark {

	public static void main(String[] args) {
		
		Person rintu = new Person();
		
		System.out.println("Enter the Person's height");
		Scanner sc = new Scanner(System.in);
		
		int heightEntered = sc.nextInt();
		
		System.out.println("Enter the Person's weight");
		int weightEntered =sc.nextInt();
		
		rintu.height= heightEntered;
		rintu.weight=weightEntered;
		
		rintu.isEligible();
		
		

	}

}
