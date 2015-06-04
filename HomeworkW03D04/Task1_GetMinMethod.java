public class Task1_GetMinMethod {

	// This method outputs the smaller number of the two numbers
	public static int getMin2(int a, int b) {
		return Math.min(a, b);
	}

	// This method outputs the smaller number of the three numbers
	public static int getMin3(int a, int b, int c) {
		return Math.min(a, Math.min(b, c));
	}

	public static void main(String[] args) {
		
		// Calling methods getMin2 and getMin3
		System.out.println(getMin2(5, 6));
		System.out.println(getMin3(1152, 256, 3535));
	}

}
