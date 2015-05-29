public class Task1_InBetweenNumbers {

	public static void main(String[] args) {

		// This program outputs all numbers that are in the range of two inputed
		// numbers

		// Calling data from file input
		TextIO.readFile("src/Task1_input");

		// Declaration of first and second number
		int numFirst = TextIO.getInt();
		int numSecond = TextIO.getInt();

		// Declaration and calculating minNum and maxNum
		int minNum = numFirst;
		int maxNum = numSecond;

		if (minNum > numSecond) {
			minNum = numSecond;
			maxNum = numFirst;
		}

		// Calculating and printing which numbers are in-between first and
		// second number
		TextIO.putf("In-between number %d and number %d are numbers:\n",
				minNum, maxNum);
		for (int i = minNum + 1; i < maxNum; i++) {
			TextIO.putf("%3d", i);
		}
		
		TextIO.readStandardInput();

	}

}
