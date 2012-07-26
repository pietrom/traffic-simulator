package it.unibs.ing.fp.traffic;

public class Road {
	private Item[][] map;
	
	public Road(int columnCount, int rowCount) {
		this.map = new Item[columnCount][rowCount];
		fillNullItemsUsingEmptySpaces();
	}
	
	private void fillNullItemsUsingEmptySpaces() {
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(this.map[i][j] == null) {
					this.map[i][j] = new Empty();
				}
			}
		}
	}

	public Item getItemAt(Position position) {
		return this.map[position.getX()][position.getY()];
	}

	public void setItemAt(Position position, Item item) {
		this.map[position.getX()][position.getY()] = item;
	}

	public void simulate() {
		final Item[][] newMap = new Item[map.length][map[0].length];
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[0].length; j++) {
				final Position newPosition = map[i][j].moveFrom(new Position(i, j));
				if(newPositionIsValid(newPosition) && newPositionIsAvailable(newMap, newPosition)) {
					newMap[newPosition.getX()][newPosition.getY()] = map[i][j];
				}
			}
		}
		map = newMap;
		fillNullItemsUsingEmptySpaces();
	}

	private boolean newPositionIsValid(Position newPosition) {
		return newPosition.getX() < map.length && newPosition.getY() < map[0].length;
	}

	private boolean newPositionIsAvailable(final Item[][] newMap,
			final Position newPosition) {
		return newMap[newPosition.getX()][newPosition.getY()] == null;
	}
}
