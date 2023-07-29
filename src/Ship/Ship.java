
package Ship;

public class Ship {
	
	private String type;
	private int row;
	private int square;

	// constructor
	public Ship(String type,int row, int square) {
		setRow(row);
		setSquare(square);
		setType(type);

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
