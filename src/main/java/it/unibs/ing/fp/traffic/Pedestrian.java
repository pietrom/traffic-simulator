package it.unibs.ing.fp.traffic;

public class Pedestrian implements Item {

	@Override
	public String getSymbol() {
		return "P";
	}
	
	@Override
	public Position moveFrom(Position position) {
		return position.right(1);
	}
}
