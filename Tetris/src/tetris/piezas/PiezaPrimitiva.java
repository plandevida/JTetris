package tetris.piezas;

import java.awt.Graphics;

import tetris.interfaces.Dibujable;

public class PiezaPrimitiva implements Dibujable {
	
	protected final int lado = 12;

	@Override
	public void pinta(Graphics g) {
		// NO HACE NADA, TINE QUE SER SOBREESCRITO POR LA CLASE QUE HEREDE DE ESTA
	}

}
