
public class EVCarManagement {

	public static void main(String[] args) {
		ElectricCar car1 = new ElectricCar("Tesla","Model", 75.5, 50.0, 10.0);
		ElectricCar car2 = new ElectricCar("Nissan", "Leaf", 40.0, 30.0, 8.0);
		ElectricCar car3 = new ElectricCar("Chevrolet", "Bolt", 60.0, 45.0, 12.0);
		ElectricCar car4 = new ElectricCar("BMW", "i3", 50.0, 50.0, 9.0);
		ElectricCarV2 CCar1 = new ElectricCarV2("Tesla","Model", 75.5, 50.0, 10.0);
		ElectricCarV2 CCar2 = new ElectricCarV2("Nissan", "Leaf", 40.0, 30.0, 8.0);
		ElectricCarV2 CCar3 = new ElectricCarV2("Chevrolet", "Bolt", 60.0, 45.0, 12.0);
		ElectricCarV2 CCar4 = new ElectricCarV2("BMW", "i3", 50.0, 50.0, 9.0);
		System.out.println("Car 1: " + car1.toString());
		System.out.println("Car 2: " + car2.toString());
		System.out.println("Car 3: " + car3.toString());
		System.out.println("Car 4: " + car4.toString());
		System.out.println();
		System.out.println("Car 1: " + car1.calculateRange()+ "km");
		System.out.println("Car 2: " + car2.calculateRange()+ "km");
		System.out.println("Car 3: " + car3.calculateRange()+ "km");
		System.out.println("Car 4: " + car4.calculateRange()+ "km");
		System.out.println();
		
		System.out.print("Car1 : Simulating Charging for 3 hour...\n");
		car1.simulateCharging(3);
		System.out.println();
		System.out.print("Car4 : Simulating Charging for 4 hour...\n");
		car4.simulateCharging(4);
		
		System.out.printf("Case1: %s\n", ElectricCarV2.compareBatteryCapacity(CCar1,CCar3));
		System.out.printf("Case2: %s\n", ElectricCarV2.compareBatteryCapacity(CCar2,CCar3));
		System.out.printf("Case3: %s\n", ElectricCarV2.compareBatteryCapacity(CCar2,CCar4));
		}

	

}

//File: EVCarManagement
//Description: Calculate charge percentage
//Assignment Number: Lab03 
//
//ID: 6688093
//Name: Ongsa Raksalam
//Section: 2
//Grader: ICE
//
//On my honor, Ongsa Raksalam, this lab assignment is my own work
//and I have not provided this code to any other students.

