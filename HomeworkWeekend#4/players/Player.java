package players;

public class Player {

	// Declaration of properties of player
	public String name;
	public int year;
	public String position;
	
	// Creating constructor
	public String toString() {
		String s = "";
		s += "Player name: " + name + "\n";
		s += "Player year of birth: " + year + "\n";
		s += "Player position: " + position + "\n";
		
		return s;
	}
	
	// Creating method toString
	public Player(String name, int year, String position) {
		super();
		this.name = name;
		this.year = year;
		this.position = position;
	}
	
	
	
	
	
}
