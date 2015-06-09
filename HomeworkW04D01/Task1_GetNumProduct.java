/**
 * Program calculates product of all elements of an array.
 * <p>
 * If the all elements are not numerical value it throws NumberFormatException.
 * 
 * @author Adis Cehajic
 *
 */
public class Task1_GetNumProduct {

	public static void main(String[] args) {

		try {
			// Throwing exception if there is no elements in the array
			if (args.length == 0) {
				throw new ArrayIndexOutOfBoundsException();
			}
			// Calling method getArguments which will print all inputed
			// numerical values in the console
			getArguments(args);
			// Printing product of all numerical values of the array
			System.out.printf(
					"\nProduct of all float numbers in args array is: %.2f\n",
					productOfArgsElements(args));
		} catch (NumberFormatException ex) {
			System.out
					.println("\nCan not calculate product!\nNot all array values are numerical!");
		} catch (ArrayIndexOutOfBoundsException ex2) {
			System.out.println("There is no elements in the array!");
		}
	}

	/**
	 * Prints the elements of an array in the console
	 * 
	 * @param args
	 *            - Inputed array
	 * @throws NumberFormatException
	 *             If the element is not a number
	 */
	public static void getArguments(String[] args) {

		System.out.println("Elements in args array are: ");

		for (int i = 0; i < args.length; i++) {
			System.out.printf("%.2f ", Float.parseFloat(args[i]));
		}

	}

	/**
	 * Calculates the product of all numerical elements of an argument array. If
	 * the element is not a number throws exception.
	 * 
	 * @param args
	 *            - Inputed argument array
	 * @return Product of all numerical elements of an argument array
	 */
	public static float productOfArgsElements(String[] args) {
		float product = 1;

		for (String num : args) {
			float number = Float.parseFloat(num);
			product *= number;
		}
		return product;

	}
}
