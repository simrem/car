package no.citrus.example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoadTest {
	@Test
	public void road_should_have_a_surface(){
		Road road = new Road("asphalt");
		assertThat("Veien vaarres", road.getSurface(), equalTo("asphalt"));
	}
}
