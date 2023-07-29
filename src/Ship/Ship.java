
package Ship;

public class Ship {

	private int row;
	private int square;

	// constructor
	public Ship(int row, int square) {
		setRow(row);
		setSquare(square);

	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

}
