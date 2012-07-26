package it.unibs.ing.fp.traffic;

public class Car extends Item {
	@Override
	public String getSymbol() {
		return "C";
	}

	@Override
	public Position moveFrom(Position position) {
		return position.bottom(2);
	}

	@Override
	public boolean canOverwrite(Item item) {
		return false;
	}

	public boolean canBeOverwrittenBy(Cyclist cyclist) {
		return true;
	}
}
