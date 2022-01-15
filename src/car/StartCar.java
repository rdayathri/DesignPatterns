package car;

public class StartCar extends Events{
	public StartCar(Car car) {
		this.car = car;
		this.car.register(this);
	}
	
	@Override
	public void update() {
		System.out.println("Car Started");
	}
}


