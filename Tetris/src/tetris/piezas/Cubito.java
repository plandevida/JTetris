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
public class Cubito extends Pieza {
	final int posX, posY;
	
	public Cubito(Integer x, Integer y, Color color) {
		this.color = color;
		posX = x;
		posY = y;
	}

	@Override
	public void pinta(Graphics g) {
		g.fillRect(posX, posY, lado, lado);
	}
}
