package design.decorate;

public class Milk extends ComdimentDecorator {

	Beverage beverage;
	
	public Milk(Beverage beverage){
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" milk";
	}

	@Override
	public int cost() {
		return 1+beverage.cost()*beverage.getSize();
	}

}
