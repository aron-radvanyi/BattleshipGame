package Logic;

import java.util.ArrayList;

import EnemyShips.EnemyShip;

public class Play {

	private PlacerLogic logic = new PlacerLogic();
	// max number of enemy ships on one square
	final int MAX_NUM_ENEMY = 1;

	public void shootOnCoordinates(int row, int square) {
		ArrayList<EnemyShip> theEnemyShips = logic.getTheEnemyShipsOnGrid(row, square);

		if (hitEnemyShip(theEnemyShips)) {
			for (int i = 0; i < theEnemyShips.size(); i++) {

			}
		}
	}

	// returns true if the enemyships were hit becasue on the coordinate
	public boolean hitEnemyShip(ArrayList<EnemyShip> theEnemyShips) {
		if (theEnemyShips.size() > MAX_NUM_ENEMY) {
			return false;
		} else {

			return true;
		}
	}
}
