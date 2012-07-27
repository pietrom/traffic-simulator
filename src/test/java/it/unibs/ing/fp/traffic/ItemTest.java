package it.unibs.ing.fp.traffic;

import static org.junit.Assert.*;
import static it.unibs.ing.fp.traffic.ObjectMother.*;

import org.junit.Test;

public class ItemTest {
	private static final class FakeItem extends Item {
		@Override
		public String getSymbol() {
			return null;
		}

		@Override
		public Position moveFrom(Position position) {
			return null;
		}

		@Override
		public boolean canOverwrite(Item item) {
			return false;
		}
	}
	
	@Test
	public void baseItemCantBeOverwrittenByCyclist() throws Exception {
		assertFalse(new FakeItem().canBeOverwrittenBy(MERCKX));
	}
	
	@Test
	public void baseItemCantBeOverwrittenByPedestrian() throws Exception {
		assertFalse(new FakeItem().canBeOverwrittenBy(JOE));
	}
}
