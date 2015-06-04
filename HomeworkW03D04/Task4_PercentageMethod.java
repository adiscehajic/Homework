public class Task4_PercentageMethod {

	// This method calculates the percentage of points on the exam
	public static double getPercentage(int N, int M) {
		return (double) (((double) N / M) * 100);
	}

	public static void main(String[] args) {

		// Calling the method getPercentage
		System.out.println("The procentage of success is: "
				+ getPercentage(3, 10));
	}

}
