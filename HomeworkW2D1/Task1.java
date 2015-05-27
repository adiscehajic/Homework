public class Task1 {
	
	public static void main(String[] args) {

		// This program calculates how many times can inputed number be divided
		// Declaring and initializing random number inputedNum
		int inputedNum = 2164;

		// Declaring and initializing number num
		int num = inputedNum;

		// Declaring and initializing a variable that will present
		// how many times can inputed number be divided
		int counter = 0;

		// Computing how many times can inputed number be divided
		do {
			num /= 2;
			counter++;

		} while (num / 2 > 0);

		// Printing the sum of all even numbers from 0 to random number num
		System.out.printf("The inputed number %d can be divided %d times!", inputedNum, counter);

	}
}
