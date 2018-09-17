package design.observer;

public class Test {

	public static void main(String[] args) {
		WeatherData data=new WeatherData();
		
		new Conditions(data);
		new Conditions(data);
		new Conditions(data);
		
		data.setMeasurements(1);
		
	}

}
