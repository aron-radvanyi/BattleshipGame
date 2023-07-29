package EnemyGrid;

import EnemyShips.EnemyShip;

import java.util.ArrayList;

public class EnemySquare {

	private int position;
	private ArrayList<EnemyShip> theEnemeyShips = new ArrayList<EnemyShip>();

	// constructor
	public EnemySquare(int position) {
		setPosition(position);
	}

	// important methods
	public boolean areThereEnemyShips() {
		if (theEnemeyShips == null) {
			return false;
		}
		return true;
	}

	// add EnemyShips to the grid
	public void addEnemyShipToSquare(EnemyShip theEnemyShip) {
		this.theEnemeyShips.add(theEnemyShip);
	}

	// remove EnemyShip from the ArrayList
	public void removeTheEnemyShip(EnemyShip theEneemyShip) {
		this.theEnemeyShips.remove(theEneemyShip);
	}
	
	//remove ALL EnemyShips from the ArrayList
	public void removeAllEnemyShips() {
		this.theEnemeyShips.removeAll(theEnemeyShips);
	}

	// getters setters
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public ArrayList<EnemyShip> getEnemyShips() {
		return theEnemeyShips;
	}

	public void setEnemyShips(ArrayList<EnemyShip> theEnemeyShips) {
		this.theEnemeyShips = theEnemeyShips;
	}

}
