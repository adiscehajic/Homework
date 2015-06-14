package players;

import java.util.Arrays;

public class Team {

	// Declaration of properties of team
	public String name;
	public Player[] players;
	
	// Creating constructor
	public String toString() {
		String s = "";
		s += "Team name: " + name + "\n";
		s += "Players: " + Arrays.toString(players) + "\n";
		
		return s;
	}

	// Creating method toString
	public Team(String name, Player[] players) {
		super();
		this.name = name;
		this.players = players;
	}
	
}
