public class Task4 {

	public static void main(String[] args) {
		int day = 25;
		int month = 6;
		
		// This program can show you which sign of the zodiac belongs entered date

		double capricorn = 1.2;
		double aquarius = 2.19;
		double pisces = 3.2;
		double aries = 4.2;
		double taurus = 5.21;
		double gemini = 6.21;
		double cancer = 7.22;
		double leo = 8.22;
		double virgo = 9.23;
		double libra = 10.23;
		double scorpio = 11.22;
		double sagittarius = 12.21;

		double division = (double) day / 100.00;
		double date = (double) month + division;

		if (date > sagittarius && date <= capricorn) {
			System.out.println("Your zodiac sign is Capricorn!");
		} else if (date > capricorn && date <= aquarius) {
			System.out.println("Your zodiac sign is Aquarius!");
		} else if (date > aquarius && date <= pisces) {
			System.out.println("Your zodiac sign is Pisces!");
		} else if (date > pisces && date <= aries) {
			System.out.println("Your zodiac sign is Aries!");
		} else if (date > aries && date <= taurus) {
			System.out.println("Your zodiac sign is Taurus!");
		} else if (date > taurus && date <= gemini) {
			System.out.println("Your zodiac sign is Gemini!");
		} else if (date > gemini && date <= cancer) {
			System.out.println("Your zodiac sign is Cancer!");
		} else if (date > cancer && date <= leo) {
			System.out.println("Your zodiac sign is Leo!");
		} else if (date > leo && date <= virgo) {
			System.out.println("Your zodiac sign is Virgo!");
		} else if (date > virgo && date <= libra) {
			System.out.println("Your zodiac sign is Libra!");
		} else if (date > libra && date <= scorpio) {
			System.out.println("Your zodiac sign is Scorpio!");
		} else {
			System.out.println("Your zodiac sign is Sagittarius!");
		}

	}

}
