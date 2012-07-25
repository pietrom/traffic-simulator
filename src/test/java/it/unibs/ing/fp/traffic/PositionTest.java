package it.unibs.ing.fp.traffic;

import static org.junit.Assert.*;
import static it.unibs.ing.fp.traffic.ObjectMother.*;

import org.junit.Test;

public class PositionTest {
	@Test
	public void differentObjectsHaveDifferentHashCodes() throws Exception {
		final int firstHash = POSITION_2_2.hashCode();
		final int secondHash = POSITION_2_4.hashCode();
		assertTrue(firstHash != secondHash);
	}
	
	@Test
	public void nullPositionNeverEqualsToNotNullOne() throws Exception {
		assertFalse(POSITION_2_2.equals(null));
	}
	
	@Test
	public void positionNeverEqualsToObjectOfDifferentClass() throws Exception {
		assertFalse(POSITION_2_2.equals("foo bar"));
	}
	
	@Test
	public void positionsAreNotEqualsWhenXsAreDifferent() throws Exception {
		assertFalse(POSITION_2_2.equals(POSITION_3_2));
	}
	
	@Test
	public void positionsAreNotEqualsWhenYsAreDifferent() throws Exception {
		assertFalse(POSITION_2_2.equals(POSITION_2_4));
	}
}
