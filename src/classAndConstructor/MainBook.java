package classAndConstructor;

public class MainBook {

	public static void main(String[] args) {

		/*
		 * Parameterized Constructor- Assigning the values while creating an object
		 * "halfGirlFriend" in class "Book"
		 */
		Book halfGirlfriend = new Book("Chetan Bhagat", "Half Girlfriend", 150);

		// Calling and displaying the values using Parameterized methods
		System.out.println("The Author is " + halfGirlfriend.getAuthor());
		System.out.println("The name of the book is " + halfGirlfriend.getName());
		System.out.println("The pages in th book is " + halfGirlfriend.getPages());

	}

}
