package design.decorate;

public class DarkRoast extends Beverage {

	public DarkRoast(int size2){
		description="dark roast";
		size=size2;
	}
	
	@Override
	public int cost() {
		return 5;
	}

}
