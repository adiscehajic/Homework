import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		// This program outputs the numbers that are lower than inputed and
		// which can be divided with its sum of digits
		
		Scanner in = new Scanner(System.in);

		System.out.print("Input number: ");
		int num = in.nextInt();

		System.out.print("The numbers which can be divided with its sum are: ");
		while (num > 1) {
			num--;

			int num2 = num;
			int sum = 0;

			while (num2 > 0) {
				sum += num2 % 10;
				num2 /= 10;
			}

			if (num % sum == 0) {
				System.out.print(num + " ");
			}
		}

		in.close();
	}

}
