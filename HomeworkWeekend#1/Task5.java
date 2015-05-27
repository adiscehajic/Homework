
public class Task5 {

	public static void main(String[] args) {
		int num1 = 55;
		int num2 = 13;
		int num3 = 1;
		int num4 = 96;
		int temp; 
		
		// This program sorts the inputed numbers from smallest to largest
		
		if (num1 > num2){
			temp = num1;
			num1 = num2;
			num2= temp;
		}
		
		if (num2 > num3){
			temp = num2;
			num2 = num3;
			num3= temp;
		}
		
		if (num3 > num4){
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		
		if (num1 > num2){
			temp = num1;
			num1 = num2;
			num2= temp;
		}
		
		if (num2 > num3){
			temp = num2;
			num2 = num3;
			num3= temp;
		}
		
		if (num3 > num4){
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
		
	}

}
