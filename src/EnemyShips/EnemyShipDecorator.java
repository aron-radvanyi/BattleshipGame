package EnemyShips;
public class EnemyShipDecorator extends EnemyShip {
	
	protected EnemyShip enemyShip;
	
	public EnemyShipDecorator(EnemyShip enemyShip,String type, int row, int square) {
		super(type,row, square);
		this.enemyShip = enemyShip;
	}
	
	public void assemble() {
		this.enemyShip.assemble();
	}
	
	

}
