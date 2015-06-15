package ba.bitcamp.homework15.task01;

public class Main {

	public static void main(String[] args) {

		// Declaration of object
		Safe safeOne = new Safe("Cashbox");

		// Checking the amount of money in the safe
		safeOne.printInformation();

		// Adding some money in the safe
		safeOne.addMoney(30);

		// Checking the amount of money in the safe
		safeOne.printInformation();

		// Adding more money in the safe
		safeOne.addMoney(100);

		// Checking the amount of money in the safe
		safeOne.printInformation();

		// Clearing the safe
		safeOne.clear();

		// Checking the amount of money in the safe
		safeOne.printInformation();
	}

}
