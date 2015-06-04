public class Task2_GradesMethod {

	// This method calculates which grade has student scored
	public static char getGrade(int score) {
		char grade = ' ';

		switch (score) {
		case 100: case 99: case 98:case 97: case 96: case 95: case 94:
				grade = 'A';			
			break;
		case 93: case 92: case 91: case 90: case 89: case 88: case 87: case 86: case 85: case 84:
				grade = 'B';
			break;
		case 83: case 82: case 81: case 80: case 79: case 78: case 77: case 76: case 75: case 74:
				grade = 'C';
			break;
		case 73: case 72: case 71: case 70: case 69: case 68: case 67: case 66: case 65: case 64:
				grade = 'D';
			break;
		case 63: case 62: case 61: case 60: case 59: case 58:case 57: case 56: case 55:
				grade = 'E';
			break;
		default:
				grade = 'F';
			break;
		}
		return grade;
	}

	public static void main(String[] args) {
		
		// Calling the method getGrade
		System.out.println("Your grade is: " + getGrade(0));

	}

}
