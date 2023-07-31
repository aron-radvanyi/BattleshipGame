package Utility;

import java.util.ArrayList;
import java.util.Random;

import EnemyShips.BasicEnemyShip;
import EnemyShips.EnemyAircraftCarrier;
import EnemyShips.EnemyBattleShip;
import EnemyShips.EnemyDestroyer;
import EnemyShips.EnemyPatrolBoat;
import EnemyShips.EnemyShip;
import EnemyShips.EnemySubmarine;

public class Utility {

	Random random = new Random();

	// method to declare random number
	public int RandomNumGenerator10() {
		int randomInt = random.nextInt(10);
		return randomInt + 1;
		// +1 becasue random.nextInt(10) will generate int between 0-9, and we need
		// range 1-10
	}

	/*
	 * gives back an ArrayList with all possible coordinates change
	 * MAX_ROWS/MAX_SQUARES if the possible coordinates changed
	 */
	public ArrayList<int[]> getListPossibleCoordinates() {
		ArrayList<int[]> possibleCoordinates = new ArrayList<>();

		final int MAX_ROWS = 10;
		final int MAX_SQUARES = 10;

		for (int i = 1; i <= MAX_ROWS; i++) {
			for (int j = 1; j <= MAX_SQUARES; j++) {
				int[] theCoordinate = new int[2];
				theCoordinate[0] = i;
				theCoordinate[1] = j;
				possibleCoordinates.add(theCoordinate);
			}
		}
		return possibleCoordinates;
	}
	
	
	public EnemyShip randomWhichEnemyShip(int row, int square) {
		int number = random.nextInt(4);
		if (number == 0) {
			EnemyShip EnemyAircraftCarrier = new EnemyAircraftCarrier(new BasicEnemyShip("EnemyAircraftCarrier",row, square),"EnemyAircraftCarrier", row, square);
			return EnemyAircraftCarrier;
		} else if (number == 1) {
			EnemyShip EnemyBattleShip = new EnemyBattleShip(new BasicEnemyShip("EnemyBattleShip",row, square),"EnemyBattleShip", row, square);
			return EnemyBattleShip;
		}else if (number == 2) {
			EnemyShip EnemySubmarine = new EnemySubmarine(new BasicEnemyShip("EnemySubmarine",row, square),"EnemySubmarine", row, square);
			return EnemySubmarine;
		}else if (number == 3) {
			EnemyShip EnemyDestroyer = new EnemyDestroyer(new BasicEnemyShip("EnemyDestroyer",row, square),"EnemyDestroyer", row, square);
			return EnemyDestroyer;
		}else {
			EnemyShip EnemyPatrolBoat = new EnemyPatrolBoat(new BasicEnemyShip("EnemyPatrolBoat",row, square),"EnemyPatrolBoat", row, square);
			return EnemyPatrolBoat;
		} 
	}

	
	

}
