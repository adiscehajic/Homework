
public class Task7 {

	public static void main(String[] args) {
		int num = 8547;
		
		int temp = 0;
		
		// This program calculates the sum of digits of the number
		
		temp = num % 10;
		temp = ((num / 10) % 10) + temp;
		temp = ((num / 100) % 10) + temp;
		temp = ((num / 1000) % 10) + temp;
		
		System.out.printf("The sum of digits of the number %d is %d", num, temp);
		
	}

}
