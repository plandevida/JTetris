package tetris;

import java.awt.Graphics;

import javax.swing.JPanel;

import tetris.piezas.Cubito;

public class TetrisPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	Cubito c;
	
	public TetrisPanel(Cubito c) {
		this.c = c;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		c.pinta(g);
	}
}
