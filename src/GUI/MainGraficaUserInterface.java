package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;

public class MainGraficaUserInterface extends JFrame {

	private JPanel contentPane;
	private ArrayList<JLabel> labelList = new ArrayList<JLabel>();

	private JLabel lblEnemyGrid1 = new JLabel("New label");
	private JLabel lblEnemyGrid2 = new JLabel("New label");
	private JLabel lblEnemyGrid3 = new JLabel("New label");
	private JLabel lblEnemyGrid4 = new JLabel("New label");
	private JLabel lblEnemyGrid5 = new JLabel("New label");
	private JLabel lblEnemyGrid6 = new JLabel("New label");
	private JLabel lblEnemyGrid7 = new JLabel("New label");
	private JLabel lblEnemyGrid8 = new JLabel("New label");
	private JLabel lblEnemyGrid9 = new JLabel("New label");
	private JLabel lblEnemyGrid10 = new JLabel("New label");
	private JLabel lblEnemyGrid11 = new JLabel("New label");
	private JLabel lblEnemyGrid12 = new JLabel("New label");
	private JLabel lblEnemyGrid13 = new JLabel("New label");
	private JLabel lblEnemyGrid14 = new JLabel("New label");
	private JLabel lblEnemyGrid15 = new JLabel("New label");
	private JLabel lblEnemyGrid16 = new JLabel("New label");
	private JLabel lblEnemyGrid17 = new JLabel("New label");
	private JLabel lblEnemyGrid18 = new JLabel("New label");
	private JLabel lblEnemyGrid19 = new JLabel("New label");
	private JLabel lblEnemyGrid20 = new JLabel("New label");
	private JLabel lblEnemyGrid21 = new JLabel("New label");
	private JLabel lblEnemyGrid22 = new JLabel("New label");
	private JLabel lblEnemyGrid23 = new JLabel("New label");
	private JLabel lblEnemyGrid24 = new JLabel("New label");
	private JLabel lblEnemyGrid25 = new JLabel("New label");
	private JLabel lblEnemyGrid26 = new JLabel("New label");
	private JLabel lblEnemyGrid27 = new JLabel("New label");
	private JLabel lblEnemyGrid28 = new JLabel("New label");
	private JLabel lblEnemyGrid29 = new JLabel("New label");
	private JLabel lblEnemyGrid30 = new JLabel("New label");
	private JLabel lblEnemyGrid31 = new JLabel("New label");
	private JLabel lblEnemyGrid32 = new JLabel("New label");

	public void updateLabels() {

		for (int i = 0; i < this.labelList.size(); i++) {
			JLabel label = this.labelList.get(i);
			label.setText("Hello");
		}

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGraficaUserInterface frame = new MainGraficaUserInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainGraficaUserInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1448, 803);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(
				new MigLayout("", "[125px][124px][125px][124px][125px][124px][125px][124px][125px][124px][125px][]",
						"[64px][64px][63px][64px][64px][64px][64px][64px][63px][64px][64px]"));

