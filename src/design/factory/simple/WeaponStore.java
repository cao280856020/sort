package design.factory.simple;

import design.factory.simple.model.Weapon;

public class WeaponStore {

	SimpleFactory factory;
	
	public WeaponStore(SimpleFactory factory){
		this.factory=factory;
	}
	
	public Weapon orderWeapon(String type){
		Weapon weapon=factory.createWeapon(type);
		
		weapon.prepare1();
		weapon.prepare2();
		weapon.prepare3();
		
		return weapon;
	}
}
