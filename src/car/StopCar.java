package car;

public class StopCar extends Events{
	public StopCar(Car car) {
		this.car = car;
		this.car.register(this);
	}
	
	@Override
	public void update() {
		System.out.println("Car Stopped");
	}
}


