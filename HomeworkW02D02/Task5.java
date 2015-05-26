import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		// This program outputs inputed number without zeros
		
		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");
		long num = in.nextInt();
		
		long withoutZero = 0;
		int ten = 1;
		
		for (int i = (int) num; i != 0; i /= 10) {
			
			if(i % 10 != 0){
				withoutZero += (i % 10) * ten;
				ten *= 10;
			}
		}
		
		System.out.printf("Number whithout zeros is: %d", withoutZero);

		in.close();
	}

}
