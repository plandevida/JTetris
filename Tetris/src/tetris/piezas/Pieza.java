package tetris.piezas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import tetris.interfaces.Dibujable;
import utilidades.ColorsEnum;

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
	
	Random random = new Random();
	int colorIndex = random.nextInt(ColorsEnum.values().length);
	protected Color color = ColorsEnum.getColorIndex(colorIndex);
	
	protected Cubito forma[][] = new Cubito[filas][columnas];
	
	@Override
	public void pinta(Graphics g) {
		g.setColor(color);
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
	
	public int getPosX() {
		return x;
	}
	
	public int getPosY() {
		return y;
	}
}
