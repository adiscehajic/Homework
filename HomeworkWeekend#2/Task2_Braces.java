import java.util.Scanner;

public class Task2_Braces {

	public static void main(String[] args) {

		// This program counts the number of braces and if the number is even
		// program outputs true and if it is odd program returns false and if
		// the first brace is opened program returns false

		Scanner in = new Scanner(System.in);
		
		System.out.print("Input braces: ");
		String braces = in.nextLine();

		// Declaration of counters for the opened and closed braces
		boolean evenNumOfBraces = true;
		int counterOpenBraces = 0;
		int counterClosedBraces = 0;

		// Checking if the brace is opened or closed and counting them
		for (int i = 0; i < braces.length(); i++) {

			if (braces.charAt(i) == '{') {
				counterOpenBraces++;
			} else if (braces.charAt(i) == '}') {
				counterClosedBraces++;
			}

			// If the first brace is opened, loop stops and outputs false
			if (braces.charAt(0) == '}') {
				break;
			}
			
			// If the brace is first closed, loop stops and outputs false
			if (braces.charAt(i) == '}' && counterOpenBraces < counterClosedBraces) {
				evenNumOfBraces = false;
				break;
			}

		}

		// Printing the result of counting braces
		if (counterOpenBraces != counterClosedBraces) {
			evenNumOfBraces = false;
			System.out.println("The number of braces is even? "
					+ evenNumOfBraces);
		} else {
			System.out.println("The number of braces is even? "
					+ evenNumOfBraces);
		}
		
		in.close();

	}

}
