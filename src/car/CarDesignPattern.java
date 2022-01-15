package car;

public class CarDesignPattern {
	public static void main(String[] args) {
		Car car = new Car();
		//new StartCar(car);
		//new StopCar(car);
		new ColorChanged(car);
		
		System.out.println("Trigger Change Car Color Observer");
		car.setColor("red");
		System.out.println("Trigger Change Car Color Observer Again");
		car.setColor("blue");
		
		
		CarType standardFuelCar = new StandardFuelCar();
		System.out.println("Standard Car Decorator called");
		standardFuelCar.carType();
		
		CarType electricCar  = new ColorDecorator(new ElectricCar());
		System.out.println("Electric Car Decorator called");
		electricCar.carType();
	}
}
