package cjhs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// Do so every command is JFrame commands
public class Framen extends JFrame {
	private static final long serialVersionUID = -3345354391577272355L;


	public Framen(int rowsi, int cols) {
		// All the variables 
		int GRID_ROWS = rowsi;
		int GRID_COL = cols;
		int BOX_SIZE = 50;

		Font DESU_FONT = new Font("Monospaced", Font.BOLD, 20);
		Color DESU_COLOR = Color.PINK;
		
		int DESU_WIDTH = BOX_SIZE * GRID_ROWS;
		int DESU_HEIGHT = BOX_SIZE * GRID_COL;

		JTextField[][] jt = new JTextField[GRID_ROWS][GRID_COL];


		// Text-boxes & Button second panel
		JTextField DESU_IN = new JTextField();
		JTextField DESU_OUT = new JTextField();
		JButton DESU_BTN = new JButton("BTN");


		// content panel that holds everything
		JPanel content = new JPanel();


		// Game panel and switch panel
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();


		// Adds panels to the content panel
		content.add(p);
		content.add(p2);


		// Layout that holds a panel above another
		BoxLayout layout = new BoxLayout(content, BoxLayout.Y_AXIS);
		content.setLayout(layout);


		add(content);
		p.setLayout(new GridLayout(GRID_ROWS, GRID_COL));


		for (int row = 0; row < GRID_ROWS; row++) {
			for (int col = 0; col < GRID_COL; col++) {
				jt[row][col] = new JTextField();
				p.add(jt[row][col]);
				jt[row][col].setFont(DESU_FONT);
				jt[row][col].setHorizontalAlignment(SwingConstants.CENTER);
				jt[row][col].setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, DESU_COLOR));
			}
		}


		DESU_BTN.addActionListener(new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				for (int row = 0; row < GRID_ROWS; row++) {
					for (int col = 0; col < GRID_COL; col++) {
						
						if(jt[row][col].getText().equalsIgnoreCase(DESU_IN.getText().toUpperCase())){
							jt[row][col].setText(DESU_OUT.getText().toUpperCase());
						}
					}
				}


			}
		});


		// Adding boxes in second panel
		p2.add(DESU_IN);
		p2.add(DESU_OUT);
		p2.add(DESU_BTN);


		// Text-boxes second panel Settings


		DESU_IN.setPreferredSize(new Dimension(50, 20));
		DESU_OUT.setPreferredSize(new Dimension(50, 20));


		p.setPreferredSize(new Dimension(DESU_WIDTH, DESU_HEIGHT));
		p2.setPreferredSize(new Dimension(DESU_WIDTH, BOX_SIZE));
		pack();
		setLocationRelativeTo(null);
		setTitle("sdas");
		setDefaultCloseOperation(3);

		setAlwaysOnTop(true);
		setVisible(true);
		setAlwaysOnTop(false);


	}


}


