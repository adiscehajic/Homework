import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		// This program computes the sum of digits of inputed number 
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		int sum = 0;

		for (int i = num; i > 0; i /= 10) {
			sum += i % 10;
		}

		System.out.println(sum);
		
		in.close();
	}

}
