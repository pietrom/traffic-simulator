package it.unibs.ing.fp.traffic;

import static org.junit.Assert.*;

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
}
