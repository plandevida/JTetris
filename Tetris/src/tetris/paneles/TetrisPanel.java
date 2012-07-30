package tetris.paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import tetris.piezas.Pieza;
import tetris.piezas.fichas.Barra;
import tetris.piezas.fichas.Cubo;
import tetris.ventana.Tetris;

/**
 * 
 * @author Plandevida
 *
 */
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
		setDoubleBuffered(true);
	}
	
	private void background(Graphics g) {
//		for (int i = 12; i < (ventana.getWidth()/12) - 1; i++) {
//			g.drawRect(i, ventana.getHeight(), 2, 1);
//		}
		
		this.setBackground(Color.gray);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		background(g);
		
		pieza = new Cubo();
		pieza.pinta(g);
		
		((Pieza) new Barra()).pinta(g);
		
//		for (int i=0; i< 20; i++) {
//			pieza.desplazaRelativamente(12, 12);
//		}
	}
	
	Pieza pieza;
	
	public Pieza getPieza() {
		return pieza;
	}
}
