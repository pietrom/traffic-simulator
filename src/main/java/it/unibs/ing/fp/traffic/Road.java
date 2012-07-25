package it.unibs.ing.fp.traffic;

public class Road {
	private Item[][] map;
	
	public Road(int columnCount, int rowCount) {
		this.map = new Item[columnCount][rowCount];
		for(int i = 0; i < columnCount; i++) {
			for(int j = 0; j < rowCount; j++) {
				this.map[i][j] = new Empty();
			}
		}
	}

	public Item getItemAt(Position position) {
		return this.map[position.getX()][position.getY()];
	}
}
