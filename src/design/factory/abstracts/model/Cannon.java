package design.factory.abstracts.model;

import design.factory.abstracts.ingredient.IngredientFactory;

public class Cannon extends Weapon {

	IngredientFactory ingredientFactory;
	
	public Cannon(IngredientFactory ingredientFactory){
		this.ingredientFactory=ingredientFactory;
	}
	
	public void prepare(){
		System.out.println("preparing "+name);
		super.setIron(ingredientFactory.createIron());
		super.setWood(ingredientFactory.createWood());
	}
}
