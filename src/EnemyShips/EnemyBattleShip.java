package EnemyShips;

public class EnemyBattleShip extends EnemyShipDecorator {

	/*
	 * url to visualise the enemyship with an icon from a CDN link
	 */
	private String imageURL = "";
	private String name = "Battleship";
	private int points = 4;

	public EnemyBattleShip(EnemyShip enemyship, String type, int row, int square) {
		super(enemyship, type, row, square);

	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print("This is an Aircraft carrier");
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
