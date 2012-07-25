package it.unibs.ing.fp.traffic;

public class Empty implements Item {
	@Override
	public String getSymbol() {
		return " ";
	}

	@Override
	public Position moveFrom(Position position) {
		return position;
	}
}
