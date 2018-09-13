package design.d1.impl;

import design.d1.Quackable;

public class MuteQuack implements Quackable {

	@Override
	public void quack() {
		System.out.println("mute quack");

	}

}
