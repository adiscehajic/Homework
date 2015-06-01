public class Task6_Movies {

	public static void main(String[] args) {

		// Inputing the information about first movie
		Movie movieFirst = new Movie("Gladiator", 2000, "Ridley Scott",
				"Action, Drama", 8.5, true);

		// Inputing the information about second movie
		Movie movieSecond = new Movie("Inception", 2010, "Christopher Nolan",
				"Action, Mystery, Sci-Fi", 8.8, false);

		// Printing information about both movies
		System.out.println(movieFirst);
		System.out.println(movieSecond);

	}

}
