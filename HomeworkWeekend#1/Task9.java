public class Task9 {

	public static void main(String[] args) {
		int num = 1212;

		int temp = 0;

		// This program calculates can the number be divided with the sum of its digits
		
		temp = num % 10;
		temp = ((num / 10) % 10) + temp;
		temp = ((num / 100) % 10) + temp;
		temp = ((num / 1000) % 10) + temp;

		if (num % temp == 0) {
			System.out.println("The number can be divided with the sum of its digits!");
		} else {
			System.out.println("The number can not be divided with the sum of its digits!");
		}
	}

}
