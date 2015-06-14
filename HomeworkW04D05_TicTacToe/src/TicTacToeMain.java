import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Declaration of counters that will count wins and draw games
		int counterWonXPLayer = 0;
		int counterWonOPlayer = 0;
		int counterDrawGames = 0;
		int gamesPlayed = 0;

		int num = 0;

		String[][] matrix = null;

		do {
			while (true) {
				try {

					// Creating the matrix for game and selecting size of matrix
					System.out.print("Input size of Tic Tac Toe matrix: ");
					int size = in.nextInt();
					int length = size + size + 1;
					matrix = new String[length][length];

					// Calling method that create matrix
					MatrixHelper.printTicTacToeMatrix(matrix);

					// Calling method that print create matrix
					MatrixHelper.printMatrix(matrix);

					break;
				} catch (InputMismatchException ex) {
					System.out.println("Wrong input! Please input again!");
					in.nextLine();
				}
			}

			gamesPlayed++;

			String[][] gameTicTacToe = matrix;
			int counterX = 0;

			while (true) {
				// Calling method that enables player X to play
				MatrixHelper.playerXPlays(matrix);

				// Printing matrix
				MatrixHelper.printMatrix(matrix);

				// Calculating if player X is winner
				boolean isWonX = MatrixHelper.checkX(gameTicTacToe);
				if (isWonX == true) {
					counterWonXPLayer++;
					break;
				}

				// Counting player X moves
				counterX++;

				// Calculating if the game is draw
				if (counterX > gameTicTacToe.length / 2 + 1) {
					System.out.println("Game draw!");
					counterDrawGames++;
					break;
				}

				// Calling method that enables player O to play
				MatrixHelper.playerOPlays(matrix);

				// Printing matrix
				MatrixHelper.printMatrix(matrix);

				// Calculating if player O is winner
				boolean isWonO = MatrixHelper.checkO(gameTicTacToe);
				if (isWonO == true) {
					counterWonOPlayer++;
					break;
				}

			}
			System.out
					.println("Do you want to play another game? \nIf YES input number 1, if NOT input number 0!");
			num = in.nextInt();
		} while (num == 1);

		in.close();

		// Storing the result of playing game
		TextIO.writeFile("src/Score.txt");
		TextIO.putf(
				"Scores: \n\nGames played: %d\n\nPlayer X has %d wins\n\nPlayer O has %d wins\n\n%d games ended draw",
				gamesPlayed, counterWonXPLayer, counterWonOPlayer,
				counterDrawGames);
		TextIO.writeStandardOutput();

	}
}
