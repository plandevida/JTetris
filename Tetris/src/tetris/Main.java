package tetris;

import javax.swing.JFrame;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tetris tetris = new Tetris();
		tetris.setLayout(null);
		
		tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tetris.setVisible(Boolean.TRUE);
	}
}
