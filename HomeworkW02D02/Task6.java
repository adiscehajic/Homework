import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		// This program outputs the wanted digit of inputed number

		Scanner in = new Scanner(System.in);

		System.out.print("Input number: ");
		int num = in.nextInt();

		System.out.print("Input the position from right side to left: ");
		int numDigit = in.nextInt();

		int counter = 0;

		for (int i = num; i > 0; i /= 10) {
			int digits = i % 10;
			counter++;
			if (counter == numDigit) {
				System.out.println("The wanted digit is: " + digits);
				break;
			}
		}
		in.close();

	}

}
