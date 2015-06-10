import java.util.Scanner;

public class Task3_Jumper {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Declaration of matrix 3x3
		int[][] array2D = new int[3][3];

		// Inputing elements into the matrix
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print("Insert element: ");
				array2D[i][j] = in.nextInt();
			}
		}

		// Calling method printMatrix that prints inputed matrix in the console
		MatrixMetods.printMatrix(array2D);

		// Inputing Y coordinate
		System.out.print("Insert Y coordinate (number of row): ");
		int y = in.nextInt();

		// Inputing X coordinate
		System.out.print("Insert X coordinate (number of column): ");
		int x = in.nextInt();

		// Calling method getMaxPoints and printing the result
		System.out.printf("Max points for field %d,%d is: ", y, x);
		System.out.print(MatrixMetods.getMaxPoints(array2D, y, x));

		in.close();
	}
}
