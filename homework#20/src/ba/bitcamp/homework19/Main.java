package ba.bitcamp.homework19;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame window = new JFrame("Our little program");

		PaintPanel pp = new PaintPanel(450, 500);
		
		window.add(pp);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(450, 500);
		window.setLocationRelativeTo(null);
		window.setVisible(true);

		

	}

}
