import java.util.Arrays;

public class Task1_HundredElements {

	public static void main(String[] args) {

		// This program outputs an array of 100 elements that contains only
		// numbers from 0 to 9
		
		// Declaration of an array with 100 elements
		int[] arr = new int[100];

		// Inputing values from 0 to 9 into array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			while (arr[i] > 9) {
				arr[i] -= 10;
			}
		}

		// Printing the result
		System.out.println(Arrays.toString(arr));
	}

}
