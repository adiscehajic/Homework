package school;

public class SchoolClass {

	// Declaration of properties of class
	public String name;
	public int numberOfStudents;
	
	// Creating constructor
	public SchoolClass(String name, int numberOfStudents) {
		super();
		this.name = name;
		this.numberOfStudents = numberOfStudents;
	}
	
	// Creating method toString
	public String toString() {
	
		String s = "";
		s = "Name: " + name + "\n";
		s += "Number of students: " + numberOfStudents + "\n";
		
		return s;
	}
	
}
