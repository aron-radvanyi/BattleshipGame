package EnemyShips;

public class EnemyDestroyer extends EnemyShipDecorator {
	
	/*
	 * url to visualise the enemyship with an icon from a CDN link
	 */
	private String imageURL = "";
	private String name = "Destroyer";
	private int points = 2;

	public EnemyDestroyer(EnemyShip enemyship, int row, int square) {
		super(enemyship, row, square);
		setImageURL(imageURL);
		setName(name);
		setPoints(points);

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
