package design.d1;

public abstract class GoOut {
	protected TripMode tripMode;
	//执行出行
	public void goGo(){
		tripMode.goOut();
	}
	//设定出行方式
	public void setTripMode(TripMode tripMode) {
		this.tripMode = tripMode;
	}
}
