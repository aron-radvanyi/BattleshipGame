package EnemyGrid;
import java.util.ArrayList;
import EnemyShips.EnemyShip;

public class EnemyGrid {

	private ArrayList<EnemyRow> EnemyRows = new ArrayList<EnemyRow>();
	private final int NUM_OF_ROWS = 10;

	// constructor
	public EnemyGrid() {
		EnemyRow temporaryRow;
		for (int i = 1; i <= this.NUM_OF_ROWS; i++) {
			temporaryRow = new EnemyRow(i);
			this.EnemyRows.add(temporaryRow);
		}
	}// end Grid

	// method to determine if there is a EnemyShip on square
	public boolean areThereEnemyShips(int row, int square) {
		for (EnemyRow temporaryRow : this.EnemyRows) {
			if (temporaryRow.getPosition() == row) {
				// found the correct row
				for (EnemySquare tempSquare : temporaryRow.getSquares()) {
					if (tempSquare.getPosition() == square) {
						// found the correct square
						return tempSquare.areThereEnemyShips();
					}
				}
			}
		}
		return false;
	}// end of the isThereAShip

	// to add EnemyShip to the grid
	public void addEnemyShipToGrid(EnemyShip enemyShip, int row, int square) {
		for (EnemyRow temporaryRow : this.EnemyRows) {
			if (temporaryRow.getPosition() == row) {
				// found correct row
				for (EnemySquare tempSquare : temporaryRow.getSquares()) {
					if (tempSquare.getPosition() == square) {
						// found correct square
						tempSquare.addEnemyShipToSquare(enemyShip);
					}
				}
			}
		}
	}// end of addShipToGrid

	// removing all enemy ships
	public void removeAllEnemyShipsFromGrid(int row, int square) {
		for (EnemyRow temporaryRow : this.EnemyRows) {
			if (temporaryRow.getPosition() == row) {
				// found correct row
				for (EnemySquare tempSquare : temporaryRow.getSquares()) {
					if (tempSquare.getPosition() == square) {
						// found correct square
						tempSquare.removeAllEnemyShips();
					}
				}
			}
		}
	}

	// getting the enemy ships
	public ArrayList<EnemyShip> getTheEnemyShipsFromGrid(int row, int square) {
		for (EnemyRow temporaryRow : this.EnemyRows) {
			if (temporaryRow.getPosition() == row) {
				// found correct row
				for (EnemySquare tempSquare : temporaryRow.getSquares()) {
					if (tempSquare.getPosition() == square) {
						// found correct square
						return tempSquare.getEnemyShips();
					}
				}
			}
		}
		return null;
	}

	// removing the enemy ships from the grid
	public void removeTheEnemeyShipFromGrid(EnemyShip enemyShip, int row, int square) {
		for (EnemyRow temporaryRow : this.EnemyRows) {
			if (temporaryRow.getPosition() == row) {
				// found correct row
				for (EnemySquare tempSquare : temporaryRow.getSquares()) {
					if (tempSquare.getPosition() == square) {
						// found correct square
						tempSquare.removeTheEnemyShip(enemyShip);
					}
				}
			}
		}
	}

}
