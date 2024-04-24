public class Sensor {
	private GarbageContainer container;

	public Sensor(GarbageContainer container) {
		this.container = container;
	}

	public void reportFillLevel() {
		// Implementation needed: Report the container's fill level to the control
		// center
		WasteManagementControlCenter.receiveData(container.getContainer(), container.getFillLevel(),
				container.getFuel(), container.getPrior());

	}
}
