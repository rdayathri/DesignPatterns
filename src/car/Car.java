package car;

import java.util.ArrayList;
import java.util.List;


public class Car {

	private List<Events> events = new ArrayList<Events>();
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		notifyChanges();
	}
	
	public void register (Events event) {
		events.add(event);
	}
	public void notifyChanges() {
		for(Events event :events ) {
			event.update();
		}
		
	}

}
