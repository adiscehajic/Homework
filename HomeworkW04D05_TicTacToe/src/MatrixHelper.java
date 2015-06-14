import java.util.Scanner;

public class MatrixHelper {

	/**
	 * Prints 2D matrix
	 * 
	 * @param matrix
	 *            Matrix that user want to print
	 */
	public static void printMatrix(String[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3s ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * Prints the matrix for playing game TicTacToe
	 * 
	 * @param matrix
	 *            Inputed matrix
	 */
	public static void printTicTacToeMatrix(String[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j += 2) {
				matrix[i][j] = "|";
			}
		}

		for (int i = 0; i < matrix.length; i += 2) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = "-";
			}
		}

		int counter = 1;

		for (int i = 1; i < matrix.length; i += 2) {
			for (int j = 1; j < matrix[i].length; j += 2) {
				matrix[i][j] = String.valueOf(counter);
				counter++;
			}
		}
	}

	/**
	 * Enables player X to put X in the place that he want and that is free.
	 * 
	 * @param array
	 *            Inputed matrix
	 * @return Matrix that has inputed X
	 */
	public static String[][] playerXPlays(String[][] array) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		// while (true) {
		System.out
				.print("Player X is on the move! \nInput number of field where you want to put X: ");
		String num = in.next();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j].equals(num))
					array[i][j] = "X";
			}
		}
		// break;
		// }
		return array;
	}

	/**
	 * Enables player O to put O in the place that he want and that is free.
	 * 
	 * @param array
	 *            Inputed matrix
	 * @return Matrix that has inputed O
	 */
	public static String[][] playerOPlays(String[][] array) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		// while (true) {
		System.out
				.print("Player O is on the move! \nInput number of field where you want to put O: ");
		String num = in.next();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j].equals(num))
					array[i][j] = "O";
			}
		}
		// break;
		// }
		return array;
	}

	/**
	 * Calculating the number of X in the row.
	 * 
	 * @param array
	 *            Game array.
	 * @param row
	 *            The row that is calculated.
	 * @return If in the row is X true and false if not.
	 */
	public static boolean getRowForX(String[][] array, int row) {
		int counter = 0;
		for (int i = 1; i < array.length; i += 2) {
			if (array[row][i].equals("X")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculating if in the row is all X.
	 * 
	 * @param array
	 *            Game array.
	 * 
	 * @return True if in the row are all X and false if not.
	 */
	public static boolean isRowX(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (getRowForX(array, i) == true) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Calculating the number of O in the row.
	 * 
	 * @param array
	 *            Game array.
	 * @param row
	 *            The row that is calculated.
	 * @return If in the row is O true and false if not.
	 */
	public static boolean getRowForO(String[][] array, int row) {
		int counter = 0;
		for (int i = 1; i < array.length; i += 2) {
			if (array[row][i].equals("O")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculating if in the row is all O.
	 * 
	 * @param array
	 *            Game array.
	 * 
	 * @return True if in the row are all O and false if not.
	 */
	public static boolean isRowO(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (getRowForO(array, i) == true) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Calculating the number of X in the column.
	 * 
	 * @param array
	 *            Game array.
	 * @param column
	 *            Column that is calculated.
	 * @return If in the row is X true and false if not.
	 */
	public static boolean checkOutColumnForX(String[][] array, int column) {
		int counter = 0;
		for (int i = 1; i < array.length; i += 2) {
			if (array[i][column].equals("X")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculating if in the column are all X
	 * 
	 * @param array
	 *            Game array.
	 * @return If in the row are all X true and false if not.
	 */
	public static boolean isAllXColumn(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (checkOutColumnForX(array, i) == true) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Calculating the number of O in the column.
	 * 
	 * @param array
	 *            Game array.
	 * @param column
	 *            Column that is calculated.
	 * @return If in the row is O true and false if not.
	 */
	public static boolean checkOutColumnForO(String[][] array, int column) {
		int counter = 0;
		for (int i = 1; i < array.length; i += 2) {
			if (array[i][column].equals("O")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculating if in the column are all O
	 * 
	 * @param array
	 *            Game array.
	 * @return If in the row are all O true and false if not.
	 */
	public static boolean isAllOColumn(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (checkOutColumnForO(array, i) == true) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Calculating if in the diagonal is X
	 * 
	 * @param array
	 *            Game array.
	 * @return If in the diagonal are X true and false if not.
	 */
	public static boolean isMainDiagonalX(String[][] array) {
		int counter = 0;
		for (int i = 1; i < array.length; i += 2) {
			if (array[i][i].equals("X")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculating if in the diagonal is O
	 * 
	 * @param array
	 *            Game array.
	 * @return If in the diagonal are O true and false if not.
	 */
	public static boolean isMainDiagonalO(String[][] array) {
		int counter = 0;
		for (int i = 1; i < array.length; i += 2) {
			if (array[i][i].equals("O")) {
				counter++;
			}
		}
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculating if in the diagonal are all X
	 * 
	 * @param array
	 *            Game array.
	 * @return If in the diagonal are all X true and false if not.
	 */
	public static boolean isSideDiagonalX(String[][] array) {
		int counter = 0;
		int i = 1;
		int j = array.length - 2;
		do {
			if (array[i][j].equals("X")) {
				counter++;
			}
			i += 2;
			j -= 2;
		} while (i <= array.length - 2 && j >= 0);
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculating if in the diagonal are all O
	 * 
	 * @param array
	 *            Game array.
	 * @return If in the diagonal are all O true and false if not.
	 */
	public static boolean isSideDiagonalO(String[][] array) {
		int counter = 0;
		int i = 1;
		int j = array.length - 2;
		do {
			if (array[i][j].equals("O")) {
				counter++;
			}
			i += 2;
			j -= 2;
		} while (i <= array.length - 2 && j >= 0);
		if (counter == array.length / 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checking if in the row or in the column are all X and if are than prints
	 * message that player X is winner.
	 * 
	 * @param array
	 *            Game array.
	 * @return True if in the row or column are all X and false if not.
	 */
	public static boolean checkRowsAndColumnsX(String[][] array) {
		boolean doneXrow = isRowX(array);
		if (doneXrow == true) {
			System.out.println("Winner is player X!");
			return true;
		}

		boolean doneXcolumn = isAllXColumn(array);
		if (doneXcolumn == true) {
			System.out.println("Winner is player X!");
			return true;
		}

		return false;
	}

	/**
	 * Checking if in the row or in the column are all O and if are than prints
	 * message that player O is winner.
	 * 
	 * @param array
	 *            Game array.
	 * @return True if in the row or column are all O and false if not.
	 */
	public static boolean checkRowsAndColumnsO(String[][] array) {
		boolean doneOrow = isRowO(array);
		if (doneOrow == true) {
			System.out.println("Winner is player O!");
			return true;
		}

		boolean doneOcolumn = isAllOColumn(array);
		if (doneOcolumn == true) {
			System.out.println("Winner is player O!");
			return true;
		}

		return false;
	}

	/**
	 * Checking if in the diagonals are all X and if are than prints message
	 * that player X is winner.
	 * 
	 * @param array
	 *            Game array.
	 * @return True if in the diagonals are all X and false if not.
	 */
	public static boolean checkDiagonalsX(String[][] array) {
		boolean doneXMainDiagonal = isMainDiagonalX(array);
		if (doneXMainDiagonal == true) {
			System.out.println("Winner is player X!");
			return true;
		}

		boolean doneXSideDiagonal = isSideDiagonalX(array);
		if (doneXSideDiagonal == true) {
			System.out.println("Winner is player X!");
			return true;
		}

		return false;
	}

	/**
	 * Checking if in the diagonals are all O and if are than prints message
	 * that player O is winner.
	 * 
	 * @param array
	 *            Game array.
	 * @return True if in the diagonals are all O and false if not.
	 */
	public static boolean checkDiagonalsO(String[][] array) {
		boolean doneOMainDiagonal = isMainDiagonalO(array);
		if (doneOMainDiagonal == true) {
			System.out.println("Winner is player O!");
			return true;
		}

		boolean doneOSideDiagonal = isSideDiagonalO(array);
		if (doneOSideDiagonal == true) {
			System.out.println("Winner is player O!");
			return true;
		}

		return false;
	}

	/**
	 * Checks if X player is winner.
	 * 
	 * @param array
	 *            Game array.
	 * @return True if player X is winner and false if not.
	 */
	public static boolean checkX(String[][] array) {
		boolean doneRowsAndColumnsX = checkRowsAndColumnsX(array);
		if (doneRowsAndColumnsX == true) {
			return true;
		}

		boolean doneDiagonalsX = checkDiagonalsX(array);
		if (doneDiagonalsX == true) {
			return true;
		}

		return false;
	}

	/**
	 * Checks if O player is winner.
	 * 
	 * @param array
	 *            Game array.
	 * @return True if player O is winner and false if not.
	 */
	public static boolean checkO(String[][] array) {
		boolean doneRowsAndColumnsO = checkRowsAndColumnsO(array);
		if (doneRowsAndColumnsO == true) {
			return true;
		}

		boolean doneDiagonalsO = checkDiagonalsO(array);
		if (doneDiagonalsO == true) {
			return true;
		}

		return false;
	}

}
