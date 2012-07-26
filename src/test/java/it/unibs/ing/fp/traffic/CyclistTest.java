package it.unibs.ing.fp.traffic;

import static it.unibs.ing.fp.traffic.ObjectMother.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CyclistTest {
	private Item cyclist;
	
	@Before
	public void initCyclist() {
		cyclist = new Cyclist();
	}
	
	@Test
	public void cyclistHasItsOwnSymbol() throws Exception {
		assertEquals("B", cyclist.getSymbol());
	}
	
	@Test
	public void cyclistMovesToBottom() {
		assertEquals(POSITION_2_3, cyclist.moveFrom(POSITION_2_2));
	}
}
