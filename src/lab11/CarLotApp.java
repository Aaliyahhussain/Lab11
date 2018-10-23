package lab11;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CarLotApp {

	// making a static variable outside main
	// means it can be shared by all methods
	private static List<Car> cars = new ArrayList<>();
	private static Scanner userInput;

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		cars.add(new Car("Nikolai", "Model S", 2017, 54999.9));
		cars.add(new Car("Fourd", "Escapade", 2017, 31999.9));
		cars.add(new Car("Chewie", "Vette", 2017, 44989.9));
		cars.add(new UsedCar("Hyonda", "Prior", 2015, 14795.5, 35987.6));
		cars.add(new UsedCar("GC", "Chirpus", 2013, 8500, 12345));
		cars.add(new UsedCar("GC", "Witherell", 2016, 14450, 3500));

		boolean done = false;
		while (!done) {
			System.out.println("Select an option: (list, select, remove, add, quit)");
			String option = scnr.nextLine();
			switch (option) {
			case "list":
				doListOption();
				// TODO
				break;
			case "select":
				doSelectOption(cars);
				// TODO
				break;
			case "quit":
				// TODO
				done = true;
				break;
			default:
				System.out.println("Invalid choice...");
				break;

			}

		}

	}

	private static void doListOption() {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println((i + 1) + ". " + cars.get(i));
		}

	}

	private static List<Car> doSelectOption(List<Car> carMenu) {

        System.out.print("Which car would you like? ");
        int selection = userInput.nextInt();
        
        userInput.nextLine();
        selection -= 1;


        System.out.println(carMenu.get(selection));

        System.out.println("Would you like to buy this car? ");
        String buyCar = userInput.nextLine();

        
        if (buyCar.toLowerCase().startsWith("y")) {
            System.out.println("Excellent! Our finance department will be in touch shortly.");
            System.out.println();
            carMenu.remove(selection);
        }
        
        return carMenu;

	  

	}

}
	
	
// String buyCar = userInput.nextLine();

//= userInput.nextInt();

//String output = String.format("make", "model", "year", "price", "mileage");

//Car car = new Car("Nikolai", "Model S", 2017, 54999.9);
//System.out.println(car);
//
//UsedCar used = new UsedCar("Hyonda", "Prior", 2015, 14795.5, 35987.6);
//System.out.println(used);