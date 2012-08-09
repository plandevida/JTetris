package tetris.piezas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import utilidades.ColorsEnum;

/**
 * Clase que provee una matriz para pintar
 * las piezas
 * 
 * @author nano
 *
 */
public abstract class Pieza extends PiezaPrimitiva{
	protected final int filas = 4, columnas = 3;
	protected int x, y;
	
	protected Cubito forma[][] = new Cubito[filas][columnas];
	
	Random random = new Random();
	int colorIndex = random.nextInt(ColorsEnum.values().length);
	protected Color color = ColorsEnum.getColorIndex(colorIndex);
	
	protected abstract void crearForma();
	
	/**
	 * Transmite la nueva posición a los cubitos que componen la pieza
	 * 
	 * @param offsetX
	 * @param offsetY
	 * @param relative
	 */
	protected void populatePosition(int offsetX, int offsetY, boolean relative) {
		for (int i=0; i<this.filas; i++) {
			for (int j=0; j<this.columnas; j++) {
				if (forma[i][j] != null) {
					System.out.println("In position: i = " + i + ", j = " + j);
					if (relative) {
						System.out.println("|___ Old x = " + forma[i][j].posX);
						forma[i][j].posX += offsetX;
						System.out.println("|___ New x = " + forma[i][j].posX);
						System.out.println("|___ Old y = " + forma[i][j].posY);
						forma[i][j].posY += offsetY;
						System.out.println("|___ Old y = " + forma[i][j].posY);
					} else {
						forma[i][j].posX = offsetX + i * lado;
						forma[i][j].posY = offsetY + j * lado;
					}
				}
			}
		}
	}
	
	@Override
	public void pinta(Graphics g) {
		g.setColor(color);
		for (int i=0; i<this.filas; i++) {
			for (int j=0; j<this.columnas; j++) {
				if (forma[i][j] != null) {
					forma[i][j].pinta(g);
				}
			}
		}
	}

	public void desplaza(int newX, int newY) {
		x = newX;
		y = newY;
		populatePosition(newX, newY, false);
	}
	
	public void desplazaRelativamente(int offsetX, int offsetY) {
		x += offsetX;
		y += offsetY;
		populatePosition(offsetX, offsetY, true);
	}
	
	public int getPosX() {
		return x;
	}
	
	public int getPosY() {
		return y;
	}
}
