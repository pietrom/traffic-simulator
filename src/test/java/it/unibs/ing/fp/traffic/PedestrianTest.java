package it.unibs.ing.fp.traffic;

import static org.junit.Assert.*;

import org.junit.Test;

public class PedestrianTest {
	@Test
	public void pedestrianHasHisOwnSymbol() throws Exception {
		Item pedestrian = new Pedestrian();
		assertEquals("P", pedestrian.getSymbol());
	}
}
