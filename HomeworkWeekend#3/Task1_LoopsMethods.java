import java.util.Scanner;

public class Task1_LoopsMethods {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Insert number: ");
		int num = in.nextInt();

		System.out.print("Inputed numbers with comma: ");
		getOutputComma(num);

		System.out.println("Number of digits is: " + getNumOfDigits(num));
		System.out
				.println("Inputed number with swaped first and last digit is: "
						+ changeFirstLastDigit(num));

		System.out.println("Input first number: ");
		int num1 = in.nextInt();
		System.out.println("Input second number: ");
		int num2 = in.nextInt();

		System.out.println("Numbers in their range is: "
				+ inRangeNumbers(num1, num2));

		in.close();

	}

	// This method outputs inputed number with comma after every three digits

	public static void getOutputComma(int num) {
		String s = "";
		int counter = 0;
		while (num > 0) {
			if (counter == 3) {
				s = "," + s;
				counter = 0;
			}
			s = num % 10 + s;
			num /= 10;
			counter++;
		}
		System.out.println(s);
	}

	// This method calculates the number of digits of inputed number
	public static int getNumOfDigits(int num) {
		int counter = 0;

		while (num > 0) {
			num /= 10;
			counter++;
		}
		return counter;
	}

	// This method swaps the position of the first and last digit of the inputed
	// number
	public static int changeFirstLastDigit(int num) {
		int numS = 0;
		int counter = 1;
		int lastDigit = num % 10;
		int revNum = 0;
		num = num / 10;

		if (num < 10) {
			revNum = lastDigit;
		} else {
			while (num > 10) {
				int digit = num % 10;
				numS += digit * Math.pow(10, counter);
				num /= 10;
				counter++;
			}
			revNum = (int) (lastDigit * Math.pow(10, counter) + numS + num);
		}
		return revNum;
	}

	public static String inRangeNumbers(int num1, int num2) {

		String str = "";

		int max = 0;
		int min = 0;

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		int num3 = max - min;

		for (int i = min; i < max; i++) {

			if (num3 % 2 == 0) {
				if (i % 2 == 0) {
					str += i + " ";
				}
			} else {
				if (i % 2 != 0) {
					str += i + " ";
				}
			}

		}

		return str;
	}

	/*
	 * public static String getOutputComma(int num){ String str = "" + num;
	 * 
	 * return str;
	 * 
	 * }
	 */

}
