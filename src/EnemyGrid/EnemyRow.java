package EnemyGrid;

import java.io.Serializable;
import java.util.ArrayList;

public class EnemyRow implements Serializable {
	private ArrayList<EnemySquare> EnemySquares = new ArrayList<EnemySquare>();
	private int position;
	private final int NUM_OF_SQUARES = 10;

	// constructor
	public EnemyRow(int position) {
		EnemySquare temporarySquare;
		for (int i = 1; i <= this.NUM_OF_SQUARES; i++) {
			temporarySquare = new EnemySquare(i);
			this.EnemySquares.add(temporarySquare);
		}
		setPosition(position);
	}

	// getters and setters
	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition() {
		return this.position;
	}

	public ArrayList<EnemySquare> getSquares() {
		return this.EnemySquares;
	}

}
