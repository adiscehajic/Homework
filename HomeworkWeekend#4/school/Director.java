package school;

public class Director {

	// Declaration of properties of director
	public String name;
	public int yearOfBirth;
	
	// Creating constructor
	public Director(String name, int yearOfBirth) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}
	
	// Creating method toString
	public String toString() {
		String s = "";
		s = "Name: " + name + "\n";
		s += "Year of birth: " + yearOfBirth + "\n";
		
		return s;
	}
	
}
