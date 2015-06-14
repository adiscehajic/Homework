package players;

import java.util.Arrays;

import players.Team;

public class Main_Football {

	public static void main(String[] args) {

		// Creating of players
		Player playerOne = new Player("Gianluigi Buffon", 1978, "Goalkeeper");
		Player playerTwo = new Player("Giorgio Chiellini", 1984, "Defender");
		Player playerThree = new Player("Leonardo Bonucci", 1987, "Defender");
		Player playerFour = new Player("Stephan Lichtsteiner", 1984, "Defender");
		Player playerFive = new Player("Patrice Evra", 1981, "Defender");
		Player playerSix = new Player("Paul Pogba", 1993, "Midfielder");
		Player playerSeven = new Player("Claudio Marchisio", 1986, "Midfielder");
		Player playerEigth = new Player("Andrea Pirlo", 1979, "Midfielder");
		Player playerNine = new Player("Arturo Vidal", 1987, "Midfielder");
		Player playerTen = new Player("Carlos Tevez", 1984, "Forward");
		Player playerEleven = new Player("Alvaro Morata", 1993, "Forward");

		// Creating an array of players
		Player[] playersOne = { playerOne, playerTwo, playerThree, playerFour,
				playerFive, playerSix, playerSeven, playerEigth, playerNine,
				playerTen, playerEleven };

		// Creating a team of players
		Team teamOne = new Team("Juventus", playersOne);

		// Calling method countPlayers and printing how many players is born on
		// inputed year
		System.out.printf("On year %d in team %s is born %d players.\n\n",
				1984, teamOne.name, countPlayers(teamOne, 1984));

		// Calling method countPlayer and printing how many players plays in
		// inputed position
		System.out.printf("In %s has %d players in position %s.\n\n",
				teamOne.name, countPlayers(teamOne, "Defender"), "Defender");

		// Calling method getYoungestPlayer and printing youngest player(s) into
		// a inputed team
		System.out.printf("The youngest player(s) in team %s is/are: \n%s\n:",
				teamOne.name, Arrays.toString(getYoungestPlayer(teamOne)));

	}

	/**
	 * Goes trough team of players and counts how many players is born on the
	 * year that user inputs.
	 * 
	 * @param t
	 *            Team of players.
	 * @param year
	 *            Year that user wants to check.
	 * @return Count of players born on inputed year.
	 */
	public static int countPlayers(Team t, int year) {

		// Declaration of a counter that will count players
		int counter = 0;

		// Counting how many players is born on inputed year
		for (int i = 0; i < t.players.length; i++) {
			if (t.players[i].year == year) {
				counter++;
			}
		}

		return counter;
	}

	/**
	 * Goes trough team of players and counts how many players is in the inputed
	 * position.
	 * 
	 * @param t
	 *            Team of player.
	 * @param position
	 *            Position that user want to check.
	 * @return Number of players that plays on inputed position.
	 */
	public static int countPlayers(Team t, String position) {

		// Declaration of a counter that will count players
		int counter = 0;

		// Counting how many players plays on inputed position
		for (int i = 0; i < t.players.length; i++) {
			if (t.players[i].position.equals(position)) {
				counter++;
			}
		}

		return counter;
	}

	/**
	 * Goes trough team of players and searches which is the youngest player(s).
	 * <p>
	 * If there is more players that are born on the same year and they are
	 * youngest, prints all players.
	 * 
	 * @param t
	 *            Team of players.
	 * @return Youngest player(s) in the team.
	 */
	public static Player[] getYoungestPlayer(Team t) {

		// Declaration of variable that will check for youngest player(s)
		int min = 0;

		// Declaration of a counter that will count how many players is youngest
		// in team
		int counter = 0;

		// Checking which year is youngest in team
		for (int i = 0; i < t.players.length; i++) {
			if (t.players[i].year > min) {
				min = t.players[i].year;
			}
		}

		// Checking how many player is born on youngest year
		for (int j = 0; j < t.players.length; j++) {
			if (t.players[j].year == min) {
				counter++;
			}
		}

		// Declaration of an array of youngest players
		Player[] youngestPlayers = new Player[counter];

		// Setting counter on 0
		int counter1 = 0;

		// Putting youngest players into an array of players
		for (int i = 0; i < t.players.length; i++) {
			// If the player is born on youngest year puts him into an array
			if (t.players[i].year == min) {
				youngestPlayers[counter1] = t.players[i];
				counter1++;
			}
		}

		return youngestPlayers;
	}

}
