package it.unibs.ing.fp.traffic;

public class Empty extends Item {
	@Override
	public String getSymbol() {
		return " ";
	}

	@Override
	public Position moveFrom(Position position) {
		return position;
	}

	@Override
	public boolean canOverwrite(Item item) {
		return false;
	}
}
