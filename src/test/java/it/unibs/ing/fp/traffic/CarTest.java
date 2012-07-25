package it.unibs.ing.fp.traffic;

import static org.junit.Assert.assertEquals;
import static it.unibs.ing.fp.traffic.ObjectMother.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	private Item car;
	
	@Before
	public void initCar() {
		car = new Car();
	}
	
	@Test
	public void carHasItsOwnSymbol() throws Exception {
		assertEquals("C", car.getSymbol());
	}
	
	@Test
	public void pedestrianMovesToBottom() {
		assertEquals(POSITION_2_4, car.moveFrom(POSITION_2_2));
	}
}
