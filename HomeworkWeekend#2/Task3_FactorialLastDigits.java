import java.util.Scanner;

public class Task3_FactorialLastDigits {

	public static void main(String[] args) {

		// This program outputs the last two digit of factorial of inputed
		// number that are not 0

		Scanner in = new Scanner(System.in);

		// Inputing number
		System.out.println("Input number: ");
		int num = in.nextInt();

		// Checking if the inputed number is higher than 3, while factorial of
		// numbers lower than 4 have only one digit
		if (num > 3) {

			long factorial = 1;

			// Calculating the factorial of inputed number
			for (int i = 1; i <= num; i++) {
				factorial *= i;
				while (factorial % 10 == 0) {
					factorial /= 10;
				}
				factorial %= 1000000;
			}

			int digitCounter = 0;

			int digitSum = 0;

			// Printing last two digit of the factorial that are not 0
			do {
				int digit = (int) (factorial % 10);

				digitSum += (int) (digit * Math.pow(10, digitCounter));

				if (digit != 0) {
					digitCounter++;
				}

				factorial /= 10;
			} while (factorial > 0 && digitCounter < 2);

			// Printing the result
			System.out.print("Last two digits are: " + digitSum);
		} else {
			System.out
					.println("The factorial of inputed number has only one digit.");
		}

		in.close();
	}

}
