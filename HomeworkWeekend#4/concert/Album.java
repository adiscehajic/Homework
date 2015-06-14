package concert;

import java.util.Arrays;

public class Album {

	// Declaration of properties of album
	public String albumName;
	Artist nameArtist;
	Song[] songs;
	public String albumGenre;
	
	// Creating constructor
	public Album(String albumName, Artist nameArtist, Song[] songs,
			String albumGenre) {
		this.albumName = albumName;
		this.nameArtist = nameArtist;
		this.songs = songs;
		this.albumGenre = albumGenre;
	}

	// Creating method toString
	public String toString() {
		String s = "";
		s += "Album name: " + albumName + "\n";
		s += "Author: " + nameArtist.name + "\n";
		s += "Songs: " + Arrays.toString(songs) + "\n";
		s += "Genre: " + albumGenre + "\n";
		
		return s;
	}
	
}
