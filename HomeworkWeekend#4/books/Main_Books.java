package books;

import java.util.Arrays;

public class Main_Books {

	public static void main(String[] args) {

		// Creating books
		Book bookOne = new Book("Death and the Dervish", 1966,
				"Psychological drama", true);
		Book bookTwo = new Book("Fortress", 1970, "Psychological drama", true);
		Book bookThree = new Book("Pro et contra Vuk", 1967, "Drama", false);

		Book bookFour = new Book("The Damned Yard", 1954, "Drama", true);
		Book bookFive = new Book("The Bridge on the Drina", 1945, "Novel", true);
		Book bookSix = new Book("Omer-Pasha Latas", 1976, "Novel", false);

		// Creating an array of books for each author
		Book[] booksOne = { bookOne, bookTwo, bookThree };
		Book[] booksTwo = { bookFour, bookFive, bookSix };

		// Creating authors
		Author authorOne = new Author("Mesa Selimovic", 1910, booksOne);
		Author authorTwo = new Author("Ivo Andric", 1982, booksTwo);
		Author authorThree = new Author("Branko Copic", 1990, booksTwo);

		// Creating an array of authors
		Author[] authorArrayOne = { authorOne, authorTwo, authorThree };

		// Calling method countBestsellingBooks and printing result
		System.out.printf("%s has wrote %d bestsellers.\n\n", authorOne.name,
				countBestsellingBooks(authorOne));

		// Calling method getNumberOfWrittenBooks and printing result
		System.out.printf("%s has from %d to %d wrote %d books.\n\n",
				authorTwo.name, 1945, 1960,
				getNumberOfWrittenBooks(authorTwo, 1945, 1960));

		// Calling method getAuthorWithMostBestsellers that will print author(s)
		// with most bestsellers
		System.out.println(Arrays
				.toString(getAuthorWithMostBestsellers(authorArrayOne)));
	}

	/**
	 * Outputs how many bestsellers does author have.
	 * 
	 * @param a
	 *            Author
	 * @return Number of bestsellers that author has wrote.
	 */
	public static int countBestsellingBooks(Author a) {

		// Declaration of a counter that will count bestselling books
		int counter = 0;

		// Checking which books are bestsellers
		for (int i = 0; i < a.books.length; i++) {
			if (a.books[i].isBestseller == true) {
				counter++;
			}
		}

		return counter;
	}

	/**
	 * Outputs how many books has author wrote in the range of years that user
	 * inputs.
	 * 
	 * @param a
	 *            Author
	 * @param year1
	 *            Starting year of range.
	 * @param year2
	 *            Ending year of range.
	 * @return Number of books that author has wrote in the range of years that
	 *         user inputs.
	 */
	public static int getNumberOfWrittenBooks(Author a, int year1, int year2) {

		// Declaration of a counter that will count bestselling books
		int counter = 0;

		// Checking which books are written in inputed range of years
		for (int i = 0; i < a.books.length; i++) {
			if (a.books[i].yearOfPublishing >= year1
					&& a.books[i].yearOfPublishing <= year2) {
				counter++;
			}
		}

		return counter;
	}

	/**
	 * Outputs the author(s) with most bestsellers in the authors array.
	 * <p>
	 * If there is more authors with same number of most bestsellers, outputs
	 * all authors.
	 * 
	 * @param authors
	 *            Array of authors
	 * @return Author(s) with most bestsellers.
	 */
	public static Author[] getAuthorWithMostBestsellers(Author[] authors) {

		// Declaration of an array that which elements will be a number of
		// bestsellers for each author in the array.
		int[] numberOfBestsellers = new int[authors.length];

		// Declaration of a counter that will count bestsellers of each author
		int counter = 0;

		for (int i = 0; i < numberOfBestsellers.length; i++) {
			// Reseting of an counter after the number of bestsellers for one
			// author is inputed into an array
			counter = 0;
			// Counting how many bestsellers does each author have
			for (int j = 0; j < authors[i].books.length; j++) {
				if (authors[i].books[j].isBestseller == true) {
					counter++;
				}
				// Putting number of bestsellers into an array
				numberOfBestsellers[i] = counter;
			}
		}

		// Declaration of the variable that will represent max number of the
		// bestsellers
		int max = 0;

		// Checking what is the max number of bestsellers
		for (int i = 0; i < numberOfBestsellers.length; i++) {
			if (numberOfBestsellers[i] > 0) {
				max = Math.max(numberOfBestsellers[0], numberOfBestsellers[i]);
			}
		}

		// Declaration of the variable that will represent how many max number
		// of the bestsellers is in the array
		int counter1 = 0;

		// Checking how many max number of the bestsellers is in the array
		for (int i = 0; i < numberOfBestsellers.length; i++) {
			if (numberOfBestsellers[i] == max) {
				counter1++;
			}
		}

		// Creating an array in which will authors with most bestsellers be
		// stored
		Author[] authorsBestseller = new Author[counter1];

		// Declaration of the variable that will represent index into an
		// authorsBestseller array
		int counter2 = 0;

		// Checking which authors have max number of bestsellers and inputing
		// them into an authorsBestseller array
		for (int i = 0; i < numberOfBestsellers.length; i++) {
			if (numberOfBestsellers[i] == max) {
				authorsBestseller[counter2] = authors[i];
			}
			counter2++;
		}

		return authorsBestseller;
	}
}
