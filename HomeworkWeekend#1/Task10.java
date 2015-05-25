public class Task10 {

	public static void main(String[] args) {
		int valueA = 2;
		int valueB = 10;
		int valueC = -4;
		int valueD = 24;
		int valueX = 4;

		// This program shows is it the inputted value X a solution of cubic equation

		if ((valueA * Math.pow(valueX, 3) + valueB * Math.pow(valueX, 2)
				+ valueC * valueX + valueD) == 0) {
			System.out
					.println("The inputted value X is the solution of cubic equation!");
		} else {
			System.out
					.println("The inputted value X is not the solution of cubic equation!");
		}
	}

}
