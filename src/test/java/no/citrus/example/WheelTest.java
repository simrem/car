package no.citrus.example;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class WheelTest {
	
	@Test
	public void wheel_should_spin(){
		Tyre tyre = new Tyre();
		Wheel wheel = new Wheel(tyre);
		boolean spin = wheel.spin();
		assertThat(spin, equalTo(true));
	}
	
	@Test
	public void wheel_should_have_inflated_tyre(){
		Tyre tyre = new Tyre();
		Wheel wheel = new Wheel(tyre);
		Tyre fetchedTyre = wheel.getTyre();
		boolean inflated = fetchedTyre.isInflated();
		assertThat(inflated, equalTo(true));
	}
}
