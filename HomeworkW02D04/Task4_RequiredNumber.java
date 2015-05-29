public class Task4_RequiredNumber {

	public static void main(String[] args) {

		// This program uses two numbers from the file, where first number
		// represents the number of nubers that will apear after first and
		// second number, and second number represents

		TextIO.readFile("src/Task4_input");

		// Pulling the numbers N and M from the file
		int numN = TextIO.getInt();
		int numM = TextIO.getInt();

		// Outputing them in the console
		TextIO.putln(numN);
		TextIO.putln(numM);

		int counter = 0;

		// Saving N numbers in the file and calculating if number M is in
		// the file
		for (int i = 0; i < numN; i++) {
			int numbers = (int) (Math.random() * 10);
			TextIO.putln(numbers);
			if (numbers == numM) {
				counter++;
			}
		}

		// Printing the result
		if (counter > 0) {
			TextIO.put("Number M is in the file");
		} else {
			TextIO.put("Number M is not in the file");
		}

		TextIO.readStandardInput();

	}

}
