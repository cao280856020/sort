package design.d1.impl;

import design.d1.Flyable;

public class FlyNoWay implements Flyable {

	@Override
	public void fly() {
		System.out.println("flyNoWay");
	}

}
