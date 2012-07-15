package tetris.paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import tetris.piezas.Pieza;
import tetris.ventana.Tetris;

public class TetrisPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	Pieza p;
	private Tetris ventana;
	
	public TetrisPanel(Tetris ventana) {
		initUI(ventana);
	}
	
	public TetrisPanel(Pieza p, Tetris ventana) {
		this.p = p;
		initUI(ventana);
	}
	
	private void initUI(Tetris ventana) {
		this.ventana = ventana;
		setLayout(null);
		setPreferredSize(new Dimension(this.ventana.getWidth()/2, this.ventana.getHeight()/2));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.fillRect(2, 2, 10, 10);
		g.setColor(Color.red);
	}
}
