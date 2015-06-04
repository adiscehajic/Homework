public class Task5_NumbersOnlyMethod {

	// This method throws all characters of the string except numbers
	public static String getNumbersOnly(String s) {

		// Declaration of a string in which method will putt all characters that
		// are numbers
		String numbersOnly = "";

		// Comparison of characters of the string with ASCII value of the
		// numbers from 0 to 9
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				numbersOnly += s.charAt(i);
			}
		}
		// Checking if there is numbers into string. If there is no numbers
		// result is 0
		if (numbersOnly == "") {
			numbersOnly = "" + 0;
		}
		// Returning new string only with characters that are numbers
		return numbersOnly;
	}

	public static void main(String[] args) {

		// Calling method getNumbersOnly
		System.out.println(getNumbersOnly(":r:(:S"));
	}
}
