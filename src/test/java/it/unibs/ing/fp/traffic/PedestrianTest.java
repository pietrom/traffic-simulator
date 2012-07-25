package it.unibs.ing.fp.traffic;

import static org.junit.Assert.assertEquals;
import static it.unibs.ing.fp.traffic.ObjectMother.*;

import org.junit.Before;
import org.junit.Test;

public class PedestrianTest {
	private Item pedestrian;
	
	@Before
	public void initPedestrian() {
		pedestrian = new Pedestrian();
	}
	@Test
	public void pedestrianHasHisOwnSymbol() throws Exception {
		assertEquals("P", pedestrian.getSymbol());
	}
	
	@Test
	public void pedestrianMovesToRight() {
		assertEquals(POSITION_3_2, pedestrian.moveFrom(POSITION_2_2));
	}
}
