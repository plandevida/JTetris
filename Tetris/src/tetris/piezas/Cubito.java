package tetris.piezas;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Es la minima unidad dibujable del juego
 * a partir de ella se componen las piezas
 * 
 * @author Plandevida
 *
 */
public class Cubito extends PiezaPrimitiva {
	int posX, posY;
	Color color;
	Pieza pieza;
	
	public Cubito(Integer x, Integer y, Color color, Pieza p) {
		this.color = color;
		this.posX = x;
		this.posY = y;
		this.pieza = p;
	}

	@Override
	public void pinta(Graphics g) {
		g.fillRect(posX, posY, lado, lado);
	}
}
