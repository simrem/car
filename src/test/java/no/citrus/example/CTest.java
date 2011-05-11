package no.citrus.example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CTest {
	@Test
	public void should_call_on_c(){
		C cClass = new C();
		boolean cValue = cClass.c();
		assertThat(cValue, is(equalTo(true)));
	}
	
}
