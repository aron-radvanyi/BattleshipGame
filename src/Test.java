import javax.swing.JOptionPane;

import Logic.PlacerLogic;

public class Test {

	public static void main(String[] args) {
		PlacerLogic logic = new PlacerLogic();
		
		logic.enemyShipPlacer();
		
		String test = logic.getTest();
		JOptionPane.showMessageDialog(null, test);
		

	}

}
