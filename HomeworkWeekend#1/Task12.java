public class Task12 {

	public static void main(String[] args) {
		double radius = 1.128;

		double volumen = (4 * Math.pow(radius, 3) * Math.PI) / 3;

		// This program shows is it the ball with inputted radius a "good quality" ball
		
		if ((volumen >= 6.010993) && (volumen <= 6.017007)) {
			System.out.printf("The ball with radius %.5f has the volume "
					+ "of %.5f and is the 'good quality' ball!", radius, volumen);
		} else {
			System.out.printf("The ball with radius %.5f has the volume "
					+ "of %.5f and is not the 'good quality' ball!", radius, volumen);
		}

	}

}
