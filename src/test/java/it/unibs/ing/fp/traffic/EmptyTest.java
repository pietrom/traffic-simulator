package it.unibs.ing.fp.traffic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EmptyTest {
	private Item empty;
	
	@Before
	public void initEmptySpace() {
		empty = new Empty();
	}
	
	@Test
	public void emptySpaceHasItsOwnSymbol() throws Exception {
		assertEquals(" ", empty.getSymbol());
	}
	
	@Test
	public void emptySpaceDoesntMove() throws Exception {
		Position next = empty.moveFrom(ObjectMother.POSITION_2_2);
		assertEquals(ObjectMother.POSITION_2_2, next);
	}
}