		JLabel lblBorderSquare1 = new JLabel("1");
		lblBorderSquare1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderSquare1, "cell 1 0,grow");

		JLabel lblBorderSquare2 = new JLabel("2");
		lblBorderSquare2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderSquare2, "cell 2 0,grow");

		JLabel lblBorderSquare3 = new JLabel("3");
		lblBorderSquare3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderSquare3, "cell 3 0,grow");

		JLabel lblBorderSquare4 = new JLabel("4");
		lblBorderSquare4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderSquare4, "cell 4 0,grow");

		JLabel lblBorderSquare5 = new JLabel("5");
		lblBorderSquare5.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderSquare5, "cell 5 0,grow");

		JLabel lblBorderSquare6 = new JLabel("6");
		lblBorderSquare6.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderSquare6, "cell 6 0,grow");

		JLabel lblBorderSquare7 = new JLabel("7");
		lblBorderSquare7.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderSquare7, "cell 7 0,grow");

		JLabel lblBorderSquare8 = new JLabel("8");
		lblBorderSquare8.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderSquare8, "cell 8 0,grow");

		JLabel lblBorderSquare9 = new JLabel("9");
		lblBorderSquare9.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderSquare9, "cell 9 0,grow");

		JLabel lblBorderSquare10 = new JLabel("10");
		lblBorderSquare10.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderSquare10, "cell 10 0,grow");

		JLabel lblBorderRow1 = new JLabel("1");
		lblBorderRow1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderRow1, "cell 0 1,grow");

		contentPane.add(this.lblEnemyGrid1, "cell 1 1,grow");

		contentPane.add(this.lblEnemyGrid2, "cell 2 1,grow");

		contentPane.add(this.lblEnemyGrid3, "cell 3 1,grow");

		contentPane.add(this.lblEnemyGrid4, "cell 4 1,grow");

		contentPane.add(this.lblEnemyGrid5, "cell 5 1,grow");

		contentPane.add(this.lblEnemyGrid6, "cell 6 1,grow");

		contentPane.add(this.lblEnemyGrid7, "cell 7 1,grow");

		contentPane.add(this.lblEnemyGrid8, "cell 8 1,grow");

		contentPane.add(this.lblEnemyGrid9, "cell 9 1,grow");

		contentPane.add(this.lblEnemyGrid10, "cell 10 1,grow");

		JLabel lblBorderRow2 = new JLabel("2");
		lblBorderRow2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderRow2, "cell 0 2,grow");

		contentPane.add(lblEnemyGrid11, "cell 1 2,grow");

		contentPane.add(lblEnemyGrid12, "cell 2 2,grow");

		contentPane.add(lblEnemyGrid13, "cell 3 2,grow");

		contentPane.add(lblEnemyGrid14, "cell 4 2,grow");

		contentPane.add(lblEnemyGrid15, "cell 5 2,grow");

		contentPane.add(lblEnemyGrid16, "cell 6 2,grow");

		contentPane.add(lblEnemyGrid17, "cell 7 2,grow");

		contentPane.add(lblEnemyGrid18, "cell 8 2,grow");

		contentPane.add(lblEnemyGrid19, "cell 9 2,grow");

		contentPane.add(lblEnemyGrid20, "cell 10 2,grow");

		JLabel lblBorderRow3 = new JLabel("3");
		lblBorderRow3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderRow3, "cell 0 3,grow");
		
		contentPane.add(lblEnemyGrid21, "cell 1 3,grow");
		contentPane.add(lblEnemyGrid22, "cell 2 3,grow");
		contentPane.add(lblEnemyGrid23, "cell 3 3,grow");
		contentPane.add(lblEnemyGrid24, "cell 4 3,grow");
		contentPane.add(lblEnemyGrid25, "cell 5 3,grow");
		contentPane.add(lblEnemyGrid26, "cell 6 3,grow");
		contentPane.add(lblEnemyGrid27, "cell 7 3,grow");
		contentPane.add(lblEnemyGrid28, "cell 8 3,grow");

		contentPane.add(lblEnemyGrid29, "cell 9 3,grow");

		contentPane.add(lblEnemyGrid30, "cell 10 3,grow");

		JLabel lblBorderRow4 = new JLabel("4");
		lblBorderRow4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderRow4, "cell 0 4,grow");

		contentPane.add(lblEnemyGrid31, "cell 1 4,grow");
		contentPane.add(lblEnemyGrid32, "cell 2 4,grow");
		JLabel lblEnemyGrid33 = new JLabel("New label");
		contentPane.add(lblEnemyGrid33, "cell 3 4,grow");

		JLabel lblEnemyGrid34 = new JLabel("New label");
		contentPane.add(lblEnemyGrid34, "cell 4 4,grow");

		JLabel lblEnemyGrid35 = new JLabel("New label");
		contentPane.add(lblEnemyGrid35, "cell 5 4,grow");

		JLabel lblEnemyGrid36 = new JLabel("New label");
		contentPane.add(lblEnemyGrid36, "cell 6 4,grow");

		JLabel lblEnemyGrid37 = new JLabel("New label");
		contentPane.add(lblEnemyGrid37, "cell 7 4,grow");

		JLabel lblEnemyGrid38 = new JLabel("New label");
		contentPane.add(lblEnemyGrid38, "cell 8 4,grow");

		JLabel lblEnemyGrid39 = new JLabel("New label");
		contentPane.add(lblEnemyGrid39, "cell 9 4,grow");

		JLabel lblEnemyGrid40 = new JLabel("New label");
		contentPane.add(lblEnemyGrid40, "cell 10 4,grow");

		JLabel lblBorderRow5 = new JLabel("5");
		lblBorderRow5.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderRow5, "cell 0 5,grow");

		JLabel lblEnemyGrid41 = new JLabel("New label");
		contentPane.add(lblEnemyGrid41, "cell 1 5,grow");

		JLabel lblEnemyGrid42 = new JLabel("New label");
		contentPane.add(lblEnemyGrid42, "cell 2 5,grow");

		JLabel lblEnemyGrid43 = new JLabel("New label");
		contentPane.add(lblEnemyGrid43, "cell 3 5,grow");

		JLabel lblEnemyGrid44 = new JLabel("New label");
		contentPane.add(lblEnemyGrid44, "cell 4 5,grow");

		JLabel lblEnemyGrid45 = new JLabel("New label");
		contentPane.add(lblEnemyGrid45, "cell 5 5,grow");

		JLabel lblEnemyGrid46 = new JLabel("New label");
		contentPane.add(lblEnemyGrid46, "cell 6 5,grow");

		JLabel lblEnemyGrid47 = new JLabel("New label");
		contentPane.add(lblEnemyGrid47, "cell 7 5,grow");

		JLabel lblEnemyGrid48 = new JLabel("New label");
		contentPane.add(lblEnemyGrid48, "cell 8 5,grow");

		JLabel lblEnemyGrid49 = new JLabel("New label");
		contentPane.add(lblEnemyGrid49, "cell 9 5,grow");

		JLabel lblEnemyGrid50 = new JLabel("New label");
		contentPane.add(lblEnemyGrid50, "cell 10 5,grow");

		JLabel lblBorderRow6 = new JLabel("6");
		lblBorderRow6.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderRow6, "cell 0 6,grow");

		JLabel lblEnemyGrid51 = new JLabel("New label");
		contentPane.add(lblEnemyGrid51, "cell 1 6,grow");

		JLabel lblEnemyGrid52 = new JLabel("New label");
		contentPane.add(lblEnemyGrid52, "cell 2 6,grow");

		JLabel lblEnemyGrid53 = new JLabel("New label");
		contentPane.add(lblEnemyGrid53, "cell 3 6,grow");

		JLabel lblEnemyGrid54 = new JLabel("New label");
		contentPane.add(lblEnemyGrid54, "cell 4 6,grow");

		JLabel lblEnemyGrid55 = new JLabel("New label");
		contentPane.add(lblEnemyGrid55, "cell 5 6,grow");

		JLabel lblEnemyGrid56 = new JLabel("New label");
		contentPane.add(lblEnemyGrid56, "cell 6 6,grow");

		JLabel lblEnemyGrid57 = new JLabel("New label");
		contentPane.add(lblEnemyGrid57, "cell 7 6,grow");

		JLabel lblEnemyGrid58 = new JLabel("New label");
		contentPane.add(lblEnemyGrid58, "cell 8 6,grow");

		JLabel lblEnemyGrid59 = new JLabel("New label");
		contentPane.add(lblEnemyGrid59, "cell 9 6,grow");

		JLabel lblEnemyGrid60 = new JLabel("New label");
		contentPane.add(lblEnemyGrid60, "cell 10 6,grow");

		JLabel lblBorderRow7 = new JLabel("7");
		lblBorderRow7.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderRow7, "cell 0 7,grow");

		JLabel lblEnemyGrid61 = new JLabel("New label");
		contentPane.add(lblEnemyGrid61, "cell 1 7,grow");

		JLabel lblEnemyGrid62 = new JLabel("New label");
		contentPane.add(lblEnemyGrid62, "cell 2 7,grow");

		JLabel lblEnemyGrid63 = new JLabel("New label");
		contentPane.add(lblEnemyGrid63, "cell 3 7,grow");

		JLabel lblEnemyGrid64 = new JLabel("New label");
		contentPane.add(lblEnemyGrid64, "cell 4 7,grow");

		JLabel lblEnemyGrid65 = new JLabel("New label");
		contentPane.add(lblEnemyGrid65, "cell 5 7,grow");

		JLabel lblEnemyGrid66 = new JLabel("New label");
		contentPane.add(lblEnemyGrid66, "cell 6 7,grow");

		JLabel lblEnemyGrid67 = new JLabel("New label");
		contentPane.add(lblEnemyGrid67, "cell 7 7,grow");

		JLabel lblEnemyGrid68 = new JLabel("New label");
		contentPane.add(lblEnemyGrid68, "cell 8 7,grow");

		JLabel lblEnemyGrid69 = new JLabel("New label");
		contentPane.add(lblEnemyGrid69, "cell 9 7,grow");

		JLabel lblEnemyGrid70 = new JLabel("New label");
		contentPane.add(lblEnemyGrid70, "cell 10 7,grow");

		JLabel lblBorderRow8 = new JLabel("8");
		lblBorderRow8.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderRow8, "cell 0 8,grow");

		JLabel lblEnemyGrid71 = new JLabel("New label");
		contentPane.add(lblEnemyGrid71, "cell 1 8,grow");

		JLabel lblEnemyGrid72 = new JLabel("New label");
		contentPane.add(lblEnemyGrid72, "cell 2 8,grow");

		JLabel lblEnemyGrid73 = new JLabel("New label");
		contentPane.add(lblEnemyGrid73, "cell 3 8,grow");

		JLabel lblEnemyGrid74 = new JLabel("New label");
		contentPane.add(lblEnemyGrid74, "cell 4 8,grow");

		JLabel lblEnemyGrid75 = new JLabel("New label");
		contentPane.add(lblEnemyGrid75, "cell 5 8,grow");

		JLabel lblEnemyGrid76 = new JLabel("New label");
		contentPane.add(lblEnemyGrid76, "cell 6 8,grow");

		JLabel lblEnemyGrid77 = new JLabel("New label");
		contentPane.add(lblEnemyGrid77, "cell 7 8,grow");

		JLabel lblEnemyGrid78 = new JLabel("New label");
		contentPane.add(lblEnemyGrid78, "cell 8 8,grow");

		JLabel lblEnemyGrid79 = new JLabel("New label");
		contentPane.add(lblEnemyGrid79, "cell 9 8,grow");

		JLabel lblEnemyGrid80 = new JLabel("New label");
		contentPane.add(lblEnemyGrid80, "cell 10 8,grow");

		JLabel lblBorderRow9 = new JLabel("9");
		lblBorderRow9.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderRow9, "cell 0 9,grow");

		JLabel lblEnemyGrid81 = new JLabel("New label");
		contentPane.add(lblEnemyGrid81, "cell 1 9,grow");

		JLabel lblEnemyGrid82 = new JLabel("New label");
		contentPane.add(lblEnemyGrid82, "cell 2 9,grow");

		JLabel lblEnemyGrid83 = new JLabel("New label");
		contentPane.add(lblEnemyGrid83, "cell 3 9,grow");

		JLabel lblEnemyGrid84 = new JLabel("New label");
		contentPane.add(lblEnemyGrid84, "cell 4 9,grow");

		JLabel lblEnemyGrid85 = new JLabel("New label");
		contentPane.add(lblEnemyGrid85, "cell 5 9,grow");

		JLabel lblEnemyGrid86 = new JLabel("New label");
		contentPane.add(lblEnemyGrid86, "cell 6 9,grow");

		JLabel lblEnemyGrid87 = new JLabel("New label");
		contentPane.add(lblEnemyGrid87, "cell 7 9,grow");

		JLabel lblEnemyGrid88 = new JLabel("New label");
		contentPane.add(lblEnemyGrid88, "cell 8 9,grow");

		JLabel lblEnemyGrid89 = new JLabel("New label");
		contentPane.add(lblEnemyGrid89, "cell 9 9,grow");

		JLabel lblEnemyGrid90 = new JLabel("New label");
		contentPane.add(lblEnemyGrid90, "cell 10 9,grow");

		JLabel lblBorderRow10 = new JLabel("10");
		lblBorderRow10.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBorderRow10, "cell 0 10,grow");

		JLabel lblEnemyGrid91 = new JLabel("New label");
		contentPane.add(lblEnemyGrid91, "cell 1 10,grow");

		JLabel lblEnemyGrid92 = new JLabel("New label");
		contentPane.add(lblEnemyGrid92, "cell 2 10,grow");

		JLabel lblEnemyGrid93 = new JLabel("New label");
		contentPane.add(lblEnemyGrid93, "cell 3 10,grow");

		JLabel lblEnemyGrid94 = new JLabel("New label");
		contentPane.add(lblEnemyGrid94, "cell 4 10,grow");

		JLabel lblEnemyGrid95 = new JLabel("New label");
		contentPane.add(lblEnemyGrid95, "cell 5 10,grow");

		JLabel lblEnemyGrid96 = new JLabel("New label");
		contentPane.add(lblEnemyGrid96, "cell 6 10,grow");

		JLabel lblEnemyGrid97 = new JLabel("New label");
		contentPane.add(lblEnemyGrid97, "cell 7 10,grow");

		JLabel lblEnemyGrid98 = new JLabel("New label");
		contentPane.add(lblEnemyGrid98, "cell 8 10,grow");

		JLabel lblEnemyGrid99 = new JLabel("New label");
		contentPane.add(lblEnemyGrid99, "cell 9 10,grow");

		JLabel lblEnemyGrid100 = new JLabel("New label");
		contentPane.add(lblEnemyGrid100, "cell 10 10,grow");

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateLabels();
			}
		});
		contentPane.add(btnUpdate, "cell 11 10");
	}

	public void initializeJLabelList() {
		int numberOfLabels = 32;

		for (int i = 1; i <= numberOfLabels; i++) {
			// Assuming your JLabel variable names follow the pattern lbl_1, lbl_2, ...,
			// lbl_100
			String labelName = "lblEnemyGrid" + i;

			// Get the JLabel object based on the generated name using reflection (assuming
			// the JLabels are instance variables of the class)
			JLabel label = getJLabelByVariableName(labelName);

			if (label != null) {
				this.labelList.add(label);
			}
		}
	}

	// Helper method to get JLabel objects using their variable names through
	// reflection
	private JLabel getJLabelByVariableName(String variableName) {
		try {
			return (JLabel) getClass().getDeclaredField(variableName).get(this);
		} catch (NoSuchFieldException | IllegalAccessException | ClassCastException e) {
			// Handle exceptions or return null if the JLabel with the given name is not
			// found or has the wrong type
			e.printStackTrace();
			return null;
		}
	}

}
