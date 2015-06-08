import java.util.Scanner;

public class Task2_Switch {

	public static void main(String[] args) {

		// This program outputs the schedule of an BitCamp candidate
		Scanner in = new Scanner(System.in);

		// Inputing the time 
		System.out.println("Insert hour time: ");
		int hour = in.nextInt();

		// Outputting what is candidate doing in which time
		switch (hour) {
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			System.out.println("It is lectures time!");
			break;
		case 14:
		case 15:
		case 16:
		case 17:
			System.out.println("It is exercises time!");
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 0:
		case 1:
			System.out.println("It is homework time!");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("It is sleeping time!");
			break;
		default:
			System.out.println("You have inputed wrong value of an hour!");
			break;
		}

		in.close();
	}
}
