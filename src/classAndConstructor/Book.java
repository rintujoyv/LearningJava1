package classAndConstructor;

public class Book {

	// Declaring the class level variables
	String author;
	String title;
	int pageCount;

	// N argument constructor
	Book() {

	}

	// Parameterized Constructor
	public Book(String authorName, String name, int pages) {

		author = authorName;
		title = name;
		pageCount = pages;

	}

	// No argument method defined- no input but returns a value
	String getAuthor() {

		return author;
	}

	// No argument method defined- no input but returns a value
	String getName() {

		return title;
	}

	// No argument method defined- no input but returns a value
	int getPages() {

		return pageCount;
	}
}
