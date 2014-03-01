package tetris.paneles;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

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
	private long lastMovement;
	
	public TetrisLienzo(TetrisWindow ventana) {
		initUI(ventana);
	}
	
	private void initUI(TetrisWindow ventana) {
		this.ventana = ventana;
		setPreferredSize(new Dimension(this.ventana.getWidth()/2, this.ventana.getHeight()/2));
		setIgnoreRepaint(true);
		lastMovement = 0;
	}
	
	Pieza[] piezas = { new Barra(), new Cubo(), new EleD(), new EleI(), new EscalonD(), new EscalonI()};
	
	@Override
	public void paint(Graphics g) {
		background(g);
		
//		for ( int i = 0; i < piezas.length; i++) {
			
			Pieza pieza = piezas[0];
			
			pieza.pinta(g);
//		}
		
//		if (ventana.getDataPanel() != null && data == null) {
//			data = ventana.getDataPanel();
//		}
	}
	
//	@Override
//	public void update(Graphics g) {
//
//		paint(getGraphics());
//	}
	
	public void update(int deltaTime) {
		
		long milliseconds = System.currentTimeMillis();
		
		if ( milliseconds - lastMovement > 300) {
        	
        	for ( int i = 0; i< piezas.length; i++) {
        		repaint(piezas[i].getPosX(), piezas[i].getPosY(), 12*3, 12*4);
        		piezas[i].desplazaRelativamente(0, 12);
        		repaint(piezas[i].getPosX(), piezas[i].getPosY(), 12*3, 12*4);
        	}
        	
        	lastMovement = milliseconds;
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
		
		private Pieza p;
		
		public Pieza getPieza() {
			return p;
		}
		
		Piezas(Pieza p) {
			this.p = p;
		}
	}
}
