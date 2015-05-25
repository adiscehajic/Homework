public class Task1 {

	public static void main(String[] args) {
		double lineA = 1;
		double lineB = 15;
		double lineC = 3;
		
		// Program presents possibility to create a triangle with inputed lengths of three lines
		
		if((lineA + lineB) > lineC && (lineA + lineC) > lineB && (lineB + lineC) > lineA) {
			System.out.println("It is possible to create a triangle!");
		} else {
			System.out.println("It is not possible to create a triangle!");
		}
	}

}