package design.d1.model;

import design.d1.Duck;
import design.d1.impl.FlyNoWay;
import design.d1.impl.Squeak;

public class DecoyDuck extends Duck {

	public DecoyDuck(){
		quackable=new Squeak();
		flyable=new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println(" decoy display");
		
	}
	
}
