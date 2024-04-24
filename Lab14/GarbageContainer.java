public class GarbageContainer {
	private int containerId;
	private double fillLevel;
	private double fuel;
	private String prior;

	public GarbageContainer(int containerId) {
		this.containerId = containerId;
		this.fillLevel = 0.0;
		this.fuel = 0.0;
		this.prior = "";
	}

	public void setFillLevel(double level) {
		// Implementation needed: Set the fill level and possibly trigger a sensor alert
		this.fillLevel = level;
	}

	public double getFillLevel() {
		return this.fillLevel;
	}

	public int getContainer() {
		return this.containerId;
	}

	public void setFuel(double fuel) {
		// Implementation needed: Set the fill level and possibly trigger a sensor alert
		this.fuel = fuel;
	}

	public double getFuel() {
		return this.fuel;
	}

	public void setPrior(String prior) {
		// Implementation needed: Set the fill level and possibly trigger a sensor alert
		this.prior = prior;
	}

	public String getPrior() {
		return this.prior;
	}
	// Additional getters or setters as needed
}
