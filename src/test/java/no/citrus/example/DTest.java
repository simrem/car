package no.citrus.example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DTest {
	@Test
	public void should_call_on_e(){
		D dClass = new D();
		boolean dValue = dClass.d();
		assertThat(dValue, is(equalTo(true)));
	}
}
