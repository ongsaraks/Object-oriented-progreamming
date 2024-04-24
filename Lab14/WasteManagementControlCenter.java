public class WasteManagementControlCenter {
	public static void receiveData(int containerId, double fillLevel, double fuel, String prior) {
		// Implementation needed: Decide whether to schedule a pickup based on the fill
		// level

		if (fillLevel > 95 || prior.contains("E")) {
			Dispatcher.schedulePickup(containerId, fuel, prior);
		}

	}

}
