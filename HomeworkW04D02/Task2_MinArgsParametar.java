import java.util.Arrays;

/**
 * Program reads an array from args parameters and calculates the lowest number
 * 
 * @author Adis Cehajic
 *
 */
public class Task2_MinArgsParametar {

	public static void main(String[] args) {

		try {
			// Declaration of minimum value
			int min = Integer.parseInt(args[0]);

			// Printing args array
			System.out.println(Arrays.toString(args));

			// Calculating which is the lowest number
			for (int i = 0; i < args.length; i++) {
				int number = Integer.parseInt(args[i]);
				if (min > number) {
					min = number;
				}
			}
			// Printing lowest number
			System.out.printf("Min value in args array is: " + min);

		} catch (NumberFormatException e) {
			System.out.println("Please input only numbers!");
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Args array is empty! Please insert some numbers.");
		}

	}

}
