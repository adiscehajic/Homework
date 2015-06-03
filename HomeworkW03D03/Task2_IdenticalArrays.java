import java.util.Arrays;
import java.util.Scanner;

public class Task2_IdenticalArrays {

	public static void main(String[] args) {

		// This program compares two arrays and calculates are they identical
		
		Scanner in = new Scanner(System.in);

		// Declaration of two arrays
		int[] firstArray = new int[5];
		int[] secondArray = new int[5];

		// Inputing numbers into first array
		System.out.println("Insert 5 numbers into first array: ");
		while (true) {
			for (int i = 0; i < firstArray.length; i++) {
				System.out.print("Insert number: ");
				firstArray[i] = in.nextInt();
			}
			break;
		}

		// Inputing numbers into second array
		System.out.println("Insert 5 numbers into second array: ");
		while (true) {
			for (int i = 0; i < secondArray.length; i++) {
				System.out.print("Insert number: ");
				secondArray[i] = in.nextInt();
			}
			break;
		}

		// Declaration of an counter that will count identical numbers
		int counter = 0;
		
		// Checking which numbers are identical
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if (firstArray[i] == secondArray[j] && i == j) {
					counter++;
				}
			}
		}

		// Printing two inputed arrays
		System.out.println(Arrays.toString(firstArray));
		System.out.println(Arrays.toString(secondArray));

		// Printing the result
		if (counter == firstArray.length) {
			System.out.println("Arrays are identical!");
		} else {
			System.out.println("Array are not idenical!");
		}
		in.close();
	}
}
