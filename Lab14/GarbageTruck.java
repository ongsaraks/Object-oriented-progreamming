public class GarbageTruck {
	public void collectWaste(String route, double fuel, String prior) {
		// Implementation needed: Simulate collecting waste along the given route

		if (prior == "S") {
			System.out.println("Standard pickup scheduled for Container " + route);
			System.out.println("Collecting waste along Standard Route for Container " + route);
			System.out.println("Current fuel efficiency: " + fuel + " miles per gallon.");
		} else if (prior == "E") {
			System.out.println("Emergency pickup triggered for Container " + route);
			System.out.println("Collecting waste along Standard Route for Container " + route);
			System.out.println("Current fuel efficiency: " + fuel + " miles per gallon.");
		} else if (prior == "T") {
			System.out.println("Collecting waste along Alternative Route for Container " + route + " due to traffic");
			System.out.println("Current fuel efficiency: " + fuel + " miles per gallon.");
		} else {
			System.out.println("Collecting waste along Route for Container " + route); // unchallenge
		}

	}
}
