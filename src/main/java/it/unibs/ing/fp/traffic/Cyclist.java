package it.unibs.ing.fp.traffic;

public class Cyclist extends Item {
	@Override
	public String getSymbol() {
		return "B";
	}

	@Override
	public Position moveFrom(Position position) {
		return position.bottom(1);
	}

	@Override
	public boolean canOverwrite(Item item) {
		return item.canBeOverwrittenBy(this);
	}
}