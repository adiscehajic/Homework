/**
 * Program calculates how many number characters contains inputed string.
 * 
 * @author Adis Cehajic
 *
 */
public class Task3_CountOfNumbers {

	public static void main(String[] args) {

		try {
			// Checking if there is any string elements
			if (args.length == 0) {
				throw new IllegalArgumentException();
				// Checking if there is more than one string element
			} else if (args.length > 1) {
				throw new ArrayIndexOutOfBoundsException();
				// Calling method getCountOfNumbers and calculating the number
				// of number characters in inputed string and printing result
			} else if (args.length == 1) {
				if (getCountOfNumbers(args[0]) == 0) {
					System.out.printf("%s does not contain any numbers!",
							args[0]);
				} else {
					System.out.printf("%s contains %d number(s)!\n", args[0],
							getCountOfNumbers(args[0]));
				}
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Please input ONE string to the program!");
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Please input ONLY one string to the program!");
		}

	}

	/**
	 * Calculates how many number characters contains inputed string.
	 * 
	 * @param str
	 *            - Inputed string argument.
	 * @return Number of number characters in inputed string.
	 * @throws ArrayIndexOutOfBoundsException If there is no elements in the string.
	 */
	public static int getCountOfNumbers(String str) {

		// Declaration of counter that will count number characters
		int count = 0;

		// Going trough string character by character
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			// Checking if ASCII value of character is from 47 to 58
			if (character > 47 && character < 58) {
				count++;
			}
		}

		// Returning number of number characters
		return count;
	}

}
