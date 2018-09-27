package design.command;

import design.command.model.Light;
import design.command.SimpleRemoteControl;

public class Test {
	
	Light light=new Light();
	LightOnCommand lightOn=new LightOnCommand(light);
	
	SimpleRemoteControl simple=new SimpleRemoteControl(lightOn);
}
