package ba.bitcamp.homework15.task02;

public class Animal {

	private String name;
	private int activity;
	private int waterNeed;
	private static int timeDayNight = 1;
	private static int waterLevel = 1;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            - Name of animal
	 * @param activity
	 *            - When is animal active. If activity is 1 animal is active
	 *            during day, and if it is 2 animal is active during night.
	 * @param waterNeed
	 *            - How much water does animal need. If the value is 1 animal
	 *            does not need a lot of money, if the value is 2 animal need
	 *            more water and if it is 3 animal need a lot of water.
	 */
	public Animal(String name, int activity, int waterNeed) {
		this.name = name;
		this.activity = activity;
		this.waterNeed = waterNeed;
	}

	/**
	 * Changes the day into a night and night into a day.
	 */
	public static void cycleDayNight() {

		if (timeDayNight == 1) {
			timeDayNight = 2;
		} else {
			timeDayNight = 1;
		}

	}

	/**
	 * Changes the level of water for a inputed value.
	 * 
	 * @param value
	 *            - Value of water on which we want to set.
	 * @throws NumberFormatException
	 *             If the inputed value of water level is higher than 3.
	 */
	public static void setAmountOfWater(int value) {

		try {
			if (value == 0) {
				waterLevel = 0;
			} else if (value == 2) {
				waterLevel = 2;
			} else if (value == 3) {
				waterLevel = 3;
			} else if (value == 1) {
				waterLevel = 1;
			} else {
				throw new NumberFormatException();
			}
		} catch (NumberFormatException ex) {
			System.out
					.printf("Wrong inputed water level! Water level is stil %d! Input level from 0 to 3!\n",
							waterLevel);
		}

	}

	/**
	 * Prints the status of animal.
	 * <p>
	 * If the time of the day and the water level corresponds to the animal,
	 * prints the message "It is fine. The animal is active and has water.".
	 * <p>
	 * If the time of the day corresponds to the animal and the water level does
	 * not, prints message
	 * "The animal is active, but does not have enough water.".
	 * <p>
	 * If the time of the day does not corresponds to the animal and the water
	 * level does, prints message
	 * "The animal is not active, but has enough water.".
	 * <p>
	 * If the time of the day and water level does not corresponds to the
	 * animal, prints message
	 * "The animal is not active and it does not have enough water.".
	 */
	public void printStatus() {

		if (activity == timeDayNight && waterNeed == waterLevel) {
			System.out
					.println("It is fine. The animal is active and has water.");
		} else if (activity == timeDayNight && waterNeed != waterLevel) {
			System.out
					.println("The animal is active, but does not have enough water.");
		} else if (activity != timeDayNight && waterNeed == waterLevel) {
			System.out
					.println("The animal is not active, but has enough water.");
		} else if (activity != timeDayNight && waterNeed != waterLevel) {
			System.out
					.println("The animal is not active and it does not have enough water.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getActivity() {
		return activity;
	}

	public void setActivity(int activity) {
		this.activity = activity;
	}

	public int getWaterNeed() {
		return waterNeed;
	}

	public void setWaterNeed(int waterNeed) {
		this.waterNeed = waterNeed;
	}

}
