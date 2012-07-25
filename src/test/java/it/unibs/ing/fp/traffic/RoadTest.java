package it.unibs.ing.fp.traffic;

import static org.junit.Assert.*;
import static it.unibs.ing.fp.traffic.ObjectMother.*;

import org.junit.Test;

public class RoadTest {
	@Test
	public void roadContainsSpecifiedNumberOfEmptySpaces() throws Exception {
		Road road = new Road(5, 10);
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				assertTrue(road.getItemAt(new Position(i, j)) instanceof Empty);
			}
		}
	}
	
	@Test
	public void setUpSpecifiedItem() throws Exception {
		Road road = new Road(5, 10);
		road.setItemAt(POSITION_2_2, JOE);
		road.setItemAt(POSITION_2_4, PANDA);
		
		assertEquals(JOE, road.getItemAt(POSITION_2_2));
		assertEquals(PANDA, road.getItemAt(POSITION_2_4));
	}
}
