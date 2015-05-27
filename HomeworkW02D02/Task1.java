import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		// This program draws a rectangle with + ! and |
		
		Scanner in = new Scanner(System.in);

		System.out.print("Input side a: ");
		int num1 = in.nextInt();
		
		System.out.print("Input side b: ");
		int num2 = in.nextInt();

		for (int i = 0; i < num1; i++) {

			if (i == 0 || i == num1 - 1) {
				System.out.print("+");
			} else {
				System.out.print("|");
			}

			for (int j = 0; j < num2 - 2; j++) {
				if (i > 0 && i < num1 - 1) {
					System.out.print(" ");
				} else {
					System.out.print("-");
				}
			}

			if (i == 0 || i == num1 - 1) {
				System.out.print("+");
			} else {
				System.out.print("|");
			}

			System.out.println();
		}

		in.close();
	}

}
