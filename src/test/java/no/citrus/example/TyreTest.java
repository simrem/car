package no.citrus.example;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TyreTest {
	@Test
	public void tyre_should_be_inflated(){
		Tyre tyre = new Tyre();
		boolean inflated = tyre.isInflated();
		assertThat(inflated, equalTo(false));
	}
}
