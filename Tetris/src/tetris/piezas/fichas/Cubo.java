package tetris.piezas.fichas;

import java.awt.Color;
import java.awt.Graphics;

import tetris.piezas.Cubito;
import tetris.piezas.Pieza;
import tetris.piezas.interfaces.Dibujable;

public class Cubo extends Pieza implements Dibujable {

	@Override
	public void pinta(Graphics g) {																		// Este array representa un esquema de pieza:
		forma = new Cubito[][] {{new Cubito(0, 0, Color.blue), new Cubito(0,1,Color.blue), null},		//		| 1, 1, 0, 0 |
								{new Cubito(0, 0, Color.blue), new Cubito(0,1,Color.blue), null},		//		| 1, 1, 0, 0 |
								{null, null, null},														//		| 0, 0, 0, 0 |
								{null, null, null}};													//		| 0, 0, 0, 0 |
																										// donde los unos significa que ahí se pintará un cubito
	}
}
