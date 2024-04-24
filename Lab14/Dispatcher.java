public class Dispatcher {
	public static void schedulePickup(int containerId, double fuel, String prior) {
		// Implementation needed: Schedule a garbage truck to pick up waste from the
		// specified container
		GarbageTruck c = new GarbageTruck();
		if (prior != "E") {
			System.out.println("Container " + containerId + " is almost full" + ". Scheduling pickup."); // unchalenge
			c.collectWaste((TruckRouteOptimizer.calculateOptimalRoute(containerId)), fuel, prior);
		} else {
			c.collectWaste((TruckRouteOptimizer.calculateOptimalRoute(containerId)), fuel, prior);
		}
	}
}
