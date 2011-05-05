package no.citrus.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;



public class EngineTest {
	@Test
	public void should_consume_gasoline(){
		Engine engine = new Engine();
		assertThat(engine.getFuelType(), equalTo("gasoline"));
	}
}
