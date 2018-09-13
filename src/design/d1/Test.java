package design.d1;

import design.d1.impl.FlyNoWay;
import design.d1.model.MallardDuck;

public class Test {

	public static void main(String[] args) {
		Duck duck=new MallardDuck();
		duck.display();
		duck.performFly();
		
		duck.setFlyable(new FlyNoWay());
		
		duck.performFly();
	}

}
