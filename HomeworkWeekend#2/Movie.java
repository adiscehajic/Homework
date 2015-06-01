public class Movie {

	private String fullMovieTitle;
	private int yearOfMaking;
	private String movieGenre;
	private String producerName;
	private double imdbRating;
	private boolean wonOscar;

	// Creating of constructor Movie
	public Movie(String movie, int year, String producer, String genre,
			double rating, boolean oscar) {
		fullMovieTitle = movie;
		yearOfMaking = year;
		movieGenre = genre;
		producerName = producer;
		imdbRating = rating;
		wonOscar = oscar;
	}

	// Creating of toString
	public String toString() {
		String s = "";
		s = s + "Movie: " + fullMovieTitle + "\n";
		s = s + "Year: " + yearOfMaking + "\n";
		s = s + "Genre: " + movieGenre + "\n";
		s = s + "Producer: " + producerName + "\n";
		s = s + "IMDB rating: " + imdbRating + "\n";
		s = s + "Oscar: " + wonOscar + "\n";
		return s;
	}
}
