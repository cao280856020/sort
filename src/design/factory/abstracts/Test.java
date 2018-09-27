package design.factory.abstracts;

import design.factory.abstracts.model.Weapon;

public abstract class Test {

	public static void main(String[] args){
		WeaponStore wStore = new ColdWeaponStore();
		
		Weapon weapon = wStore.orderWeap("knife1");
		
		weapon.prepare();
		System.out.println(weapon.getIron()+":"+weapon.getWood());
	}
}
