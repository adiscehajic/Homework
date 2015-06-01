import java.util.Scanner;

public class Task5_Methods {

	// This method outputs the odd number that comes after inputed number
	public static int getNextOddNumber(int num) {
		int oddNumber = 0;
		for (int i = num + 1; i > num; i++) {
			if (i % 2 != 0) {
				oddNumber = i;
				break;
			}
		}
		return oddNumber;
	}

	// This method calculates the area of the circle
	public static double getAreaOfCircle(int diameter) {
		int radius = diameter / 2;
		double areaOfCircle = Math.pow(radius, 2) * Math.PI;
		return areaOfCircle;
	}

	// This method calculates is the inputed number in the range between two
	// numbers
	public static boolean isInRange(int start, int finish, int num) {
		boolean inRange = false;

		if (num > start && num < finish) {
			inRange = false;
		}

		return inRange;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");
		int num = in.nextInt();

		System.out.printf("Next odd number is: %d\n", getNextOddNumber(num));
		System.out.printf("Area of circle is: %.2f\n", getAreaOfCircle(num));
		System.out.printf("Is the inputed number in range? %b",
				isInRange(1, 5, 2));

		in.close();
	}
}
