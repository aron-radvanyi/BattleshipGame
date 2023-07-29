package Logic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import EnemyGrid.EnemyGrid;
import Utility.Utility;
import EnemyShips.EnemyShip;

public class PlacerLogic {

	private EnemyGrid theEnemyGrid = new EnemyGrid();
	private Utility utility = new Utility();
	private String test = "The ships:";

	public void enemyShipPlacer() {
		// max number of ships on square
		final int MAX_NUM_SHIPS = 1;
		// min num ships in the game
		final int MIN_NUM_SHIPS = 5;

		for (int i = 0; i < MIN_NUM_SHIPS; i++) {
			int row = utility.RandomNumGenerator10();
			int square = utility.RandomNumGenerator10();

			ArrayList<EnemyShip> theEnemyShips = this.theEnemyGrid.getTheEnemyShipsFromGrid(row, square);

			if (theEnemyShips.size() <= MAX_NUM_SHIPS) {

				EnemyShip theEnemyShip = utility.randomWhichEnemyShip(row, square);
				theEnemyGrid.addEnemyShipToGrid(theEnemyShip, row, square);
				test = test + " "; 
				
				i++;
			} else {
				row = utility.RandomNumGenerator10();
				square = utility.RandomNumGenerator10();
			}
		}
	}
	
	/*public ArrayList<EnemyShip> getEnemyShips (){
		
		ArrayList<int[]> thePossCoordinates = utility.getListPossibleCoordinates();
		for(int i = 0; i<thePossCoordinates.size();i++) {
			
			int[] theCoordinates = thePossCoordinates.get(i);
			
		}
		
	}*/

	

}
