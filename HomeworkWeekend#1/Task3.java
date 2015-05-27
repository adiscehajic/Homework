public class Task3 {

	public static void main(String[] args) {

		byte day1 = 2;
		byte month1 = 12;
		int year1 = 2012;

		byte day2 = 1;
		byte month2 = 12;
		int year2 = 2013;

		// This program calculates which of the two dates comes first
		
		double division1 = day1 / 100;
		double division2 = day2 / 100;
		double date1 = month1 + division1;
		double date2 = month2 + division2;
		
		if (year1 != year2) {
			if (year1 > year2) {
				System.out.printf("%d.%d.%d comes before %d.%d.%d", day2,
						month2, year2, day1, month1, year1);
			} else if (year1 < year2) {
				System.out.printf("%d.%d.%d comes before %d.%d.%d", day1,
						month1, year1, day2, month2, year2);
			}
		} else if (date1 != date2) {
			if (date1 > date2) {
				System.out.printf("%d.%d.%d comes before %d.%d.%d", day2,
						month2, year2, day1, month1, year1);
			} else {
				System.out.printf("%d.%d.%d comes before %d.%d.%d", day1,
						month1, year1, day2, month2, year2);
			}
		} else 
			System.out.println("It's a same date!");
			
	}
}
