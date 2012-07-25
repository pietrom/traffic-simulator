package it.unibs.ing.fp.traffic;

public class Position {
	private final int x, y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public Position right(int amount) {
		return new Position(x + amount, y);
	}

	public Position bottom(int amount) {
		return new Position(x, y + amount);
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
