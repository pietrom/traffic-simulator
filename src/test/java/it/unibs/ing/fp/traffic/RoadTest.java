package it.unibs.ing.fp.traffic;

import static it.unibs.ing.fp.traffic.ObjectMother.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RoadTest {
	private Road road;
	
	@Before
	public void initRoad() {
		road = new Road(5, 10);
	}
	
	@Test
	public void roadContainsSpecifiedNumberOfEmptySpaces() throws Exception {
		assertRoadFilledByEmptySpaces();
	}
	
	@Test
	public void setUpSpecifiedItem() throws Exception {
		road.setItemAt(POSITION_2_2, JOE);
		road.setItemAt(POSITION_2_4, PANDA);
		
		assertEquals(JOE, road.getItemAt(POSITION_2_2));
		assertEquals(PANDA, road.getItemAt(POSITION_2_4));
	}
	
	@Test
	public void emptySpacesDoNotMove() throws Exception {
		road.simulate();
		assertRoadFilledByEmptySpaces();
	}
	
	@Test
	public void dynamicItemsMoveAccordingToTheirsSpecificBehaviour() {
		road.setItemAt(POSITION_2_2, JOE);
		road.setItemAt(POSITION_2_4, PANDA);
		
		road.simulate();
		
		assertEquals(JOE, road.getItemAt(POSITION_3_2));
		assertEquals(PANDA, road.getItemAt(POSITION_2_6));
	}
	
	@Test
	public void dynamicItemsDoNotLeaveHoles() throws Exception {
		road.setItemAt(POSITION_2_2, JOE);
		road.setItemAt(POSITION_2_4, PANDA);
		
		road.simulate();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				assertNotNull(road.getItemAt(new Position(i, j)));
			}
		}
	}
	
	private void assertRoadFilledByEmptySpaces() {
		assert(5 * 10 == emptyItemsCount());
	}
	
	@Test
	public void dynamicItemsExitTheRoad() throws Exception {
		road.setItemAt(POSITION_4_4_RIGHT_BORDER, JOE);
		road.setItemAt(POSITION_2_9_BOTTOM_BORDER, PANDA);
		road.simulate();
		assertRoadFilledByEmptySpaces();
	}
	
	@Test
	public void carDisappearsWhenCollidingWithAPedestrian() throws Exception {
		road.setItemAt(POSITION_1_4, JOE);
		road.setItemAt(POSITION_2_2, PANDA);
		road.simulate();
		
		assertEquals(JOE, road.getItemAt(POSITION_2_4));
		assertEquals(5 * 10 - 1, emptyItemsCount());
	}

	private int emptyItemsCount() {
		int count = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				
				if(road.getItemAt(new Position(i, j)) instanceof Empty) {
					count++;
				}
			}
		}
		return count;
	}
	
	@Test
	public void collisionBetweenCarAndCyclistResultsInCarsDisappearance() throws Exception {
		road.setItemAt(POSITION_2_2, PANDA);
		road.setItemAt(POSITION_2_3, MERCKX);
		road.simulate();
		
		assertEquals(MERCKX, road.getItemAt(POSITION_2_4));
	}
	
	@Test
	public void collisionBetweenPedestrianAndCyclistResultsInPedestriansDisappearance() throws Exception {
		road.setItemAt(POSITION_1_4, JOE);
		road.setItemAt(POSITION_2_3, MERCKX);
		road.simulate();
		
		assertEquals(MERCKX, road.getItemAt(POSITION_2_4));
	}
	
	@Test
	public void movementOrderDoesntMatter() throws Exception {
		road.setItemAt(POSITION_2_2, MERCKX);
		road.setItemAt(POSITION_2_3, PANDA);
		road.simulate();
		
		assertEquals(MERCKX, road.getItemAt(POSITION_2_3));
		assertEquals(PANDA, road.getItemAt(POSITION_2_5));
	}
}
