
public class Main {

	public static void main(String[] args) {

		// Declaration of variable numberInt
		int numberInt = 10;

		// Calling method product
		System.out.printf("Square of inputed number %d is %d\n", numberInt,
				product(numberInt));

		// Declaration of variable numberDouble
		double numberDouble = 10;

		// Calling method product
		System.out.printf("Square of inputed number %.2f is %.2f\n",
				numberDouble, product(numberDouble));

		// Declaration of two integer variables
		int numberFirstInt = 10;
		int numberSecondInt = 15;

		// Calling method product
		System.out.printf("Product of numbers %d and %d is %d\n",
				numberFirstInt, numberSecondInt,
				product(numberFirstInt, numberSecondInt));

		// Declaration of two double variables
		double numberFirstDouble = 10;
		double numberSecondDouble = 15;

		// Calling method product
		System.out.printf("Product of numbers %.2f and %.2f is %.2f",
				numberFirstDouble, numberSecondDouble,
				product(numberFirstDouble, numberSecondDouble));

	}

	/**
	 * Calculates the integer value of a square of inputed number
	 * 
	 * @param number
	 *            Inputed integer value
	 * @return Square of inputed number
	 */
	public static int product(int number) {
		return number * number;
	}

	/**
	 * Calculates the double value of a square of inputed number
	 * 
	 * @param number
	 *            Inputed double value
	 * @return Square of inputed number
	 */
	public static double product(double number) {
		return number * number;
	}

	/**
	 * Calculates product of two inputed integer numbers
	 * 
	 * @param numberFirstInt
	 *            First inputed integer number
	 * @param numberSecondInt
	 *            Second inputed integer number
	 * @return Product of two inputed numbers
	 */
	public static int product(int numberFirstInt, int numberSecondInt) {
		return numberFirstInt * numberSecondInt;
	}

	/**
	 * Calculates product of two inputed double numbers
	 * 
	 * @param numberFirstDouble
	 *            First inputed double number
	 * @param numberSecondDouble
	 *            Second inputed double number
	 * @return Product of two inputed numbers
	 */
	public static double product(double numberFirstDouble,
			double numberSecondDouble) {
		return numberFirstDouble * numberSecondDouble;
	}

}
