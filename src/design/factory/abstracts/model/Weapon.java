package design.factory.abstracts.model;

public abstract class Weapon {

	protected String name;
	
	protected String iron;
	
	protected String wood;
	
	public abstract void prepare();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void prepare1(){
		System.out.println("步骤一");
	}
	
	public void prepare2(){
		System.out.println("步骤二");
	}
	
	public void prepare3(){
		System.out.println("步骤三");
	}

	public String getIron() {
		return iron;
	}

	public void setIron(String iron) {
		this.iron = iron;
	}

	public String getWood() {
		return wood;
	}

	public void setWood(String wood) {
		this.wood = wood;
	}
	
	
}
