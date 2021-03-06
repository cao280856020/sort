package design.factory.abstracts;

import design.factory.abstracts.model.Weapon;

public abstract class WeaponStore {
	
	Weapon weapon;
	
	public final Weapon orderWeap(String type){
		weapon=createWeapon(type);
		weapon.prepare1();
		weapon.prepare2();
		weapon.prepare3();
		return weapon;
	}
	
	abstract Weapon createWeapon(String type);
}
