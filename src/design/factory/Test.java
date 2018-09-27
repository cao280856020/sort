package design.factory;

import design.factory.simple.SimpleFactory;
import design.factory.simple.WeaponStore;

public class Test {

	public static void main(String[] args) {
		WeaponStore store=new WeaponStore(new SimpleFactory());
		store.orderWeapon("sword");

	}

}
