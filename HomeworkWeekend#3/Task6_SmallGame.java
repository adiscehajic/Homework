import java.util.Arrays;
import java.util.Scanner;

public class Task6_SmallGame {

	public static void main(String[] args) {

		// This program enables user to see how much time does he need to bring
		// all values of the elements of an random array to zero
		
		Scanner in = new Scanner(System.in);

		// Declaration of an array with five elements
		int[] array = new int[5];

		// Printing array with random values
		System.out.println(Arrays.toString(getArray(array)));

		long time_start = System.currentTimeMillis();

		// Checking how much time does user need to bring all element values of
		// an array to 0
		while (!getAllZeros(array)) {
			System.out.println("Please insert value of index: ");
			int index = in.nextInt();
			try {
				game(array, index);
				System.out.println(Arrays.toString(array));
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("Please insert index from 0 to 4");
				in.nextLine();
			}

		}

		long time_end = System.currentTimeMillis();

		// Printing how much time had user needed
		if (getAllZeros(array)) {
			System.out.printf("You have won! You needed %d seconds!",
					(time_end - time_start) / 1000);
		}

		in.close();
	}

	// This method outputs an array with random element values from 0 to 4
	public static int[] getArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 4 + 1);
		}

		return array;
	}

	// This method checks if all elements of an array are 0
	public static boolean getAllZeros(int[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count++;
			}
		}

		if (count == array.length) {
			return true;
		}

		return false;
	}

	// This method changes values of the elements depending on the index
	public static int[] game(int[] array, int index) {

		// If the inputed value of index is out of bounds throws exception
		if (index > 4 || index < 0) {
			throw new IndexOutOfBoundsException();
		}

		int numIndex = array[index];

		// Changing the values of the array, depending on inputed index
		if (index % 2 == 0) {
			for (int i = 0; i < array.length; i++) {
				// Adding the value of selected index to all elements
				array[i] += numIndex;
				if (array[i] > 4) {
					array[i] = 4;
				}
			}
			// Subtracting the value of index by 1
			array[index] = numIndex - 1;
			if (array[index] < 0) {
				array[index] = 0;
			}
		} else {
			for (int i = 0; i < array.length; i++) {
				// Subtracting the values of all elements by value of index
				array[i] -= numIndex;
				if (array[i] < 0) {
					array[i] = 0;
				}
			}
			// Subtracting the value of index by 1
			array[index] = numIndex - 1;
			if (array[index] < 0) {
				array[index] = 0;
			}
		}

		return array;
	}
}
