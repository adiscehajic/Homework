public class Task4_Decrypting {

	public static void main(String[] args) {

		// This program decrypts given encodedFile.in

		TextIO.readFile("src/encodedFile");

		int numOfRows = TextIO.getInt();

		// Outputing the text from the file
		for (int i = 0; i < numOfRows; i++) {
			String text = TextIO.getln();

			// Subtraction of ASCII numbers of the characters for one and
			// printing the result
			for (int j = 0; j < text.length(); j++) {
				char character = text.charAt(j);
				int numChar = character - 1;
				character = (char) numChar;
				TextIO.put(character);
			}
			TextIO.putln();
		}

		TextIO.readStandardInput();
	}
}
