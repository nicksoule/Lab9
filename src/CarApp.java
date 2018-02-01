
/*
 * Nicholas Soule
 * Lab9 - Java - prompts user for info about any number of cars and store the info in an 
 * arraylist which can be recalled and printed out
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String make;
		String model;
		int year;
		double price;
		int numCars;

		System.out.println("Welcome to the Grand Circus Motors Admin console!");
		// prompts user to enter a number and validates that it's actually a number
		numCars = Validator.getInt(scan, "How many cars are you entering? ");

		// arraylist created to store the info for the cars that are about to be entered
		ArrayList<Car> carList = new ArrayList<>();
		for (int i = 0; i < numCars; ++i) {
			// for each car, the program loops through collecting the required date
			Car carInfo = new Car();
			System.out.println("Enter Car #" + (i + 1) + " Make: ");
			make = scan.nextLine();
			carInfo.setMake(make);
			System.out.println("Enter Car #" + (i + 1) + " Model: ");
			model = scan.nextLine();
			carInfo.setModel(model);
			// validates user entered only valid years for car year
			year = Validator.getInt(scan, "Enter Car #" + (i + 1) + " Year: \n", 1885, 2020);
			carInfo.setYear(year);
			System.out.println("Enter Car #" + (i + 1) + " Price: ");
			price = scan.nextDouble();
			scan.nextLine();
			carInfo.setPrice(price);

			carList.add(carInfo);

		}
		System.out.println("Current Invetory: ");
		for (int i = 0; i < carList.size(); i++) {
			// reassigned values of data to different variables to make the print out
			// statement more readable
			String m = carList.get(i).getMake();
			String m2 = carList.get(i).getModel();
			int y = carList.get(i).getYear();
			double p = carList.get(i).getPrice();
			System.out.printf("%-10s %-10s %-10s %s%-10.2f\n", m, m2, y, "$", p);
		}

	}

}
