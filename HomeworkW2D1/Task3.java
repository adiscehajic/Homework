public class Task3 {
	
	public static void main(String[] args) {

		// This program calculates is the inputed number 'perfect' or not
		// Declaring and initializing random number inputedNum
		int inputedNum = 496;

		// Declaring and initializing a variable that will present the
		// numbers with which the inputed number can be divided
		int counter = 1;

		// Declaring and initializing a variable that will sum all numbers
		// with which the inputed number can be divided
		int inputedNumDividerSum = 0;

		System.out.print("The dividers of inputed number are: ");

		// Checking if the number present the numbers with which the
		// inputed number can be divided
		while (counter < inputedNum) {
			if (inputedNum % counter == 0) {
				System.out.print(counter + " ");
				inputedNumDividerSum += counter;
			}
			counter++;
		}
		System.out.println("\nThe sum of inputed number is: "
				+ inputedNumDividerSum);

		// Checking if the inputed number is the 'perfect' number or not
		// and printing the result
		if (inputedNum == inputedNumDividerSum) {
			System.out.printf("The inputed number %d is 'perfect' number!",
					inputedNum);
		} else {
			System.out.printf("The inputed number %d is not 'perfect' number!",
					inputedNum);
		}
	}
}
