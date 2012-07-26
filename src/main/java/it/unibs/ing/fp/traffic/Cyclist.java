package it.unibs.ing.fp.traffic;

public class Cyclist implements Item {
	@Override
	public String getSymbol() {
		return "B";
	}

	@Override
	public Position moveFrom(Position position) {
		return position.bottom(1);
	}
}