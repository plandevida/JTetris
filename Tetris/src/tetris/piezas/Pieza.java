package tetris.piezas;

import java.awt.Color;
import java.awt.Graphics;

import tetris.interfaces.Dibujable;

/**
 * Interfaz que provee una matriz para pintar
 * las piezas
 * 
 * @author nano
 *
 */
public abstract class Pieza implements Dibujable{
	protected final int filas = 4, columnas = 3;
	protected final int lado = 12;
	protected int x, y;
	protected Color color = Color.BLUE;
	
	protected Cubito forma[][] = new Cubito[filas][columnas];
	
	@Override
	public void pinta(Graphics g) {
		for (int i=0; i<this.filas; i++) {
			for (int j=0; j<this.columnas; j++) {
				if (forma[i][j] != null) {
					Cubito cubito = forma[i][j];
					cubito.pinta(g);
				}
			}
		}
	}

	public void desplaza(Integer newX, Integer newY) {
		x = newX != null ? newX : x ;
		y = newY != null ? newY : y;
	}
	
	public void desplazaRelativamente(int offsetX, int offsetY) {
		x += offsetX;
		y += offsetY;
	}
}
