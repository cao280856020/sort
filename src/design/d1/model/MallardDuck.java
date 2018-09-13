package design.d1.model;

import design.d1.Duck;
import design.d1.impl.FlyWithWing;
import design.d1.impl.Quack;

public class MallardDuck extends Duck {
	public MallardDuck(){
		quackable=new Quack();
		flyable=new FlyWithWing();
	}

	@Override
	public void display() {
		System.out.println(" mallard display");
		
	}
	
}
