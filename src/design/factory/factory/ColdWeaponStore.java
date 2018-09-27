package design.factory.factory;

import design.factory.factory.model.Knife;
import design.factory.factory.model.Sword;
import design.factory.factory.model.Weapon;

public class ColdWeaponStore extends WeaponStore{
	
	Weapon weapon;
	
	@Override
	Weapon createWeapon(String type) {
		if(type.equals("knife")){
			weapon = new Knife();
		}else{
			weapon = new Sword(); 
		}
		return weapon;
	}
}
