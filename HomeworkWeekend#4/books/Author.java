package books;

import java.util.Arrays;

public class Author {

	// Declaration of properties of author
	public String name;
	public int yearOfBirth;
	public Book[] books;
	
	// Creating constructor	
	public Author(String name, int yearOfBirth, Book[] books) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.books = books;
	}
	
	// Creating toString method
	public String toString() {

		String s = "";
		s = "Name: " + name + "\n";
		s += "Year of birth: " + yearOfBirth + "\n";
		s += "Published books: " + Arrays.toString(books) + "\n";
		
		return s;
	}

}
