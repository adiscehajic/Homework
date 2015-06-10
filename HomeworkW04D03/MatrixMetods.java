public class MatrixMetods {

	/**
	 * Prints matrix with random values of elements from 0 to 9.
	 * 
	 * @param matrix
	 *            - Declared matrix with random values of elements
	 */
	public static int[][] getRandomMatrix(int[][] matrix) {

		// Inputing into elements of the matrix random values from 0 to 9
		// and printing matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
				System.out.printf("%d  ", matrix[i][j]);
			}
			System.out.println();
		}
		return matrix;
	}

	/**
	 * Counts how many times does inputed number repeats in the matrix.
	 * 
	 * @param matrix
	 *            Inputed matrix.
	 * @param number
	 *            Number that user want to check how many times does number
	 *            repeats in the matrix.
	 * @return Number that represents how many times does inputed number repeats
	 *         in the matrix.
	 */
	public static int countNumber(int[][] matrix, int number) {

		// Declaration of a counter that will count repetitions of inputed
		// number
		int counter = 0;

		// Counting the repetitions of inputed number
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (number == matrix[i][j]) {
					counter++;
				}
			}
		}
		System.out.printf("How many times does number %d repeats? ", number);
		return counter;
	}

	/**
	 * Prints matrix
	 * 
	 * @param matrix
	 *            - Declared matrix
	 */
	public static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%2d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * Calculates how many sums of all elements of a row and of a column is zero
	 * 
	 * @param matrix
	 *            Declared matrix
	 * @return Number that represents how many times is sum of all elements of a
	 *         row and of a column is zero
	 */
	public static int getNumOfZeroRowsAndColumns(int[][] matrix) {

		// Declaration of a variable sum
		int sum = 0;
		// Declaration of a variable counter that will count sums that are zero
		int counter = 0;

		// Going trough matrix and calculating sums of rows and columns
		for (int i = 0; i < matrix.length; i++) {
			sum = 0;
			// Calculating sum of elements of a column
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				if (sum == 0) {
					counter++;
				}
			}
			sum = 0;
			// Calculating sum of elements of a row
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[j][i];
				if (sum == 0) {
					counter++;
				}
			}
		}
		return counter;
	}
	
	/**
	 * Calculates the max points that is possible for a jumper in chess to
	 * pickup for a specific position.
	 * 
	 * In the matrix 3x3 jumper can jump from almost every field to a two
	 * fields. Only from field 1,1 can not jump anywhere. These method compares
	 * values of standing position of a jumper and two fields on which can jump,
	 * and returns max points.
	 * 
	 * @param matrix
	 *            Inputed matrix 3x3.
	 * @param x
	 *            Coordinate value that represents number of column in matrix.
	 * @param y
	 *            Coordinate value that represents number of row in matrix.
	 * @return Max value which is possible for a jumper in chess to pickup for a
	 *         specific position.
	 */
	public static int getMaxPoints(int[][] matrix, int y, int x) {

		// Declaration of variable maxPoints 	
		int maxPoints = 0;

		// Calculating on which field can jumper jump and which points can pickup
		for (int i = y; i < y + 1; i++) {
			for (int j = x; j < x + 1; j++) {

				if (i == 0 && j == 0) {
					maxPoints = Math.max(matrix[0][0], Math.max(matrix[1][2], matrix[2][1]));
				} else if (i == 0 && j == 1) {
					maxPoints = Math.max(matrix[0][1], Math.max(matrix[2][2], matrix[2][0]));
				} else if (i == 0 && j == 2) {
					maxPoints = Math.max(matrix[0][2], Math.max(matrix[2][1], matrix[1][0]));
				}
				
				if (i == 1 && j == 0) {
					maxPoints = Math.max(matrix[1][0], Math.max(matrix[0][2], matrix[2][2]));
				} else if (i == 1 && j == 1) {
					maxPoints = matrix[1][1];
				} else if (i == 1 && j == 2) {
					maxPoints = Math.max(matrix[1][2], Math.max(matrix[0][0], matrix[2][0]));
				}
				
				if (i == 2 && j == 0) {
					maxPoints = Math.max(matrix[2][0], Math.max(matrix[0][1], matrix[1][2]));
				} else if (i == 2 && j == 1) {
					maxPoints = Math.max(matrix[2][1], Math.max(matrix[0][0], matrix[0][2]));
				} else if (i == 2 && j == 2) {
					maxPoints = Math.max(matrix[2][2], Math.max(matrix[1][0], matrix[0][1]));
				}
				
			}
		}
		
		// Returning max value
		return maxPoints;
	}


}
