package concert;

public class Song {

	// Declaration of properties of song
	Artist artist;
	public String nameSong;
	public int yearSong;
	public String genreSong;

	// Creating method toString
	public String toString() {
		String s = "";
		s += "Artist: " + artist.name + "\n";
		s += "Song name: " + nameSong + "\n";
		s += "Year of publishing: " + yearSong + "\n";
		s += "Song genre: " + genreSong + "\n";

		return s;
	}

	// Creating constructor
	public Song(Artist artist, String nameSong, int yearSong, String genreSong) {
		this.artist = artist;
		this.nameSong = nameSong;
		this.yearSong = yearSong;
		this.genreSong = genreSong;
	}

}
