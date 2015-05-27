
public class Task6 {

	public static void main(String[] args) {
		byte hour = 3;
		byte minute = 1;
		
		// This program converts time from military format to AM/PM format
		
		byte hourPM = (byte) (hour - 12);
		
		if (hour == 0) {
			hour ++;
			System.out.printf("The exact time is %d:%02dh AM", hour, minute);
		} else if ((hour >= 0) && (hour <= 12)) {
			System.out.printf("The exact time is %d:%02dh AM", hour, minute);
		} else if((hour > 12) && (hour <= 24)) {
			System.out.printf("The exact time is %d:%02dh PM", hourPM, minute);
		}
	}

}