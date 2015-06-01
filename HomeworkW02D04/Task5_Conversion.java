<<<<<<< HEAD
public class Task5_Conversion {

	public static void main(String[] args) {

		// This program is converting decimal number into binary number

		TextIO.readFile("src/Task5_decimal");

		// Calling decimal value from file
		int decimal = TextIO.getInt();

		// Declaration of variable binary and converting decimal value into
		// binary
		String binary = Integer.toBinaryString(decimal);

		// Outputing the result into fila binary
		TextIO.writeFile("src/Task5_binary");
		TextIO.put(binary);

		TextIO.readStandardInput();
		TextIO.writeStandardOutput();

	}

}
=======
public class Task5_Conversion {

	public static void main(String[] args) {

		// This program is converting decimal number into binary number

		TextIO.readFile("src/Task5_decimal");

		// Calling decimal value from file
		int decimal = TextIO.getInt();

		// Declaration of variable binary and converting decimal value into
		// binary
		String binary = Integer.toBinaryString(decimal);

		// Outputing the result into fila binary
		TextIO.writeFile("src/Task5_binary");
		TextIO.put(binary);

		TextIO.readStandardInput();
		TextIO.writeStandardOutput();

	}

}
>>>>>>> a52ed71a4eb0608c2821322bd526e1b4686ca5ba
