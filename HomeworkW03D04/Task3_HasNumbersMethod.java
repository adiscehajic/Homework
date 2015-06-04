
public class Task3_HasNumbersMethod {

	// This method calculates is there a number in the string that we input
	public static boolean hasNumbers(String s) {

		boolean hasNum = false;
		String numbers = "";

		// Compering characters of the string with a numbers from 0 to 9 that are
		// converted into characters
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < 10; j++) {
				numbers = "" + j;
				// Checking if there is a number in the string
				if (s.charAt(i) == numbers.charAt(0)) {
					hasNum = true;
				}
			}
		}
		// Returning result
		return hasNum;
	}

	public static void main(String[] args) {

		// Calling the method hasNumbers
		System.out.println("Is there a number in a string? "
				+ hasNumbers("index0f"));

	}

}
