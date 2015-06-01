public class Task8_NameSurname {

	public static void main(String[] args) {
		
		// This program outputs name and surname from the given address
		
		String nameSurname = "www.example.com?name=Jon&surname=Stark";

		int counter = 0;

		System.out.print("Name: ");

		// Finding and printing name
		for (int i = 21; i < nameSurname.length(); i++) {
			if (nameSurname.charAt(i) == '&') {
				counter = i + 9;
				break;
			}
			System.out.print(nameSurname.charAt(i));
		}

		System.out.print(" ");

		// Finding and printing surname
		for (int i = counter; i < nameSurname.length(); i++) {
			System.out.print(nameSurname.charAt(i));
		}
	}
}
