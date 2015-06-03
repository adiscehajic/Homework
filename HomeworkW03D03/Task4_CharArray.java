import java.util.Arrays;
import java.util.Scanner;

public class Task4_CharArray {

	public static void main(String[] args) {

		// This program moves the elements of the array for the position that
		// user wants
		Scanner in = new Scanner(System.in);

		// Inputing the number of the position that user want to move elements
		System.out.println("Input number N: ");
		int n = in.nextInt();

		// Declaring the array of character elements
		char[] array = new char[] { 'I', 'N', 'G', 'B', 'I', 'T', 'C', 'A',
				'M', 'P' };

		// Declaring the empty array
		char[] array1 = new char[array.length];

		// Moving elements to the right side
		if (n >= 0 || n % array.length == 0) {
			int i = 0;
			n = n % array.length;
			while (i < array.length) {
				while (n < array.length) {
					array1[n] = array[i];
					n++;
					if (n == array.length) {
						n -= n;
					}
					break;
				}
				i++;
			}
			System.out.println(Arrays.toString(array1));

		// Moving elements to the left side
		} else {
			int i = 0;
			n = array.length + n;
			while (i < array.length) {
				while (n < array.length) {
					array1[n] = array[i];
					n++;
					if (n == array.length) {
						n -= n;
					}
					break;
				}
				i++;
			}

			// Printing the array
			System.out.println(Arrays.toString(array1));
		}
		in.close();
	}

}
