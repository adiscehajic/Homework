package concert;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Creating artists
		Artist artistFirst = new Artist("Sting", false, 1977, "Rock");
		Artist artistSecond = new Artist("Whitesnake", true, 1978, "Rock");
		Artist artistThird = new Artist("Bon Jovi", true, 1983, "Rock");
		Artist artistFourth = new Artist("Halid Beslic", false, 1975, "Folk");

		// Creating songs
		Song songFirst = new Song(artistThird, "Always", 1994, "Rock");
		Song songSecond = new Song(artistThird, "Bed of Roses", 1994, "Rock");
		Song songThird = new Song(artistThird, "It's my life", 2000, "Rock");
		Song songFourth = new Song(artistThird, "Runaway", 1984, "Rock");

		Song songFive = new Song(artistFourth, "Necu necu dijamante", 1985,
				"Folk");
		Song songSix = new Song(artistFourth, "Okuj me care", 1985, "Folk");
		Song songSeven = new Song(artistFourth, "Pozuri", 2005, "Folk");
		Song songEigth = new Song(artistFourth, "Poljubac", 2005, "Folk");

		Song songNine = new Song(artistFirst, "Fields of gold", 1993, "Rock");
		Song songTen = new Song(artistFirst, "Shape of my heart", 2001, "Rock");
		Song songEleven = new Song(artistFirst, "Englishman in New York", 1987,
				"Rock");
		Song songTwelve = new Song(artistFirst, "Desert rose", 2001, "Rock");

		Song songThirteen = new Song(artistSecond, "Here I go again", 1982,
				"Rock");
		Song songFourteen = new Song(artistSecond, "Is this love", 1987, "Rock");
		Song songFifteen = new Song(artistSecond, "Soldier of fortune", 1997,
				"Rock");
		Song songSixteen = new Song(artistSecond, "Give me all your love",
				1987, "Rock");

		// Creating an array of songs
		Song[] songsFirst = { songFirst, songSecond, songThird, songFourth };
		Song[] songsSecond = { songFive, songSix, songSeven, songEigth };
		Song[] songsThird = { songNine, songTen, songEleven, songTwelve };
		Song[] songsFourth = { songThirteen, songFourteen, songFifteen,
				songSixteen };

		// Creating an array of songs that will be played at concert
		Song[] concertSongs = { songFirst, songSecond, songThird, songFourth,
				songFive, songSix, songSeven, songEigth, songNine, songTen,
				songEleven, songTwelve, songThirteen, songFourteen,
				songFifteen, songSixteen, songFive };

		// Creating albums
		Album albumFirst = new Album("Keep the faith", artistThird, songsFirst,
				"Rock");
		Album albumSecond = new Album("Necu necu dijamante", artistFourth,
				songsSecond, "Folk");
		Album albumThird = new Album("Crazy", artistFirst, songsThird, "Rock");
		Album albumFourth = new Album("1987", artistSecond, songsFourth, "Rock");

		// Creating an array of albums
		Album[] albumArray = { albumFirst, albumSecond, albumThird, albumFourth };

		// Creating an array of artists
		Artist[] artistArray = { artistFirst, artistSecond, artistThird,
				artistFourth };

		// Creating of concert
		Concert concertOne = new Concert(artistArray, concertSongs);

		// Calling method isSameAuthor
		System.out.printf("Is the artist of song %s and song %s same? %b\n\n",
				songFirst.nameSong, songThird.nameSong,
				isSameAuthor(songFirst, songThird));

		// Calling method isFromSoloAuthor
		System.out.printf("Is the song from solo author or band? %b\n\n",
				isFromSoloAuthor(songThird));

		// Calling method getOlderSong
		System.out.println("Older song is:\n"
				+ getOlderSong(songFirst, songThirteen));

		// Calling method countGenreNumber
		System.out.printf(
				"Number of songs in the album %s with genre %s is %d.\n\n",
				albumFirst.albumName, "Rock",
				countGenreNumber(albumFirst, "Rock"));

		// Calling method printAlbumInformation and finding in which album is
		// inputed song
		System.out.printf("Song %s is in the album: \n", songSix.nameSong);
		printAlbumInformation(albumArray, songSix);

		// Calling method getNumberOfSongsPerAlbum and printing in an array how
		// many songs from each album where played at concert
		System.out.println("At concert from each album where played songs: \n"
				+ Arrays.toString(getNumberOfSongsPerAlbum(concertOne,
						albumArray)) + "\n");

		// Calling method getMaxNumberOfSongs and finding what is the number of
		// songs that one artist has played at concert
		System.out.println("Max number of songs that one artist has played at concert is: " + getMaxNumberOfSongs(concertOne));

	}

	/**
	 * Checking if the author of two songs is same.
	 * 
	 * @param s1
	 *            Author of first song.
	 * @param s2
	 *            Author of second song.
	 * @return True if the author is same and false if the author is not same.
	 */
	public static boolean isSameAuthor(Song s1, Song s2) {

		if (s1.artist.name.equals(s2.artist.name)) {
			return true;
		}

		return false;
	}

	/**
	 * Checking if the author of song is solo artist or band.
	 * 
	 * @param s1
	 *            Song that we checking.
	 * @return True if the song is from solo artist and false if the song is
	 *         from band.
	 */
	public static boolean isFromSoloAuthor(Song s1) {

		if (s1.artist.isBand) {
			return false;
		}

		return true;
	}

	/**
	 * Compares two songs and prints one that is older.
	 * 
	 * @param s1
	 *            First song.
	 * @param s2
	 *            Second song.
	 * @return Song that is older.
	 */
	public static Song getOlderSong(Song s1, Song s2) {

		// Calculating if the year of song is lower.
		if (s1.yearSong > s2.yearSong) {
			return s2;
		}
		
		return s1;
	}

	/**
	 * Goes trough album and counts how many songs is with inputed genre.
	 * 
	 * @param a
	 *            Selected album.
	 * @param genre
	 *            Selected genre.
	 * @return Number of songs which genre is same as inputed genre.
	 */
	public static int countGenreNumber(Album a, String genre) {

		// Declaration of a counter that will count genre in album
		int counter = 0;

		// Calculating how many genre of the songs in the album is equal to
		// inputed genre
		for (int i = 0; i < a.songs.length; i++) {
			if (a.songs[i].genreSong == genre) {
				counter++;
			}
		}

		return counter;
	}

	/**
	 * Checking in which album is inputed song and prints all information about
	 * that album.
	 * 
	 * @param a
	 *            Array of albums.
	 * @param s
	 *            Song that method checks.
	 */
	public static void printAlbumInformation(Album[] a, Song s) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].songs.length; j++) {
				if (a[i].songs[j].nameSong.equals(s.nameSong)) {
					System.out.println(a[i]);
				}
			}
		}
	}

	/**
	 * Outputs an array where number of elements represents how many albums
	 * where played on concert and each element represents how many songs from
	 * album where played at concert.
	 * 
	 * @param c
	 *            Concert
	 * @param a
	 *            An array of albums
	 * @return An array where each element represents how many song from each
	 *         album where played at concert.
	 */
	public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a) {

		// Declaration of a counter that will count played songs
		int counter = 0;

		// Declaration of an array
		int[] songsNum = new int[c.artists.length];

		// Calculating how many songs where played from each album and putting
		// number of played songs for each album into an array
		for (int z = 0; z < c.artists.length; z++) {
			counter = 0;
			for (int i = 0; i < c.songs.length; i++) {
				for (int j = 0; j < a[z].songs.length; j++) {
					if (c.songs[i].nameSong.equals(a[z].songs[j].nameSong)) {
						counter++;
					}
				}
				songsNum[z] = counter;
			}
		}

		return songsNum;
	}

	/**
	 * Calculates which artist has played most songs in the concert and prints
	 * the number of played songs.
	 * 
	 * @param c
	 *            Concert
	 * @return Max number of songs that one artist has played in concert.
	 */
	public static int getMaxNumberOfSongs(Concert c) {

		// Declaration of a counter that will count songs played by artist
		int counter = 0;

		// Declaration of the variable that will represent max number of played
		// songs
		int max = 0;

		// Calculating which artist has played most songs and what is max number
		// of played songs
		for (int i = 0; i < c.artists.length; i++) {
			counter = 0;
			for (int j = 0; j < c.songs.length; j++) {
				if (c.artists[i].name.equals(c.songs[j].artist.name)) {
					counter++;
				}
			}
			if (counter > max) {
				max = counter;
			}
		}

		return max;
	}

}
