import java.util.Scanner;

public class Task7_MujosContainers {

	public static void main(String[] args) {

		// This program is checking weather Mujo need additional containers to
		// transport his load
		
		Scanner in = new Scanner(System.in);

		System.out.print("Input number of containers: ");
		int containers = in.nextInt();
		int newNumOfContainers = containers;
		
		System.out.print("Input capacity: ");
		int capacity = in.nextInt();
		int additionalContainers = 0;
		boolean canFit = true;

		// Checking can the load fit into containers
		while (newNumOfContainers > capacity) {
			if (!canFit) {
				newNumOfContainers = containers + additionalContainers;
				canFit = true;
			}
			if (newNumOfContainers % 2 == 0) {
				newNumOfContainers /= 2;
			} else {
				canFit = false;
				additionalContainers++;
			}
		}

		// Printing results
		System.out.println("Additional containers: " + additionalContainers);

		in.close();
	}

}
