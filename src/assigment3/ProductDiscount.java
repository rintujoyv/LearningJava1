package assigment3;

public class ProductDiscount {

	public static void main(String[] args) {

		double productRate = 20;

		double discountApplied = productRate * 0.5;
		double totalProductValue;

		boolean promoCodeFive = true;
		boolean promoCodeTen = false;
		boolean promoCodeTwenty = false;

		if (promoCodeFive) {

			totalProductValue = discountApplied * 0.05;
			totalProductValue = discountApplied - totalProductValue;

			System.out.println("The Total price of the product with discount applied is : " + totalProductValue);
		} else if (promoCodeTen) {

			totalProductValue = discountApplied * 0.1;
			totalProductValue = discountApplied - totalProductValue;

			System.out.println("The Total price of the product with discount applied is : " + totalProductValue);

		} else if (promoCodeTwenty) {

			totalProductValue = discountApplied * 0.2;
			totalProductValue = discountApplied - totalProductValue;

			System.out.println("The Total price of the product with discount applied is : " + totalProductValue);

		} else {

			System.out.println("The Total price of the product with discount applied is : " + discountApplied);

		}

	}

}
