package tetris;

import javax.swing.JFrame;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tetris tetris = new Tetris("JTetris");
		tetris.setLayout(null);
		tetris.setBounds(200, 200, 500, 700);
		
		tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tetris.setVisible(Boolean.TRUE);
	}
}
