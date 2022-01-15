package car;

public class ColorChanged extends Events{
	public ColorChanged(Car car) {
		this.car = car;
		this.car.register(this);
	}
	
	@Override
	public void update() {
		System.out.println("Color of the changed to: "+car.getColor());
	}
}


