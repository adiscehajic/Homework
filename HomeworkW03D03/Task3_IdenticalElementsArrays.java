import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_IdenticalElementsArrays {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] firstArray = new int[5];
		int[] secondArray = new int[5];

		System.out.println("Input elements of first array: ");

		while (true) {
			try {
				while (true) {
					for (int i = 0; i < firstArray.length; i++) {
						System.out.print("Input number: ");
						firstArray[i] = in.nextInt();
					}
					break;
				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Please input numerical value!");
				in.nextLine();
			}
		}

		System.out.println("Input elements of second array: ");

		while (true) {
			try {
				while (true) {
					for (int i = 0; i < secondArray.length; i++) {
						System.out.print("Input number: ");
						secondArray[i] = in.nextInt();
					}
					break;
				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Please input numerical value!");
				in.nextLine();
			}
		}

		int counter = 0;

		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if (secondArray[j] == firstArray[i]) {
					counter++;					
				} 
			}
		}

		System.out.println(counter);
		System.out.println(Arrays.toString(firstArray));
		System.out.println(Arrays.toString(secondArray));

		if (counter == firstArray.length) {
			System.out.println("Arrays are identical!");
		} else {
			System.out.println("Arrays are not identical!");
		}

		in.close();
	}

}
