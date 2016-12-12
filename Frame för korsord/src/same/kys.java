package same;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class kys {
	private JFrame f;
	private JPanel p;
	private JButton	 b;
	private JLabel l;

	public kys() {

		gui();

	}
	


	public void gui() {
		
		f = new JFrame("korsord");
		f.setVisible(true);
		f.setSize(1280, 800);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setBackground(Color.BLACK);
		
		b = new JButton("test");
		l = new JLabel("test label");
		
		p.add(b);
		p.add(l);
		
		f.add(p,BorderLayout.SOUTH);
		
		

	}
	public static void main(String args[]){
		new kys(); 
	}

}
