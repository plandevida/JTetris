package tetris.paneles;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import tetris.piezas.Pieza;
import tetris.piezas.fichas.Barra;
import tetris.piezas.fichas.Cubo;
import tetris.piezas.fichas.EleDrch;
import tetris.piezas.fichas.EleIzq;
import tetris.piezas.fichas.Escalon;
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
	
//	private void background(Graphics g) {
////		for (int i = 12; i < (ventana.getWidth()/12) - 1; i++) {
////			g.drawRect(i, ventana.getHeight(), 2, 1);
////		}
//		
//		setBackground(Color.BLUE);
//	}
	
	@Override
	public void paintComponent(Graphics g) {
//		background(g);
		
		pieza = new Cubo();
		pieza.pinta(g);
		System.out.println(pieza.getPosY());
		pieza.desplazaRelativamente(0, 12);
		System.out.println(pieza.getPosY());
		pieza = new Barra();
		pieza.pinta(g);
		pieza = new EleDrch();
		pieza.pinta(g);
		pieza = new EleIzq();
		pieza.pinta(g);
		pieza = new Escalon();
		pieza.pinta(g);
	}
	
	Pieza pieza;
	
	public Pieza getPieza() {
		return pieza;
	}
}
