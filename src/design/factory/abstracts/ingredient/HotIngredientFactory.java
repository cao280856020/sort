package design.factory.abstracts.ingredient;

public class HotIngredientFactory extends IngredientFactory {

	@Override
	public String createIron() {
		return "创建热兵器铁";
	}

	@Override
	public String createWood() {
		return "创建热兵器木头";
	}

}
