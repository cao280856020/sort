package design.factory.abstracts.ingredient;

public class ColdIngredientFactory extends IngredientFactory {

	@Override
	public String createIron() {
		return "创建冷兵器铁";
	}

	@Override
	public String createWood() {
		return "创建冷兵器木头";
	}

}
