package design.d1.impl;

import design.d1.TripMode;

public class AirPlanTripMode implements TripMode {
	@Override
	public void goOut() {
		System.out.print("	飞机	");
	}
}
