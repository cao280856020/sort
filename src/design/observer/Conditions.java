package design.observer;

import java.util.Observable;
import java.util.Observer;

public class Conditions implements Observer {
	
	Observable observable;
	
	private int x;
	
	public Conditions(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable obserable, Object arg1) {
		WeatherData data=(WeatherData)obserable;
		this.x=data.getX();
		
		System.out.println("x="+x);
	}

}
