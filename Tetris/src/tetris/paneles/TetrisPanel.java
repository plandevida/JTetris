package tetris.paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

import tetris.piezas.Pieza;
import tetris.piezas.fichas.Barra;
import tetris.piezas.fichas.Cubo;
import tetris.piezas.fichas.EleDrch;
import tetris.piezas.fichas.EleIzq;
import tetris.piezas.fichas.Escalon;
import tetris.ventana.TetrisWindow;

/**
 * 
 * @author Plandevida
 *
 */
public class TetrisPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private TetrisWindow ventana;
	private DataPanel data;
	
	public TetrisPanel(TetrisWindow ventana) {
		initUI(ventana);
	}
	
	private void initUI(TetrisWindow ventana) {
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
	
	Pieza pieza = new Cubo();
	
	@Override
	public void paintComponent(Graphics g) {
//		background(g);
		
		pieza.pinta(g);
		
		if (ventana.getDataPanel() != null && data == null) {
			data = ventana.getDataPanel();
		}
		
		update();
	}
	
	public void update() {
		if (pieza.getPosY() < ventana.getHeight()) {
//			Random random = new Random();
//			pieza = Piezas.values()[random.nextInt(Piezas.values().length-1)].p;
//			pieza.desplaza(pieza.getPosX(), 12);
//		} else {
			pieza.desplazaRelativamente(0, 12);
		}
	}
	
	private enum Piezas {
		BARRA(new Barra()),
		CUBO(new Cubo()),
		ELED(new EleDrch()),
		ELEI(new EleIzq()),
		ESCALON(new Escalon())
		;
		
		Pieza p;
		
		Piezas(Pieza p) {
			this.p = p;
		}
	}
}
