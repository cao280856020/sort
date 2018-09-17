package design.d1;

import design.d1.impl.AirPlanTripMode;
import design.d1.impl.CarTripMode;
import design.d1.impl.TrainTripMode;
import design.d1.model.BusinessTrip;
import design.d1.model.GoHome;

public class Test {
	public static void main(String[] args) {
		GoOut go=new BusinessTrip();
		go.goGo();
		System.out.print("  切换  ");
		go.setTripMode(new TrainTripMode());
		go.goGo();
		System.out.print("  切换  ");
		go.setTripMode(new CarTripMode());
		go.goGo();
		
		System.out.println();
		
		go=new GoHome();
		go.goGo();
		System.out.print("  切换  ");
		go.setTripMode(new AirPlanTripMode());
		go.goGo();
		System.out.print("  切换  ");
		go.setTripMode(new TrainTripMode());
		go.goGo();
	}
}
