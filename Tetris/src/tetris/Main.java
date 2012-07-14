package tetris;

import java.awt.Color;

import javax.swing.JFrame;

import tetris.piezas.Cubito;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tetris tetris = new Tetris("JTetris");
		tetris.setLayout(null);
		tetris.setBounds(200, 200, 500, 700);
		
		TetrisPanel panel = new TetrisPanel(new Cubito(2, 2, Color.BLUE));
		panel.setLayout(null);
		
		tetris.add(panel);
		
		tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tetris.setVisible(Boolean.TRUE);
	}
}
