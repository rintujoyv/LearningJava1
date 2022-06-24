package classAndConstructor;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
		
			
			Product[] selectedProducts =  new Product[3];
			//Scanner sc = new Scanner(System.in);
			
			
			selectedProducts[0] = new Product("Milk",5.45,"Organic", 2);
			selectedProducts[1] = new Product("Bread",2.35,"Whole wheat",1);
			selectedProducts[2] = new Product("Butter",5.45,"Organic",3);
			System.out.println("*********Invoice**********");
			System.out.println("Products   Price  Quantity");
			for(int i =0;i<selectedProducts.length;i++) {
				
				System.out.println(selectedProducts[i].name+"       "+selectedProducts[i].pricePerunit+"    "+selectedProducts[i].quantity);
				
			}
			
			Invoice Invoice1 = new Invoice();
			System.out.println("Total Amount before tax: $"+Invoice1.calculateInvoiceTotal(selectedProducts));
			System.out.println("Total Amount after tax: $"+Invoice1.calculateTax(selectedProducts));
		}

	}