package it.unibs.ing.fp.traffic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {
	@Test
	public void carHasItsOwnSymbol() throws Exception {
		Item car = new Car();
		assertEquals("C", car.getSymbol());
	}
}
