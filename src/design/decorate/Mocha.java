package design.decorate;

public class Mocha extends ComdimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" mocha";
	}

	@Override
	public int cost() {
		return 3+beverage.cost()*beverage.getSize();
	}

}
