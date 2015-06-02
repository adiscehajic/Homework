import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task2_FileFactorial {

	public static void main(String[] args) {

		// This program is reading values from a file and calculating the
		// factorial of a same number

		// Reading from a file
		TextIO.readFile("src/Test");

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Input name of a file: ");
			// Inputing the name of a file
			String fileName = input.nextLine();
			try {
				long factorial = 1;

				// Checking if the file exist
				if (fileName.equals("Test")) {
					int num = TextIO.getInt();
					// Calculating the factorial of a number from a file
					for (int i = 1; i <= num; i++) {
						factorial *= i;
					}
					// Printing the result
					System.out.printf("Factorial of a number %d is %d!", num,
							factorial);
				} else {
					// If the inputed file name does not exist, user must again
					// input name of a file
					throw new NoSuchElementException();
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Inputed file does not exist. Please input right name.");
			} catch (NoSuchElementException e2) {
				System.out.println("Inputed file does not exist. Please input right name.");
			} catch (IllegalArgumentException e1) {
				System.out.println("The number is not on the first place in the file.");
				break;
			}
		}
		input.close();
		TextIO.readStandardInput();
	}
}
