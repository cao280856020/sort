package design.factory.factory;

import design.factory.factory.model.Cannon;
import design.factory.factory.model.Gun;
import design.factory.factory.model.Weapon;

public class HotWeaponStore extends WeaponStore {

	Weapon weapon;
	
	@Override
	Weapon createWeapon(String type) {
		if(type.equals("gun")){
			weapon = new Gun();
		}else{
			weapon = new Cannon(); 
		}
		return weapon;
	}

}
