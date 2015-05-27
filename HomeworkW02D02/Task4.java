import java.util.Scanner;


public class Task4 {

	public static void main(String[] args) {
		
		// This program outputs the sum of dividers of inputed 
		// number until we input 0
		
		Scanner in = new Scanner(System.in);
				
		int num = 0;	
				
		do {
		System.out.print("Input number: ");	
		num = in.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0){
				sum += i;
			}
		}
		System.out.printf("Sum of dividers of inputed number is: %d\n", sum);
		} while (num != 0);
				
		in.close();
	}

}
