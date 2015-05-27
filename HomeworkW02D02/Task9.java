import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		// This program draws the triangle whit same sides with * 
		
		Scanner in = new Scanner(System.in);

		System.out.print("Input side of the triangle: ");
		int side = in.nextInt();

		System.out.println();

		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				if (side - 1 > i + j) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		in.close();
	}

}
