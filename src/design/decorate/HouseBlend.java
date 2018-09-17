package design.decorate;

public class HouseBlend extends Beverage {

	public HouseBlend(int size2){
		description="house blend";
		size=size2;
	}
	
	@Override
	public int cost() {
		return 2;
	}

}
