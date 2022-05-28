package assignmentsubmission3;

import java.util.Scanner;

public class ProductDiscount {

	public static void main(String[] args) {

		double productRate = 0;
		System.out.println("Enter the Product rate");

		Scanner sc = new Scanner(System.in);

		productRate = sc.nextDouble();

		double discountApplied = productRate * 0.5;
		double totalProductValue;

		String promoCodeFive = "Promo5";
		String promoCodeTen = "Promo10";
		String promoCodeTwenty = "Promo20";
		String promoCode = "";

		System.out.println("Enter the Promo code used in this product");
		promoCode = sc.next();

		if (promoCode.equals(promoCodeFive)) {

			totalProductValue = discountApplied * 0.05;
			totalProductValue = discountApplied - totalProductValue;

			System.out.println("The Total price of the product with Promocode applied is : " + totalProductValue);

		} else if (promoCode.equals(promoCodeTen)) {

			totalProductValue = discountApplied * 0.1;
			totalProductValue = discountApplied - totalProductValue;

			System.out.println("The Total price of the product with Promocode applied is : " + totalProductValue);

		} else if (promoCode.equals(promoCodeTwenty)) {

			totalProductValue = discountApplied * 0.2;
			totalProductValue = discountApplied - totalProductValue;

			System.out.println("The Total price of the product with Promocode applied is : " + totalProductValue);

		} else {

			System.out.println("The Total price of the product with discount applied is : " + discountApplied);

		}

	}

}
