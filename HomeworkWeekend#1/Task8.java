
public class Task8 {

	public static void main(String[] args) {
		double coordX = 2;
		double coordY = 2;
		double coordZ = 2;
		
		// This program calculates the distance of the dot from the origin (0,0,0) 
		// of a coordinate system 
		
		double diagonal = Math.sqrt(Math.pow(coordX, 2) + Math.pow(coordZ, 2));
		
		double distance = Math.sqrt(Math.pow(diagonal, 2) + Math.pow(coordY, 2));
		
		System.out.printf("The distance of the dot from the origin is: %.2f", distance);
	}

}
