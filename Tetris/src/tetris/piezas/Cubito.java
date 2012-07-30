package tetris.piezas;

import java.awt.Color;
import java.awt.Graphics;

import tetris.piezas.interfaces.Dibujable;

/**
 * Es la minima unidad dibujable del juego
 * a partir de ella se componen las piezas
 * 
 * @author Plandevida
 *
 */
public class Cubito extends Pieza implements Dibujable {
	final int posX, posY, ancho = 10, alto = 10;
	Color color = Color.BLUE;
	
	public Cubito(Integer x, Integer y, Color color) {
		this.color = color;
		posX = x;
		posY = y;
	}

	@Override
	public void pinta(Graphics g) {
		g.fillRect(posX, posY, ancho, alto);
	}
}
