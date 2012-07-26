package it.unibs.ing.fp.traffic;

public class Pedestrian extends Item {

	@Override
	public String getSymbol() {
		return "P";
	}
	
	@Override
	public Position moveFrom(Position position) {
		return position.right(1);
	}

	@Override
	public boolean canOverwrite(Item item) {
		return false;
	}
}
