package it.unibs.ing.fp.traffic;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmptyTest {
	@Test
	public void emptySpaceHasItsOwnSymbol() throws Exception {
		Item empty = new Empty();
		assertEquals(" ", empty.getSymbol());
	}
}
