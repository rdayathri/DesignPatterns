package car;

public abstract class CarTypeDecorator  implements CarType{
	protected CarType carTypeDecorator;
	public CarTypeDecorator(CarType carTypeDecorator) {
		this.carTypeDecorator = carTypeDecorator;
	}
	
	public void carType() {
		carTypeDecorator.carType();
	}
}

