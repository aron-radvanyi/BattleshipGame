package EnemyShips;
public class EnemyShipDecorator extends EnemyShip {
	
	protected EnemyShip enemyShip;
	
	public EnemyShipDecorator(EnemyShip enemyShip, int row, int square) {
		super(row, square);
		this.enemyShip = enemyShip;
	}
	
	public void assemble() {
		this.enemyShip.assemble();
	}
	
	

}
