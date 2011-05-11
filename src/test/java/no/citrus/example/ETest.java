package no.citrus.example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class ETest {
	@Test
	public void should_do_e(){
		E eClass = new E();
		boolean eValue = eClass.e();
		assertThat(eValue, is(equalTo(true)));
	}
}
