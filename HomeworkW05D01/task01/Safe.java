package ba.bitcamp.homework15.task01;

public class Safe {

	private String name;
	private int amount;

	/**
	 * Constructor
	 * 
	 * @param name
	 */
	public Safe(String name) {
		this.name = name;
		amount = 0;
	}

	/**
	 * Add inputed amount of money to total amount.
	 * 
	 * @param money
	 *            - Inputed amount of money that we want to add.
	 */
	public void addMoney(int money) {
		amount += money;
	}

	/**
	 * Prints total amount of money.
	 * 
	 * @return - Total amount of money.
	 */
	public int getMoney() {
		return amount;
	}

	/**
	 * Sets total amount of money to 0.
	 */
	public void clear() {
		amount = 0;
	}

	/**
	 * Prints the message for the amount of money in the safe.
	 */
	public void printInformation() {

		if (amount == 0) {
			System.out.println("It is empty!");
		} else if (amount > 0 && amount <= 20) {
			System.out.println("There is some, but not much!");
		} else if (amount > 20 && amount <= 100) {
			System.out.println("There is some!");
		} else {
			System.out.println("There is a lot!");
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
