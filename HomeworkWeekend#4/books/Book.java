package books;

public class Book {

	// Declaration of properties of book
	public String name;
	public int yearOfPublishing;
	public String genre;
	public boolean isBestseller;
	
	// Creating constructor	
	public Book(String name, int yearOfPublishing, String genre,
			boolean isBestseller) {
		super();
		this.name = name;
		this.yearOfPublishing = yearOfPublishing;
		this.genre = genre;
		this.isBestseller = isBestseller;
	}
	
	// Creating toString method
	public String toString() {

		String s = "";
		s = "Name: " + name + "\n";
		s += "Year of publishing: " + yearOfPublishing + "\n";
		s += "Genre: " + genre + "\n";
		s += "Bestseller: " + isBestseller + "\n";
		
		return s;
		
	}
	
}
