package no.citrus.example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BTest {
	@Test
	public void should_call_on_c(){
		B bClass = new B();
		boolean bValue = bClass.b();
		assertThat(bValue, is(equalTo(true)));
	}
}
