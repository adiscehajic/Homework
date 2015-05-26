import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		// This program outputs the highest divider of two inputed numbers

		Scanner in = new Scanner(System.in);

		System.out.print("Insert first number: ");
		int num1 = in.nextInt();

		System.out.print("Insert second number: ");
		int num2 = in.nextInt();

		boolean found = false;

		// Checking which of the two inputed numbers is lower
		int max = num1;

		if (max < num2) {
			max = num2;
		}

		// Checking and printing the highest common divider
		for (int i = max; i > 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.printf("Higher common divider of inputed numbers is: %d", i);
						found = true;
				break;
			}
			max--;
		}
		
		if (found == false) {
			System.out.println("The two inputed numbers have not common divider!");
		}

		in.close();
	}

}
