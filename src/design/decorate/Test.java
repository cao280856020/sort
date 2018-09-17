package design.decorate;

public class Test {

	public static void main(String[] args) {
		
		Beverage beverage=new HouseBlend(2);
		System.out.println(beverage.getDescription()+" "+beverage.cost());
		
		beverage=new Milk(beverage);
		beverage=new Milk(beverage);
		beverage=new Mocha(beverage);
		
		System.out.println(beverage.getDescription()+" "+beverage.cost());
		
		
		beverage=new DarkRoast(2);
		System.out.println(beverage.getDescription()+" "+beverage.cost());
		
		beverage=new Milk(beverage);
		beverage=new Mocha(beverage);
		
		System.out.println(beverage.getDescription()+" "+beverage.cost());
	}

}
