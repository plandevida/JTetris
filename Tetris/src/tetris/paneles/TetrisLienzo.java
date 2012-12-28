package tetris.paneles;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

import tetris.piezas.Pieza;
import tetris.piezas.fichas.Barra;
import tetris.piezas.fichas.Cubo;
import tetris.piezas.fichas.EleD;
import tetris.piezas.fichas.EleI;
import tetris.piezas.fichas.EscalonD;
import tetris.piezas.fichas.EscalonI;
import tetris.ventana.TetrisWindow;
import utilidades.ColorsEnum;

public class TetrisLienzo extends Canvas {
private static final long serialVersionUID = 1L;
	
	private TetrisWindow ventana;
	private DataPanel data;
	
	public TetrisLienzo(TetrisWindow ventana) {
		initUI(ventana);
	}
	
	private void initUI(TetrisWindow ventana) {
		this.ventana = ventana;
		setPreferredSize(new Dimension(this.ventana.getWidth()/2, this.ventana.getHeight()/2));
		setIgnoreRepaint(true);
	}
	
	Pieza pieza = new Barra();
	Pieza pieza1 = new Cubo();
	Pieza pieza2 = new EleD();
	Pieza pieza3 = new EleI();
	Pieza pieza4 = new EscalonD();
	Pieza pieza5 = new EscalonI();
	
	@Override
	public void paint(Graphics g) {
		background(g);
		
		pieza.pinta(g);
		pieza1.pinta(g);
		pieza2.pinta(g);
		pieza3.pinta(g);
		pieza4.pinta(g);
		pieza5.pinta(g);
		
		if (ventana.getDataPanel() != null && data == null) {
			data = ventana.getDataPanel();
		}
		
//		update();
	}
	
	public void update(int deltaTime) {
		if (pieza.getPosY() < ventana.getHeight()) {
//			Random random = new Random();
//			pieza = Piezas.values()[random.nextInt(Piezas.values().length-1)].p;
//			pieza.desplaza(pieza.getPosX(), 12);
//		} else {
			System.out.println(deltaTime);
			System.out.println(deltaTime * 0.25);
			pieza.desplazaRelativamente(0, (int) (deltaTime * 0.25));
			pieza1.desplazaRelativamente(0, 12);
			pieza2.desplazaRelativamente(0, 12);
			pieza3.desplazaRelativamente(0, 12);
			pieza4.desplazaRelativamente(0, 12);
			pieza5.desplazaRelativamente(0, 12);
		}
	}
	
	private void background(Graphics g) {
		int lineasV = getWidth();
		int lineasH = getHeight();
		int posLinea = 12;
		
		g.setColor(ColorsEnum.LIGTH_GRAY.getColor());
		
		for (int i = 0; i <= (lineasH/12) - 1; i++) {
			if (i <= lineasV/12)
				g.drawLine(posLinea, 0, posLinea, lineasH);
			g.drawLine(0, posLinea, lineasV, posLinea);
			posLinea += 12;
		}
	}
	
	private enum Piezas {
		CUBO(new Cubo()),
		ELED(new EleD()),
		ESCALOND(new EscalonD()),
		ELEI(new EleI()),
		ESCALONI(new EscalonI()),
		BARRA(new Barra()),
		;
		
		Pieza p;
		
		Piezas(Pieza p) {
			this.p = p;
		}
	}
}
