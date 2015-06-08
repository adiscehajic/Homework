import java.util.Arrays;
import java.util.Scanner;


public class Task5_ArraysMethods {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Inputing length of first array
		System.out.println("Input length of first array:");
		int arrayLength1 = in.nextInt();

		// Inputing length of second array
		System.out.println("Input length of second array:");
		int arrayLength2 = in.nextInt();

		// Declaration of both arrays
		int[] array1 = new int[arrayLength1];
		int[] array2 = new int[arrayLength2];

		// Inputing elements into first array
		System.out.println("Input elemets of first array: ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = in.nextInt();
		}

		// Inputing elements into second array
		System.out.println("Input elemets of second array: ");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = in.nextInt();
		}

		// Calling method compareArrays
		System.out.println("Arrays are equal? " + compareArrays(array1, array2));
		
		// Calling method computeTwoArrays
		System.out.println("The sum of two arrays is: " + Arrays.toString(computeTwoArrays(array1, array2)));

		// Calling methos mergingTwoArrays
		System.out.println("Two inputed arrays into thirs: " + Arrays.toString(mergingTwoArrays(array1, array2)));
		in.close();
		
	}

	// This method calculates if the two inputed arrays are equal
	public static boolean compareArrays(int[] array1, int[] array2) {

		// Checking if the length of both arrays are equal, if not returns false
		if (array1.length != array2.length) {
			return false;
		}

		// Comparing elements of two arrays
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}

		return true;
	}
	
	// This method computes elements of two inputed arrays
	public static int[] computeTwoArrays(int[] array1, int[] array2){
		int maxLength = 0;
		
		// Checking which inputed array is larger
		if (array1.length > array2.length) {
			maxLength = array1.length;
		} else {
			maxLength = array2.length;
		}

		// Declaration of the third array
		int[] array3 = new int[maxLength];

		// Addition of the elements of two array into third array
		for (int i = 0; i < array3.length; i++) {
			if (array1.length > array2.length) {
				if (i < array2.length) {
					array3[i] = array1[i] + array2[i];
				} else {
					array3[i] = array1[i];
				}
			} else if (array2.length > array1.length) {
				if (i < array1.length) {
					array3[i] = array1[i] + array2[i];
				} else {
					array3[i] = array2[i];
				}
			}
		}
		
		return array3;
		
	}
	
	// This method merges two inputed arrays into third array
	public static int[] mergingTwoArrays(int[] array1, int[] array2){
		
		// Declaration of an empty array
		int[] array3 = new int[array1.length + array2.length];

		// Merging first and second array with third array
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (j == i) {
					array3[i] = array1[j];
				}
			}
			for (int z = 0; z < array2.length; z++) {
				if ((z + array1.length) == i) {
					array3[i] = array2[z];
				}
			}
		}
		return array3;
	}
	
}
