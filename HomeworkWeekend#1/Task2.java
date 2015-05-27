
public class Task2 {

	public static void main(String[] args) {
		double num = 7.5;
		
		// This program shows in which range is the inputed number
		
		if((num > 5) && (num <= 7.5)) {
			System.out.println("The inputed number is in the range from 5 to 7.5!");
		} else if ((num > 7.5) && (num <= 10)) {
			System.out.println("The inputed number is in the range from 7.5 to 10!");
		} else {
			System.out.println("The inputed number is not in the range from "
					+ "5 to 7.5 and in the range from 7.5 to 10!");
		}
	}

}
