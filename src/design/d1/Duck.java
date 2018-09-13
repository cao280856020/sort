package design.d1;

public abstract class Duck {
	
	protected Flyable flyable;
	
	protected Quackable quackable;
	
	public abstract void display();
	
	public void swim(){
		System.out.println("swim");
	}
	
	public void performFly(){
		flyable.fly();
	}
	
	public void performQuack(){
		quackable.quack();
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public void setQuackable(Quackable quackable) {
		this.quackable = quackable;
	}
	
	
	
}
