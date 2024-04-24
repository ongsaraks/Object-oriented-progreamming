public class WasteManagementSystem {
	public static void main(String[] args) {
		GarbageContainer container101 = new GarbageContainer(101);
		GarbageContainer container999 = new GarbageContainer(999);
		GarbageContainer container111 = new GarbageContainer(111);
		container101.setFillLevel(96.0); // Trigger the sensor and check system response
		container101.setFuel(10);
		container101.setPrior("S"); // challenge

		container999.setFuel(10);
		container999.setPrior("E");

		container111.setFillLevel(96.0); // Trigger the sensor and check system response
		container111.setFuel(10);
		container111.setPrior("T");
		Sensor r101 = new Sensor(container101);
		Sensor r999 = new Sensor(container999);
		Sensor r111 = new Sensor(container111);
		r101.reportFillLevel();
		r999.reportFillLevel();
		r111.reportFillLevel();
		// Further tests and system interactions can be added here
	}
}
