import EnemyShips.EnemyShip;
import EnemyShips.EnemyShipDecorator;

public class EnemySubmarine extends EnemyShipDecorator {
	
	/*
	 * url to visualise the enemyship with an icon from a CDN link
	 */
	private String imageURL = "";
	private String name = "Submarine";
	private int points = 3;

	public EnemySubmarine(EnemyShip enemyship, int row, int square) {
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
