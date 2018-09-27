package design.factory.abstracts.model;

import design.factory.abstracts.ingredient.IngredientFactory;

public class Knife extends Weapon {
	
	IngredientFactory ingredientFactory;
	
	public Knife(IngredientFactory ingredientFactory){
		this.ingredientFactory=ingredientFactory;
	}
	
	public void prepare(){
		System.out.println("preparing "+super.getName());
		super.setIron(ingredientFactory.createIron());
		super.setWood(ingredientFactory.createWood());
	}
}
