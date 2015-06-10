import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_MatrixNumCounter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Declaration of rows and columns of the matrix
		int rows = 0;
		int columns = 0;

		while (true) {
			while (true) {
				try {
					// Inputing number of matrix rows
					System.out.println("Insert number of matrix rows: ");
					rows = in.nextInt();
					break;
					// If the inputed value of row is not number catches
					// exception and returns again for the input
				} catch (InputMismatchException e) {
					System.out
							.println("Wrong input! Please input numerical value!");
					in.nextLine();
				}
			}
			while (true) {
				try {
					// Inputing number of matrix columns
					System.out.println("Insert number of matrix columns: ");
					columns = in.nextInt();

					break;
					// If the inputed value of row is not number catches
					// exception and returns again for the input
				} catch (InputMismatchException e) {
					System.out
							.println("Wrong input! Please input numerical value!");
					in.nextLine();
				}
			}

			break;
		}

		// Declaration of matrix with inputed values of rows and columns
		int[][] matrix = new int[rows][columns];

		// Inputing random elements into matrix
		matrix = MatrixMetods.getRandomMatrix(matrix);

		// Inputing the number that we want to count
		System.out.println("Input the number that you want to count: ");
		int number = in.nextInt();

		// Creating and printing matrix and calculating how many times does
		// inputed number repeats
		System.out.println(MatrixMetods.countNumber(matrix, number));

		in.close();
	}

}
