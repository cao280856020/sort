package design.d1.model;

import design.d1.GoOut;
import design.d1.impl.AirPlanTripMode;

public class BusinessTrip extends GoOut {
	public BusinessTrip(){
		System.out.print("出差   ");
		tripMode=new AirPlanTripMode();
	}
}
