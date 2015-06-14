package school;

public class Main_School {

	public static void main(String[] args) {

		// Creating of classes
		SchoolClass classOne = new SchoolClass("IVc¸", 34);
		SchoolClass classTwo = new SchoolClass("VIIId", 31);
		SchoolClass classThree = new SchoolClass("Ia", 25);
		SchoolClass classFour = new SchoolClass("IIIe", 30);
		SchoolClass classFive = new SchoolClass("Vb", 29);
		SchoolClass classSix = new SchoolClass("IVd¸", 31);
		SchoolClass classSeven = new SchoolClass("VIIa", 30);
		SchoolClass classEigth = new SchoolClass("IIa", 26);
		SchoolClass classNine = new SchoolClass("VIc", 28);
		SchoolClass classTen = new SchoolClass("Va", 35);

		SchoolClass classEleven = new SchoolClass("IVc¸", 24);
		SchoolClass classTwelve = new SchoolClass("VIIId", 29);
		SchoolClass classThirteen = new SchoolClass("Ia", 28);
		SchoolClass classFourteen = new SchoolClass("IIIe", 33);
		SchoolClass classFifteen = new SchoolClass("Vb", 27);
		SchoolClass classSixteen = new SchoolClass("IVd¸", 35);
		SchoolClass classSeventeen = new SchoolClass("VIIa", 31);
		SchoolClass classEigthteen = new SchoolClass("IIa", 24);
		SchoolClass classNineteen = new SchoolClass("VIc", 27);
		SchoolClass classTwenty = new SchoolClass("Va", 32);

		// Creating an arrays of classes
		SchoolClass[] classArrayOne = { classOne, classTwo, classThree,
				classFour, classFive, classSix, classSeven, classEigth,
				classNine, classTen };

		SchoolClass[] classArrayTwo = { classEleven, classTwelve,
				classThirteen, classFourteen, classFifteen, classSixteen,
				classSeventeen, classEigthteen, classNineteen, classTwenty };

		// Creating of directors
		Director directorOne = new Director("Zaid Zerdo", 1993);
		Director directorTwo = new Director("Gordan Masic", 1995);

		// Creating of schools
		School schoolOne = new School("Gimnasium", directorOne, classArrayOne);
		School schoolTwo = new School("Electrotechnical", directorTwo,
				classArrayTwo);

		// Creating an array of schools
		School[] schoolArrayOne = { schoolOne, schoolTwo };

		// Calling method getNameOfClassWithMostStudents and printing the class
		// with most students of inputed school
		System.out.printf("The class with most students in school %s is: \n", schoolOne.name); 
		getNameOfClassWithMostStudents(schoolOne);
		System.out.println();

		// Calling method getSchoolWithYoungestDirector and printing the school that has youngest directors
		System.out.println("School with youngest director is: \n" + getSchoolWithYoungestDirector(schoolArrayOne) + "\n");

		// Calling method getNameOfSchoolWithMoreStudents and printing the name of school with most students
		System.out
				.println("The school with most students is: " + getNameOfSchoolWithMoreStudents(schoolOne, schoolTwo));
	}

	/**
	 * Outputs the name of the class with most students in inputed school
	 * 
	 * @param s
	 *            School
	 */
	public static void getNameOfClassWithMostStudents(School s) {

		// Declaration of the variable that will represent the max number of
		// students
		int max = 0;

		// Calculating which is max number of students into a class
		for (int i = 0; i < s.classes.length; i++) {
			max = Math.max(s.classes[0].numberOfStudents,
					s.classes[i].numberOfStudents);
		}

		// Finding the class with max number of students
		for (int i = 0; i < s.classes.length; i++) {
			if (s.classes[i].numberOfStudents == max) {
				System.out.println(s.classes[i].name);
			}
		}
	}

	/**
	 * Outputs school that has youngest director from an array of schooles
	 * 
	 * @param schools
	 *            Array of schools
	 * @return School that has youngest director
	 */
	public static School getSchoolWithYoungestDirector(School[] schools) {

		// Declaration of the variable that will represent the max year
		int max = 0;

		// Calculating the max year
		for (int i = 0; i < schools.length; i++) {
			max = Math.max(schools[0].director.yearOfBirth,
					schools[i].director.yearOfBirth);
		}

		// Searching for a school that has director with max year of birth
		for (int i = 0; i < schools.length; i++) {
			if (schools[i].director.yearOfBirth == max) {
				return schools[i];
			}
		}

		return null;
	}

	/**
	 * Outputs the name of the school with most students from two inputed
	 * schools.
	 * <p>
	 * If the number of students in both inputed schools is the same outputs
	 * message that number of students is the same.
	 * 
	 * @param s1
	 *            First school
	 * @param s2
	 *            Second school
	 * @return If the number is larger in one school prints name of the school
	 *         with most students and if the number is same prints the message.
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2) {

		// Declaration of variables that will represent the amount of students
		// into each school
		int sumOfStudentsOne = 0;
		int sumOfStudentsTwo = 0;

		// Calculating the number of students in first school
		for (int i = 0; i < s1.classes.length; i++) {
			sumOfStudentsOne += s1.classes[i].numberOfStudents;
		}

		// Calculating the number of students in second school
		for (int i = 0; i < s2.classes.length; i++) {
			sumOfStudentsTwo += s2.classes[i].numberOfStudents;
		}

		// Checking which school has most students
		if (sumOfStudentsOne > sumOfStudentsTwo) {
			return s1.name;
		} else if (sumOfStudentsOne < sumOfStudentsTwo) {
			return s2.name;
		}

		return "Number of students in both schools is the same";
	}

}
