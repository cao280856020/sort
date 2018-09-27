package design.factory.abstracts;

import design.factory.abstracts.ingredient.HotIngredientFactory;
import design.factory.abstracts.ingredient.IngredientFactory;
import design.factory.abstracts.model.Cannon;
import design.factory.abstracts.model.Gun;
import design.factory.abstracts.model.Weapon;

public class HotWeaponStore extends WeaponStore {

	Weapon weapon;
	
	@Override
	Weapon createWeapon(String type) {
		
		IngredientFactory ingredientFactory=new HotIngredientFactory();
		
		if(type.equals("gun")){
			weapon = new Gun(ingredientFactory);
			weapon.setName("hot gun !");
		}else{
			weapon = new Cannon(ingredientFactory); 
			weapon.setName("hot cannon !");
		}
		return weapon;
	}

}
