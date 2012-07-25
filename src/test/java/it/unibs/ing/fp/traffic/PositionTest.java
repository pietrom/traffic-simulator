package it.unibs.ing.fp.traffic;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {
	@Test
	public void differentObjectsHaveDifferentHashCodes() throws Exception {
		final int firstHash = ObjectMother.POSITION_2_2.hashCode();
		final int secondHash = new Position(5, 10).hashCode();
		assertTrue(firstHash != secondHash);
	}
	
	@Test
	public void nullPositionNeverEqualsToNotNullOne() throws Exception {
		assertFalse(ObjectMother.POSITION_2_2.equals(null));
	}
	
	@Test
	public void positionNeverEqualsToObjectOfDifferentClass() throws Exception {
		assertFalse(ObjectMother.POSITION_2_2.equals("foo bar"));
	}
	
	@Test
	public void positionsAreNotEqualsWhenXsAreDifferent() throws Exception {
		assertFalse(ObjectMother.POSITION_2_2.equals(new Position(3, 2)));
	}
	
	@Test
	public void positionsAreNotEqualsWhenYsAreDifferent() throws Exception {
		assertFalse(ObjectMother.POSITION_2_2.equals(new Position(2, 4)));
	}
}
