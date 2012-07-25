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
				if(newMap[newPosition.getX()][newPosition.getY()] == null) {
					newMap[newPosition.getX()][newPosition.getY()] = map[i][j];
				}
			}
		}
		map = newMap;
		fillNullItemsUsingEmptySpaces();
	}
}
