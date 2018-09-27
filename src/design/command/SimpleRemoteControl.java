package design.command;

//控制器
public class SimpleRemoteControl {
	
	private Command slot;
	
	public SimpleRemoteControl(Command slot){
		this.slot=slot;
	}
	
	public void buttonWasPressed(){
		slot.execute();
	}
}
