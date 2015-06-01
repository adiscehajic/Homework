<<<<<<< HEAD
public class Task2_SumOfAllNumbers {

	public static void main(String[] args) {

		// This program calculates the sum of all numbers that are contained in
		// file input2 without -1

		TextIO.readFile("src/Task2_input");

		int sum = 0;
		int num = 0;

		// Taking numbers from file, checking if their are > 0 and addicting
		// them
		
		TextIO.putln("The numbers in the file are:");
		do {
			num = TextIO.getInt();

			if (num >= 0) {
				TextIO.put(num + " ");
			} else {
				break;
			}

			sum += num;
		} while (num >= 0);

		// Printing the amount of the sum of all numbers in file
		TextIO.putf("\nTheir sum is: %d", sum);

		TextIO.readStandardInput();
	}

}
=======
public class Task2_SumOfAllNumbers {

	public static void main(String[] args) {

		// This program calculates the sum of all numbers that are contained in
		// file input2 without -1

		TextIO.readFile("src/Task2_input");

		int sum = 0;
		int num = 0;

		// Taking numbers from file, checking if their are > 0 and addicting
		// them
		
		TextIO.putln("The numbers in the file are:");
		do {
			num = TextIO.getInt();

			if (num >= 0) {
				TextIO.put(num + " ");
			} else {
				break;
			}

			sum += num;
		} while (num >= 0);

		// Printing the amount of the sum of all numbers in file
		TextIO.putf("\nTheir sum is: %d", sum);

		TextIO.readStandardInput();
	}

}
>>>>>>> a52ed71a4eb0608c2821322bd526e1b4686ca5ba
