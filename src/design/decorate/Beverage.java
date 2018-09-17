package design.decorate;

public abstract class Beverage {

	String description="无效的饮料";
	
	public String getDescription(){
		return description;
	}
	
	int size=1;
	
	public int getSize(){
		return size; 
	}
	
	public abstract int cost();
}
