package design.factory.simple;

import design.factory.simple.model.Knife;
import design.factory.simple.model.Sword;
import design.factory.simple.model.Weapon;

public class SimpleFactory {

	Weapon weapon=null;
	
	public Weapon createWeapon(String type){
		if(type.equals("knife")){
			weapon=new Knife();
		}else{
			weapon=new Sword();
		}
		return weapon;
	}
}
