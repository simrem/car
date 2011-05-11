package no.citrus.example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ATest {
	@Test
	public void should_call_on_b() {
		A aClass = new A();
		boolean aValue = aClass.a();
		assertThat(aValue, is(equalTo(true)));
	}
}
