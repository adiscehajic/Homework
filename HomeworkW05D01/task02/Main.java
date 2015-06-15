package ba.bitcamp.homework15.task02;

public class Main {

	
	public static void main(String[] args) {
		
		// Creating objects
		Animal animalOne = new Animal("Tiger", 1, 1);
		Animal animalTwo = new Animal("Owl", 2, 3);
		
		// Printing status of the animals
		animalOne.printStatus();
		animalTwo.printStatus();
		
		// Changing the time of the day
		Animal.cycleDayNight();
		
		// Setting the amount of water
		Animal.setAmountOfWater(5);
		
		System.out.println();
		
		// Printing status of the animals
		animalOne.printStatus();
		animalTwo.printStatus();
		
		
	}
		
}
