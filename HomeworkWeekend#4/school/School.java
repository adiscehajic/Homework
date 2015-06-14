package school;

import java.util.Arrays;

public class School {

	// Declaration of properties of school
	public String name;
	public Director director;
	public SchoolClass[] classes;

	// Creating constructor
	public School(String name, Director director, SchoolClass[] classes) {
		super();
		this.name = name;
		this.director = director;
		this.classes = classes;
	}
	
	// Creating method toString
	public String toString() {
		String s = "";
		s = "Name: " + name + "\n";
		s += "Director: " + director + "\n";
		s += "Classes: " + Arrays.toString(classes) + "\n";
		
		return s;
	}
}
