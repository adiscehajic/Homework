public class Task2 {

	public static void main(String[] args) {
		
		// This program calculates the sum of all even numbers from 0 to random number num
		// Declaring and initializing random number num
		int num = 965;
		
		// Declaring and initializing a variable that will present the even numbers
		int counter = 0;
		
		// Declaring and initializing a variable that will sum all even numbers
		int evenNumbersSum = 0;

		// Checking if the number is even or odd
		while (counter < num) {
			if (counter % 2 == 0) {			 
				evenNumbersSum += counter;	
				System.out.print("");
			}
			counter++;
		}
		
		// Printing the sum of all even numbers from 0 to random number num
		System.out.println("The sum of all even numbers in the given range is: "
						+ evenNumbersSum);
	}
}
