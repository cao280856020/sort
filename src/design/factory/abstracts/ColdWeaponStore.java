package design.factory.abstracts;

import design.factory.abstracts.ingredient.ColdIngredientFactory;
import design.factory.abstracts.ingredient.IngredientFactory;
import design.factory.abstracts.model.Knife;
import design.factory.abstracts.model.Sword;
import design.factory.abstracts.model.Weapon;

public class ColdWeaponStore extends WeaponStore{
	
	Weapon weapon;
	
	@Override
	Weapon createWeapon(String type) {
		
		IngredientFactory ingredientFactory=new ColdIngredientFactory();
		
		if(type.equals("knife")){
			weapon = new Knife(ingredientFactory);
			weapon.setName("cold knife !");
		}else{
			weapon = new Sword(ingredientFactory); 
			weapon.setName("cold sword !");
		}
		return weapon;
	}
}
