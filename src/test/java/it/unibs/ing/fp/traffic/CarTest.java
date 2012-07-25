package it.unibs.ing.fp.traffic;

import static org.junit.Assert.assertEquals;

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
		assertEquals(new Position(2, 4), car.moveFrom(ObjectMother.POSITION_2_2));
	}
}
