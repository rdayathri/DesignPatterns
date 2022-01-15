package car;

public class ColorDecorator extends CarTypeDecorator{
 public ColorDecorator (CarType carTypeDecorator) {
	 super(carTypeDecorator);
 }
 @Override
 public void carType() {
	 carTypeDecorator.carType();
	 setBlueColor(carTypeDecorator);
 }
 private void setBlueColor(CarType carTypeDecorator) {
	 System.out.println("Car color: Blue");
 }
}
