import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program converts the value of temperature in celsiuses into kelvins
 * 
 * @author Adis Cehajic
 *
 */
public class Task1_ConvertToKelvins {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (true) {
			try {
				System.out
						.println("Please input value of temperature in celsiuses (°)");
				double celsius = in.nextDouble();
				System.out.printf("Value of temperature in kelvins is: %.2f K",
						convertToKelvins(celsius));
				break;
			} catch (InputMismatchException e) {
				System.out.println("Inputed wrong value of celsius.");
				in.nextLine();
			}
		}
		in.close();
	}

	/**
	 * Converts inputed temperature in celsiuses (°) into kelvins (K)
	 * 
	 * @param celsius
	 *            - Inputed value of temperature in celsiuses (°)
	 * @return - Value of inputed temperature in kelvins (K)
	 * @throws InputMismatchException
	 *             If the inputed values of celsiuses is not numerical value
	 */
	public static double convertToKelvins(double celsius) {
		return celsius + 273.15;
	}

}
