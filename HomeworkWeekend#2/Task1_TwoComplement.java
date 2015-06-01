import java.util.Scanner;

public class Task1_TwoComplement {

	public static void main(String[] args) {

		// This program calculates two's complement of the binary number

		Scanner in = new Scanner(System.in);
		
		System.out.print("Input binary number: ");
		String bin = in.nextLine();
		int num = 4;
		int counter = 0;
		String newBin = "";

		for (int i = 0; i < bin.length(); i++) {
			counter++;
		}

		// Calculating if the binary number is positive or negative
		// If it is negative program calculates two's complement of the binary
		// number
		if (counter % num == 0) {
			for (int i = 0; i < bin.length(); i++) {
				char binChar = bin.charAt(i);
				if (binChar == '1') {
					newBin += '0';
				} else if (binChar == '0') {
					newBin += '1';
				}
			}

			// Declaration of two's complement
			String binComplement = "";
			if (newBin.charAt(bin.length() - 1) == '0') {
				for (int i = 0; i < bin.length(); i++) {
					if (i == bin.length() - 1) {
						binComplement += '1';
					} else {
						binComplement += newBin.charAt(bin.length() - 1);
					}
				}
				System.out.print("Binary number is: " + binComplement);
			} else if (newBin.charAt(bin.length() - 1) == '1') {
				counter = 0;
				for (int i = bin.length() - 1; i >= 0; i--) {
					if (newBin.charAt(i) == '1') {
						binComplement += '0';
						counter++;
					} else {
						binComplement += '1';
						counter++;
					}
					if (binComplement.charAt(counter - 1) == '1') {
						counter = i - 1;
						break;
					}
				}
				if (counter < newBin.length()) {
					for (int i = counter; i >= 0; i--) {
						binComplement += newBin.charAt(i);
					}
				}
				String twoComplement = "";
				for (int i = newBin.length() - 1; i >= 0; i--) {
					twoComplement += binComplement.charAt(i);
				}
				System.out.println("Binary number is: " + twoComplement);
			}
		} else {
			System.out.println("Binary number is: " + bin);
		}
		
		in.close();
	}

}
