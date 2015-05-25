public class Task11 {

	public static void main(String[] args) {
		int hourStart = 23;
		int minuteStart = 15;
		int minuteDuration = 149;

		// This program calculates when the plane is landing if we know at what
		// time is the plane taking off and how long was the plane in the air
		int hourLanding = (minuteDuration / 60) + hourStart;
		int minuteLanding = (minuteDuration % 60) + minuteStart;

		hourLanding += minuteLanding / 60;
		minuteLanding = minuteLanding % 60;

		if (hourLanding >= 24) {
			hourLanding -= 24;
			System.out.printf("Plane taking off at %d:%02dh\n", hourStart,
					minuteStart);
			System.out.printf("Flight duration %d minutes\n", minuteDuration);
			System.out.printf("Plane landing at %02d:%02dh\n", hourLanding,
					minuteLanding);
		} else {
			System.out.printf("Plane taking off at %d:%02dh\n", hourStart,
					minuteStart);
			System.out.printf("Flight duration %d minutes\n", minuteDuration);
			System.out.printf("Plane landing at %02d:%02dh\n", hourLanding,
					minuteLanding);
		}

	}

}
