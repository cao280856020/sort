package design.observer;

import java.util.Observable;
public class WeatherData extends Observable {
	
	private int x;
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(int x){
		this.x=x;
		this.measurementsChanged();
	}
	
	public int getX() {
		return x;
	}
}
