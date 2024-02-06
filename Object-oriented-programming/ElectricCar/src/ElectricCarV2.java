
class ElectricCarV2 {
	private String brand;
	private String model;
	private double batteryCapacity;
	private double currentCharge;
	private double chargingRate;
	double percent = 0;
	public ElectricCarV2(String brand, String model, double batteryCapacity,double currentCharge,double chargingRate){
		this.brand = brand;
		this.model = model;
		this.batteryCapacity = batteryCapacity;
		this.currentCharge = currentCharge;
		this.chargingRate = chargingRate;
	}
	public void setCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public double getCapacity() {
		return this.batteryCapacity;
	}
	public String toString() {
		return brand + "," + model + "," + batteryCapacity + "," + currentCharge + "," + chargingRate;
	}
	public double calculateRange() {
		return currentCharge * 6.4;
	}
	public  void simulateCharging(int Hour) {	
		if(currentCharge >= batteryCapacity) {
			System.out.println("Battery fully charged!");
			return;
		}
		for(int i = 1; i <= Hour; i++) {
			currentCharge += chargingRate;
			percent = (currentCharge / batteryCapacity) * 100;
			if(percent < 100) {
				System.out.printf("Charging progress %d hr. :%.2f%% | Current Charge: %.2f kWh\n",i,percent,currentCharge);
			}
			else if(percent > 100) {
				System.out.printf("Charging progress %d hr. :%.2f%% | Current Charge: %.2f kWh\n",Hour,100.00,batteryCapacity);
				break;
			}
			
		}
	
	}
	public static ElectricCarV2 compareBatteryCapacity(ElectricCarV2 Var1,ElectricCarV2 Var2) {
		if(Var1.getCapacity() > Var2.getCapacity()) {
			return  Var1;
		}
		else{
			return  Var2;
		}
		
	}

	//File: ElectricCarV2
	//Description: : Battery Capacity Comparison
	//Assignment Number: Lab03 Challenge
	//
	//ID: 6688093
	//Name: Ongsa Raksalam
	//Section: 2
	//Grader: ICE
	//
	//On my honor, Ongsa Raksalam, this lab assignment is my own work
	//and I have not provided this code to any other students.


	
//	public void setCapacity(double sum) {
//		this.batteryCapacity = sum;
//	}
//	public double getCapacity() {
//		return this.batteryCapacity;
//	}
	
	
}

	