package classAndConstructor;

public class Invoice {
	double total = 0;

	
	double calculateInvoiceTotal(Product[] product) {

		for (int i = 0; i < product.length; i++) {
			total = product[i].pricePerunit * product[i].quantity;

		}

		return total;
	}
	
	// Add a method calculateTax (13%) and provide the totalAmount including Tax.

	double calculateTax(Product[] product) {

		for (int i = 0; i < product.length; i++) {
			total = product[i].pricePerunit * product[i].quantity;

		}

		total = total * 1.13;

		return total;
	}

	
}