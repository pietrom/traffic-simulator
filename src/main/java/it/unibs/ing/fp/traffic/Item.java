package it.unibs.ing.fp.traffic;

public interface Item {

	public abstract String getSymbol();

	public abstract Position moveFrom(Position position);

}
