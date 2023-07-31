package Logic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import EnemyGrid.EnemyGrid;
import Utility.Utility;
import EnemyShips.BasicEnemyShip;
import EnemyShips.EnemyAircraftCarrier;
import EnemyShips.EnemyBattleShip;
import EnemyShips.EnemyDestroyer;
import EnemyShips.EnemyPatrolBoat;
import EnemyShips.EnemyShip;
import EnemyShips.EnemySubmarine;

public class PlacerLogic {

	private EnemyGrid theEnemyGrid = new EnemyGrid();
	private Utility utility = new Utility();
	private ArrayList<EnemyShip> thePossibleShips = new ArrayList<EnemyShip>();
	private String test = "The ships:";
	private Random random = new Random();

	public void enemyShipPlacer() {
		addingPossibleShips();
		// max number of ships on one square
		final int MAX_NUM_SHIPS = 1;
		// min num ships in the game
		final int MIN_NUM_SHIPS = 5;

		ArrayList<EnemyShip> thePossibleShipsCopy = this.thePossibleShips;

		for (int i = 0; i < MIN_NUM_SHIPS; i++) {
			int row = utility.RandomNumGenerator10();
			int square = utility.RandomNumGenerator10();

			ArrayList<EnemyShip> theEnemyShips = this.theEnemyGrid.getTheEnemyShipsFromGrid(row, square);

			if (theEnemyShips.size() < MAX_NUM_SHIPS) {

				EnemyShip theEnemyShip = thePossibleShipsCopy.get(random.nextInt(thePossibleShipsCopy.size()));
				thePossibleShipsCopy.remove(theEnemyShip);
				theEnemyShip.setRow(row);
				theEnemyShip.setSquare(square);
				theEnemyGrid.addEnemyShipToGrid(theEnemyShip, row, square);

				this.test = this.test + "\n" + theEnemyShip.getType() + " " + theEnemyShip.getRow() + " "
						+ theEnemyShip.getSquare();

			} else {
				row = utility.RandomNumGenerator10();
				square = utility.RandomNumGenerator10();
			}
		}
	}

	public void addingPossibleShips() {
		int row = 0;
		int square = 0;
		EnemyShip enemyAircraftCarrier = new EnemyAircraftCarrier(new BasicEnemyShip("Aircraft Carrier", row, square),
				"Aircraft Carrier", row, square);
		EnemyShip enemyBattleShip = new EnemyBattleShip(new BasicEnemyShip("Battleship", row, square), "Battleship",
				row, square);
		EnemyShip enemySubmarine = new EnemySubmarine(new BasicEnemyShip("Submarine", row, square), "Submarine", row,
				square);
		EnemyShip enemyDestroyer = new EnemyDestroyer(new BasicEnemyShip("Destroyer", row, square), "Destroyer", row,
				square);
		EnemyShip enemyPatrolBoat = new EnemyPatrolBoat(new BasicEnemyShip("Patrol Boat", row, square), "Patrol Boat",
				row, square);

		this.thePossibleShips.add(enemyAircraftCarrier);
		this.thePossibleShips.add(enemyBattleShip);
		this.thePossibleShips.add(enemySubmarine);
		this.thePossibleShips.add(enemyDestroyer);
		this.thePossibleShips.add(enemyPatrolBoat);
	}

	public String getTest() {
		return this.test;
	}

	public ArrayList<EnemyShip> getTheEnemyShipsOnGrid(int row, int square) {
		return this.theEnemyGrid.getTheEnemyShipsFromGrid(row, square);
	}

}
