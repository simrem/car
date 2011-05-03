package no.citrus.example;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private final String brand;
	private final int MAX_WHEELS;
	private List<WheelInterface> wheels;

	public Car(String brand) {
		this.brand = brand;
		wheels = new ArrayList<WheelInterface>();
		MAX_WHEELS = 4;
	}

	public String getBrand() {
		return brand;
	}

	public boolean addWheel(WheelInterface wheel) {
		if(wheels.size() < MAX_WHEELS) {
			wheels.add(wheel);
			return true;
		}
		else {
			return false;
		}
			
	}

	public Integer getNumOfWheels() {
		return wheels.size();
	}

	public void addWheels() {
		Tyre tyre = new Tyre();
		WheelInterface wheel = new Wheel(tyre);
		while(addWheel(wheel));
	}

	public boolean move() {
		boolean moved = true;
		for(WheelInterface wheel : wheels){
			moved = moved && wheel.spin();
		}
		return moved;
	}

	public boolean removeLastWheel() {
		
		return false;
	}
	

}
