import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		// This program outputs all magical numbers that 
		// are lower than inputed number
		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");
		int inputNumber = in.nextInt();
		int sum = 0;

		for (int j = 1; j < inputNumber; j++) {
			int num = inputNumber;
			
			
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum += i;
				}
				if(i == sum){
				System.out.println(i);
			} 
				
				
			}
			
			
		}
		
		//System.out.println(sum);

		in.close();
	}

}
