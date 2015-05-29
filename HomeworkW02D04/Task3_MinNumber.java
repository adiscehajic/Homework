import java.awt.font.NumericShaper;

public class Task3_MinNumber {

	public static void main(String[] args) {

		// This program outputs the lowest number in file who contains n+1
		// numbers where n is the number of numbers in file after him

		TextIO.readFile("src/Task3_input");

		// Pulling the number n from the file
		int num = TextIO.getInt();
		int numbers = 0;

		// Saving number n again in the file
		TextIO.writeFile("src/Task3_input");

		TextIO.putln(num);

		// Declaration of minimal value in the file
		int min = 100;

		// Putting n number of random numbers in the file and calculating which
		// number is lowest
		for (int i = 0; i < num; i++) {
			numbers = (int) (Math.random() * 100);
			TextIO.putln(numbers);

			if (numbers < min) {
				min = numbers;
			}

		}

		// Printing the lowest number in the file
		TextIO.putf("The lowest number in the file is: %d", min);

		TextIO.readStandardInput();
		TextIO.writeStandardOutput();
	}

}
