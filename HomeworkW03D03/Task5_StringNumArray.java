import java.util.Arrays;
import java.util.Scanner;

public class Task5_StringNumArray {

	public static void main(String[] args) {

		// This program is calculating how many times does a numbers from 0 to 9
		// repeats into string array
		
		Scanner in = new Scanner(System.in);

		// Inputing the length of an array
		System.out.println("Insert string array length: ");
		int length = in.nextInt();
		
		// Declaration of an string array
		String[] array1 = new String[length];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = in.nextLine();
		}

		// Declaration of a counters that will count the elements
		int counter = 0;
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		int counter6 = 0;
		int counter7 = 0;
		int counter8 = 0;
		int counter9 = 0;

		String str = "";

		char character;

		// Counting how many times does elements repeat
		for (int i = 0; i < array1.length; i++) {
			str = (array1[i]);
			for (int j = 0; j < str.length(); j++) {
				character = str.charAt(j);
				int num = (int) character - 48;
				switch (num) {
				case 0:
					counter++;
					break;
				case 1:
					counter1++;
					break;
				case 2:
					counter2++;
					break;
				case 3:
					counter3++;
					break;
				case 4:
					counter4++;
					break;
				case 5:
					counter5++;
					break;
				case 6:
					counter6++;
					break;
				case 7:
					counter7++;
					break;
				case 8:
					counter8++;
					break;
				case 9:
					counter9++;
					break;
				}
			}
		}
		
		// Printing the new array with counted elements
		int[] array2 = new int[] { counter, counter1, counter2, counter3,
				counter4, counter5, counter6, counter7, counter8, counter9 };
		System.out.println(Arrays.toString(array2));

		in.close();
	}

}
