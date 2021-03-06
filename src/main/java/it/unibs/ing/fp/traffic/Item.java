package it.unibs.ing.fp.traffic;

public abstract class Item {

	public abstract String getSymbol();

	public abstract Position moveFrom(Position position);

	public abstract boolean canOverwrite(Item item);

	public boolean canBeOverwrittenBy(Cyclist cyclist) {
		return false;
	}
	
	public boolean canBeOverwrittenBy(Pedestrian cyclist) {
		return false;
	}
}
