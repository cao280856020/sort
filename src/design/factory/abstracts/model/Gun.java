package design.factory.abstracts.model;

import design.factory.abstracts.ingredient.IngredientFactory;

public class Gun extends Weapon {

	IngredientFactory ingredientFactory;
	
	public Gun(IngredientFactory ingredientFactory){
		this.ingredientFactory=ingredientFactory;
	}
	
	public void prepare(){
		System.out.println("preparing "+name);
		super.setIron(ingredientFactory.createIron());
		super.setWood(ingredientFactory.createWood());
	}
}
