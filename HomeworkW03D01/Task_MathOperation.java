import java.util.Scanner;

public class Task_MathOperation {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (true) {
			try {

				// Iputing the expression that we want to calculate
				System.out.print("Input expression: ");
				String expression = in.nextLine();

				expression = expression.replaceAll("\\s", "");

				// Declaring the counter that will output the position of sign
				int counter = 0;

				// Searching the position of the sign
				for (int i = 0; i < expression.length(); i++) {
					if (expression.charAt(i) == '+'
							|| expression.charAt(i) == '-'
							|| expression.charAt(i) == '/'
							|| expression.charAt(i) == '*') {
						counter = expression.indexOf(expression.charAt(i));
					}
				}

				// Dividing the left and right side of the expression
				String firstString = expression.substring(0, counter);
				String secondString = expression.substring((counter + 1),
						expression.length());

				// Converting the left and right side of the string expression
				// into integer
				Integer firstNum = Integer.parseInt(firstString);
				Integer secondNum = Integer.parseInt(secondString);

				int result = 0;

				// Calculating the inputed expression
				switch (expression.charAt(counter)) {
				case '+':
					result = firstNum + secondNum;
					break;
				case '-':
					result = firstNum - secondNum;
					break;
				case '/':
					result = firstNum / secondNum;
					break;
				case '*':
					result = firstNum * secondNum;
					break;
				default:
					break;
				}

				// Printing the result
				System.out
						.println("The result of the expression is: " + result);
				break;
			} catch (StringIndexOutOfBoundsException e) {
				System.out
						.println("Wrong input! \nYou have not inputed anything. "
								+ "\nPlease input expression that you want to calculate.");
			} catch (NumberFormatException e1) {
				System.out.println("Wrong input! \nPlease enter values that are numbers.");
			}
		}
		in.close();
	}
}
