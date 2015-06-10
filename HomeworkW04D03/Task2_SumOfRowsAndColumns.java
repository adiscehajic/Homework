public class Task2_SumOfRowsAndColumns {

	public static void main(String[] args) {

		// Declaration of a matrix with inputed elements
		int[][] array2D = { { 1, -2, 1 }, { 5, 0, 4 }, { -4, 2, 2 } };

		// Calling method printMatrix that will print matrix in the console
		MatrixMetods.printMatrix(array2D);

		// Calling method getNumOfZeroRowsAndColumns that calculates how many
		// sums of a rows and columns is zero
		System.out
				.println("Number of sums of elements in a row and column that are zero is: "
						+ MatrixMetods.getNumOfZeroRowsAndColumns(array2D));

	}

}
