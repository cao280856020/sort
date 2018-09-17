package design.d1.model;

import design.d1.GoOut;
import design.d1.impl.CarTripMode;

public class GoHome extends GoOut {
	public GoHome(){
		System.out.print("回家  ");
		tripMode=new CarTripMode();
	}
}
