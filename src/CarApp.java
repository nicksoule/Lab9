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
		numCars = Validator.getInt(scan, "How many cars are you entering? ");
		

		ArrayList<Car> carList = new ArrayList<>();
		for (int i = 0; i < numCars; ++i) {
			Car carInfo = new Car();
			System.out.println("Enter Car #" + (i + 1) + " Make: ");
			make = scan.nextLine();
			carInfo.setMake(make);
			System.out.println("Enter Car #" + (i + 1) + " Model: ");
			model = scan.nextLine();
			carInfo.setModel(model);
			System.out.println("Enter Car #" + (i + 1) + " Year: ");
			year = scan.nextInt();
			carInfo.setYear(year);
			System.out.println("Enter Car #" + (i + 1) + " Price: ");
			price = scan.nextDouble();
			scan.nextLine();
			carInfo.setPrice(price);

			carList.add(carInfo);

		}
		System.out.println("Current Invetory: ");
		for(int i = 0; i < carList.size(); i++) {   
		    String m = carList.get(i).getMake();
		    String m2 = carList.get(i).getModel();
		    int y = carList.get(i).getYear();
		    double p = carList.get(i).getPrice();
		    System.out.printf("%-10s %-10s %-10s %-10s\n", m , m2, y, "$" + p);
		}  

	}

}
