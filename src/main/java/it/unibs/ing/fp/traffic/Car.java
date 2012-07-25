package it.unibs.ing.fp.traffic;

public class Car implements Item {
	@Override
	public String getSymbol() {
		return "C";
	}
	
	@Override
	public Position moveFrom(Position position) {
		return position.bottom(2);
	}
}
