package no.citrus.example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CarTest {
	@Test
	public void car_should_have_brand(){
		Car car = new Car("BMW");
		String brand = car.getBrand();
		assertThat(brand, equalTo("BMW"));
	}
	
	@Test
	public void car_should_support_max_4_wheels(){
		Car car = new Car("BMW");
		Tyre tyre = new Tyre();
		WheelInterface wheel = new Wheel(tyre);
		int wheels = 0;
		while(car.addWheel(wheel)) {
			wheels++;
		}
		assertThat(car.getNumOfWheels(), equalTo(4));
	}
	
	@Test
	public void car_should_move(){
		Car car = new Car("BMW");
		car.addWheels();
		boolean moved = car.move();
		assertThat(moved, equalTo(true));
	}
	
//	@Test
//	public void car_should_be_able_to_remove_last_added_tyre(){
//		Car car = new Car("BMW");
//		boolean result = car.removeLastWheel();
//		assertThat(result, equalTo(true));
//	}
	
	
}
