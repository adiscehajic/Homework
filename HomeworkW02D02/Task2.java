import java.util.Scanner;

public class Task2 {

	// This program outputs wished fibonnaci element 
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Select which fibonnaci element you want: ");
		int fibonnaci = in.nextInt();
		long firstNumber = 1;
		long secondNumber = 0;
		long thirdNumber = 0;

		for (int i = 1; i < fibonnaci; i++) {
			thirdNumber = firstNumber + secondNumber;
			secondNumber = firstNumber;
			firstNumber = thirdNumber;

		}

		if (fibonnaci <= 50) {
			System.out.printf("%d element of fibonnaci sequence is: %d",
					fibonnaci, firstNumber);
		} else {
			System.out.println("Error!");
		}

		in.close();
	}

}
