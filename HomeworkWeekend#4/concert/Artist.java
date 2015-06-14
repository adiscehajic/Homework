package concert;

public class Artist {

	// Declaration of properties of artist
	public String name;
	public boolean isBand;
	public int yearsActive;
	public String musicGenre;
	
	// Creating method toString
	public String toString() {
		String s = "";
		s += "Name: " + name + "\n";
		s += "Is artist band? " + isBand + "\n";
		s += "Years active: " + yearsActive + "\n";
		s += "Genre of music: " + musicGenre + "\n";
	
		return s;
	}

	// Creating constructor
	public Artist(String name, boolean isBand, int yearsActive,
			String musicGenre) {
		super();
		this.name = name;
		this.isBand = isBand;
		this.yearsActive = yearsActive;
		this.musicGenre = musicGenre;
	}
	
}
